package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        turnRight();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void setPins2(){
         turnRight();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        
    }
     public void setPins3(){
         turnRight();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void setPins4(){
        turnRight();
        move();
        putBeeper();
    }
    public void setPins5 () {
        turnRight();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void setPins6 () {
        turnRight();
        putBeeper();
        move();
        move();
        putBeeper();
        
    }
    public void setPins7 () {
        turnRight();
        putBeeper();
    }
    }

