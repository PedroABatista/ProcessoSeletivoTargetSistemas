import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String a;

        System.out.print("Digite algo : ");
        a = leitor.nextLine();

        System.out.println();

        System.out.printf("Receber : %s\n", a);
        System.out.printf("Saida : %s\n", inverterString(a));
    }

    public static String inverterString(String a) {
        int x, y;
        String apoio;
        apoio = "";
        y = a.length();

        for (x = (y - 1); x >= 0; x--) {
            apoio = apoio + a.charAt(x);
        }
        return (apoio);
    }
}
