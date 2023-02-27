
public class Test {
    public static void main(String[] args) {
        Basket p = new Basket();
        for (int i = 0; i < 5; i++) {
            new Monk(p, "和尚" + (i + 1) + ":\t").start();
        }
    }
}