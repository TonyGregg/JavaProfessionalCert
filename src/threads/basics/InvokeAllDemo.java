package threads.basics;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by genil on 6/11/18 at 16 50
 **/
public class InvokeAllDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        /*List<Callable<String>> callableList = Arrays.asList(
                () -> "task # 1",
                () -> "task # 2",
                () -> "task # 3"
        );

        ExecutorService executorService = Executors.newWorkStealingPool();
        executorService.invokeAll(callableList)
        .stream()
        .map(stringFuture -> {
            try{
               return stringFuture.get();
            }catch (Exception ex) {
                throw new IllegalStateException(ex);
            }
        }).forEach(System.out::println);*/

        List<Callable<String>> callables = Arrays.asList(
                createCallables("Task 1",5),
                createCallables("Task # 2",2),
                createCallables("Task # 3",3)
        );

        ExecutorService executorService = Executors.newWorkStealingPool();

        String result  = executorService.invokeAny(callables);

        System.out.println("Res "+result );

    }

    private static Callable<String> createCallables(String result, int delayInSecs) {
        return () -> {
            TimeUnit.SECONDS.sleep(delayInSecs);
            return result;
        };
    }

}
