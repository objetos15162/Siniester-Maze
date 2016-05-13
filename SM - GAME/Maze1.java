import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maze1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze1 extends World
{
    private SimpleTimer timer;
    private Counter timerDisplay;
    private Counter keysDisplay;
    private Counter cluesDisplay;
    
    /**
     * Constructor for objects of class Maze1.
     * 
     */
    public Maze1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1025, 825, 1); 
        timerDisplay = new Counter(" ");
        addObject(timerDisplay,351,36);
        keysDisplay =new Counter(" ");
        addObject(keysDisplay,805,22);
        cluesDisplay =new Counter(" ");
        addObject(cluesDisplay,804,52);
        timer = new SimpleTimer();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ButtonBack buttonback = new ButtonBack();
        addObject(buttonback,908,782);
        //FOR BLOC HLARGE
        BlocHorizontal blochorizontal = new BlocHorizontal();
        addObject(blochorizontal,389,336);
        blochorizontal.setImage("SM - Block Large 1.png");
        BlocHorizontal blochorizontal1 = new BlocHorizontal();
        addObject(blochorizontal1,646,336);
        blochorizontal1.setImage("SM - Block Large 1.png");
        BlocHorizontal blochorizontal2 = new BlocHorizontal();
        addObject(blochorizontal2,337,417);
        blochorizontal2.setImage("SM - Block Large 1.png");
        BlocHorizontal blochorizontal3 = new BlocHorizontal();
        addObject(blochorizontal3,568,417);
        blochorizontal3.setImage("SM - Block Large 1.png");
        BlocHorizontal blochorizontal4 = new BlocHorizontal();
        addObject(blochorizontal4,565,486);
        blochorizontal4.setImage("SM - Block Large 1.png");
        BlocHorizontal blochorizontal5 = new BlocHorizontal();
        addObject(blochorizontal5,345,486);
        blochorizontal5.setImage("SM - Block Large 1.png");
        BlocHorizontal blochorizontal6 = new BlocHorizontal();
        addObject(blochorizontal6,157,486);
        blochorizontal6.setImage("SM - Block Large 1.png");
        //FOR BLOC HMEDIUM
         BlocHorizontal blochorizontal7 = new BlocHorizontal();
         addObject(blochorizontal7,135,814);
         blochorizontal7.setImage("SM - Block Medium 1.png");
         BlocHorizontal blochorizontal8 = new BlocHorizontal();
         addObject(blochorizontal8,91,814);
         blochorizontal8.setImage("SM - Block Medium 1.png");
         BlocHorizontal blochorizontal9 = new BlocHorizontal();
         addObject(blochorizontal9,965,615);
         blochorizontal9.setImage("SM - Block Medium 1.png");
         BlocHorizontal blochorizontal10 = new BlocHorizontal();
         addObject(blochorizontal10,462,691);
         blochorizontal10.setImage("SM - Block Medium 1.png");
         BlocHorizontal blochorizontal11 = new BlocHorizontal();
         addObject(blochorizontal11,438,691);
         blochorizontal11.setImage("SM - Block Medium 1.png");
         BlocHorizontal blochorizontal12 = new BlocHorizontal();
         addObject(blochorizontal12,638,566);
         blochorizontal12.setImage("SM - Block Medium 1.png");
         BlocHorizontal blochorizontal13 = new BlocHorizontal();
         addObject(blochorizontal13,612,566);
         blochorizontal13.setImage("SM - Block Medium 1.png");
         BlocHorizontal blochorizontal14 = new BlocHorizontal();
         addObject(blochorizontal14,237,565);
         blochorizontal14.setImage("SM - Block Medium 1.png");
         BlocHorizontal blochorizontal15 = new BlocHorizontal();
         addObject(blochorizontal15,364,766);
         blochorizontal15.setImage("SM - Block Medium 1.png");
         //FOR BLOC HSMALL
         BlocHorizontal blochorizontal16 = new BlocHorizontal();
         addObject(blochorizontal16,801,512);
         blochorizontal16.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal17 = new BlocHorizontal();
         addObject(blochorizontal17,677,711);
         blochorizontal17.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal18 = new BlocHorizontal();
         addObject(blochorizontal18,727,711);
         blochorizontal18.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal19 = new BlocHorizontal();
         addObject(blochorizontal19,400,592);
         blochorizontal19.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal20 = new BlocHorizontal();
         addObject(blochorizontal20,450,592);
         blochorizontal20.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal21 = new BlocHorizontal();
         addObject(blochorizontal21,925,537);
         blochorizontal21.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal22 = new BlocHorizontal();
         addObject(blochorizontal22,902,537);
         blochorizontal22.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal23 = new BlocHorizontal();
         addObject(blochorizontal23,804,411);
         blochorizontal23.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal24 = new BlocHorizontal();
         addObject(blochorizontal24,854,411);
         blochorizontal24.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal25 = new BlocHorizontal();
         addObject(blochorizontal25,878,411);
         blochorizontal25.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal26 = new BlocHorizontal();
         addObject(blochorizontal26,951,411);
         blochorizontal26.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal27 = new BlocHorizontal();
         addObject(blochorizontal27,1000,411);
         blochorizontal27.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal28 = new BlocHorizontal();
         addObject(blochorizontal28,30,562);
         blochorizontal28.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal29 = new BlocHorizontal();
         addObject(blochorizontal29,75,562);
         blochorizontal29.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal30 = new BlocHorizontal();
         addObject(blochorizontal30,27,662);
         blochorizontal30.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal31 = new BlocHorizontal();
         addObject(blochorizontal31,74,662);
         blochorizontal31.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal32 = new BlocHorizontal();
         addObject(blochorizontal32,225,641);
         blochorizontal32.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal33 = new BlocHorizontal();
         addObject(blochorizontal33,276,641);
         blochorizontal33.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal34 = new BlocHorizontal();
         addObject(blochorizontal34,827,637);
         blochorizontal34.setImage("SM - Block Small 1.png");
         BlocHorizontal blochorizontal35 = new BlocHorizontal();
         addObject(blochorizontal35,877,637);
         blochorizontal35.setImage("SM - Block Small 1.png");
         
         //FOR BLOC VLARGE
         BlocVertical blocvertical = new BlocVertical();
         addObject(blocvertical,214,717);
         blocvertical.setImage("SM - Block Large 2.png");
         BlocVertical blocvertical1 = new BlocVertical();
         addObject(blocvertical1,214,730);
         blocvertical1.setImage("SM - Block Large 2.png");
         BlocVertical blocvertical2 = new BlocVertical();
         addObject(blocvertical2,815,709);
         blocvertical2.setImage("SM - Block Large 2.png");
         BlocVertical blocvertical3 = new BlocVertical();
         addObject(blocvertical3,815,725);
         blocvertical3.setImage("SM - Block Large 2.png");
         //FOR BLOC VMEDIUM
         BlocVertical blocvertical4 = new BlocVertical();
         addObject(blocvertical4,16,507);
         blocvertical4.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical5 = new BlocVertical();
         addObject(blocvertical5,16,528);
         blocvertical5.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical6 = new BlocVertical();
         addObject(blocvertical6,88,584);
         blocvertical6.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical7 = new BlocVertical();
         addObject(blocvertical7,88,625);
         blocvertical7.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical8 = new BlocVertical();
         addObject(blocvertical8,16,683);
         blocvertical8.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical9 = new BlocVertical();
         addObject(blocvertical9,16,745);
         blocvertical9.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical10 = new BlocVertical();
         addObject(blocvertical10,16,779);
         blocvertical10.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical11 = new BlocVertical();
         addObject(blocvertical11,289,661);
         blocvertical11.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical12 = new BlocVertical();
         addObject(blocvertical12,289,661);
         blocvertical12.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical13 = new BlocVertical();
         addObject(blocvertical13,289,732);
         blocvertical13.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical14 = new BlocVertical();
         addObject(blocvertical14,289,717);
         blocvertical14.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical15 = new BlocVertical();
         addObject(blocvertical15,440,785);
         blocvertical15.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical16 = new BlocVertical();
         addObject(blocvertical16,440,813);
         blocvertical16.setImage("SM - Block Medium 2.png");
         /*BlocVertical blocvertical17 = new BlocVertical();
         addObject(blocvertical17,538,584);
         blocvertical17.setImage("SM - Block Medium 2.png");*/
         BlocVertical blocvertical18 = new BlocVertical();
         addObject(blocvertical18,538,655);
         blocvertical18.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical19 = new BlocVertical();
         addObject(blocvertical19,538,637);
         blocvertical19.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical20 = new BlocVertical();
         addObject(blocvertical20,742,658);
         blocvertical20.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical21 = new BlocVertical();
         addObject(blocvertical21,742,677);
         blocvertical21.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical22 = new BlocVertical();
         addObject(blocvertical22,718,435);
         blocvertical22.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical23 = new BlocVertical();
         addObject(blocvertical23,718,452);
         blocvertical23.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical24 = new BlocVertical();
         addObject(blocvertical24,794,354);
         blocvertical24.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical25 = new BlocVertical();
         addObject(blocvertical25,794,377);
         blocvertical25.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical26 = new BlocVertical();
         addObject(blocvertical26,891,429);
         blocvertical26.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical27 = new BlocVertical();
         addObject(blocvertical27,891,504);
         blocvertical27.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical28 = new BlocVertical();
         addObject(blocvertical28,891,466);
         blocvertical28.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical29 = new BlocVertical();
         addObject(blocvertical29,939,430);
         blocvertical29.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical30 = new BlocVertical();
         addObject(blocvertical30,439,504);
         blocvertical30.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical31 = new BlocVertical();
         addObject(blocvertical31,939,495);
         blocvertical31.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical32 = new BlocVertical();
         addObject(blocvertical32,1015,509);
         blocvertical32.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical33 = new BlocVertical();
         addObject(blocvertical33,1016,577);
         blocvertical33.setImage("SM - Block Medium 2.png");
         BlocVertical blocvertical34 = new BlocVertical();
         addObject(blocvertical34,1016,549);
         blocvertical34.setImage("SM - Block Medium 2.png");
         //FOR BLOC VSMALL
         BlocVertical blocvertical35 = new BlocVertical();
         addObject(blocvertical35,464,569);
         blocvertical35.setImage("SM - Block Small 2.png");
         BlocVertical blocvertical36 = new BlocVertical();
         addObject(blocvertical36,464,574);
         blocvertical36.setImage("SM - Block Small 2.png");
         BlocVertical blocvertical37 = new BlocVertical();
         addObject(blocvertical37,389,569);
         blocvertical37.setImage("SM - Block Small 2.png");
         BlocVertical blocvertical38 = new BlocVertical();
         addObject(blocvertical38,389,573);
         blocvertical38.setImage("SM - Block Small 2.png");
         BlocVertical blocvertical39 = new BlocVertical();
         addObject(blocvertical39,891,618);
         blocvertical39.setImage("SM - Block Small 2.png");
             
    }
    
    @Override
    public void act()
    {      
      //CONTADOR DE TIEMPO
      if(timer.millisElapsed()>1000)
      {
       timerDisplay.add(1);  
       timer.mark();
      }
    }
    
    public Counter getClues()
    {
        return cluesDisplay;
    }
    
    public Counter getKeys()
    {
        return keysDisplay;
    }
}
