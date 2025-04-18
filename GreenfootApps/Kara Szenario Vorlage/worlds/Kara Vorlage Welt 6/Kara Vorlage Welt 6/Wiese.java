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

        Kara kara = new Kara();
        addObject(kara,3,7);
        Tree tree = new Tree();
        addObject(tree,3,8);
        Tree tree2 = new Tree();
        addObject(tree2,4,8);
        Tree tree3 = new Tree();
        addObject(tree3,5,8);
        Tree tree4 = new Tree();
        addObject(tree4,6,8);
        Tree tree5 = new Tree();
        addObject(tree5,7,8);
        Tree tree6 = new Tree();
        addObject(tree6,7,9);
        Tree tree7 = new Tree();
        addObject(tree7,7,10);
        Tree tree8 = new Tree();
        addObject(tree8,7,11);
        Leaf leaf = new Leaf();
        addObject(leaf,8,11);
        Tree tree9 = new Tree();
        addObject(tree9,9,11);
        Tree tree10 = new Tree();
        addObject(tree10,9,10);
        Tree tree11 = new Tree();
        addObject(tree11,9,9);
        Tree tree12 = new Tree();
        addObject(tree12,9,8);
        Tree tree13 = new Tree();
        addObject(tree13,9,7);
        Tree tree14 = new Tree();
        addObject(tree14,9,6);
        Tree tree15 = new Tree();
        addObject(tree15,9,5);
        removeObject(kara);
        MyKara myKara = new MyKara();
        addObject(myKara,3,7);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom,5,7);
    }
}
