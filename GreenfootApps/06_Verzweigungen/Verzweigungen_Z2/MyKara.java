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
        boolean foundLeaf = false;
        
        while (!foundLeaf) {
            // Falls Kara auf einem Blatt ist, wird das Blatt
            // aufgesammelt und dann wird das Programm gestoppt.
            if (onLeaf()) {
                foundLeaf = true;
                removeLeaf();
            }
            
            // Falls Kara nicht vor einem Baum ist, dann bewegen wir uns
            // Falls jedoch dort ein Baum ist, dann umgehen wir diesen.
            if (!treeFront()) {
                move();
            } else {
                walkAroundTree();
            }
        }
        Greenfoot.stop();
    }
    
    private void walkAroundTree() {
        int treeHeight = 0;
        
        turnLeft();
        while (treeRight()) {
            move();
            treeHeight += 1;
        }
        turnRight();
        move();
        
        while (treeRight()) {
            move();
        }
        turnRight();
        moveMultipleSteps(treeHeight);
        turnLeft();
    }
    
    private void moveMultipleSteps(int steps) {
        for (int i = 0; i < steps; i++) {
            move();
        }
    }
}
