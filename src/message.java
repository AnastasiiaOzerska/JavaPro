import java.util.Scanner;

public class message {
    public static void main(String[] args) {
        String militaryCommissarMessage = " , visit the draft board";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        if(age>=18 && age<=26){
            System.out.println(name + militaryCommissarMessage);
        }

    }
}
