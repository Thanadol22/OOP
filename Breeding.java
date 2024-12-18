
package nokkhuntongbreeding;

public class Breeding {

   
    public NokkhunTong breed(NokkhunTong bird1, NokkhunTong bird2) {
       
        if (bird1.isMale() == bird2.isMale()) {
            
            System.out.println("The sexes of birds must be different in order to breed.");
            return null;
        }
    
        boolean childIsMale = new java.util.Random().nextBoolean();
        String childName;
        if (childIsMale) {
            childName = bird1.getName().substring(0, 1) + bird2.getName().substring(0, 1); 
        } else {
            childName = bird2.getName().substring(0, 1) + bird1.getName().substring(0, 1); 
        }

       
        return new NokkhunTong(childName, childIsMale);
    }
}



