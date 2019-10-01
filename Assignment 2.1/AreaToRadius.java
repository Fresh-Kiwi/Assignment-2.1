import java.util.Scanner;

class AreaToRadius {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    boolean runOnce = true;
        
    while (run == true) {    
        if (runOnce == true) {
            System.out.println("What is the area of the circle? Enter ''0'' to stop the program.");
            runOnce = false;
        } else {
            System.out.println("What is the area of the new circle?");
        }
        System.out.println("");
        
        double area = sc.nextDouble();
            
        if (area == 0) {
            System.exit(0);
        }
        
        double radius = Math.sqrt(area/Math.PI);
            
        System.out.println("");
            
        if (runOnce == true) {
            System.out.println("The radius of the circle is " + radius);
        } else {
            System.out.println("The radius of the new circle is " + radius);
        }
                
        System.out.println("");
    }
  }
}
