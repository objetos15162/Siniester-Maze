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
    
    /**
     * Constructor for objects of class Maze.
     * 
     */
    public Maze()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1);
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
        addObject(gamerBrad,148,404);
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
    }
   
    @Override
    public void act()
    {      
      if(timer.millisElapsed()>1000)
      {
          timerDisplay.add(1);  
          timer.mark();
      }
    }
    
    public Counter getClues()
    {
        return clueDisplay;
    }
    
    public Counter getKeys()
    {
        return keyDisplay;
    }
    
    private void setMazeA()
    {
        mazeA =
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
    
    public void setLife()
    {
        if(gamerBrad.getLife()==100)
        {
           barLife.setImage("SM - BarLife100.png");
        }
        
        if(gamerBrad.getLife()==75)
        {
           barLife.setImage("SM - BarLife75.png");
        }
        
        if(gamerBrad.getLife()==50)
        {
           barLife.setImage("SM - BarLife50.png");
        }
        
        if(gamerBrad.getLife()==25)
        {
           barLife.setImage("SM - BarLife25.png");
        }
        
        if(gamerBrad.getLife()==0)
        {
            Screen lostWorld= new Screen(2);
            Greenfoot.setWorld(lostWorld);
        }
    }
    
    public void setOxigen()
    {
        if(gamerBrad.getOxigen()==100)
        {
           barOxigen.setImage("SM - BarOxigen100.png");
        }
        
        if(gamerBrad.getOxigen()==75)
        {
           barOxigen.setImage("SM - BarOxigen75.png");
        }
        
        if(gamerBrad.getOxigen()==50)
        {
           barOxigen.setImage("SM - BarOxigen50.png");
        }
        
        if(gamerBrad.getOxigen()==25)
        {
           barOxigen.setImage("SM - BarOxigen25.png");
        }
        
        if(gamerBrad.getOxigen()==0)
        {
            Screen lostWorld= new Screen(2);
            Greenfoot.setWorld(lostWorld);
        }
    }
    
    public void setAdrenalin()
    {
        if(gamerBrad.getAdrenalin()==100)
        {
           barAdrenalin.setImage("SM - BarAdrenalin100.png");
        }
        
        if(gamerBrad.getAdrenalin()==75)
        {
           barAdrenalin.setImage("SM - BarAdrenalin75.png");
        }
        
        if(gamerBrad.getAdrenalin()==50)
        {
           barAdrenalin.setImage("SM - BarAdrenalin50.png");
        }
        
        if(gamerBrad.getAdrenalin()==25)
        {
           barAdrenalin.setImage("SM - BarAdrenalin25.png");
        }
        
        if(gamerBrad.getAdrenalin()==0)
        {
            Screen lostWorld= new Screen(2);
            Greenfoot.setWorld(lostWorld);
        }
    }
    
    public GamerBrad getBrad()
    {
        return gamerBrad;
    }
    
    public int getActualTime()
    {
        return timerDisplay.getValue();
    }
}
