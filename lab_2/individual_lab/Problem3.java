package lab_2.individual_lab;
import kareltherobot.*;
import java.awt.Color;



/**
 * Write a description of class Problem3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem3 extends Robot
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Problem3
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    
   
public void setH1() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void setH2() {
        turnRight();
        turnRight();
        move();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void setH3() {
        turnRight();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        
    }
    
public void setH4() {
    move();
    move();
    move();
    putBeeper();
    move();
    
    }
}
        
        

