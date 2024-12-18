
package lab2;

import java.util.Scanner;

public class NokKhunTong {
    // String = Class name = Refercent
    int age=21;
    float weight=500,foodweight;
    
     public void speak() {
        System.out.println("Hello Wednesday");
    }
     
     public void talk() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("พูด: ");
        String talk = scanner.nextLine();
        System.out.println("Tongdum: "+talk);
        if (talk.isEmpty())
            System.out.println("อายุ "+age+" ปี");
        
        
    }
     public void eat() {
        System.out.println("น้ำหนักตัว = "+weight+" กรัม");
        Scanner scanner = new Scanner(System.in);
        System.out.print("กินอาหาร(กรัม): ");
        float eat = scanner.nextFloat();
        foodweight = eat;   
        if(foodweight > weight){
            foodweight = 0;
            System.out.println("กินเยอะเกินไปทำให้ท้องเสีย x_x ");
            System.exit(0);
        }
        else{
             weight = foodweight + weight;
             System.out.println("น้ำหนักตัว = "+weight+" กรัม");
             System.out.println("น้ำหนักอาหารในกระเพาะ "+foodweight+" กรัม");
             
        }
    }
     
    public void poo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ถ่าย: ");
        float poo = scanner.nextFloat();
        foodweight = foodweight - poo;
        System.out.println("เหลืออาหารในกระเพาะ "+foodweight+" กรัม");
    }
    
     
}

