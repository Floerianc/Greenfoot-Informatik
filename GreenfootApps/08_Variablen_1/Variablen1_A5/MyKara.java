import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Die Klasse MyKara ist eine Unterklasse von Kara.
 * Sie erbt damit alle Methoden der Klasse Kara:
 * 
 * Aktionen:    move(), turnLeft(), turnRight(), putLeaf(), removeLeaf()
 * Sensoren:    onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MyKara extends Kara
{
    final int WORLD_WIDTH = 15;
    final int WORLD_HEIGHT = 15;
        
    int x = 1;
    int y = 1;
    
    int leafs = 0;
    int steps = 0;
    
    /**
     * In der Methode 'act()' koennen die Befehle fuer Kara programmiert werden.
     * Die Befehle werden dort nacheinander aufgerufen, wenn man nach dem 
     * 'Uebersetzen' (=kompilieren) den 'Act'-Knopf drueckt.
     * Beim druecken des 'Run'-Knopfes wird diese Methode immer wieder ausgefuehrt.
     */
    public void act() 
    {
        while (x < WORLD_WIDTH && y < WORLD_HEIGHT) {
            while (x < WORLD_WIDTH) {
                walkStraight(false);
            }
            walkStraight(false);
            walkDown(false);
        }
        while (x < WORLD_WIDTH) {
            walkStraight(false);
        }
        outputStats();
        Greenfoot.stop();
    }  
    
    private void outputStats() {
        String stats = "\n\nWorld Width:\t%d\nWorld Height:\t%d\nLeafs:\t\t%d\nSteps:\t\t%d";
        String result = String.format(stats, WORLD_WIDTH, WORLD_HEIGHT, leafs, steps);
        System.out.println(result);
    }
    
    private void pickupLeaf() {
        removeLeaf();
        leafs++;
    }
    
    private void changeXY(int xChange, int yChange) {
        int rawX = x += xChange;
        int rawY = y += yChange;
        
        if (rawX > WORLD_WIDTH) {
            x = 1;
        } else {
            x = rawX;
        }
        
        if (rawY > WORLD_HEIGHT) {
            y = 1;
        } else {
            y = rawY;
        }
        
        int thoseSteps = xChange + yChange;
        steps += thoseSteps;
    }
    
    private void outputXY() {
        String myStr = "X: %d | Y: %d";
        String result = String.format(myStr, x, y);
        System.out.println(result);
    }
    
    private void walkStraight(boolean debug) {
        if (onLeaf()) {
            pickupLeaf();
        }
        
        move();
        changeXY(1, 0);
        
        if (debug) {
            outputXY();
        }
    }
    
    private void walkDown(boolean debug) {
        if (onLeaf()) {
            pickupLeaf();
        }
        
        turnRight();
        move();
        turnLeft();
        changeXY(0, 1);
        
        if (debug) {
            outputXY();
        }
    }
}
