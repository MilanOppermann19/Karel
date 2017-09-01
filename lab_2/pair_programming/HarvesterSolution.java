package lab_2.pair_programming;

import kareltherobot.*; 
/**
 * Milan Oppermann
 * Mr.Appel
 * 8/30/17
 */
public class HarvesterSolution extends UrRobot
{   //Instance variables (fields) are declared
    
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public HarvesterSolution(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        move();
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    }
    
    public void harvestTwoRows() {

        harvestOneRow();
        NextRow();
        harvestOneRow();
        repositionRight();
    }
    
    public void repositionRight() {
        
        turnRight();
        move();
        turnRight();
    }
    
    private void turnRight() {
        //Your code goes here
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    private void harvestOneRow() {
        //your code goes here
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
    }
    
    public void harvestCorner() {
        //your code goes here
        pickBeeper();
    }
    
    private void NextRow() {
        //Before executing this, the robot should be facing East on the last corner
        // of the current row
        turnLeft();
        move();
        turnLeft();
        
    }
}

