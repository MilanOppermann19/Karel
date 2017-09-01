package lab_2.individual_lab;

/**
   @Author:Milan
      Date:
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 karel = new Problem3(3, 2, North, 10);
        karel.setH1();
        karel.setH2();
        karel.setH3();
        karel.setH4();
    }

    static {
        World.reset(); 
        World.readWorld("fig3-8.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(30);  
        World.setVisible(true);
    }
}
