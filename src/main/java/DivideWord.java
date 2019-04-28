import java.util.Scanner;

public class DivideWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Możesz wprowadzac dane!");
        String slowo = sc.next();

        int polowa = slowo.length()/2;

        System.out.println("Liczba znakobw: " +slowo.length());
        System.out.println(slowo.substring(polowa));



    }
}
