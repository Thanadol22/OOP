
package hourglass;

public class HourGlass {

   
    public static void main(String[] args) {
        HourGlassClass HourGlass = new HourGlassClass(5000, 0);
        System.out.println("The sandclock position is 1,2,3,4 means the A side of the watch is at the position up,right,down,left, respectively");
        System.out.println("Side A of the HourGlass is at Side " + HourGlass.a);

        HourGlass.rotate90();
        HourGlass.rotate90();
        HourGlass.rotate90();
       
    }
    
}
