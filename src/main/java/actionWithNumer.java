import java.util.Scanner;

public class actionWithNumer {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[] tab = new int[5];

        int suma = 0;

        for (int i = 0; i < tab.length; i++) {

            System.out.println("Wprowadz liczby ");
            int a = sc.nextInt();
            tab[i] = a;


            if (a % 2 == 0) {
                suma = suma + a;
            } else suma = suma - a;


        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Lista liczb:" +tab[i]);
        }
        System.out.println("wynik " + suma);
    }
}


