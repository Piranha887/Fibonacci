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

        int[] num = new int[x + 1];

        if (x == 0) return 0;
        if (x == 1) return 1;

        num[0] = 0;
        num[1] = 1;

        for (int i = 2; i <= x; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }

        return num[x];
    }

}
