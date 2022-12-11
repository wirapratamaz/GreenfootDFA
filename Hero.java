import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
        }
        if (Greenfoot.isKeyDown("a")){
            shooting ();
        }
            
    }
    public void shooting()
    {
        delay++;
        if(delay==20)
        {
        getWorld().addObject(new Fireball(),getX(),getY());
        Greenfoot.playSound("bullet.wav");
        delay =0;
    }
    }
}
