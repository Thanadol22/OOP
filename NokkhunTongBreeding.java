package nokkhuntongbreeding;

public class NokkhunTongBreeding {

    public static void main(String[] args) {
       
        NokkhunTong bird1 = new NokkhunTong("Dang", true);  
        NokkhunTong bird2 = new NokkhunTong("Blue", false); 
        NokkhunTong bird3 = new NokkhunTong("Red", true);   
        NokkhunTong bird4 = new NokkhunTong("Green", false); 

       
        Breeding breeding = new Breeding();

       
        NokkhunTong child1 = breeding.breed(bird1, bird2);
        if (child1 != null) {
            System.out.println("Name of Child 1 (from Dang and Blue): " + child1.getName());
            System.out.println("Sex of Child 1: " + (child1.isMale() ? "Male" : "Female"));
        }
        System.out.print("\n");
        NokkhunTong child2 = breeding.breed(bird3, bird4);
        if (child2 != null) {
            System.out.println("Name of Child 2 (from Red and Green): " + child2.getName());
            System.out.println("Sex of Child 2: " + (child2.isMale() ? "Male" : "Female"));
        }
        System.out.print("\n");
        NokkhunTong child3 = breeding.breed(bird1, bird3); 
    }
}
