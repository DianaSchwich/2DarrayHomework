package TwoArrayHomework;
//Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops
public class Cars {
    public static void main(String[] args) {
        String[][] cars = {
                {"american", "german"},
                {"korean", "italian"}

        };

        for (int row = 0; row < cars.length; row++) {

            for (int colum = 0; colum < cars[row].length; colum++) {
                System.out.println(cars[row][colum] +"");
            }

            System.out.println();
        }
                for(String[] row:cars){
                    for(String elements:row){
                        System.out.println(elements+"");
                }

                }
    }
}