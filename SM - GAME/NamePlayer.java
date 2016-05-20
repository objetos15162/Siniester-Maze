import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class NamePlayer here.
 * 
 * @author Eduardo Sanchez and Jocelyn Covarrubias 
 * @version 7.14
 */
public class NamePlayer extends Actor
{
    private String namePlayer = " ";
    private NameGamer theWorld;
    private int max=0;
    
    /**
     * Act - do whatever the NamePlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      World allWorld = getWorld();
      theWorld = (NameGamer)allWorld;
      Greenfoot.setSpeed(30);
      int end;
       if(Greenfoot.getKey() == "enter"){
            Maze newWorld= new Maze(namePlayer);
            Greenfoot.setWorld(newWorld);
       }
        
        if(max < 6) {
        if(Greenfoot.isKeyDown("a")) {
            namePlayer += "A";
            max++;
        }
        
        if(Greenfoot.isKeyDown("b")) {
           namePlayer += "B";
           max++;
        }
        
        if(Greenfoot.isKeyDown("c")) {
           namePlayer += "C";
           max++;
        }
        
        if(Greenfoot.isKeyDown("d")) {
            namePlayer += "D";
            max++;
        }
        
        if(Greenfoot.isKeyDown("e")) {
            namePlayer += "E";
            max++;
        }
        
        if(Greenfoot.isKeyDown("f")) {
            namePlayer += "F";
            max++;
        }
        
        if(Greenfoot.isKeyDown("g")) {
            namePlayer += "G";
            max++;
        }
        
        if(Greenfoot.isKeyDown("h")) {
            namePlayer += "H";
            max++;
        }
        
        if(Greenfoot.isKeyDown("i")) {
           namePlayer += "I";
           max++;
        }
        
        if(Greenfoot.isKeyDown("j")) {
            namePlayer += "J";
            max++;
        }
        
        if(Greenfoot.isKeyDown("k")) {
            namePlayer += "K";
            max++;
        }
        
        if(Greenfoot.isKeyDown("l")) {
            namePlayer += "L";
            max++;
        }
        
        if(Greenfoot.isKeyDown("m")) {
            namePlayer += "M";
            max++;
        }
        
        if(Greenfoot.isKeyDown("n")) {
            namePlayer += "N";
            max++;
        }
        
        if(Greenfoot.isKeyDown("o")) {
            namePlayer += "O";
            max++;
        }
        
        if(Greenfoot.isKeyDown("p")) {
            namePlayer += "P";
            max++;
        }
        
        if(Greenfoot.isKeyDown("q")) {
            namePlayer += "Q";
            max++;
        }
        
        if(Greenfoot.isKeyDown("r")) {
            namePlayer += "R";
            max++;
        }
        
        if(Greenfoot.isKeyDown("s")) {
            namePlayer += "S";
            max++;
        }
        
        if(Greenfoot.isKeyDown("t")) {
           namePlayer += "T";
           max++;
        }
        
        if(Greenfoot.isKeyDown("u")) {
            namePlayer += "U";
            max++;
        }
        
        if(Greenfoot.isKeyDown("v")) {
            namePlayer += "V";
            max++;
        }
        
        if(Greenfoot.isKeyDown("w")) {
            namePlayer += "W";
            max++;
        }
        
        if(Greenfoot.isKeyDown("x")) {
            namePlayer += "X";
            max++;
        }
        
        if(Greenfoot.isKeyDown("y")) {
          namePlayer += "Y";
          max++;
        }
        
        if(Greenfoot.isKeyDown("z")) {
           namePlayer += "Z";
           max++;
        }
       }
    
        if(Greenfoot.isKeyDown("backspace")) {
            end = namePlayer.length() - 1;
            String subStr = namePlayer.substring(0,end);
            namePlayer = subStr;
            max--;
        }
      
       theWorld.addName();
      
      
    
    }
    
    /**
     * This metod is for get the player's name.
     * @return The player's name.
     */
    public String getNamePlayer() 
    {
        return namePlayer;
    }
}