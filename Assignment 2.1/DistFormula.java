import java.util.Scanner;

class DistFormula {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        
        while (run == true) {
            System.out.println("What is the X value of the first point? Enter a letter to stop the program.");
            
            System.out.println("");
            
            double x1 = sc.nextDouble();
            
            System.out.println("");
            
            System.out.println("What is the Y value of the first point?");
            
            System.out.println("");
            
            double y1 = sc.nextDouble();
            
            System.out.println("");
            
            System.out.println("What is the X value of the second point?");
            
            System.out.println("");
            
            double x2 = sc.nextDouble();
            
            System.out.println("");
            
            System.out.println("What is the Y value of the second point?");
            
            System.out.println("");
            
            double y2 = sc.nextDouble();
            
            System.out.println("");
            
            double distance = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));
            
            System.out.println("The distance between the two points is " + distance);
            
            System.out.println("");
        }
    }
}