import java.util.Scanner;

public class ActionWithNumber2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz ilosc podanych licb");

        int razy = sc.nextInt();
        int suma = 0;

        for (int i = 0; i < razy; i++) {

            System.out.println("Wprowadz liczby ");
            int a = sc.nextInt();

            if (a % 2 == 0) {
                suma = suma + a;
            } else suma = suma - a;

        }
        System.out.println("wynik " + suma);

    }
}
