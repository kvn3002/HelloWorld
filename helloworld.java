import java.util.Scanner;

public class helloworld{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("how old are you?");
        int age = scanner.nextInt();

        System.out.println("what year is it?");
        int year = scanner.nextInt();

        int dob = year-age;
        
        System.out.println("you were born in " + dob);
    }

}