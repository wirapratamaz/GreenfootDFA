import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    static Counter poin = new Counter("POIN :");
    static Counter nyawa = new Counter("NYAWA : "); 
    //public static GreenfootSound bg = new GreenfootSound("bg04.mp3");
    public MyWorld()
    {    
        super(1080, 725, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,70,200);

        for(int i=1;i<=5;i++)
            addObject(new Monster1(),getWidth()-0,Greenfoot.getRandomNumber(getHeight()-10));

        addObject(poin,60,20);
        poin.setValue(0);

        addObject(nyawa,190,20);
        nyawa.setValue(10);
        IconStage1 stage1 = new IconStage1();
        addObject(stage1,1001,35);
    }

    public void act(){
    if(MyWorld.poin.getValue()==300){
    Greenfoot.setWorld(new Stage2());
    }
    if(MyWorld.nyawa.getValue()==0){
    Greenfoot.setWorld( new GameOver());
    }
}
}
    


