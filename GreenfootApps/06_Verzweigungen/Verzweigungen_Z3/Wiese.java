import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Diese Klasse erstellt eine Welt für Kara. Sie enthaelt Einstellungen ueber
 * die Hoehe und Breite der Welt und initialisiert alle Actors.
 * 
 * @author Marco Jakob
 * @version 04.04.2011
 */
public class Wiese extends World 
{   
    private static final int WORLD_WIDTH = 15;  // Anzahl der Zellen horizontal
    private static final int WORLD_HEIGHT = 15;  // Anzahl der Zellen vertikal

    private static final int CELL_SIZE = 28; // Groesse einer einzelnen Zelle

    /**
     * Erstellt eine Welt fuer Kara.
     */
    public Wiese() 
    {
        // Erzeugt eine neue Welt
        super(WORLD_WIDTH, WORLD_HEIGHT, CELL_SIZE);

        setPaintOrder(Kara.class, Tree.class, Mushroom.class, Leaf.class);
        Greenfoot.setSpeed(15);

        // Erzeuge die Anfangs-Objekte fuer die Welt.
        prepare();
    }

    /**
     * Bereite die Welt fuer den Programmstart vor. Das heisst: Erzeuge die Anfangs-
     * Objekte und fuege sie der Welt hinzu.
     * 
     * Tipp: Die Objekte zuerst mit der Maus in der Welt platzieren. Anschliessend 
     * Rechtsklick auf die Welt, dann 'Die Welt speichern' auswaehlen. So werden alle
     * Objekte automatisch in diese Methode geschrieben.
     */
    private void prepare() 
    {

        Tree tree = new Tree();
        addObject(tree,0,3);
        Tree tree2 = new Tree();
        addObject(tree2,1,3);
        Tree tree3 = new Tree();
        addObject(tree3,2,3);
        Tree tree4 = new Tree();
        addObject(tree4,3,3);
        Tree tree5 = new Tree();
        addObject(tree5,3,4);
        Tree tree6 = new Tree();
        addObject(tree6,3,5);
        Tree tree7 = new Tree();
        addObject(tree7,3,6);
        Tree tree8 = new Tree();
        addObject(tree8,3,7);
        Tree tree9 = new Tree();
        addObject(tree9,4,7);
        Tree tree10 = new Tree();
        addObject(tree10,4,8);
        Tree tree11 = new Tree();
        addObject(tree11,5,8);
        Tree tree12 = new Tree();
        addObject(tree12,6,8);
        Tree tree13 = new Tree();
        addObject(tree13,6,9);
        Tree tree14 = new Tree();
        addObject(tree14,6,10);
        Tree tree15 = new Tree();
        addObject(tree15,6,11);
        Tree tree16 = new Tree();
        addObject(tree16,7,11);
        tree16.setLocation(7,11);
        Tree tree17 = new Tree();
        addObject(tree17,7,11);
        Tree tree18 = new Tree();
        addObject(tree18,8,11);
        Tree tree19 = new Tree();
        addObject(tree19,9,11);
        Tree tree20 = new Tree();
        addObject(tree20,10,11);
        Tree tree21 = new Tree();
        addObject(tree21,10,12);
        Tree tree22 = new Tree();
        addObject(tree22,11,12);
        Tree tree23 = new Tree();
        addObject(tree23,12,12);
        Tree tree24 = new Tree();
        addObject(tree24,13,12);
        Leaf leaf = new Leaf();
        addObject(leaf,13,13);
        MyKara myKara = new MyKara();
        addObject(myKara,0,4);
    }
}
