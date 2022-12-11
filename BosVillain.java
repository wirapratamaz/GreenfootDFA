import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BosVillain extends Actor
{
    /**
     * Act - do whatever the bos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    int y = 4;
    int counter = 5;
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-y, getY()+y);
        if(getY()<=100 || getY()>=getWorld().getHeight()-150){
            y = -y;
        }
        if(isTouching(Fireball.class)){
            counter--;
            removeTouching(Fireball.class);
            if(counter==0){
               getWorld().addObject(new Blast(), getX(), getY());
               Stage3.poin.add(100);
               getWorld().addObject(new CopyOfBosVillain(), getWorld().getWidth(), getY());
               getWorld().removeObject(this);
            }
        }
        else if(isTouching(Hero.class))
        {
            Stage3.nyawa.add(-5);
            getWorld().addObject(new CopyOfBosVillain(), Greenfoot.getRandomNumber(40)+750, Greenfoot.getRandomNumber(200)+75);
            getWorld().removeObject(this);
        }
    }
}
