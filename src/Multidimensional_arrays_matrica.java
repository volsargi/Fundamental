public class Multidimensional_arrays_matrica {
    public static void main(String [] args){
        int [] number= {1,2,3};

        int [] [] matrix = {{1,2,3},
                            {4,5,6},
                           {7,8,9}};

    for (int i = 0; i<matrix.length; i++){ //stroka vneshnego cikla- stroka ee dlina
        for(int j = 0; j<matrix[i].length; j++){ //vnutrnnij cikl krutimsja stolko raz skolko elementov
            System.out.print(matrix[i] [j] + " "); //print ne prinln- vajag izvietojumam
        }
        System.out.println();
    }
    }
}
