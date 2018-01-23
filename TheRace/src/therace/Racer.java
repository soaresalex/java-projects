
package therace;

public class Racer extends Thread {
    private int x;
    private int y;
    private final int animal;
    RMoving m;
    
    public Racer(int a, RMoving m1) {
        animal = a;
        m = m1;
        if(animal == 1) {x = 0; y = 50;}
        if(animal == 2) {x = 0; y = 160;}
    }
    
    public void run() {
        m.moving(animal, x, y);
    }
}