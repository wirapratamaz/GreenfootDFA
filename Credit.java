import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends Actor
{
    /**
     * Act - do whatever the credit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         if(Greenfoot.mousePressed(this))
            Greenfoot.setWorld(new CreditsScreen());
    }
}
