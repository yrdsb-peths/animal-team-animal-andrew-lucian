import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author Lucian and Andrew
 * @version May 12, 2026
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephant_trumpet.mp3");
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-1);
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(-1);
            move(3);
        }
        
        eat();
    }

    public void eat() {
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }

    }
}