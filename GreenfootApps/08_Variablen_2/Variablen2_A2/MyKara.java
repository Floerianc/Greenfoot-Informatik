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
        boolean finishedSpiral = false;
        int AXIS_LENGTH = 14;
        int steps = AXIS_LENGTH;
        
        putLeaf();
        while (!finishedSpiral) {
            if (steps <= 0) {
                finishedSpiral = true;
            }
            moveSteps(steps);
            turnRight();
            moveSteps(steps);
            turnRight();
            steps -= 2;
        }
    }  
    
    private void moveSteps(int steps) {
        for (int i = 0; i < steps; i++) {
            move();
            putLeaf();
        }
    }
}
