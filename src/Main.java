import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int x,y,gcd=1,lcm,counter=1;

        System.out.print("Enter x:");
        x = scanner.nextInt();
        System.out.print("Enter y:");
        y = scanner.nextInt();

        while (counter <= x){

            if (x % counter == 0 && y % counter == 0){

                gcd = counter;

            }

            counter++;

        }

        // EKOK = (n1*n2) / EBOB
           lcm  = (x*y)   / gcd;


        System.out.println("*********************");
        System.out.println("GCD("+x+","+y+") = "+gcd); //EBOB
        System.out.println("LCM("+x+","+y+") = "+lcm); //EKOK
        System.out.println("*********************");









    }
}
