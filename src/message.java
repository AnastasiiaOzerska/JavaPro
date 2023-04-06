import java.util.Scanner;

public class message {
    public static void main(String[] args) {
        String militaryCommissarMessage = " , visit the draft board";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter your name");
            String name = scanner.next();
            System.out.println("Enter your age");
        int age = scanner.nextInt();
        if(age>=18 && age<=26){
            System.out.println(name + militaryCommissarMessage);
        }else {
            System.out.println("You are not the right age");
        }

    }
}}
