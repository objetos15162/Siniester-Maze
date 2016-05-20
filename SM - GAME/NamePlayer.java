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
            Maze newWorld= new Maze();
            Greenfoot.setWorld(newWorld);
        }
        
        if(Greenfoot.isKeyDown("a")) {
            namePlayer += "A";
        }
        
        if(Greenfoot.isKeyDown("b")) {
           namePlayer += "B";
        }
        
        if(Greenfoot.isKeyDown("c")) {
           namePlayer += "C";
        }
        
        if(Greenfoot.isKeyDown("d")) {
            namePlayer += "D";
        }
        
        if(Greenfoot.isKeyDown("e")) {
            namePlayer += "E";
        }
        
        if(Greenfoot.isKeyDown("f")) {
            namePlayer += "F";
        }
        
        if(Greenfoot.isKeyDown("g")) {
            namePlayer += "G";
        }
        
        if(Greenfoot.isKeyDown("h")) {
            namePlayer += "H";
        }
        
        if(Greenfoot.isKeyDown("i")) {
           namePlayer += "I";
        }
        
        if(Greenfoot.isKeyDown("j")) {
            namePlayer += "J";
        }
        
        if(Greenfoot.isKeyDown("k")) {
            namePlayer += "K";
        }
        
        if(Greenfoot.isKeyDown("l")) {
            namePlayer += "L";
        }
        
        if(Greenfoot.isKeyDown("m")) {
            namePlayer += "M";
        }
        
        if(Greenfoot.isKeyDown("n")) {
            namePlayer += "N";
        }
        
        if(Greenfoot.isKeyDown("o")) {
            namePlayer += "O";
        }
        
        if(Greenfoot.isKeyDown("p")) {
            namePlayer += "P";
        }
        
        if(Greenfoot.isKeyDown("q")) {
            namePlayer += "Q";
        }
        
        if(Greenfoot.isKeyDown("r")) {
            namePlayer += "R";
        }
        
        if(Greenfoot.isKeyDown("s")) {
            namePlayer += "S";
        }
        
        if(Greenfoot.isKeyDown("t")) {
           namePlayer += "T";
        }
        
        if(Greenfoot.isKeyDown("u")) {
            namePlayer += "U";
        }
        
        if(Greenfoot.isKeyDown("v")) {
            namePlayer += "V";
        }
        
        if(Greenfoot.isKeyDown("w")) {
            namePlayer += "W";
        }
        
        if(Greenfoot.isKeyDown("x")) {
            namePlayer += "X";
        }
        
        if(Greenfoot.isKeyDown("y")) {
          namePlayer += "Y";
        }
        
        if(Greenfoot.isKeyDown("z")) {
           namePlayer += "Z";
        }
        
        if(Greenfoot.isKeyDown("backspace")) {
            end = namePlayer.length() - 1;
            String subStr = namePlayer.substring(0,end);
            namePlayer = subStr;
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
