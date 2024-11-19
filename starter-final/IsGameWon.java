// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class IsGameWon extends World
{

    /**
     * Constructor for objects of class IsGameWon.
     */
    public IsGameWon()
    {
        super(600, 400, 1);
        showTextWithBigBlackFont("Congratualations,You Win!", 100, 200);
    }

    /**
     * How the game writes text on the screen
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(35);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
