import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Swiss Cheese Elephant", 60);

    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 300, 100);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,282,206);
        Label label = new Label("Press space to start", 100);
        addObject(label,215,320);
        label.setLocation(374,311);
        label.setLocation(375,310);
        label.setValue(50);
        label.setLocation(413,309);
        removeObject(label);
        Label llabel = new Label("Press Space To Start", 50);
        addObject(label,173,308);
        label.setLocation(301,282);
        label.setLocation(364,288);
        label.setLocation(303,290);
        Label label2 = new Label("use arrow keys to move", 50);
        addObject(label2,158,348);
        label2.setLocation(310,335);
        label2.setLocation(297,335);
        label.setValue("press space to start");
        label.setLocation(363,293);
        removeObject(label);
        Label qlabel = new Label("Press Space To Start", 50);
        addObject(qlabel,201,291);
        qlabel.setLocation(295,285);
    }
}
