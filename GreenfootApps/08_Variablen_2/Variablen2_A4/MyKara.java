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
    int originX = 0;
    int originY = 0;
    
    int x = 0;
    int y = 0;
    
    public static final int DIRECTION_RIGHT = 0;
    public static final int DIRECTION_DOWN = 90;
    public static final int DIRECTION_LEFT = 180;
    public static final int DIRECTION_UP = 270;
    
    /**
     * In der Methode 'act()' koennen die Befehle fuer Kara programmiert werden.
     * Die Befehle werden dort nacheinander aufgerufen, wenn man nach dem 
     * 'Uebersetzen' (=kompilieren) den 'Act'-Knopf drueckt.
     * Beim druecken des 'Run'-Knopfes wird diese Methode immer wieder ausgefuehrt.
     */
    public void act() 
    {
        int leafs = 0;
        
        while (x < 15) {
            leafs = getLength();
            placeAlongY(leafs);
            neutralDirection();
            walk();
        }
    }
    
    private void placeAlongY(int leafAmount) {
        runToAxis(x, 0, true);
        neutralDirection();
        turnLeft();
        
        for (int i = 0; i < leafAmount; i++) {
            putLeaf();
            walk();
        }
        
        runToAxis(x, 0, true);
    }
    
    private int getLength() {
        neutralDirection();
        turnRight();
        walk();
        
        int leafLength = 0;
        
        if (onLeaf()) {
            while (onLeaf()) {
                walk();
                leafLength++;
            }
        }
        return leafLength;
    }
    
    private void walk() {
        int direction = getRotation();
        
        move();
        
        if (direction == DIRECTION_RIGHT) {
            x++;
        } else if (direction == DIRECTION_DOWN) {
            y--;
        } else if (direction == DIRECTION_LEFT) {
            x--;
        } else if (direction == DIRECTION_UP) {
            y++;
        }
    }
    
    private void neutralDirection() {
        int direction = getRotation();
        
        if (direction == DIRECTION_RIGHT) {
            return;
        } else if (direction == DIRECTION_DOWN) {
            turnLeft();
            return;
        } else if (direction == DIRECTION_LEFT) {
            turnLeft();
            turnLeft();
            return;
        } else if (direction == DIRECTION_UP) {
            turnLeft();
            turnLeft();
            turnLeft();
            return; 
        }
    }
    
    private void runToAxis(int newX, int newY, boolean includeCurrentPos) {
        // newX: 5, newY: 7
        // currentX: 0, currentY: 2
        neutralDirection();
        int moveX = 0;
        int moveY = 0;
        
        if (includeCurrentPos) {
            moveX = newX - x;
            moveY = newY - y;
        } else {
            moveX = newX;
            moveY = newY;
        }
        
        if (moveX > 0) {
            for (int i = 0; i < moveX; i++) {
                walk();
            }
        } else if (moveX < 0) {
            turnLeft();
            turnLeft();
            for (int i = 0; i > moveX; i--) {
                walk();
            }
        }
        
        int direction = getRotation();
        
        if (moveY > 0) {
            turnLeft();
            for (int i = 0; i < moveY; i++) {
                walk();
            }
        } else if (moveY < 0) {
            if (direction == DIRECTION_LEFT) {
                turnLeft();
            } else {
                turnRight();
            }
            for (int i = 0; i > moveY; i--) {
                walk();
            }
        }
    }
}
