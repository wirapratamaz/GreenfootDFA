import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class gameover.
     * 
     */
    public GameOver()
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
        Gover gover = new Gover();
        addObject(gover,415,135);
        Credit credit = new Credit();
        addObject(credit,672,346);
        //MyWorld.bg.stop();
        //MyWorld.bg = new GreenfootSound("bg4.wav");
        //MyWorld.bg.playLoop();
        gover.setLocation(742,245);
        Gover gover2 = new Gover();
        addObject(gover2,720,420);
        gover.setLocation(714,239);
        removeObject(gover);
        gover2.setLocation(747,229);
        credit.setLocation(790,332);
        gover2.setLocation(862,239);
        gover2.setLocation(909,212);
        credit.setLocation(808,320);
        gover2.setLocation(79,255);
        gover2.setLocation(860,222);
        credit.setLocation(748,292);
        gover2.setLocation(593,64);
        credit.setLocation(579,165);
        credit.setLocation(583,199);
        credit.setLocation(625,415);
        gover2.setLocation(671,241);
        credit.setLocation(793,359);
        credit.setLocation(663,384);
        Backgameover back = new Backgameover();
        addObject(back,40,38);
        //MyWorld.bg.stop();
    }
}
