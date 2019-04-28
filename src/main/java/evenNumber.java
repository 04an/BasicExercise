
import java.util.Scanner;

public class evenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz dodatnia liczbę");
        int liczba = sc.nextInt();

        if (liczba %2 == 0) {
            System.out.println(" Liczba jest parzysta");
        } else System.out.println("liczba jest nieparzysta");


    }
}
