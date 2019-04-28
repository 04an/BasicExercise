public class Maxnumber {

    public static void main(String[] args) {
        int[] tab = {1, 20, 3, 4, 5, 6, 7, 8, 9, 10};

        int numMax = tab[0];
        int numMin = tab[0];
        int minInd = 0;
        int maxInd= 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > numMax) {
                numMax = tab[i];
                maxInd = i;
            }
            if (tab[i] < numMin) {
                numMin = tab[i];
                minInd = i;
            }
        }
        System.out.println("liczba maksymalna: " + numMax +" Numer indeksu: "+maxInd+ "\n" + "liczba minimalna: " +numMin + " Numer indeksu: " +minInd);

//  System.out.println("liczba maksymalna: " + numMax);
//        for (int i = 0; i < tab.length; i++)
//            if (tab[i] < num) {
//                num = tab[i];}
//System.out.println("liczba minimalna: " + numMin);
    }
}
