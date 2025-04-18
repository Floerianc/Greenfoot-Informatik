import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die Klasse MyKara ist eine Unterklasse von Kara.
 * Sie erbt damit alle Methoden der Klasse Kara:
 * 
 * Aktionen:    move(), turnLeft(), turnRight(), putLeaf(), removeLeaf()
 * Sensoren:    onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MyKara extends Kara
{
    /**
     * In der Methode 'act()' koennen die Befehle fuer Kara programmiert werden.
     * Die Befehle werden dort nacheinander aufgerufen, wenn man nach dem 
     * 'Uebersetzen' (=kompilieren) den 'Act'-Knopf drueckt.
     * Beim druecken des 'Run'-Knopfes wird diese Methode immer wieder ausgefuehrt.
     */
    public void act() 
    {
        moveMultipleSteps(4);
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        moveMultipleSteps(4);
        
        for (int i = 0; i < 4; i++) {
            turnRight();
        }
        
        moveMultipleSteps(2);
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        moveMultipleSteps(6);
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        moveMultipleSteps(6);
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        moveMultipleSteps(3);
    }  
    
    private void moveMultipleSteps(int steps) {
        for (int i = 0; i < steps; i++) {
            move();
        }
    }
}
