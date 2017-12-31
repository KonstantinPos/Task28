public class Main {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int sum;
        System.out.print("Последовательность Фибоначчи первых 11 чисел: 1 1 ");
        for (int i = 0; i < 9; i++) {
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
        }
    }
}
