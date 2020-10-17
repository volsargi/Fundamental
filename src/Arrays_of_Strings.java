public class Arrays_of_Strings {
    public static void main(String[] args){
        int[] numbers = new int [5]; //izveidots masīvs ar 5 tukšām rūtīm
        numbers [0] = 10;
        String[] strings = new String [3];
        strings [0] = "privet";
        strings [1] = "poka";
        strings [2] = "Java";
      System.out.println(strings[0]); // printējam ārā
      System.out.println(strings[1]); // printējam ārā
        for(int i = 0;  i<strings.length; i++){
            System.out.println(strings[i]);
        }
    for(String string:strings){ //stroka , imja stroki i massiv cherez kotorij prohodim
        System.out.println(string);
    }
int[] numbers1 = {1, 2, 3}; //masīvs ar skaitļiem uzreiz
        int sum = 0;
        for (int x:numbers1){ // x ir intx=1; nākamajā pievieno vēl sum un beigās visu ciparu summa
            sum = sum + x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0; //vydeljaem mesto 32 bita pamjati
     // String s; // vydeljaetsa pamjatj tolko na ssylku na korobku dannyh
        String s= null; // uzhe mesto na stroku, no null eto pustota
        System.out.println(s);
    }
}
