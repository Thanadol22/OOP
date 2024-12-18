package lab4;
public class WaterGlass {

    private double glassCapacity;
    private double currentVolume;

    public WaterGlass(double glassCapacity) {
        this.glassCapacity = glassCapacity;
        this.currentVolume = 0;
    }

   
    public void fillGlass(double fillWater) {
       
        if (fillWater <= glassCapacity) {
            currentVolume = fillWater;
            System.out.println("เติมน้ำในแก้ว " + currentVolume + " ลิตร");
        } else {
            currentVolume = glassCapacity;
            double spilledWater = fillWater - glassCapacity;
            System.out.println("เติมน้ำในแก้ว " + currentVolume + " ลิตร");
            System.out.println("น้ำล้น " + spilledWater + " ลิตร");
        }
    }

 
    public void pourWater(double pour) {
        
        if (pour <= currentVolume) {
            currentVolume -= pour;
            System.out.println("เทน้ำออก " + pour + " ลิตร");
            System.out.println("น้ำที่เหลือในแก้ว: " + currentVolume + " ลิตร");
        } else {
            System.out.println("ไม่สามารถเทน้ำออก " + pour + " ลิตรได้ เนื่องจากเกินปริมาณน้ำที่มีอยู่");
        }
    }

  
    public void pourInto(WaterGlass anotherGlass, double amountToPour) {
        if (amountToPour <= currentVolume) {
            if (amountToPour + anotherGlass.currentVolume <= anotherGlass.glassCapacity) {
                this.currentVolume -= amountToPour;
                anotherGlass.currentVolume += amountToPour;
                System.out.println("เทน้ำ " + amountToPour + " ลิตร ไปยังแก้วอีกใบ");
                System.out.println("น้ำที่เหลือในแก้ว: " + this.currentVolume + " ลิตร");
                System.out.println("น้ำในแก้วอีกใบ: " + anotherGlass.currentVolume + " ลิตร");
            } else {
                System.out.println("ไม่สามารถเทน้ำได้เพราะจะล้นแก้วอีกใบ");
            }
        } else {
            System.out.println("ไม่สามารถเทน้ำได้เพราะปริมาณน้ำไม่เพียงพอ");
        }
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public double getGlassCapacity() {
        return glassCapacity;
    }
}

