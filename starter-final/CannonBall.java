// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{

    /**
     * 
     */
    public CannonBall()
    {
    }

    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Collision();
        if (Lost()) {
            transitionToGameLostWorld();
        }
    }

    /**
     * What happens when the cannonballs hit the ladybug
     */
    public void Collision()
    {
        Actor Ladybug = getOneIntersectingObject(Ladybug.class);
        if (Ladybug != null) {
            World world = getWorld();
            world.removeObject(Ladybug);
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * Moves player to lose screen
     */
    public boolean Lost()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Also moves player to lose screen
     */
    public void transitionToGameLostWorld()
    {
        World IsGameLost =  new  IsGameLost();
        Greenfoot.setWorld(IsGameLost);
    }
}
