import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Position here.
 * 
 * @author Anabel Covarrubias 
 * @version 2.2
 */
public class Position extends Actor
{
    private String playerF;
    private String playerS;
    private String playerT;
    private long first;
    private long second;
    private long third;
    
    /**
     * Method for set the first player.
     */
    public void setPlayerF(String player1)
    {
         playerF = player1;
    }
    
    /**
     * Method for set the second player.
     */
    public void setPlayerS(String player2)
    {
         playerS = player2;
    }
    
    /**
     * Method for set the third player.
     */
    public void setPlayerT(String player3)
    {
         playerT = player3;
    }
    
    /**
     * Method for set the first.
     */
    public void setFirst(long points1)
    {
        first = points1;
    }
    
    /**
     * Method for set the second.
     */
    public void setSecond(long points2)
    {
        second = points2;
    }
    
    /**
     * Method for set the third.
     */
    public void setThird(long points3)
    {
        third = points3;
    }
    
    /**
     * Method for get the name.
     * @return The name of the player.
     */
    public String getPlayers()
    {
        String name = playerF + "\n" + "\n" + playerS + "\n" + "\n" + playerT;
        return name;
    }
    
    /**
     * Method for get the first player.
     * @return The value of 
     * first player's points.
     */
    public long getFirst()
    {
        return first;
    }
    
    /**
     * Method for get the second player.
     * @return The value of 
     * first player's points.
     */
    public long getSecond()
    {
        return second;
    }
    
    /**
     * Method for get the third player.
     * @return The value of 
     * first player's points.
     */
    public long getThird()
    {
        return third;
    }
    
    /**
     * Method for convert int to String.
     * @return String of the points.
     */
    public String getPoints()
    {
        String convert = Long.toString(first) + Long.toString(second) + 
                      Long.toString(third);
        return convert;
    }
    
    /**
     * Method to compare the points.
     * @param pointsGame They're the points
     * earned in the game.
     */
    public void comparePoints(long pointsGame)
    {
        if(pointsGame > this.getThird()) {
             if(pointsGame > this.getSecond()) {
                  if(pointsGame > this.getFirst()) {
                          this.setFirst(pointsGame);
                    }
                   else {
                       this.setSecond(pointsGame);
                    }
             }
             else {
                   this.setThird(pointsGame);
                }
        }
    }
}