import java.util.Scanner;
public class Calculator 
{
    public static void main(String[] args)
    {
        int num1=0, num2=0, ch=0,num=0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The 1st Number");
        num1 = Sc.nextInt();
        System.out.println("Enter The 2nd Number");
        num2 = Sc.nextInt();
        while(true)
        {
            System.out.println("Press 1 to add\n Press 2 to subtraction\n Press 3 to Multiplication\n Press 4 to division");
            ch = Sc.nextInt();
            switch (ch) 
            {
                case 1:
                  num=num1+num2;
                  System.out.println("Output:"+num);
                  break;
                case 2:
                num=num1-num2;
                  System.out.println("Output"+ num);
                  break;
                case 3:
                num=num1*num2;
                  System.out.println("Output:"+num);
                  break;
                case 4:
                num=num1/num2;
                  System.out.println("Output:"+num);
                  break;
            }
        }

    }
}
