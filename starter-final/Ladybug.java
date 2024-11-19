// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        if (Winner()) {
            transitionToGameWonWorld();
        }
        goal();
    }

    /**
     * The movement options for the Ladybug, it turns rather than move sideways
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(4);
        }
    }

    /**
     * What the game does when the player reaches the goal (the FinishLocation)
     */
    public void goal()
    {
        Actor FinishLocation = getOneIntersectingObject(FinishLocation.class);
        if (FinishLocation != null) {
            
            World world = getWorld();
            world.removeObject(FinishLocation);
            Greenfoot.playSound("win.wav");
        }
    }

    /**
     * When the player wins the game moves the player to the win screen
     */
    public boolean Winner()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Also tries to move the player to the win screen
     */
    public void transitionToGameWonWorld()
    {
        World IsGameWon =  new  IsGameWon();
        Greenfoot.setWorld(IsGameWon);
    }
}
