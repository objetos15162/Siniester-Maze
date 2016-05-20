import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maze here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Maze extends World
{
    private SimpleTimer timer;
    private Counter timerDisplay;
    private Counter keyDisplay;
    private Counter clueDisplay;
    private BLife barLife;
    private BOxigen barOxigen;
    private BAdrenalin barAdrenalin;
    private GamerBrad gamerBrad;
    private String mazeA;
    private String mazeB;
    private String mazeC;
    private String mazeD;
    Label namePlayer;
    
    /**
     * Constructor for objects of class Maze.
     * 
     */
    public Maze(String player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1);
        Greenfoot.setSpeed(50);
        timerDisplay = new Counter(" ");
        addObject(timerDisplay,328,28);
        timer = new SimpleTimer();
        keyDisplay =new Counter(" ");
        addObject(keyDisplay,702,18);
        clueDisplay =new Counter(" ");
        addObject(clueDisplay,704,44);
        barLife= new BLife();
        addObject(barLife,532,15);
        barOxigen= new BOxigen();
        addObject(barOxigen,533,43);
        barAdrenalin= new BAdrenalin();
        addObject(barAdrenalin,820,41);
        gamerBrad= new GamerBrad();
        addObject(gamerBrad,50,404);
        namePlayer= new Label(player,25);
        addObject(namePlayer,150,28);
        buildMazeA();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ToBack buttonback = new ToBack();
        addObject(buttonback,862,657);
        Key key = new Key();
        addObject(key,303,242);
        Key key2 = new Key();
        addObject(key2,377,439);
        Key key3 = new Key();
        addObject(key3,398,593);
        Key key4 = new Key();
        addObject(key4,105,550);
        Key key5 = new Key();
        addObject(key5,118,634);
        Key key6 = new Key();
        addObject(key6,539,628);
        Key key7 = new Key();
        addObject(key7,617,389);
        Key key8 = new Key();
        addObject(key8,798,337);
        Adrenalin adrenalin = new Adrenalin();
        addObject(adrenalin,474,257);
        Adrenalin adrenalin2 = new Adrenalin();
        addObject(adrenalin2,770,615);
        Adrenalin adrenalin3 = new Adrenalin();
        addObject(adrenalin3,370,534);
        Adrenalin adrenalin4 = new Adrenalin();
        addObject(adrenalin4,150,299);
        Clue clue = new Clue();
        addObject(clue,593,231);
        Clue clue2 = new Clue();
        addObject(clue2,329,338);
        Clue clue3 = new Clue();
        addObject(clue3,249,564);
        Clue clue4 = new Clue();
        addObject(clue4,785,578);
        KeySpecial keyspecial = new KeySpecial();
        addObject(keyspecial,553,470);
        KeySpecial keyspecial2 = new KeySpecial();
        addObject(keyspecial2,154,208);
        KeySpecial keyspecial3 = new KeySpecial();
        addObject(keyspecial3,470,200);
        KeySpecial keyspecial4 = new KeySpecial();
        addObject(keyspecial4,824,295);
        Door door = new Door();
        addObject(door,511,355);
        door.setLocation(510,355);
        KeySpecial keyspecial5 = new KeySpecial();
        addObject(keyspecial5,474,364);
        removeObject(keyspecial4);
        removeObject(keyspecial2);
        Nurse nurse = new Nurse();
        addObject(nurse,398,274);
        Nurse nurse2 = new Nurse();
        addObject(nurse2,475,616);
        Esther esther = new Esther();
        addObject(esther,836,293);
        Billy billy = new Billy();
        addObject(billy,249,651);
        Saw saw = new Saw();
        addObject(saw,845,582);
        Ben ben = new Ben();
        addObject(ben,184,292);
    }
   
    /*
     * This method makes to act the timer in the maze
     */
    @Override
    public void act()
    {      
      if(timer.millisElapsed()>1000)
      {
          timerDisplay.add(1);  
          timer.mark();
      }
    }
    
    /**
     * This metod return a display of type clueDisplay
     * @return a counter of type clueDisplay
     */
    public Counter getClues()
    {
        return clueDisplay;
    }
    
    /**
     * This metod return a display of type keyDisplay
     * @return a counter of type keyDisplay
     */
    public Counter getKeys()
    {
        return keyDisplay;
    }
    
    /**
     * This metod return a object of type GamerBrad
     * @return a object of type GamerBrad
     */
    public GamerBrad getBrad()
    {
        return gamerBrad;
    }
    
    /**
     * This metod return a int value of the timerDisplay
     * @return a int value of the timerDisplay
     */
    public int getActualTime()
    {
        return timerDisplay.getValue();
    }
    
    /*
     * This method initialize a string to create the maze A
     */
    private void setMazeA()
    {
        mazeA =
        "NNNNNNNNNNNNNNNNNNNNHHHHHHHNNNNNNNNNNNNNNNNNN" +
        "HHHHHHHHHHHHHHHHHHHHHNNNNNHHHHHHHNNNNNNNNNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNNNNNNNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNNNNNNNNNN" +
        "HNNNHHHHHHHNNNNNNNNNNNNNNNNNNNNNHHHHHHHHHHHHH" +
        "HNNNNNNNNNHNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNHNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNHNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNHHHHHNNNNNNNHNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNHNNNHNNNNNNNHNNNNNNNNNNH" +
        "HNNNNNNHHHHNNNNNNNNNNHNNNHNNNNNNNHNNNNNNNNNNH" +
        "HNNNNNNHNNHNNNNNNNNNNHHHHHNNNNNNNHNNNNNNNNNNH" +
        "HNNNNNNHNNHNNNNNNNNNNNNNNNNNNNNNNHNNNNNNHHHHH" +
        "HNNNNNNHNNHHHHHNNNNNNNNNNNNNNNNNNHNNNNNNHNNNN" +
        "HNNNNNNHNNNNNNHNNNNNNNNNNNNNNNNNNHNNNNNNHNNNN" +
        "HNNNNNNHHHHHHHHNNNNNNNNNNNNNNNNNNNNNNNNNHNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHHHHH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNHHHHHHHHHHNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNNNNNNNNH" +
        "HNNNNNNHHHHHHHHHNNNNNNNNNNNNNNNNNHNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH";
        
    }
    
    /*
     * This method initialize a string to create the maze B
     */
    private void setMazeB()
    {
        mazeB =
        "NNNNNNNNNNNNNNNNNNNNHHHHHHHNNNNNNNNNNNNNNNNNN" +
        "HHHHHHHHHHHHHHHHHHHHHNNNNNHHHHHHHNNNNNNNNNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNNNNNNNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNNNNNNNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHHHHHHHHHHHHH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHHHHH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHHHHH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH";
    }
    
    /*
     * This method initialize a string to create the maze C
     */
    private void setMazeC()
    {
        mazeC =
        "NNNNNNNNNNNNNNNNNNNNHHHHHHHNNNNNNNNNNNNNNNNNN" +
        "HHHHHHHHHHHHHHHHHHHHHNNNNNHHHHHHHNNNNNNNNNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNNNNNNNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNNNNNNNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHHHHHHHHHHHHH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHHHHH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHHHHH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH";
    }
    
    /*
     * This method initialize a string to create the maze D
     */
    private void setMazeD()
    {
        mazeD =
        "NNNNNNNNNNNNNNNNNNNNHHHHHHHNNNNNNNNNNNNNNNNNN" +
        "HHHHHHHHHHHHHHHHHHHHHNNNNNHHHHHHHNNNNNNNNNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNNNNNNNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNNNNNNNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHHHHHHHHHHHHH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHHHHH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHNNNN" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHHHHH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNH" +
        "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH";
    }
    
    /*
     * This method create the blocks of maze A following the string the maze A
     */
    private void buildMazeA()
    { 
      int x = 10;
      int y = 140;
      setMazeA();
      for(int p=0;p<mazeA.length();p++)
      {
          if(mazeA.charAt(p)== 'H')
          {
              addObject(new Bloc(),x,y);
          }
          
          if(mazeA.charAt(p)== 'V')
          {
              addObject(new Bloc(),x,y);
          }
          x +=20;
          if(x>getWidth())
          {
              x = 10;
              y += 24;
          }
          
      }
    }

    
}
