
package lab2;

public class Lab2 {
    
    public static void main(String[] args) {
    
        NokKhunTong myNokKhunThong  = new NokKhunTong();
        //NokKhunTong myNokKhunThong2  = new NokKhunTong(); //Method ที่มีชื่อเหมือนกับ class เรียกมันว่า Constructor ซึ่งมีไว้สำหรับสร้าง 
                                                         //object (จองหน่วยความจำบน RAM ตามขนาดของ class)
        //myNokKhunThong.name = "Tongdum";
        //myNokKhunThong2.name = "Tongdang";
        //System.out.println(myNokKhunThong.name);
        //System.out.println(myNokKhunThong2.name);
        
        //myNokKhunThong.speak(); 
        //myNokKhunThong2.speak(); 
        myNokKhunThong.talk();
        myNokKhunThong.eat();
        myNokKhunThong.poo();
        
        }
    
        
    }

    

