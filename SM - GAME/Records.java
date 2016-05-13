import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Records here.
 * 
 * @author Eduardo Corpus and Anabel Covarrubias 
 * @version 1.1
 */
public class Records extends World
{

    /**
     * Constructor for objects of class Records.
     * 
     */
    public Records()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1025, 825, 1);
        Binary test = new Binary();
        Position positions = new Position();
        if(test.existPlayer() == false) {
        //Create positions
        positions.setPlayerF("Andy");
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
        addObject (text,200,150);
        Label textPoints = new Label(test.readRecords(),50);
        addObject (textPoints,400,150);
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
        ButtonBack buttonback = new ButtonBack();
        addObject(buttonback,889,751);
    }
}
