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
        int leafAmount = 4;
        int stepSize = 2;
        whileSchleife(leafAmount, stepSize);
        // zaehlSchleife(leafAmount, stepSize);
    }  
    
    private void whileSchleife(int amount, int stepSize) {
        int placedLeafs = 0;
        while (placedLeafs < amount - 1) {
            putLeaf();
            
            int i = 0;
            while (i < stepSize) {
                move();
                i++;
            }
            placedLeafs++;
        }
        putLeaf();
    }
    
    private void zaehlSchleife(int amount, int stepSize) {
        for (int placedLeafs = 0; placedLeafs < amount - 1; placedLeafs++) {
            putLeaf();
            for (int i = 0; i < stepSize; i++) {
                move();
            }
        }
        putLeaf();
    }
}
