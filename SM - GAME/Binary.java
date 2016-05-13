import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class for binary archive.
 * 
 * @author Anabel Covarrubias 
 * @version Betha 5.4
 */
public class Binary extends Actor
{
    private String player = "Players.dat";
    private String points = "Points.dat";
    private long one;
    private long two;
    private long three;
    
    /**
     * Method for write the names of the best Players
     * in a binary file.
     * @param players It's a String with the name
     * of the best players. 
     */
    public void writePlayers(String players)
    {
        try {
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(this.player));
            file.writeObject(players);
            file.close();
        } 
            catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    /**
     * Method for read the names of the best Players
     * in a binary file.
     * @return It's a String with the name
     * of the best players. 
     */
    public String readPlayers()
    {
        String read = null;
        try {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(this.player));
            read = (String) file.readObject();
            file.close();
        } 
        catch (ClassNotFoundException ex) {
             System.out.println(ex);
        }   
        catch (IOException ex) {
             System.out.println(ex);
       }
       return read;
    }
    
    /**
     * Method for write the points of the best Players
     * in a binary file.
     * @param points It's a String with the points
     * of the best players. 
     */
    public void writeRecords(String points)
    {
        try {
            ObjectOutputStream fileRec = new ObjectOutputStream(new FileOutputStream(this.points));
            fileRec.writeObject(points);
            fileRec.close();
        } 
            catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    /**
     * Method for read the points of the best Players
     * in a binary file.
     * @return It's a String with the points
     * of the best players. 
     */
    public String readRecords()
    {
        String read = null;
        long aux, res;
        try {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(this.points));
            read = (String) file.readObject();
            file.close();
            aux = Long.parseLong(read);
            setThree(aux%10000);
            aux = aux / 10000;
            setTwo(aux%10000);
            aux = aux / 10000;
            setOne(aux);
        } 
        catch (ClassNotFoundException ex) {
             System.out.println(ex);
        } 
        catch (IOException ex) {
             System.out.println(ex);
       }
        read = Long.toString(one) + "\n" + Long.toString(two) +
                    "\n" + Long.toString(three);
        return read;
    }
    
    /**
     * Method for set the variable one.
     * @param number1 Value to set.
     */
    private void setOne(long number1)
    {
        one = number1;
    }
    
    /**
     * Method for set the variable two.
     * @param number2 Value to set.
     */
    private void setTwo(long number2)
    {
        two = number2;
    }
    
    /**
     * Method for set the variable three.
     * @param number3 Value to set.
     */
    private void setThree(long number3)
    {
        three = number3;
    }
    
    /**
     * Method to check if the binary file 
     * of the best players exist.
     * @return If exist the file. 
     */
    public boolean existPlayer()
    {
        boolean tryPlayer = false;
        try {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(this.player));
            tryPlayer = true;
            file.close();
        }
                
        catch (IOException ex) {
             tryPlayer = false;
       }
        return tryPlayer;
    }
    
    /**
     * Method to check if the binary file 
     * of the best points exist.
     * @retunr If exist the file. 
     */
    public boolean existPoints()
    {
        boolean tryPlayer = false;
        try {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(this.points));
            tryPlayer = true;
            file.close();
        }
                
        catch (IOException ex) {
             tryPlayer = false;
       }
        return tryPlayer;
    }
    
    /**
     * Method to get the value of the 
     * variable one.
     * @return The value of the 
     * variable one.
     */
    public long getOne()
    {
        return one;
    }
    
    /**
     * Method to get the value of the 
     * variable two.
     * @return The value of the 
     * variable two.
     */
    public long getTwo()
    {
        return two;
    }
    
    /**
     * Method to get the value of the 
     * variable three.
     * @return The value of the 
     * variable three.
     */
    public long getThree()
    {
        return three;
    }
}
