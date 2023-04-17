package TwoArrayHomework;
//Using 2D array create a grocery list.
//Inside you should have an array of veggies, fruits,sweets dairy and . Retrieve all values from that array using 2 different loops
public class groceries {
    public static void main(String[] args) {
        String[][]grocery={
                          {"orange", "mango", "peach",},
                          {"tomato", "onions","broccoli"},
                          {"chocolate","caramel","cake",}};

        for (String[] row : grocery) {
                for (String elements : row) {
                    System.out.print(elements + " ");
                }
                System.out.println();
        }
        System.out.println("");
        for(int rows=0; rows<grocery.length;rows++) {
            for (int column = 0; column < grocery[rows].length; column++) {
                System.out.print(grocery[rows][column]+"");
            }
            System.out.println();
        }
    }
}
