import java.util.Scanner;

public class Switch {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Vvedi vozrast");
        int age = scanner.nextInt();
        switch(age){
            case 0:
                System.out.println("You are born");
                break;
            case 7:
                System.out.println("You are child");
                break;
            case 18:
                System.out.println("You are student");
                break;
            case 80:
                System.out.println("You are very old :D ");
                break;
            default:
                System.out.println("Niodin ne podoshel");
        }
    }
}
