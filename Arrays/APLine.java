package Arrays;
public class APLine {
    private int a; 
    private int b; 
    private int c; 

    public APLine(int a, int b, int c) {
         this.a = a; 
         this.b = b; 
         this.c = c; 
    } 
     
    public double getSlope() {
            return (double) (-1 * this.a) / this.b;  
     }  

     public boolean isOnLine(int x, int y) {
           if (((this.a * x) + (this.b * y) + this.c) == 0) 
                  return true; 
           return false;         
      } 
     public static void main(String[] args) {
    	 APLine line1 = new APLine(5, 4, -17); 
    	 double slope1 = line1.getSlope();
    	 System.out.println(slope1);
    	 boolean onLine1 = line1.isOnLine(5, -2);
    	 System.out.println(onLine1);
     }
} 


