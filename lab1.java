import java.util.Scanner;

public class lab1{

    public static void main(String args[]){

        float a,b,res;
        char choice,ch;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("1 Add two numbers\n");
            System.out.print("2 Multiply two numbers\n");
            System.out.print("3 EXIT\n");

            choice = scan.next().charAt(0);
            switch(choice){

                case '1' : System.out.println("CASE 1");
                            a = scan.nextFloat();
                            b = scan.nextFloat();
                            res = a+b;
                            System.out.println("RESULT = "+ res);
                            break;

                case '2' : System.out.println("CASE 2");
                            a = scan.nextFloat();
                            b = scan.nextFloat();
                            res = a*b;
                            System.out.println("RESULT = "+ res);
                            break;

                case '3' : System.exit(0);
                            break;

                default : System.out.println("DEFAULT");
                            break;
            }
        }while(choice !=2);
    }
}