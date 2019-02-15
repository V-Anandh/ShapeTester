import java.lang.Math;
import java.util.Scanner; 
import java.text.DecimalFormat;
class ShapeTester {
  public static void main(String[] args) {
    //Start Part
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("Welcome to shape maker! Lets find and volume and surface area for a few shapes...");
    System.out.println("What shape would you like to calculate first? For a Box (Type the number 1), For a Pyramid (Type the number 2), or For a Sphere (Type the number 3)");    
    Scanner sc = new Scanner(System.in);
      int shape = sc.nextInt();
    // Box
    if (shape == 1){
     System.out.println("What is the length of the box?");
    int bLength = sc.nextInt();
     System.out.println("What is the width of the box?");
    int bWidth = sc.nextInt();    
     System.out.println("What is the height of the box?");
    int bHeight = sc.nextInt();
    Box B1 = new Box(bLength,bWidth,bHeight);
     System.out.println("The volume of your box: " + B1.volume());
     System.out.println("The surface area of your box : " + B1.surfaceArea());
    }  
    //Pyramid
    if (shape == 2){
     System.out.println("What is the length of the pyramid?");
    int pLength = sc.nextInt();
     System.out.println("What is the width of the pyramid?");
    int pWidth = sc.nextInt();    
     System.out.println("What is the height of the pyramid?");
    int pHeight = sc.nextInt();
    Pyramid P1 = new Pyramid(pLength,pWidth,pHeight);
     System.out.println("The volume of your pyramid: " + P1.volume());
     System.out.println("The surface area of your pyramid : " + df.format(P1.surfaceArea()));
    }   
    //Sphere   
    if (shape == 3){
     System.out.println("What is the radius of the sphere?");
    int sRadius = sc.nextInt();
    Sphere S1 = new Sphere(sRadius);
     System.out.println("The volume of your sphere: " + df.format(S1.volume()));
     System.out.println("The surface area of your sphere : " + df.format(S1.surfaceArea()));
    }         
      
  }
}