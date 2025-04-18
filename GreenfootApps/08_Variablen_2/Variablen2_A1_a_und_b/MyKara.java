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
        // displaySquare(10);
        displayRectangle(4, 12);
    }  
    
    private void displaySquare(int size) {
        int rows = size;
        
        for (int j = 0; j < rows; j++) {
            putLeaf();
            for (int i = 1; i < size; i++) {
                move();
                putLeaf();
            }
            if ((j % 2) == 0) {
                turnRight();
                move();
                turnRight();
            } else {
                turnLeft();
                move();
                turnLeft();
            }
        }
    }
    
    private void displayRectangle(int columns, int rows) {
        for (int j = 0; j < rows; j++) {
            putLeaf();
            for (int i = 1; i < columns; i++) {
                move();
                putLeaf();
            }
            if ((j % 2) == 0) {
                turnRight();
                move();
                turnRight();
            } else {
                turnLeft();
                move();
                turnLeft();
            }
        }
    }
}
