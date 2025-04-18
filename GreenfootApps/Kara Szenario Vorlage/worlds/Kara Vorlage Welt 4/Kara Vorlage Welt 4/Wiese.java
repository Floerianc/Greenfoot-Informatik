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
        Mushroom mushroom = new Mushroom();
        addObject(mushroom,5,2);
        Leaf leaf = new Leaf();
        addObject(leaf,7,2);
        Mushroom mushroom2 = new Mushroom();
        addObject(mushroom2,5,5);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,7,5);
        Mushroom mushroom3 = new Mushroom();
        addObject(mushroom3,5,8);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,7,8);
        kara.setLocation(2,2);
        mushroom.setLocation(5,2);
        kara.setLocation(2,2);
        removeObject(kara);
        MyKara myKara = new MyKara();
        addObject(myKara,2,2);
    }
}
