import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Buttons
{
    /**
     * Act - do whatever the credit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("click.wav");
            Greenfoot.setWorld(new CreditsScreen());
        }
    }
}
