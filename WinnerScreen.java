import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class namacredits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinnerScreen extends World
{

    /**
     * Constructor for objects of class namacredits.
     * 
     */
    public WinnerScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 725, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Backgameover backgameover = new Backgameover();
        addObject(backgameover,530,354);
        backgameover.setLocation(654,478);
        removeObject(backgameover);
        Menu menu = new Menu();
        addObject(menu,69,36);
    }
}
