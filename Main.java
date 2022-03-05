import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter a Number");

    num = sc.nextInt();
    if(num%2==0)
    {
      System.out.println(num +" is an Even Number");  
    }
    else{
      System.out.println(num +" is a odd Number");
    }
  }
}
