import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GamerBrad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GamerBrad extends Actor
{
    private int keys;
    private int clues;
    private boolean image1;
    
    public GamerBrad()
    {   
        clues=0;
        keys=0;
        image1 = true;
    }
    
    /**
     * Act - do whatever the Caleb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a"))
        {
            if(isTouching(BlocVertical.class))
            {
                
                if((getX()-5) >= getOneIntersectingObject(BlocVertical.class).getX())
                {
                    move(8); //Aqui iba 5,8 en todo despues y funciono masomenos
                } 
                
            }   
            else
            {
                move(-4);
                setImage("SM - BradL.png");
                image1 = false;
            }
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            if(isTouching(BlocHorizontal.class))
            {
                
                if((getY()+5) >= getOneIntersectingObject(BlocHorizontal.class).getY())
                {
                    setLocation(getX(),getY()+8); //Aqui iva getY()2
                }
                
            }
            else
            {
                setLocation(getX(),getY()-4);
                setImage("SM - Brad.png");
                image1 = false;
            }
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            if(isTouching(BlocHorizontal.class))
            {
                
                if((getY()-5) <= getOneIntersectingObject(BlocHorizontal.class).getY())
                {
                    setLocation(getX(),getY()-8); //Aqui iva getY()-2
                }
                
            }
            else
            {
                setLocation(getX(),getY()+4);
                setImage("SM - Brad.png");
                image1 = false;
            }
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            if(isTouching(BlocVertical.class))
            {
                
                if((getX()+5) <= getOneIntersectingObject(BlocVertical.class).getX())
                {
                    move(-8); //Aqui iba -5
                }
            }
            else
            {
                move(4);
            }
            setImage("SM - BradR.png");
            image1 = false;
        }
        
        //Para poder tener llaves y pistas
        if(isTouching(Key.class) && Greenfoot.isKeyDown("h"))
        {
            removeTouching(Key.class);
            keys++;
            World mundo = getWorld();
            Maze1 myWorld = (Maze1)mundo;
            myWorld.getKeys().setValue(keys);
        }
        
        if(isTouching(Clue.class) && Greenfoot.isKeyDown("k"))
        {
            removeTouching(Clue.class);
            clues++;
            World mundo = getWorld();
            Maze1 myWorld = (Maze1)mundo;
            myWorld.getClues().setValue(clues);
        }
        
        /*if(!image1)
        {
            setImage("SM - BradUD.png");
            image1=true;
        }*/
    }
        
}
