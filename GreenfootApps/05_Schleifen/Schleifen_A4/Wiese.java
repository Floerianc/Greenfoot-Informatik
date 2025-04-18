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

        MyKara myKara = new MyKara();
        addObject(myKara,2,7);
        Tree tree = new Tree();
        addObject(tree,5,7);
        Tree tree2 = new Tree();
        addObject(tree2,9,7);
        Tree tree3 = new Tree();
        addObject(tree3,11,7);
        Leaf leaf = new Leaf();
        addObject(leaf,12,7);
        Tree tree4 = new Tree();
        addObject(tree4,9,6);
        Tree tree5 = new Tree();
        addObject(tree5,9,5);
        Tree tree6 = new Tree();
        addObject(tree6,5,6);
        Tree tree7 = new Tree();
        addObject(tree7,5,5);
        Tree tree8 = new Tree();
        addObject(tree8,5,4);
        Tree tree9 = new Tree();
        addObject(tree9,4,4);
        Tree tree10 = new Tree();
        addObject(tree10,3,4);
        removeObject(tree10);
        removeObject(tree9);
    }
}
