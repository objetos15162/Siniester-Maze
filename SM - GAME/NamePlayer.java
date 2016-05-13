import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class NamePlayer here.
 * 
 * @author Anabel Covarrubias
 * @version 7.14
 */
public class NamePlayer extends Actor
{
    private String namePlayer = " ";
    private WorldGame theWorld;
    
    /**
     * Act - do whatever the NamePlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World allWorld = getWorld();
      theWorld = (WorldGame)allWorld;
      Greenfoot.setSpeed(30);
      int end;
      
        if(Greenfoot.getKey() == "enter"){
            Maze1 newWorld= new Maze1();
            Greenfoot.setWorld(newWorld);
        }
        
        if(Greenfoot.isKeyDown("a")) {
            namePlayer += "a";
        }
        
        if(Greenfoot.isKeyDown("b")) {
           namePlayer += "b";
        }
        
        if(Greenfoot.isKeyDown("c")) {
           namePlayer += "c";
        }
        
        if(Greenfoot.isKeyDown("d")) {
            namePlayer += "d";
        }
        
        if(Greenfoot.isKeyDown("e")) {
            namePlayer += "e";
        }
        
        if(Greenfoot.isKeyDown("f")) {
            namePlayer += "f";
        }
        
        if(Greenfoot.isKeyDown("g")) {
            namePlayer += "g";
        }
        
        if(Greenfoot.isKeyDown("h")) {
            namePlayer += "h";
        }
        
        if(Greenfoot.isKeyDown("i")) {
           namePlayer += "i";
        }
        
        if(Greenfoot.isKeyDown("j")) {
            namePlayer += "j";
        }
        
        if(Greenfoot.isKeyDown("k")) {
            namePlayer += "k";
        }
        
        if(Greenfoot.isKeyDown("l")) {
            namePlayer += "l";
        }
        
        if(Greenfoot.isKeyDown("m")) {
            namePlayer += "m";
        }
        
        if(Greenfoot.isKeyDown("n")) {
            namePlayer += "n";
        }
        
        if(Greenfoot.isKeyDown("o")) {
            namePlayer += "o";
        }
        
        if(Greenfoot.isKeyDown("p")) {
            namePlayer += "p";
        }
        
        if(Greenfoot.isKeyDown("q")) {
            namePlayer += "q";
        }
        
        if(Greenfoot.isKeyDown("r")) {
            namePlayer += "r";
        }
        
        if(Greenfoot.isKeyDown("s")) {
            namePlayer += "s";
        }
        
        if(Greenfoot.isKeyDown("t")) {
           namePlayer += "t";
        }
        
        if(Greenfoot.isKeyDown("u")) {
            namePlayer += "u";
        }
        
        if(Greenfoot.isKeyDown("v")) {
            namePlayer += "v";
        }
        
        if(Greenfoot.isKeyDown("w")) {
            namePlayer += "w";
        }
        
        if(Greenfoot.isKeyDown("x")) {
            namePlayer += "x";
        }
        
        if(Greenfoot.isKeyDown("y")) {
          namePlayer += "y";
        }
        
        if(Greenfoot.isKeyDown("z")) {
           namePlayer += "z";
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
