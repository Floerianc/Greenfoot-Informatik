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
        addObject(kara,2,2);
        Leaf leaf = new Leaf();
        addObject(leaf,3,2);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,4,2);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,5,2);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,5,3);
        Leaf leaf5 = new Leaf();
        addObject(leaf5,5,4);
        Leaf leaf6 = new Leaf();
        addObject(leaf6,5,5);
        Leaf leaf7 = new Leaf();
        addObject(leaf7,6,5);
        Leaf leaf8 = new Leaf();
        addObject(leaf8,7,5);
        Leaf leaf9 = new Leaf();
        addObject(leaf9,8,5);
        Leaf leaf10 = new Leaf();
        addObject(leaf10,8,6);
        Leaf leaf11 = new Leaf();
        addObject(leaf11,8,7);
        Leaf leaf12 = new Leaf();
        addObject(leaf12,8,8);
        Leaf leaf13 = new Leaf();
        addObject(leaf13,7,8);
        Leaf leaf14 = new Leaf();
        addObject(leaf14,6,8);
        Leaf leaf15 = new Leaf();
        addObject(leaf15,5,8);
        Leaf leaf16 = new Leaf();
        addObject(leaf16,4,8);
        Leaf leaf17 = new Leaf();
        addObject(leaf17,3,8);
        Leaf leaf18 = new Leaf();
        addObject(leaf18,2,8);
        Leaf leaf19 = new Leaf();
        addObject(leaf19,2,7);
        Leaf leaf20 = new Leaf();
        addObject(leaf20,2,6);
        Leaf leaf21 = new Leaf();
        addObject(leaf21,2,5);
        Leaf leaf22 = new Leaf();
        addObject(leaf22,2,4);
        Leaf leaf23 = new Leaf();
        addObject(leaf23,2,3);
    }
}
