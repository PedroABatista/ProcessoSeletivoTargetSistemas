import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int k = 0;
        boolean isFibonacci = false;
        System.out.print("Digite um valor; ");
        k = leitor.nextInt();
        int countFibonacci = 1;
        int countFibonacciTemp = 0;
        while (countFibonacciTemp <= k) {
            if (countFibonacciTemp == k) {
                isFibonacci = true;

            }
            int temp = countFibonacci;
            countFibonacci += countFibonacciTemp;
            countFibonacciTemp = temp;
        }
        if (isFibonacci) {
            System.out.println("Faz parte da sequência Fibonacci");
        } else {
            System.out.println("Não faz parte da sequência Fibonacci");
        }
    }

}