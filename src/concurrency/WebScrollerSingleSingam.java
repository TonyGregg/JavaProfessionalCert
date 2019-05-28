package concurrency;


import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static org.genil.learning.java8.concurrency.HttpConnect.download;

/**
 * Created by anton on 6/23/2018 2:32 PM
 *
 * This Single threaded web scroller is to to check the time takes to download 3 web pages.
 *
 * The performance will be compared against multi threaded approach.
 *
 * This is just to understand how thread is useful in real life scenario.
 *
 *
 * Output
 *
 Total pages :: 7
 Total time taken :
 1. Nanos : 6889000000
 2. Millis : 6889
 3. Secs 6

 With the multi threaded approach ( 2 fixed threads)

 Total time taken :
 1. Nanos : 1841000000
 2. Millis : 1841
 3. Secs 1
 *
 *
 * 3 threads
 *
 * 1. Nanos : 1485000000
 * 2. Millis : 1485
 * 3. Secs 1
 *
 **/
public class WebScrollerSingleSingam {
    private static final String[] PAGES_TO_DOWNLOAD = {"https://angular.io/guide/quickstart",
            "https://spring.io/guides/tutorials/spring-security-and-angular-js/",
            "https://javarevisited.blogspot.com/2011/07/java-multi-threading-interview.html",
            "https://kubernetes.io/docs/concepts/overview/what-is-kubernetes/",
            "https://start.spring.io/",
            "https://getbootstrap.com/docs/4.0/getting-started/introduction/",
            "https://getstart.blog/2018/03/24/docker-ce-installation-on-red-hat-7/"};


    private String getPageContent(String webPage) throws MalformedURLException, URISyntaxException {
        String htmlPage = download(webPage);

        return htmlPage;
    }

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();



        WebScrollerSingleSingam singleSingamWebScroller = new WebScrollerSingleSingam();
        List<String> listPageContents = new ArrayList<>(7);

        for (String pageName : PAGES_TO_DOWNLOAD) {
            try {
                listPageContents.add(singleSingamWebScroller.getPageContent(pageName));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }


        listPageContents.forEach(s -> {
            if(s==null || s.trim().length()<1) {
                System.out.println("One of the pages not downloaded.. .");
            }

        });

        System.out.println("Total pages :: "+listPageContents.size());

        LocalDateTime end = LocalDateTime.now();

        long nanos = ChronoUnit.NANOS.between(start,end);
        long millis = ChronoUnit.MILLIS.between(start,end);
        long secs = ChronoUnit.SECONDS.between(start,end);


        System.out.println("Total time taken : \n1. Nanos : "+nanos+"\n2. Millis : "+millis+ "\n3. Secs "+secs);

    }
}
