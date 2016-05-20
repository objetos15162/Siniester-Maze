import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Enemy extends Actor
{
    private int moveAux;
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        moveEnemy();
    }    
    
    /**
     * This metod makes a enemy move.
     */
    private void moveEnemy()
    {
        
        if(getOneIntersectingObject(Bloc.class)==null && getOneIntersectingObject(Bloc.class)==null)
        {
            
            if(moveAux==0)
            {
                move(-3);
            }
            else if(moveAux==1)
            {
                setLocation(getX(),getY()+3);
            }
            else if(moveAux==2)
            {
                setLocation(getX(),getY()-3);
            }
            else
            {
                move(3);
            }
            //Greenfoot.playSound("SM - Walk.wav");
        }
        else
        {
            
            if(moveAux==0)
            {
                move(3);
            }
            else if(moveAux==1)
            {
                setLocation(getX(),getY()-3);
            }
            else if(moveAux==2)
            {
                setLocation(getX(),getY()+3);
            }
            else
            {
                move(-3);
            }
            
            moveAux = Greenfoot.getRandomNumber(4);
            
        }  
    }
     
    /**
     * This method initialize a value random to set a direction random.
     */
    public void setMoveAux(int value)
    {
        moveAux = value;
    }
}
