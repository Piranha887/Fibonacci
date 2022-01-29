public class Fibonachi {

    public static void main(String[] args) {
        Fibonachi fib = new Fibonachi();
        System.out.println(fib.f(0));
        System.out.println(fib.f(1));
        System.out.println(fib.f(3));
        System.out.println(fib.f(5));
        System.out.println(fib.f(10));
    }

    int f(int x) {
        return x == 0 ? 0 : (x == 1 ? 1 : (f(x - 1) + f(x - 2)));
    }
}
