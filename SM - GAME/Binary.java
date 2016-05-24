import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class for binary archive.
 * 
 * @author Jocelyn Covarrubias 
 * @author Eduardo Sanchez
 * @version Betha 5.5
 */
public class Binary extends Actor
{
    private String points = "Points.dat";
    private long one;

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
            setOne(aux);
        } 
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } 
        catch (IOException ex) {
            System.out.println(ex);
        }
        read = Long.toString(one);
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
}
