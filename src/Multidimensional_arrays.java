
public class Multidimensional_arrays {
    public static void main(String[] args){
        int [] number = {1,2,3};

   int [] [] matrix = {{1,2,3,4,5},
                      {4,5,6},
                      {7,8,9,13}};
        System.out.println(matrix[0][3]);
        System.out.println(matrix[1] [1]);

        int [] number1 = new int[5];
        String[] [] strings = new String [2] [3];
        strings[0] [1] = "Hellllo";
        System.out.println(strings [0] [1]);
    }
}
