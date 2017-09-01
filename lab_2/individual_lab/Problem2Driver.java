package lab_2.individual_lab;

/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem2Driver implements Directions
{
    public static void main(String args[])  {
        Problem2 karel = new Problem2(5, 1, North, 10);
        karel.setPins();
        karel.turnOff();
        Problem2 Jim = new Problem2(4,1, North, 10);
        Jim.setPins2();
        Jim.turnOff();
        Problem2 Randy = new Problem2(3,3, North, 10);
        Randy.setPins3();
        Randy.turnOff();
        Problem2 Cole = new Problem2(2,4, North, 10);
        Cole.setPins4();
        Cole.turnOff();
        Problem2 James = new Problem2(6,2, North, 10);
        James.setPins5();
        James.turnOff();
        Problem2 Ryan = new Problem2(7,4,North, 10);
        Ryan.setPins6();
        Ryan.turnOff();
        Problem2 Sutter = new Problem2(8,5,North, 10);
        Sutter.setPins7();
        Sutter.turnOff();
        
        
    } 

    static {
        World.reset(); 
        World.readWorld("fig3-8.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}