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
    double CONST1 = 0.125;
    double CONST2 = 0.75;
    /**
     * In der Methode 'act()' koennen die Befehle fuer Kara programmiert werden.
     * Die Befehle werden dort nacheinander aufgerufen, wenn man nach dem 
     * 'Uebersetzen' (=kompilieren) den 'Act'-Knopf drueckt.
     * Beim druecken des 'Run'-Knopfes wird diese Methode immer wieder ausgefuehrt.
     */
    public void act() 
    {
        System.out.println(add(CONST1, CONST2));
        System.out.println(subtract(CONST1, CONST2));
        System.out.println(multiply(CONST1, CONST2));
        System.out.println(divide(CONST1, CONST2));
    }  
    
    private double add(double x, double y) {
        return x + y;
    }
    
    private double subtract(double x, double y) {
        return x - y;
    }
    
    private double multiply(double x, double y) {
        return x * y;
    }
    
    private double divide(double x, double y) {
        return x / y;
    }
}
