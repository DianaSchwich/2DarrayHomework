package TwoArrayHomework;
//Create 2D array of countries: north america countries, south america countries, europe countries, asian countries,
// african countries. Then print all values from that array using 2 different loops and calculate
// how many total countries been stored.
public class Contries {
    public static void main(String[] args) {
        String[][] countries = {
                {"USA","Cuba","Canada"},
                {"Colombia","Brasil","Peru"},
                {"italy","France","Greece"},
                {"Iran","India","North Korea"},
                {"Ethiopia","Egypt","Algeria"}
        };



        System.out.println("----------------For Loop-------------------");

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println("-----------------While Loop---------------------");
        int k=0;
        while  (k<countries.length) {
            int l=0;
            while (l<countries[k].length) {
                System.out.print(countries[k][l]+" ");
                l++;
            }
            System.out.println();
            k++;
        }
        System.out.println("-----------------Total Countries--------------------");
        int totalCountries=0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                totalCountries++;

            }

        }
        System.out.println(totalCountries);



    }
}




