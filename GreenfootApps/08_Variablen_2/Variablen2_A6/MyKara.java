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
        while (!leafFront() && leafRight()) {
            if (mushroomFront()) {
                Greenfoot.stop();
            }
            move();
        }
        
        if (leafFront()) {
            turnLeft();
        } else if (!leafRight()) {
            turnRight();
            move();
        }
    }  
    
    private int modulo(int a, int b) {
        return a % b;
    }
    
    private boolean leafFront() {
        return getObjectInFront(getRotation(), 1, Leaf.class) != null;
    }
    
    private boolean leafRight() {
        return getObjectInFront(modulo(getRotation() +  90, 360), 1, Leaf.class) != null;
    }
}
