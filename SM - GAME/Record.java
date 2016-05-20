import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Records here.
 * 
 * @author Eduardo Sanchez and Jocelyn Covarrubias  
 * @version 1.1
 */
public class Record extends World
{

    /**
     * Constructor for objects of class Records.
     * 
     */
    public Record()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1);
        Binary test = new Binary();
        Position positions = new Position();
        if(test.existPlayer() == false) {
        //Create positions
        positions.setPlayerF("Eduardo");
        positions.setPlayerS("Anabel");
        positions.setPlayerT("Felipe");
        positions.setFirst(1420);
        positions.setSecond(1414);
        positions.setThird(1411);
        test.writePlayers(positions.getPlayers());
        if(test.existPoints() == false) {
            test.writeRecords(positions.getPoints());
        }
       } 
        
       if(test.existPlayer() == true && test.existPoints() == true) {
        //Read and write .dat
        Label text = new Label(test.readPlayers(),50);
        addObject (text,408,364);
        Label textPoints = new Label(test.readRecords(),50);
        addObject (textPoints,584,367);
        positions.setFirst(test.getOne());
        positions.setSecond(test.getTwo());
        positions.setThird(test.getThree());
       }
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ToBack buttonback = new ToBack();
        addObject(buttonback,800,650);
    }
}