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
        // Konnte hierfür bis jetzt noch keine
        // bessere und schönere Lösung finden :-)
        turnAround();
        moveMultipleSteps(3);
        
        boolean is_running = true;
        while (is_running) {
            if (onLeaf()) {
                removeLeaf();
            }
            /*
            
            if (!mushroomFront()) {
                if (canMove() ) {
                    move();   
                } else {
                    turnLeft();
                }
            } else {
                turnLeft();
            }
            */
            if (canMove()) {
                move();
            } else {
                turnRight();
            }
        }
    }  
    
    private boolean leafFront() {
        return getObjectInFront(getRotation(), 1, Leaf.class) != null;
    }
    
    private void turnAround() {
        for (int i = 0; i < 2; i++) {
            turnRight();
        }
    }
    
    private void moveMultipleSteps(int steps) {
        for (int i = 0; i < steps; i++) {
            move();
        }
    }
}
