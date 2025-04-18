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
        Greenfoot.setSpeed(30);

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
        addObject(leaf,6,14);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,6,13);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,6,12);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,6,11);
        Leaf leaf5 = new Leaf();
        addObject(leaf5,6,10);
        Leaf leaf6 = new Leaf();
        addObject(leaf6,6,9);
        Leaf leaf7 = new Leaf();
        addObject(leaf7,6,8);
        Leaf leaf8 = new Leaf();
        addObject(leaf8,1,8);
        Leaf leaf9 = new Leaf();
        addObject(leaf9,2,8);
        Leaf leaf10 = new Leaf();
        addObject(leaf10,3,8);
        Leaf leaf11 = new Leaf();
        addObject(leaf11,4,8);
        Leaf leaf12 = new Leaf();
        addObject(leaf12,5,8);
        Leaf leaf13 = new Leaf();
        addObject(leaf13,7,8);
        Leaf leaf14 = new Leaf();
        addObject(leaf14,8,8);
        Leaf leaf15 = new Leaf();
        addObject(leaf15,9,8);
        Leaf leaf16 = new Leaf();
        addObject(leaf16,10,8);
        Leaf leaf17 = new Leaf();
        addObject(leaf17,12,8);
        Leaf leaf18 = new Leaf();
        addObject(leaf18,11,8);
        Leaf leaf19 = new Leaf();
        addObject(leaf19,13,8);
        Leaf leaf20 = new Leaf();
        addObject(leaf20,14,8);
        Leaf leaf21 = new Leaf();
        addObject(leaf21,14,9);
        Leaf leaf22 = new Leaf();
        addObject(leaf22,13,9);
        Leaf leaf23 = new Leaf();
        addObject(leaf23,13,10);
        Leaf leaf24 = new Leaf();
        addObject(leaf24,13,11);
        Leaf leaf25 = new Leaf();
        addObject(leaf25,12,10);
        Leaf leaf26 = new Leaf();
        addObject(leaf26,11,10);
        Leaf leaf27 = new Leaf();
        addObject(leaf27,11,9);
        Leaf leaf28 = new Leaf();
        addObject(leaf28,12,9);
        Leaf leaf29 = new Leaf();
        addObject(leaf29,9,9);
        Leaf leaf30 = new Leaf();
        addObject(leaf30,7,13);
        Leaf leaf31 = new Leaf();
        addObject(leaf31,7,12);
        Leaf leaf32 = new Leaf();
        addObject(leaf32,7,11);
        Leaf leaf33 = new Leaf();
        addObject(leaf33,7,10);
        Leaf leaf34 = new Leaf();
        addObject(leaf34,7,9);
        Leaf leaf35 = new Leaf();
        addObject(leaf35,8,9);
        Leaf leaf36 = new Leaf();
        addObject(leaf36,8,10);
        Leaf leaf37 = new Leaf();
        addObject(leaf37,4,9);
        Leaf leaf38 = new Leaf();
        addObject(leaf38,3,9);
        Leaf leaf39 = new Leaf();
        addObject(leaf39,2,9);
        Leaf leaf40 = new Leaf();
        addObject(leaf40,2,10);
        Leaf leaf41 = new Leaf();
        addObject(leaf41,4,10);
        Leaf leaf42 = new Leaf();
        addObject(leaf42,4,11);
        Leaf leaf43 = new Leaf();
        addObject(leaf43,4,12);
        MyKara myKara = new MyKara();
        addObject(myKara,0,7);
        Leaf leaf44 = new Leaf();
        addObject(leaf44,0,8);
        Leaf leaf45 = new Leaf();
        addObject(leaf45,0,9);
        Leaf leaf46 = new Leaf();
        addObject(leaf46,0,10);
    }
}
