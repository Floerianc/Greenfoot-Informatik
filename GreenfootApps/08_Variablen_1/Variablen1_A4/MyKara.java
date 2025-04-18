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
        int leafsPlaced = 0;
        
        while (leafsPlaced < 10) {
            while (!treeFront()) {
                if (!onLeaf()) {
                    putLeaf();
                    leafsPlaced++;
                }
                move();
            }
            
            if (!treeRight()) {
                turnRight();
            }
            if (!treeLeft()) {
                turnLeft();
            }
            if (treeRight() && treeLeft()) {
                turnLeft();
                turnLeft();
            }
        }
        Greenfoot.stop();
    }  
}
