import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("***WELCOME TO MAKAUT SGPA TO GRADE CONVERTER***");
        Float num;
        System.out.println("Enter The SGPA Score");
        num = Sc.nextFloat();
        System.out.println("CONVERTER SGPA INTO GRADE...");
        if(num>10)
        {
            System.out.println("Beyond Range");
        }
        else if(num>9){
            System.out.println("Your grade is O");
        }
        else if(num>8)
        {
            System.out.println("Your grade is A");
        }
        else if(num>7)
        {
            System.out.println("Your grade is B");
        }
        else if(num>6)
        {
            System.out.println("Your grade is C");
        }
        else if(num>5)
        {
            System.out.println("Your grade is D");
        }
        else
        {
            System.out.println("Sorry to say but you Failed...\n Prepare for the backlog :(");
        }
        System.out.println("Thank you Come again... :)");
    }
}
