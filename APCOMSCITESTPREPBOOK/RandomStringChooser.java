package APCOMSCITESTPREPBOOK;

public class RandomStringChooser {
     private String[] arr; 
     private int[] x; 
     private int counter; 
   
     public RandomStringChooser(String[] temp) {
        arr = temp;
        x = new int[arr.length];  
        counter = 0; 
     } 
 
      public String getNext() {
           if (counter >= arr.length) { 
              return "NONE"; 
           } 
          int randIndex = (int)(arr.length * Math.random()); 
          for (int i = 0; i < x.length; i++) {
                if (randIndex == x[i]) {
                        while (randIndex == x[i]) {
                            randIndex = (int)(arr.length * Math.random()); 
                        }
                 }  
           }         
           x[counter] = randIndex; 
           counter++; 
           return arr[randIndex];   
     }
      
      public static void main(String[] args) {
    	  String[] wordArray = {"wheels", "on", "the", "bus"}; 
    	  RandomStringChooser sChooser = new RandomStringChooser(wordArray); 
    	  for (int k = 0; k < 6; k++) {
    		  System.out.print(sChooser.getNext() + " ");
    	  }
    	  
    	  
      }

}