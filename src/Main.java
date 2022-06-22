public class Main {
    public static void main(String[]args){
        System.out.println( ThreadColor.ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new anotherThread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println( ThreadColor.ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new  Thread(new MyRunnable());
        myRunnableThread.start();
        System.out.println("Hello once again");
    }
}
