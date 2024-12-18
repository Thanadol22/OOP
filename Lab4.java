
package lab4;
import java.util.Scanner;
public class Lab4 {

    public static void main(String[] args) {
       double glassCapacity = 1.0; 
       

        WaterGlass myGlass1 = new WaterGlass(glassCapacity);
        WaterGlass myGlass2 = new WaterGlass(glassCapacity);

        
        myGlass1.fillGlass(0.8); 
        myGlass1.fillGlass(1.2); 

        
       
        myGlass1.pourWater(0.5); 
        myGlass1.pourWater(1.5); 

        
        myGlass2.fillGlass(0.5); 

        
        myGlass1.pourInto(myGlass2, 0.5); 
        myGlass1.pourInto(myGlass2, 1.0); 
    }
    
}
