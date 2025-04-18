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
    
    /**
     * Kara soll einen *beliebigen*, *rechteckigen* Wald patroullieren
     */
    public void act() 
    {
        if (onLeaf()) {
            removeLeaf();
        }
        
        while (!treeFront()) {
            move();
        }
        
        goAroundTree();
    }
    
    /**
     * Lets Kara walk around a tree. Must be a 1-cell-wide Tree, but height
     * can be any height.
     */
    private void goAroundTree() {
        turnLeft();
        
        int treeSize = 0;
        boolean wentAroundTree = false;
        
        while (!wentAroundTree) {
            while (treeRight()) {
                move();
                treeSize += 1;
            }
            
            // Um den Baumstamm gehen
            turnRight();
            move();
            move();
            turnRight();
            
            // Die Länge des Baums umgehen
            moveMultipleSteps(treeSize);
            
            // Wieder geradeaus laufen
            turnLeft();
            
            // Wir haben es geschafft :)
            wentAroundTree = true;
        }
    }
    
    /**
     * @param steps amount of steps that you want to move
     */
    private void moveMultipleSteps(int steps) {
        for (int i = 0; i < steps; i++) {
            move();
        }
    }
}
