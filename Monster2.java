import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Monster2 extends Monster
{
    /**
     * Act - do whatever the monster1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int y = 2;
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-2, getY()+y);
        if(getY()<=70 || getY()>=getWorld().getHeight()-65){
            y = -y;
        }
        if(isAtEdge()){
            setLocation(getWorld().getWidth()-15, Greenfoot.getRandomNumber(getWorld().getHeight()-10));
        }
        if(isTouching(Fireball.class))
        {
            removeTouching(Fireball.class);
            getWorld().addObject(new Blast(),getX(),getY());
            Stage2.poin.add(10);
            Greenfoot.playSound("blast.wav");
            getWorld().addObject(new Monster2(), getWorld().getWidth(), getY());
            getWorld().removeObject(this);
        }
        else if(isTouching(Hero.class))
        {
            Stage2.nyawa.add(-1);
            getWorld().addObject(new Monster2(), Greenfoot.getRandomNumber(40)+750, Greenfoot.getRandomNumber(200)+75);
            getWorld().removeObject(this);
        }
    }
}
