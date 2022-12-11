import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2 extends World
{

    /**
     * Constructor for objects of class Stage2.
     * 
     */
    static Counter poin = new Counter("POIN :");
    static Counter nyawa = new Counter("NYAWA : "); 
    //public static GreenfootSound bg = new GreenfootSound("bg04.mp3");
    public Stage2 ()
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

        for(int i=1;i<=2;i++)
            addObject(new Monster2(),getWidth()-0,Greenfoot.getRandomNumber(getHeight()-10));

        for(int i=1;i<=5;i++)
            addObject(new Monster3(),getWidth()-0,Greenfoot.getRandomNumber(getHeight()-10));

        addObject(poin,60,20);
        poin.setValue(300);

        addObject(nyawa,190,20);
        nyawa.setValue(10);
        IconStage2 iconStage2 = new IconStage2();
        addObject(iconStage2,992,33);
        Monster3 monster3 = new Monster3();
        addObject(monster3,841,320);
        Monster3 monster32 = new Monster3();
        addObject(monster32,931,495);
        Monster3 monster33 = new Monster3();
        addObject(monster33,941,148);
    }

    public void act(){
    if(Stage2.poin.getValue()==500){
    Greenfoot.setWorld(new Stage3());
    }
    if(Stage2.nyawa.getValue()==0){
    Greenfoot.setWorld( new GameOver());
    }
    }
}
    