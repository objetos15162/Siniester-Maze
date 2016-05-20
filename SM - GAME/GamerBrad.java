import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GamerBrad here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class GamerBrad extends Actor
{
    private int key;
    private int keySpecial;
    private int clue;
    private int box;
    private int cassette;
    private int life;
    private int adrenalin;
    private int oxigen;
    private boolean paralize;
    private int actualTime;
    private int afterTime;
    
    /**
     * Constructor for objects of class Brad.
     */
    public GamerBrad()
    {
       
       key=0;
       keySpecial=0;
       clue=0;
       box=0;
       cassette=0;
       life=100;
       adrenalin=100;
       oxigen=100;
       paralize=false;
       actualTime=0;
       afterTime=0;
    }
    
    /**
     * Act - do whatever the GamerBrad wants to do. This method is called whenever
     * This method to move a GamerBrad and check if a item or enemy is touching him.
     */
    public void act() 
    {
        // Add your action code here.
        moveBrad();
        if(isTouching(Item.class))
        {
            checkItem();
        }
        if(isTouching(Enemy.class))
        {
            checkEnemyNearby();
        }
    }
    
    /**
     * This method makes to move a GamerBrad in two ways, if it is paralized or it is unparalized.
     */
    public void moveBrad()
    {
        Actor aBloc;
        
        World mundo = getWorld();
        Maze myWorld = (Maze)mundo;
        
        if(paralize == false)
        {
            
            if(Greenfoot.isKeyDown("a"))
            {
                move(-3);
                aBloc = getOneIntersectingObject(Bloc.class);
                if(aBloc!=null)
                {
                    move(3);
                }
                //Greenfoot.playSound("SM - Breathing.wav");
            }
            
            if(Greenfoot.isKeyDown("d"))
            {
                move(3);
                aBloc = getOneIntersectingObject(Bloc.class);
                if(aBloc!=null)
                {
                    move(-3);
                }
                //Greenfoot.playSound("SM - Breathing.wav");
            }
            
            if(Greenfoot.isKeyDown("s"))
            {
                setLocation(getX(),getY()+3);
                aBloc = getOneIntersectingObject(Bloc.class);
                if(aBloc!=null)
                {
                    setLocation(getX(),getY()-3);
                }
                //Greenfoot.playSound("SM - Breathing.wav");
            }
            
            if(Greenfoot.isKeyDown("w"))
            {
                setLocation(getX(),getY()-3);
                aBloc = getOneIntersectingObject(Bloc.class);
                if(aBloc!=null)
                {
                    setLocation(getX(),getY()+3);
                }
                //Greenfoot.playSound("SM - Breathing.wav");
            }
        }
        else
        {
            afterTime= myWorld.getActualTime();
            if((afterTime-actualTime)==5)
            {
                paralize = false;
            }
        }
    }
    
    /**
     * This method check if a item is near of GamerBrad and if a item is touching him.
     */
    public void checkItem()
    {
        World mundo = getWorld();
        Maze myWorld = (Maze)mundo;
        
        if(isTouching(Key.class) && Greenfoot.isKeyDown("h"))
        {
            key++;
            Greenfoot.playSound("SM - Item.wav");
            removeTouching(Key.class);
            myWorld.getKeys().setValue(key);
            
            if(key > 5 && keySpecial > 1)
            {
                Screen iWinner = new Screen(3);
                Greenfoot.setWorld(iWinner);
            }
        }
        
        if(isTouching(Adrenalin.class) && Greenfoot.isKeyDown("j"))
        {
            adrenalin++;
            Greenfoot.playSound("SM - Item.wav");
            removeTouching(Adrenalin.class);
        }
        
        if(isTouching(Clue.class) && Greenfoot.isKeyDown("k"))
        {
            clue++;
            Greenfoot.playSound("SM - Item.wav");
            removeTouching(Clue.class);
            myWorld.getClues().setValue(clue);
        }
        
        if(isTouching(KeySpecial.class) && Greenfoot.isKeyDown("u"))
        {
            keySpecial++;
            Greenfoot.playSound("SM - Item.wav");
            removeTouching(KeySpecial.class);
        }
        
        if(isTouching(Cassette.class) && Greenfoot.isKeyDown("u"))
        {
            cassette++;
            Greenfoot.playSound("SM - Item.wav");
            removeTouching(Cassette.class);
        }
        
        if(isTouching(Knife.class))
        {
            life--;
            removeTouching(Knife.class);
        }
    }
    
    /**
     * This method check if a enemy is near of GamerBrad and if a enemy is touching him.
     */
    private void checkEnemyNearby()
    {
        World mundo = getWorld();
        Maze myWorld = (Maze)mundo;
        
        if(isTouching(Saw.class) || isTouching(Esther.class) )
        {
            life--;
        }
        
        if(isTouching(Ben.class))
        {
            adrenalin--; //The fire that he trows will kill you;
        }
        
        if(isTouching(Billy.class))
        {
            oxigen--;
        }
        
        if(isTouching(Nurse.class))
        {
            life--;
            paralize=true;
            actualTime=myWorld.getActualTime();
        }
    }
    
    /**
     * This method return a int that represent the life of GamerBrad.
     * @return a int that represent the life.
     */
    public int getLife()
    {
        return life;
    }
    
    /**
     * This method return a int that represent the adrenalin of GamerBrad.
     * @return a int that represent the adrenalin.
     */
    public int getAdrenalin()
    {
        return adrenalin;
    }
    
    /**
     * This method return a int that represent the oxigen of GamerBrad.
     * @return a int that represent the oxigen.
     */
    public int getOxigen()
    {
        return oxigen;
    }
    
}
