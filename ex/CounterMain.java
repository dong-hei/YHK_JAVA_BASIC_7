package section7_access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter c = new MaxCounter(10);
        c.increment();
        c.increment();
        c.increment();
        c.increment();
        c.increment();
        c.increment();
        int count = c.getCount();
        System.out.println(count);
    }
}
