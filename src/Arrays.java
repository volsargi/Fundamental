public class Arrays {
    public static void main(String[] args) {
        int number = 10; //korobka i v nej cifra
       int[] numbers = new int[5];//kolichestvo cyfr bez konkretnyh dannyh
       for(int i = 0; i<numbers.length; i++){ // cikl for do 5
           numbers[i] = i*10;  //beret 0 cyfru prikladyvaet v i++ edinicu i tak dalee do 5, tak inicializiruem masiv
       }
for(int i =0; i<numbers.length; i++){   // a tak inicializirovanij cikl vyvodim na ekran
    System.out.println(numbers[i]);
}
        System.out.println(); // svobonaja stroka dlja otdelenija
int[] numbers1 = {1,2,3}; // kogda hotim pomestitj konkretnie cifry
        for( int i = 0; i<numbers1.length;i++){
            System.out.println(numbers1[i]);
        }
    }
}
