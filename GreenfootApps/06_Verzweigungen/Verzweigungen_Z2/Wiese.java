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

        Mushroom mushroom = new Mushroom();
        addObject(mushroom,0,10);
        Mushroom mushroom2 = new Mushroom();
        addObject(mushroom2,1,10);
        Mushroom mushroom3 = new Mushroom();
        addObject(mushroom3,2,10);
        Mushroom mushroom4 = new Mushroom();
        addObject(mushroom4,3,10);
        Mushroom mushroom5 = new Mushroom();
        addObject(mushroom5,4,10);
        Tree tree = new Tree();
        addObject(tree,5,10);
        Tree tree2 = new Tree();
        addObject(tree2,6,10);
        Tree tree3 = new Tree();
        addObject(tree3,7,10);
        Tree tree4 = new Tree();
        addObject(tree4,7,9);
        Tree tree5 = new Tree();
        addObject(tree5,6,9);
        Tree tree6 = new Tree();
        addObject(tree6,5,9);
        Tree tree7 = new Tree();
        addObject(tree7,5,8);
        Tree tree8 = new Tree();
        addObject(tree8,6,8);
        Tree tree9 = new Tree();
        addObject(tree9,7,8);
        Tree tree10 = new Tree();
        addObject(tree10,7,7);
        Tree tree11 = new Tree();
        addObject(tree11,6,7);
        Tree tree12 = new Tree();
        addObject(tree12,5,7);
        Mushroom mushroom6 = new Mushroom();
        addObject(mushroom6,8,10);
        Mushroom mushroom7 = new Mushroom();
        addObject(mushroom7,9,10);
        Mushroom mushroom8 = new Mushroom();
        addObject(mushroom8,10,10);
        Tree tree13 = new Tree();
        addObject(tree13,11,10);
        Tree tree14 = new Tree();
        addObject(tree14,11,9);
        Tree tree15 = new Tree();
        addObject(tree15,11,8);
        Mushroom mushroom9 = new Mushroom();
        addObject(mushroom9,12,10);
        Mushroom mushroom10 = new Mushroom();
        addObject(mushroom10,13,10);
        Mushroom mushroom11 = new Mushroom();
        addObject(mushroom11,14,10);
        Leaf leaf = new Leaf();
        addObject(leaf,14,9);
        MyKara myKara = new MyKara();
        addObject(myKara,0,9);
    }
}
