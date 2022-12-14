import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Screen to display game menu options.
 * 
 * @author Giuliana Bouzon
 */
public class MenuScreen extends World {
    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public MenuScreen() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 725, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        Play play = new Play();
        addObject(play,533,388);
        Instructions instructions = new Instructions();
        addObject(instructions,534,474);
        Credits credits = new Credits();
        addObject(credits,533,562);
    }
}
