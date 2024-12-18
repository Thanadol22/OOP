
package lab4;

import java.util.Scanner;

public class Glass {
    int glass1;
    int glass2;
    int choose,fill,water,pour;
    
    Glass(int a, int b){this.glass1 = a; this.glass2 = b;}
    
    Scanner scanner = new Scanner(System.in);
    
    public void fillwater(){
        System.out.println("กรุณาเลือกบริการ 1.เติมน้ำเต็มแก้ว 2.เติมน้ำตามปริมาณที่ต้องการ");
        choose = scanner.nextInt();
        switch(choose){
            case 1 :
                water = glass1;
                System.out.println("ปริมาตรน้ำในแก้ว : "+water+" มิลลิลิตร");
                break;
            case 2 :
                System.out.println("ปริมาตรน้ำที่ต้องการเติม : ");
                fill = scanner.nextInt();
                if (fill>=glass1)
                    System.out.println("ปริมาตรน้ำในแก้ว : "+glass1+" มิลลิลิตร");
                
                else
                    System.out.println("ปริมาตรน้ำในแก้ว : "+fill+" มิลลิลิตร");
                
                break;
            
            default :
                System.out.println("กรุณาเลือกรายการตามที่กำหนด");
        }
    }
    public void pourwater(){
        System.out.println("ปริมาตรน้ำในแก้ว: "+glass1);
        System.out.println("กรุณาเลือกบริการ 1.เทน้ำทิ้งหมดแก้ว 2.เทน้ำทิ้งตามปริมาณที่ต้องการ");
        choose = scanner.nextInt();
        switch(choose){
            case 1 :
                glass1 = 0;
                System.out.println("ปริมาตรน้ำในแก้ว : "+glass1+" มิลลิลิตร");
                break;
            case 2 :
                System.out.println("ปริมาตรน้ำที่ต้องการเททิ้ง : ");
                pour = scanner.nextInt();
                if (pour>=glass1)
                    System.out.println("ปริมาตรน้ำในแก้ว : "+glass1+" มิลลิลิตร");
                
                else{
                    pour = glass1 - pour;
                    System.out.println("ปริมาตรน้ำในแก้ว : "+pour+" มิลลิลิตร");
                }
                break;
            
            default :
                System.out.println("กรุณาเลือกรายการตามที่กำหนด");
        }
    
    }
}
