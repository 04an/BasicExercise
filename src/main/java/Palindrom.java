import java.util.Scanner;


public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz tekst:");
        String slowo = sc.next();
        boolean znaczenie = true;
        char[] znak = slowo.toCharArray();
        for (int i = 0; i < znak.length; i++) {
            if (znak[i] != znak[znak.length - i - 1]) {
                znaczenie = false;
            }
            if (znaczenie == true) System.out.println("Hura slowo jest palidromem");
            else System.out.println("problem");
            break;
        }
    }
}

