package Vista;

import java.util.Random;

/**
 *
 * @author LEGOLAS
 */



public class LogicaJuego {
    
    public int[] getCardNumbers() {
        
        int[] numbers = new int[8];
        int count = 0;
        
        while(count < 8) {
            Random r = new Random();
            int na = r.nextInt(4) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 8; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }
            
        }  
        return numbers;
    }
   
    public int[] getCardNumbers16() {
        
        int[] numbers = new int[16];
        int count = 0;
       
        while(count < 16) {
            Random r = new Random();
            int na = r.nextInt(8) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 16; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }
            
        }  
        return numbers;
    }
    
        public int[] getCardNumbers24() {
        
        int[] numbers = new int[24];
        int count = 0;
       
        while(count < 24) {
            Random r = new Random();
            int na = r.nextInt(12) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 24; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }
            
        }  
        return numbers;
    }

       
    public int[] getCardNumbers20() {
        
        int[] numbers = new int[20];
        int count = 0;
       
        while(count < 20) {
            Random r = new Random();
            int na = r.nextInt(10) + 1; //genera un numero entre esa escala + 1
            int nvr = 0;
            
            for (int i = 0; i < 20; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }
            
        }  
        return numbers;
    }
    
    public int[] getCardNumbers32() {
        
        int[] numbers = new int[32];
        int count = 0;
       
        while(count < 32) {
            Random r = new Random();
            int na = r.nextInt(16) + 1; //genera un numero entre esa escala + 1
            int nvr = 0;
            
            for (int i = 0; i < 32; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }
            
        }  
        return numbers;
    }
    
     public int[] getCardNumbers36() {
        
        int[] numbers = new int[36];
        int count = 0;
       
        while(count < 36) {
            Random r = new Random();
            int na = r.nextInt(16) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 36; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }
            
        }  
        return numbers;
    }

    
}

