import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
   Scanner scan = new Scanner(System.in);

   System.out.println("whats your name?");
   String name = scan.next();
   System.out.println(name);
   System.out.println("Whats your age?");
   int age = scan.nextInt();
   System.out.println("what's your senior quote");
   String quote = scan.next();
   qoute += scan.next();
   System.out.println("Thank you"+ name + "you are" + age + "years old");
   System.out.println("and your senior qoute is" + quote);
  }
}