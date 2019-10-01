import java.util.Scanner;

class D6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        
        while (run == true) {
            int count = 0;
            
            System.out.println("Enter ''roll'' to generate 10 random six-sided dice rolls. Enter ''exit'' to stop the program.");
            
            System.out.println("");
            
            String r = sc.nextLine();
            
            System.out.println("");
            
            if (r.equals("roll")) {
                while (count < 10) {
                    double randN = Math.floor((Math.random() * 6) + 1);
                    
                    System.out.println("");
                    
                    System.out.println(randN);
                    
                    System.out.println("");
                    
                    count++;
                }
            }
            
            if (r.equals("exit")) {
                System.exit(0);
            }
            
            System.out.println("");
        }
    }
}
