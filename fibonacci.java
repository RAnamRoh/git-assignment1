public class fibonacci {
    
    public static void main(String[] args) {
        
        System.out.println(fibonacci(9));

    }

    static int fibonacci(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

}
