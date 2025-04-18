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
        addObject(tree,13,4);
        Tree tree2 = new Tree();
        addObject(tree2,12,4);
        Tree tree3 = new Tree();
        addObject(tree3,11,4);
        Tree tree4 = new Tree();
        addObject(tree4,10,4);
        Tree tree5 = new Tree();
        addObject(tree5,13,5);
        Tree tree6 = new Tree();
        addObject(tree6,13,6);
        Tree tree7 = new Tree();
        addObject(tree7,13,7);
        Tree tree8 = new Tree();
        addObject(tree8,13,8);
        Tree tree9 = new Tree();
        addObject(tree9,12,8);
        Tree tree10 = new Tree();
        addObject(tree10,11,8);
        Tree tree11 = new Tree();
        addObject(tree11,10,7);
        Tree tree12 = new Tree();
        addObject(tree12,9,7);
        Tree tree13 = new Tree();
        addObject(tree13,8,7);
        Tree tree14 = new Tree();
        addObject(tree14,7,6);
        Tree tree15 = new Tree();
        addObject(tree15,7,5);
        Tree tree16 = new Tree();
        addObject(tree16,8,5);
        Tree tree17 = new Tree();
        addObject(tree17,9,5);
        MyKara myKara = new MyKara();
        addObject(myKara,10,3);
        Leaf leaf = new Leaf();
        addObject(leaf,10,5);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,10,6);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,9,6);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,8,6);
        Leaf leaf5 = new Leaf();
        addObject(leaf5,11,6);
        Leaf leaf6 = new Leaf();
        addObject(leaf6,12,6);
        Leaf leaf7 = new Leaf();
        addObject(leaf7,12,7);
        Leaf leaf8 = new Leaf();
        addObject(leaf8,11,7);
        Leaf leaf9 = new Leaf();
        addObject(leaf9,11,5);
        Leaf leaf10 = new Leaf();
        addObject(leaf10,12,5);
    }
}
