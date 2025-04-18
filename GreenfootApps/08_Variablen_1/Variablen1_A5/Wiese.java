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
        Greenfoot.setSpeed(55);

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
        addObject(myKara,0,0);
        Leaf leaf = new Leaf();
        addObject(leaf,5,0);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,6,0);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,6,1);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,5,1);
        Leaf leaf5 = new Leaf();
        addObject(leaf5,5,2);
        Leaf leaf6 = new Leaf();
        addObject(leaf6,6,2);
        Leaf leaf7 = new Leaf();
        addObject(leaf7,6,3);
        Leaf leaf8 = new Leaf();
        addObject(leaf8,5,3);
        Leaf leaf9 = new Leaf();
        addObject(leaf9,5,4);
        Leaf leaf10 = new Leaf();
        addObject(leaf10,6,4);
        Leaf leaf11 = new Leaf();
        addObject(leaf11,6,5);
        Leaf leaf12 = new Leaf();
        addObject(leaf12,5,5);
        Leaf leaf13 = new Leaf();
        addObject(leaf13,5,6);
        Leaf leaf14 = new Leaf();
        addObject(leaf14,6,6);
        Leaf leaf15 = new Leaf();
        addObject(leaf15,6,7);
        Leaf leaf16 = new Leaf();
        addObject(leaf16,5,7);
        Leaf leaf17 = new Leaf();
        addObject(leaf17,5,8);
        Leaf leaf18 = new Leaf();
        addObject(leaf18,6,8);
        Leaf leaf19 = new Leaf();
        addObject(leaf19,6,9);
        Leaf leaf20 = new Leaf();
        addObject(leaf20,5,9);
        Leaf leaf21 = new Leaf();
        addObject(leaf21,5,10);
        Leaf leaf22 = new Leaf();
        addObject(leaf22,6,10);
        Leaf leaf23 = new Leaf();
        addObject(leaf23,6,11);
        Leaf leaf24 = new Leaf();
        addObject(leaf24,5,11);
        Leaf leaf25 = new Leaf();
        addObject(leaf25,5,12);
        Leaf leaf26 = new Leaf();
        addObject(leaf26,6,12);
        Leaf leaf27 = new Leaf();
        addObject(leaf27,6,13);
        Leaf leaf28 = new Leaf();
        addObject(leaf28,5,13);
        Leaf leaf29 = new Leaf();
        addObject(leaf29,5,14);
        Leaf leaf30 = new Leaf();
        addObject(leaf30,6,14);
        Leaf leaf31 = new Leaf();
        addObject(leaf31,9,14);
        Leaf leaf32 = new Leaf();
        addObject(leaf32,10,14);
        Leaf leaf33 = new Leaf();
        addObject(leaf33,10,13);
        Leaf leaf34 = new Leaf();
        addObject(leaf34,9,13);
        Leaf leaf35 = new Leaf();
        addObject(leaf35,9,12);
        Leaf leaf36 = new Leaf();
        addObject(leaf36,10,12);
        Leaf leaf37 = new Leaf();
        addObject(leaf37,10,11);
        Leaf leaf38 = new Leaf();
        addObject(leaf38,9,11);
        Leaf leaf39 = new Leaf();
        addObject(leaf39,9,10);
        Leaf leaf40 = new Leaf();
        addObject(leaf40,10,10);
        Leaf leaf41 = new Leaf();
        addObject(leaf41,9,9);
        Leaf leaf42 = new Leaf();
        addObject(leaf42,10,9);
        Leaf leaf43 = new Leaf();
        addObject(leaf43,10,8);
        Leaf leaf44 = new Leaf();
        addObject(leaf44,9,8);
        Leaf leaf45 = new Leaf();
        addObject(leaf45,9,7);
        Leaf leaf46 = new Leaf();
        addObject(leaf46,10,7);
        Leaf leaf47 = new Leaf();
        addObject(leaf47,10,6);
        Leaf leaf48 = new Leaf();
        addObject(leaf48,9,6);
        Leaf leaf49 = new Leaf();
        addObject(leaf49,9,5);
        Leaf leaf50 = new Leaf();
        addObject(leaf50,10,5);
        Leaf leaf51 = new Leaf();
        addObject(leaf51,10,4);
        Leaf leaf52 = new Leaf();
        addObject(leaf52,9,4);
        Leaf leaf53 = new Leaf();
        addObject(leaf53,9,3);
        Leaf leaf54 = new Leaf();
        addObject(leaf54,10,3);
        Leaf leaf55 = new Leaf();
        addObject(leaf55,10,2);
        Leaf leaf56 = new Leaf();
        addObject(leaf56,9,2);
        Leaf leaf57 = new Leaf();
        addObject(leaf57,9,1);
        Leaf leaf58 = new Leaf();
        addObject(leaf58,10,1);
        Leaf leaf59 = new Leaf();
        addObject(leaf59,10,0);
        Leaf leaf60 = new Leaf();
        addObject(leaf60,9,0);
        Leaf leaf61 = new Leaf();
        addObject(leaf61,11,2);
        Leaf leaf62 = new Leaf();
        addObject(leaf62,13,2);
        Leaf leaf63 = new Leaf();
        addObject(leaf63,12,3);
        Leaf leaf64 = new Leaf();
        addObject(leaf64,13,4);
        Leaf leaf65 = new Leaf();
        addObject(leaf65,11,5);
        Leaf leaf66 = new Leaf();
        addObject(leaf66,12,5);
        Leaf leaf67 = new Leaf();
        addObject(leaf67,13,5);
        Leaf leaf68 = new Leaf();
        addObject(leaf68,14,5);
        Leaf leaf69 = new Leaf();
        addObject(leaf69,11,7);
        Leaf leaf70 = new Leaf();
        addObject(leaf70,12,7);
        Leaf leaf71 = new Leaf();
        addObject(leaf71,13,7);
        Leaf leaf72 = new Leaf();
        addObject(leaf72,11,9);
        Leaf leaf73 = new Leaf();
        addObject(leaf73,12,9);
        Leaf leaf74 = new Leaf();
        addObject(leaf74,13,9);
        Leaf leaf75 = new Leaf();
        addObject(leaf75,14,9);
        Leaf leaf76 = new Leaf();
        addObject(leaf76,13,10);
        Leaf leaf77 = new Leaf();
        addObject(leaf77,12,11);
        Leaf leaf78 = new Leaf();
        addObject(leaf78,11,12);
        Leaf leaf79 = new Leaf();
        addObject(leaf79,13,12);
        Leaf leaf80 = new Leaf();
        addObject(leaf80,4,2);
        Leaf leaf81 = new Leaf();
        addObject(leaf81,2,2);
        Leaf leaf82 = new Leaf();
        addObject(leaf82,3,3);
        Leaf leaf83 = new Leaf();
        addObject(leaf83,2,4);
        Leaf leaf84 = new Leaf();
        addObject(leaf84,1,5);
        Leaf leaf85 = new Leaf();
        addObject(leaf85,2,5);
        Leaf leaf86 = new Leaf();
        addObject(leaf86,3,5);
        Leaf leaf87 = new Leaf();
        addObject(leaf87,4,5);
        Leaf leaf88 = new Leaf();
        addObject(leaf88,4,7);
        Leaf leaf89 = new Leaf();
        addObject(leaf89,3,7);
        Leaf leaf90 = new Leaf();
        addObject(leaf90,2,7);
        Leaf leaf91 = new Leaf();
        addObject(leaf91,1,9);
        Leaf leaf92 = new Leaf();
        addObject(leaf92,2,9);
        Leaf leaf93 = new Leaf();
        addObject(leaf93,3,9);
        Leaf leaf94 = new Leaf();
        addObject(leaf94,4,9);
        Leaf leaf95 = new Leaf();
        addObject(leaf95,2,10);
        Leaf leaf96 = new Leaf();
        addObject(leaf96,3,11);
        Leaf leaf97 = new Leaf();
        addObject(leaf97,4,12);
        Leaf leaf98 = new Leaf();
        addObject(leaf98,2,12);
        Leaf leaf99 = new Leaf();
        addObject(leaf99,7,7);
        Leaf leaf100 = new Leaf();
        addObject(leaf100,8,7);
    }
}
