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
        addObject(tree,3,4);
        Tree tree2 = new Tree();
        addObject(tree2,4,4);
        Tree tree3 = new Tree();
        addObject(tree3,5,4);
        Tree tree4 = new Tree();
        addObject(tree4,6,4);
        Tree tree5 = new Tree();
        addObject(tree5,7,4);
        Tree tree6 = new Tree();
        addObject(tree6,8,4);
        Tree tree7 = new Tree();
        addObject(tree7,9,4);
        Tree tree8 = new Tree();
        addObject(tree8,10,4);
        Tree tree9 = new Tree();
        addObject(tree9,11,4);
        Tree tree10 = new Tree();
        addObject(tree10,11,5);
        Tree tree11 = new Tree();
        addObject(tree11,10,5);
        Tree tree12 = new Tree();
        addObject(tree12,9,5);
        Tree tree13 = new Tree();
        addObject(tree13,8,5);
        Tree tree14 = new Tree();
        addObject(tree14,7,5);
        Tree tree15 = new Tree();
        addObject(tree15,6,5);
        Tree tree16 = new Tree();
        addObject(tree16,5,5);
        Tree tree17 = new Tree();
        addObject(tree17,4,5);
        Tree tree18 = new Tree();
        addObject(tree18,3,5);
        Tree tree19 = new Tree();
        addObject(tree19,3,6);
        Tree tree20 = new Tree();
        addObject(tree20,4,6);
        Tree tree21 = new Tree();
        addObject(tree21,5,6);
        Tree tree22 = new Tree();
        addObject(tree22,6,6);
        Tree tree23 = new Tree();
        addObject(tree23,7,6);
        Tree tree24 = new Tree();
        addObject(tree24,8,6);
        Tree tree25 = new Tree();
        addObject(tree25,9,6);
        Tree tree26 = new Tree();
        addObject(tree26,10,6);
        Tree tree27 = new Tree();
        addObject(tree27,11,6);
        MyKara myKara = new MyKara();
        addObject(myKara,3,7);
    }
}
