import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stage3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage3 extends World
{

    /**
     * Constructor for objects of class stage3.
     * 
     */
    static Counter poin = new Counter("POIN :");
    static Counter nyawa = new Counter("NYAWA : "); 
    //public static GreenfootSound bg = new GreenfootSound("bg2.wav");
    public Stage3()
    {    
        super(1080, 725, 1);
        //Stage2.bg.stop();
        //bg.playLoop();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,93,191);

        addObject(new BosVillain(),947,304);

        addObject(poin,60,20);
        poin.setValue(500);

        addObject(nyawa,190,20);
        nyawa.setValue(10);
        IconStage3 iconStage3 = new IconStage3();
        addObject(iconStage3,999,38);
        BosVillain bosVillain2 = new BosVillain();
        addObject(bosVillain2,804,520);
        BosVillain bosVillain3 = new BosVillain();
        addObject(bosVillain3,832,144);
        Monster3 monster33 = new Monster3();
        addObject(monster33,941,148);
        Monster1 monster11 = new Monster1();
        addObject(monster33,941,148);
    }

    public void act(){
        if(Stage3.poin.getValue()==1000){
        Greenfoot.setWorld(new WinnerScreen());
        }
        if(Stage3.nyawa.getValue()==0){
        Greenfoot.setWorld(new GameOver()); 
        }
    }

}
