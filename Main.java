public class Main {
    public Main () {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener error = System.out::println;
        Worker worker = new Worker(listener, error);
        worker.start();
    }

    public static void main(String[] args) {
        new Main();
    }
}
