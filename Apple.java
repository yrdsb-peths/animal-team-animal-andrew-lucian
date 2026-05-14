import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author Lucian and Andrew
 * @version May 12, 2026
 */
public class Apple extends Actor
{
    int speed = 1;
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
    }
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
