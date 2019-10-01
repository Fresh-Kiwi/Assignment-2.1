import java.util.Scanner;

class SimpleInterest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        
        while (run == true) { 
        
            System.out.println("What is the principle? Enter a letter to stop the program.");
        
            System.out.println("");
        
            double p = sc.nextDouble();
        
            System.out.println("");
        
            System.out.println("What is the rate?");
            
            System.out.println("");
            
            double r = sc.nextDouble();
            
            System.out.println("");
            
            System.out.println("What is the length in years?");
            
            System.out.println("");
            
            double y = sc.nextDouble();
            
            double a = p * Math.pow((1 + r), y);
            
            System.out.println("");
            
            System.out.println("The amount is " + a);
            
            System.out.println("");
        }
    }
}