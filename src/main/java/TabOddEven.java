

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TabOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz liczbe\nDla zakonczenia programu wprowadz 0");
        int liczba = sc.nextInt();
        List<Integer> listP = new ArrayList();
        List<Integer> listN = new ArrayList();

        while (liczba != 0) {
            System.out.println("Wprowadz nastepną liczbe");
            liczba = sc.nextInt();
            if (liczba % 2 == 0) {
                listP.add(liczba);
            } else if (liczba % 2 != 0) {
                listN.add(liczba);
            }
        }
        System.out.println("Wpisales 0, program zostal zakonczony. \nLiczba wszystkich wprowadzinych liczb: " + (listP.size() + listN.size()) + "\n Liczba podanych parzystych liczb: " + listP.size() + "\n Liczba podanych nieparzyst liczb: " + listN.size());
        System.out.println("lista parzystych liczb: " +listP +"\nLista niepparzystyc licb: " + listN);
        System.out.println("lista wszytkich liczb: " +listP +" " + listN);


    }


}
