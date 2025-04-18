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
        addObject(myKara,2,4);
        Leaf leaf = new Leaf();
        addObject(leaf,3,4);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,4,4);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,4,5);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,4,6);
        Leaf leaf5 = new Leaf();
        addObject(leaf5,4,7);
        Leaf leaf6 = new Leaf();
        addObject(leaf6,4,8);
        Leaf leaf7 = new Leaf();
        addObject(leaf7,5,8);
        Leaf leaf8 = new Leaf();
        addObject(leaf8,6,8);
        Leaf leaf9 = new Leaf();
        addObject(leaf9,7,8);
        Leaf leaf10 = new Leaf();
        addObject(leaf10,7,7);
        Leaf leaf11 = new Leaf();
        addObject(leaf11,7,6);
        Leaf leaf12 = new Leaf();
        addObject(leaf12,6,6);
        Leaf leaf13 = new Leaf();
        addObject(leaf13,6,5);
        Leaf leaf14 = new Leaf();
        addObject(leaf14,6,4);
        Leaf leaf15 = new Leaf();
        addObject(leaf15,7,4);
        Leaf leaf16 = new Leaf();
        addObject(leaf16,8,4);
        Leaf leaf17 = new Leaf();
        addObject(leaf17,9,4);
        Leaf leaf18 = new Leaf();
        addObject(leaf18,9,5);
        Leaf leaf19 = new Leaf();
        addObject(leaf19,9,6);
        Leaf leaf20 = new Leaf();
        addObject(leaf20,9,7);
        Leaf leaf21 = new Leaf();
        addObject(leaf21,9,8);
        Leaf leaf22 = new Leaf();
        addObject(leaf22,9,9);
        Leaf leaf23 = new Leaf();
        addObject(leaf23,9,10);
        Leaf leaf24 = new Leaf();
        addObject(leaf24,8,10);
        Leaf leaf25 = new Leaf();
        addObject(leaf25,7,10);
        Leaf leaf26 = new Leaf();
        addObject(leaf26,6,10);
        Leaf leaf27 = new Leaf();
        addObject(leaf27,5,10);
        Leaf leaf28 = new Leaf();
        addObject(leaf28,4,10);
        Leaf leaf29 = new Leaf();
        addObject(leaf29,3,10);
        Leaf leaf30 = new Leaf();
        addObject(leaf30,2,10);
        removeObject(leaf30);
        Tree tree = new Tree();
        addObject(tree,2,10);
    }
}
