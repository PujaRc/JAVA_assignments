package arithmatic;

import java.util.Scanner;

class Basarith{
        double add(double a, double b){
            return(a+b);
        }
        double subtract(double a, double b){
            return(a-b);
        }
        double multiply(double a, double b){
            return(a*b);
        }
        double divide(double a, double b){
            return(a/b);
        }
        double modulo(double a, double b){
            return(a%b);
        }

        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
    
            Basarith obj = new Basarith();
    
            System.out.println("\n");

            System.out.println("The sum of the given inputs is: " + obj.add(a, b));
            System.out.println("The difference of the given inputs is: " + obj.subtract(a, b));
            System.out.println("The product of the given inputs is: " + obj.multiply(a, b));
            System.out.println("The quotient of the given inputs is: " + obj.divide(a, b));
            System.out.println("The remainder of the given inputs is: " + obj.modulo(a, b));
    
        }

}