
package hourglass;

public class HourGlassClass {

    int SandA, SandB; 
    int a = 2, b = a + 2; 

    HourGlassClass(int SandA, int SandB) {
        this.SandA = SandA; 
        this.SandB = SandB;
    }

    public void rotate90() {
        a++;b++; 
        a = a > 4 ? 1 : a++; 
        b = b > 4 ? 1 : b++;
        System.out.println("Now side A of the hourglass is at side " + a); 
        if (SandA != 0 && a == 1) { 
            while(true) {
                SandA = SandA - 1000;
                SandB = SandB + 1000;
                if(SandA < 0 || SandB < 0){ 
                    break;
                }
                try{ 
                    Thread.sleep(1000); 
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                
                System.out.println("Sand on side A = " + SandA + " || Sand on side B = "+ SandB);
                
            }

        } else if (SandB != 0 && b == 1) {
            while(true) {
                SandB = SandB - 1000;
                SandA = SandA + 1000;
                if(SandA < 0 || SandB < 0){
                    break;
                }
                try{ 
                    Thread.sleep(1000); 
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Sand on side A = " + SandA + " || Sand on side B = "+ SandB);
            }
        }

    }
    
     public void rotate180() {
        a += 2; 
        b += 2;
        a = a == 5 ? 1
                : a == 6 ? 2
                        : a;

        b = b == 5 ? 1
                : b == 6 ? 2
                        : b;
        System.out.println("Now side A of the hourglass is at side " + a);
        if (SandA != 0 && a == 1) {
            while(true) {
                SandA = SandA - 1000;
                SandB = SandB + 1000;
                if(SandA < 0 || SandB < 0){
                    break;
                }
                try{
                    Thread.sleep(1000); 
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                
                System.out.println("Sand on side A = " + SandA + " || Sand on side B = "+ SandB);
                
            }

        } else if (SandB != 0 && b == 1) {
            while(true) {
                SandB = SandB - 1000;
                SandA = SandA + 1000;
                if(SandA < 0 || SandB < 0){
                    break;
                }
                try{
                    Thread.sleep(1000); 
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Amount of sand on side A = " + SandA + " || Amount of sand on side B = "+ SandB);
            }
        }

    }
    
    
}
