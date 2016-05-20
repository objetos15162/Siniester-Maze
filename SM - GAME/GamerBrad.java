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
     * the 'Act' or 'Run' button gets pressed in the environment.
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
    
    public void checkItem()
    {
        if(isTouching(Key.class) && Greenfoot.isKeyDown("h"))
        {
            key++;
            Greenfoot.playSound("SM - Item.wav");
            removeTouching(Key.class);
            World mundo = getWorld();
            Maze myWorld = (Maze)mundo;
            myWorld.getKeys().setValue(key);
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
            World mundo = getWorld();
            Maze myWorld = (Maze)mundo;
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
            World mundo = getWorld();
            Maze myWorld = (Maze)mundo;
            myWorld.setLife();
        }
    }
    
    private void checkEnemyNearby()
    {
        if(isTouching(Saw.class))
        {
            life--;
            World mundo = getWorld();
            Maze myWorld = (Maze)mundo;
            myWorld.setLife();
        }
        if(isTouching(Esther.class))
        {
            life--; //The knifes will kill you;
            World mundo = getWorld();
            Maze myWorld = (Maze)mundo;
            myWorld.setLife();
        }
        if(isTouching(Ben.class))
        {
            adrenalin--; //The fire that he trows will kill you;
            World mundo = getWorld();
            Maze myWorld = (Maze)mundo;
            myWorld.setAdrenalin();
        }
        if(isTouching(Billy.class))
        {
            oxigen--;
            World mundo = getWorld();
            Maze myWorld = (Maze)mundo;
            myWorld.setOxigen();
        }
        if(isTouching(Nurse.class))
        {
            life--; 
            World mundo = getWorld();
            Maze myWorld = (Maze)mundo;
            myWorld.setLife();
            paralize=true;
            actualTime=myWorld.getActualTime();
        }
    }
    
    public int getLife()
    {
        return life;
    }
    
    public int getAdrenalin()
    {
        return adrenalin;
    }
    
    public int getOxigen()
    {
        return oxigen;
    }
    
}
