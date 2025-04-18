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
        addObject(tree,4,4);
        Tree tree2 = new Tree();
        addObject(tree2,5,4);
        Tree tree3 = new Tree();
        addObject(tree3,6,4);
        Tree tree4 = new Tree();
        addObject(tree4,7,4);
        Tree tree5 = new Tree();
        addObject(tree5,7,5);
        Tree tree6 = new Tree();
        addObject(tree6,7,7);
        Tree tree7 = new Tree();
        addObject(tree7,7,8);
        Tree tree8 = new Tree();
        addObject(tree8,6,8);
        Tree tree9 = new Tree();
        addObject(tree9,5,8);
        Tree tree10 = new Tree();
        addObject(tree10,4,8);
        Tree tree11 = new Tree();
        addObject(tree11,4,7);
        Tree tree12 = new Tree();
        addObject(tree12,4,6);
        Tree tree13 = new Tree();
        addObject(tree13,4,5);
        Leaf leaf = new Leaf();
        addObject(leaf,5,5);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,6,5);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,5,6);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,6,6);
        Leaf leaf5 = new Leaf();
        addObject(leaf5,5,7);
        Leaf leaf6 = new Leaf();
        addObject(leaf6,6,7);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom,7,6);
        Kara kara = new Kara();
        addObject(kara,9,6);
        removeObject(kara);
        MyKara myKara = new MyKara();
        addObject(myKara,9,6);
    }
}
