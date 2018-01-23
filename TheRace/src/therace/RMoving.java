
package therace;

import java.util.Random;

public class RMoving 
{
    RFrame frame;
    private final static int pos_value = 28; // every 28 pixels equals 1 position
    double value;
    private boolean lock_a = true;
    private boolean lock_b = true;
    
    public RMoving(RFrame fr) { frame = fr;}
    
    public void moving(int animal, int x, int y) {
        if(animal == 1) move_hare(animal, x, y);
        if(animal == 2) move_tortoise(animal, x, y); 
    }
    
    public void move_hare(int animal, int x, int y){
        hare_start();
        go(animal, x, y);
        hare_stop();
    }
    
    public synchronized void hare_start() {
        while(!lock_a) {
            try{
                wait();
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted Exception");
            }
        }
        
        lock_a  = false;
        notifyAll();
    }
    
    public synchronized void hare_stop() {
        lock_a = true;
        notifyAll();
    }
    
    public void move_tortoise(int animal, int x, int y){
        tortoise_start();
        go(animal, x, y);
        tortoise_stop();
    }
    
    public synchronized void tortoise_start() {
        while(!lock_b) {
            try{
                wait();
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted Exception");
            }
        }
        
        lock_b  = false;
        notifyAll();
    }
    
    public synchronized void tortoise_stop() {
        lock_a = true;
        notifyAll();
    }
    
    public void go(int animal, int x, int y) {
        while(x <= 1400) {
            Random rand = new Random();
            value = rand.nextDouble();
            if(animal == 1){
                if(value > 0.0 && value < 0.5) // fast_plod
                    x += (2 * pos_value);
                if(value > 0.5 && value < 0.7){ // slip
                    if(x <= 0 || x <= (4 * pos_value)) {
                        x = 0;
                    }
                    else {
                        x -= (4 * pos_value);
                    }
                }
                if(value > 0.7 && value < 1.0) // slow_plod
                    x += pos_value;
                frame.move(x, y, animal);
                try {
                    Thread.sleep(300);
                }
                catch(InterruptedException e) {
                    System.err.println("Exception");
                }
            }
            if(animal == 2){
                if(value > 0.0 && value < 0.2) // sleep
                    x = x;
                if(value > 0.2 && value < 0.4) // big_hop
                    x += (7 * pos_value);
                if(value > 0.4 && value < 0.5){ // big_slip
                    if(x <= 0 || x <= (10 * pos_value)) {
                        x = x;
                    }
                    else {
                        x -= (10 * pos_value);
                    }
                }
                if(value > 0.5 && value < 0.8) // small_hop
                    x += pos_value;
                if(value > 0.8 && value < 1.0){ // small_slip
                    if(x <= 0 || x <= (2 * pos_value)){
                        x = x;
                    }
                    else {
                        x -= (2 * pos_value);
                    }
                }
                frame.move(x, y, animal);
                try {
                    Thread.sleep(300);
                }
                catch(InterruptedException e) {
                    System.err.println("Exception");
                }
            }
        }
    }
}