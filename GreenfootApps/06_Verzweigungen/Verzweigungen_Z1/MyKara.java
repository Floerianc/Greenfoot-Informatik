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
        /*
         * Ich gehe mal davon aus, dass ich Kara nicht die M�glichkeit
         * geben darf, einen Pilz rechts von ihm zu sehen.
         * Eine Funktion wie mushroomRight() schlie�e ich somit aus.
         */
        putLeaf();
        move();
        boolean foundLeaf = false;
        
        while (!foundLeaf) {
            turnRight();
            if (mushroomFront()) {
                turnLeft();
            }
            move();
            
            if (onLeaf()) {
                foundLeaf = true;
            }
        }
        Greenfoot.stop();
    }  
}
