package pl.sda.concurrent;

public class CustomTest {
    public static void main(String[] args) {

        System.out.println(CustomThread.currentThread());

        CustomThread customThread1 = new CustomThread();
        System.out.println(customThread1.getName());

        CustomThread customThread2 = new CustomThread();
        System.out.println(customThread2.getName());

        CustomThread customThread3 = new CustomThread();
        System.out.println(customThread3.getName());

        CustomThread customThread4 = new CustomThread();
        System.out.println(customThread4.getName());


        SimpleCustomRunnable simpleCustomRunnable1 = new SimpleCustomRunnable();
        System.out.println(simpleCustomRunnable1);


        CustomRunnable customRunnable1 = new CustomRunnable();
        System.out.println(customRunnable1);

        CustomRunnable customRunnable2 = new CustomRunnable();
        System.out.println(customRunnable2);

        CustomRunnable customRunnable3 = new CustomRunnable();
        System.out.println(customRunnable3);

        CustomRunnable customRunnable4 = new CustomRunnable();
        System.out.println(customRunnable4);

        Thread thread1 = new Thread(customRunnable1);
        thread1.start();

        Thread thread2 = new Thread(customRunnable2);
        thread2.start();

        Thread thread3 = new Thread(customRunnable3);
        thread3.start();

        Thread thread4 = new Thread(customRunnable4);
        thread4.start();



    }
}
