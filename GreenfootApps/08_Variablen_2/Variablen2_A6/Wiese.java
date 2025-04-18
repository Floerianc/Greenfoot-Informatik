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

        Leaf leaf = new Leaf();
        addObject(leaf,2,5);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,3,5);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,4,5);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,5,5);
        Leaf leaf5 = new Leaf();
        addObject(leaf5,5,4);
        Leaf leaf6 = new Leaf();
        addObject(leaf6,6,4);
        Leaf leaf7 = new Leaf();
        addObject(leaf7,6,5);
        Leaf leaf8 = new Leaf();
        addObject(leaf8,7,5);
        Leaf leaf9 = new Leaf();
        addObject(leaf9,8,5);
        Leaf leaf10 = new Leaf();
        addObject(leaf10,9,5);
        Leaf leaf11 = new Leaf();
        addObject(leaf11,6,6);
        Leaf leaf12 = new Leaf();
        addObject(leaf12,7,6);
        Leaf leaf13 = new Leaf();
        addObject(leaf13,8,6);
        Leaf leaf14 = new Leaf();
        addObject(leaf14,9,6);
        Leaf leaf15 = new Leaf();
        addObject(leaf15,7,7);
        Leaf leaf16 = new Leaf();
        addObject(leaf16,6,7);
        Leaf leaf17 = new Leaf();
        addObject(leaf17,5,7);
        Leaf leaf18 = new Leaf();
        addObject(leaf18,4,7);
        Leaf leaf19 = new Leaf();
        addObject(leaf19,3,7);
        Leaf leaf20 = new Leaf();
        addObject(leaf20,3,8);
        Leaf leaf21 = new Leaf();
        addObject(leaf21,4,8);
        Leaf leaf22 = new Leaf();
        addObject(leaf22,5,8);
        Leaf leaf23 = new Leaf();
        addObject(leaf23,6,8);
        Leaf leaf24 = new Leaf();
        addObject(leaf24,7,8);
        Leaf leaf25 = new Leaf();
        addObject(leaf25,4,9);
        Leaf leaf26 = new Leaf();
        addObject(leaf26,5,9);
        Leaf leaf27 = new Leaf();
        addObject(leaf27,6,9);
        Leaf leaf28 = new Leaf();
        addObject(leaf28,7,9);
        Leaf leaf29 = new Leaf();
        addObject(leaf29,8,9);
        Leaf leaf30 = new Leaf();
        addObject(leaf30,9,9);
        Leaf leaf31 = new Leaf();
        addObject(leaf31,10,9);
        Leaf leaf32 = new Leaf();
        addObject(leaf32,11,9);
        Leaf leaf33 = new Leaf();
        addObject(leaf33,11,10);
        Leaf leaf34 = new Leaf();
        addObject(leaf34,10,10);
        Leaf leaf35 = new Leaf();
        addObject(leaf35,9,10);
        Leaf leaf36 = new Leaf();
        addObject(leaf36,8,10);
        Leaf leaf37 = new Leaf();
        addObject(leaf37,8,11);
        Leaf leaf38 = new Leaf();
        addObject(leaf38,9,11);
        Leaf leaf39 = new Leaf();
        addObject(leaf39,10,11);
        Leaf leaf40 = new Leaf();
        addObject(leaf40,9,12);
        Leaf leaf41 = new Leaf();
        addObject(leaf41,8,12);
        Leaf leaf42 = new Leaf();
        addObject(leaf42,4,10);
        Leaf leaf43 = new Leaf();
        addObject(leaf43,5,10);
        Leaf leaf44 = new Leaf();
        addObject(leaf44,3,11);
        Leaf leaf45 = new Leaf();
        addObject(leaf45,4,11);
        Leaf leaf46 = new Leaf();
        addObject(leaf46,5,11);
        Leaf leaf47 = new Leaf();
        addObject(leaf47,6,11);
        Leaf leaf48 = new Leaf();
        addObject(leaf48,3,12);
        Leaf leaf49 = new Leaf();
        addObject(leaf49,4,12);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom,2,7);
        MyKara myKara = new MyKara();
        addObject(myKara,2,4);
        removeObject(leaf47);
    }
}
