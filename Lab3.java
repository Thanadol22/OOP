package lab3;

public class Lab3 {
 
    public static void main(String[] args) {
        //สถานะ {
        //ปริมาณเม็ดทราย
        //ด้าน int side1...
        //ปริมาณทรายในด้าน A&B
        //}
        System.out.println("The sandclock position is 1,2,3,4 means the A side of the watch is at the position up,right,down,left, respectively");
        HourGlass sand = new HourGlass(5000,0,true);
        System.out.println("The starting amount os sand in side A: "+sand.getSideA()+" and in side B: "+sand.getSideB()+" and A side is at position "+sand.getCurrentSide());
        sand.passTime(10000);
        sand.rotate90();
         sand.rotate90();
        
        
        
       
        
        
    }
    
}

