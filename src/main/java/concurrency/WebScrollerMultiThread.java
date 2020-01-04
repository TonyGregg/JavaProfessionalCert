package concurrency;

import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by anton on 6/23/2018 3:09 PM
 *
 * Multi threaded has of course improved the performance.
 * Total time taken :
 * 1. Nanos : 1511000000
 * 2. Millis : 1511
 * 3. Secs 1
 **/
public class WebScrollerMultiThread {
    ExecutorService downloadExecutor = Executors.newFixedThreadPool(4);

    private static final String[] PAGES_TO_DOWNLOAD = {"https://angular.io/guide/quickstart",
            "https://spring.io/guides/tutorials/spring-security-and-angular-js/",
            "https://javarevisited.blogspot.com/2011/07/java-multi-threading-interview.html",
            "https://kubernetes.io/docs/concepts/overview/what-is-kubernetes/",
            "https://start.spring.io/",
            "https://getbootstrap.com/docs/4.0/getting-started/introduction/",
            "https://getstart.blog/2018/03/24/docker-ce-installation-on-red-hat-7/"};

    private Deque<String> queue = new ArrayDeque<>();

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();

        WebScrollerMultiThread scroller = new WebScrollerMultiThread();
        for (String page : PAGES_TO_DOWNLOAD) {
            scroller.queue.add(page);
        }

        List<Future<String>> futures = scroller.go();
        System.out.println("Total returns "+futures.size());

        List<String> webPages  = new ArrayList<>(7);

        for (Future<String> future: futures) {
            try {
                webPages.add(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        for (String page: webPages) {
            System.out.println(page);
            System.out.println("\n\n\n\n\n ---------------------------------------------");
        }

        scroller.downloadExecutor.shutdown();

        LocalDateTime end = LocalDateTime.now();

        long nanos = ChronoUnit.NANOS.between(start,end);
        long millis = ChronoUnit.MILLIS.between(start,end);
        long secs = ChronoUnit.SECONDS.between(start,end);


        System.out.println("Total time taken : \n1. Nanos : "+nanos+"\n2. Millis : "+millis+ "\n3. Secs "+secs);

    }

    public List<Future<String>> go() {
        List<Future<String>> futures = new ArrayList<>();
        while(queue.size()>0) {
            String page = queue.poll();
            futures.add(downloadExecutor.submit(new Downloader(page)));
        }
        return futures;
    }

    class Downloader implements Callable<String> {

        public Downloader(String page) {
            this.page = page;
        }

        private final String page;

        @Override
        public String call() throws Exception {
            String content = download(page);
            return content;
        }

        public String read(InputStream in) {
            StringBuilder text = new StringBuilder();

            try (BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    text.append(line).append("\n");
                }
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return text.toString();
        }

        public String download(String sourceUrl) throws MalformedURLException, URISyntaxException {
            System.out.println("Downloading: " + sourceUrl);
            URL url = new URI(sourceUrl).toURL();

            try {
                HttpURLConnection con = (HttpURLConnection)url.openConnection();
                int responseCode = con.getResponseCode();

                if(responseCode >= 200 && responseCode < 300) { // ok
                    return read(con.getInputStream());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }
    }

}
