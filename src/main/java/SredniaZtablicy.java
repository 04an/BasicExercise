import java.sql.SQLOutput;
import java.util.Scanner;

public class SredniaZtablicy {


    public static void main(String[] args) {
        int [] tab = new int[10];
        int suma=0;
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<tab.length;i++){
            System.out.println("wprowadz liczbe");
            int a = sc.nextInt();
            tab[i]=a;
            suma +=a;

            }
        System.out.println("Suma tablicy: " + suma);
        System.out.println("Srednia tablicy: " + (suma/tab.length));
        System.out.println("Lista wszystkich wprowadzonych liczb:");
        for (int i = 0; i<tab.length;i++){
            System.out.println( tab[i]);
        }

    }
}