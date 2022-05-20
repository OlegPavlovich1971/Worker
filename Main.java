public class Main {
    public Main () {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener error = e -> e == 33;
        Worker worker = new Worker(listener, error);
        worker.start();
    }

    public static void main(String[] args) {
        new Main();
    }
}
