import java.util.concurrent.*;

public class ExecutorFrameWorkDemo {

    public static void main(String[] args) {

        // 1. Create a fixed thread pool (3 threads)
        try (ExecutorService executor = Executors.newFixedThreadPool(3)) {

            // 2. Runnable tasks (no return value)
            Runnable task1 = () -> {
                System.out.println("Runnable Task 1 executed by " + Thread.currentThread().getName());
            };

            Runnable task2 = () -> {
                System.out.println("Runnable Task 2 executed by " + Thread.currentThread().getName());
            };

            // Submit Runnable tasks
            executor.execute(task1);
            executor.execute(task2);

            // 3. Callable task (returns a value)
            Callable<Integer> callableTask = () -> {
                System.out.println("Callable Task executed by " + Thread.currentThread().getName());
                Thread.sleep(2000); // simulate work
                return 100;
            };

            // Submit Callable task
            Future<Integer> future = executor.submit(callableTask);

            // 4. Get result from Callable
            try {
                Integer result = future.get(); // blocks until result is ready
                System.out.println("Result from Callable: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }

            // 5. Submit multiple tasks using loop
            for (int i = 1; i <= 5; i++) {
                int taskId = i;
                executor.submit(() -> {
                    System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
                });
            }

            // 6. Shutdown executor
            executor.shutdown();

            try {
                if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
            }
        }

        System.out.println("All tasks finished.");
    }
}
