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
        if(isTouching(Exit.class))
        {
            checkExit();
        }
        if((keySpecial%3)==0)
        {
            removeDoor();
        }
    }

    public void moveBrad()
    {
        Actor aBloc;
        Actor bBloc;
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
                bBloc = getOneIntersectingObject(Door.class);
                if(bBloc!=null)
                {
                    move(3);
                }
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
        World mundo = getWorld();
        Maze myWorld = (Maze)mundo;

        if(isTouching(Key.class) && Greenfoot.isKeyDown("h"))
        {
            key++;
            Greenfoot.playSound("SM - Item.wav");
            removeTouching(Key.class);
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
            myWorld.getClues().setValue(clue);
        }

        if(isTouching(KeySpecial.class) && Greenfoot.isKeyDown("u"))
        {
            keySpecial++;
            Greenfoot.playSound("SM - Item.wav");
            removeTouching(KeySpecial.class);
            myWorld.getKeysSpecials().setValue(keySpecial);
            myWorld.showExits();
        }

        if(isTouching(Cassette.class) && Greenfoot.isKeyDown("u"))
        {
            cassette++;
            Greenfoot.playSound("SM - Item.wav");
            removeTouching(Cassette.class);
            myWorld.getCassettes().setValue(cassette);
            playCassette();
        }

        if(isTouching(Knife.class))
        {
            life--;
            removeTouching(Knife.class);
        }
    }

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
            adrenalin--; 
            depletesBar();
        }

        if(isTouching(Billy.class))
        {
            oxigen--;
            depletesBar();
        }

        if(isTouching(Nurse.class))
        {
            life--;
            paralize=true;
            actualTime=myWorld.getActualTime();
        }
    }

    public void checkExit()
    {
        World mundo = getWorld();
        Maze myWorld = (Maze)mundo;
        if(isTouching(Exit.class) && Greenfoot.isKeyDown("e"))
        {
            removeTouching(Exit.class);
            keySpecial=0;
            myWorld.getKeysSpecials().setValue(keySpecial);
            if(myWorld.getLetterMaze()==1)
            {
                myWorld.buildMaze(1);
            }

            if(myWorld.getLetterMaze()==2)
            {
                myWorld.buildMaze(2);
            }

            if(myWorld.getLetterMaze()==3)
            {
                myWorld.buildMaze(3);
            }

            if(myWorld.getLetterMaze()==4)
            {
                Screen winWorld = new Screen(3,this.getTotalTime());
                Greenfoot.setWorld(winWorld);
            }
        }
    }

    private void removeDoor()
    {
        World mundo = getWorld();
        Maze myWorld = (Maze)mundo;
        if((keySpecial==3) && Greenfoot.isKeyDown("o"))
        {
            myWorld.removeObjects(myWorld.getObjects(Door.class));
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

    public int getKeySpecial()
    {
        return keySpecial;
    }

    private int getTotalTime()
    {
        World mundo = getWorld();
        Maze myWorld = (Maze)mundo;
        int totalTime = myWorld.getActualTime();
        totalTime = totalTime - (key*3);
        totalTime = totalTime - (clue*6);
        return totalTime;
    }

    private void playCassette()
    {
        try {
            if(cassette==1)
            {
                try {
                    Greenfoot.playSound("SM-Maze-A.wav");
                }

                catch(IllegalArgumentException e)
                {
                    System.out.println("La cache");
                }
            }
            else if (cassette==2)
            {
                try {
                    Greenfoot.playSound("SM-Maze-B.wav");
                }

                catch(IllegalArgumentException e)
                {
                    System.out.println("La cache");
                }
            }
            else if (cassette==3)
            {
                try {
                    Greenfoot.playSound("SM-Maze-C.wav");
                }

                catch(IllegalArgumentException e)
                {
                    System.out.println("La cache");
                }
            }
            else
            {
                try {
                    Greenfoot.playSound("SM-Maze-D.wav");
                }

                catch(IllegalArgumentException e)
                {
                    System.out.println("La cache");
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {

        }
    }

    private void depletesBar()
    {   if(adrenalin<=0)
        {   
            adrenalin=0;
            oxigen--;
        }
        if(oxigen<=0)
        {   
            oxigen=0;
            life--;
        }
    }
}
