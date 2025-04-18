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

        Mushroom mushroom = new Mushroom();
        addObject(mushroom,2,5);
        Mushroom mushroom2 = new Mushroom();
        addObject(mushroom2,2,6);
        Mushroom mushroom3 = new Mushroom();
        addObject(mushroom3,2,7);
        Mushroom mushroom4 = new Mushroom();
        addObject(mushroom4,2,8);
        Mushroom mushroom5 = new Mushroom();
        addObject(mushroom5,2,9);
        Mushroom mushroom6 = new Mushroom();
        addObject(mushroom6,3,5);
        Mushroom mushroom7 = new Mushroom();
        addObject(mushroom7,4,5);
        Mushroom mushroom8 = new Mushroom();
        addObject(mushroom8,5,5);
        Mushroom mushroom9 = new Mushroom();
        addObject(mushroom9,6,5);
        Mushroom mushroom10 = new Mushroom();
        addObject(mushroom10,7,5);
        Mushroom mushroom11 = new Mushroom();
        addObject(mushroom11,8,5);
        Mushroom mushroom12 = new Mushroom();
        addObject(mushroom12,9,5);
        Mushroom mushroom13 = new Mushroom();
        addObject(mushroom13,10,5);
        Mushroom mushroom14 = new Mushroom();
        addObject(mushroom14,11,5);
        Mushroom mushroom15 = new Mushroom();
        addObject(mushroom15,12,5);
        Mushroom mushroom16 = new Mushroom();
        addObject(mushroom16,12,6);
        Mushroom mushroom17 = new Mushroom();
        addObject(mushroom17,12,7);
        Mushroom mushroom18 = new Mushroom();
        addObject(mushroom18,12,8);
        Mushroom mushroom19 = new Mushroom();
        addObject(mushroom19,12,9);
        Mushroom mushroom20 = new Mushroom();
        addObject(mushroom20,11,9);
        Mushroom mushroom21 = new Mushroom();
        addObject(mushroom21,10,9);
        Mushroom mushroom22 = new Mushroom();
        addObject(mushroom22,9,9);
        Mushroom mushroom24 = new Mushroom();
        addObject(mushroom24,8,9);
        Mushroom mushroom25 = new Mushroom();
        addObject(mushroom25,7,9);
        Mushroom mushroom26 = new Mushroom();
        addObject(mushroom26,6,9);
        Mushroom mushroom27 = new Mushroom();
        addObject(mushroom27,5,9);
        Mushroom mushroom28 = new Mushroom();
        addObject(mushroom28,4,9);
        Mushroom mushroom29 = new Mushroom();
        addObject(mushroom29,3,9);
        Mushroom mushroom30 = new Mushroom();
        addObject(mushroom30,3,8);
        Mushroom mushroom31 = new Mushroom();
        addObject(mushroom31,3,7);
        Mushroom mushroom32 = new Mushroom();
        addObject(mushroom32,3,6);
        Mushroom mushroom33 = new Mushroom();
        addObject(mushroom33,4,6);
        Mushroom mushroom34 = new Mushroom();
        addObject(mushroom34,4,7);
        Mushroom mushroom35 = new Mushroom();
        addObject(mushroom35,4,8);
        Mushroom mushroom36 = new Mushroom();
        addObject(mushroom36,5,8);
        Mushroom mushroom37 = new Mushroom();
        addObject(mushroom37,5,7);
        Mushroom mushroom38 = new Mushroom();
        addObject(mushroom38,5,6);
        Mushroom mushroom39 = new Mushroom();
        addObject(mushroom39,6,6);
        Mushroom mushroom40 = new Mushroom();
        addObject(mushroom40,6,7);
        Mushroom mushroom41 = new Mushroom();
        addObject(mushroom41,6,8);
        Mushroom mushroom42 = new Mushroom();
        addObject(mushroom42,7,8);
        Mushroom mushroom43 = new Mushroom();
        addObject(mushroom43,7,7);
        Mushroom mushroom44 = new Mushroom();
        addObject(mushroom44,7,6);
        Mushroom mushroom45 = new Mushroom();
        addObject(mushroom45,8,6);
        Mushroom mushroom46 = new Mushroom();
        addObject(mushroom46,8,7);
        Mushroom mushroom47 = new Mushroom();
        addObject(mushroom47,8,8);
        Mushroom mushroom48 = new Mushroom();
        addObject(mushroom48,9,8);
        Mushroom mushroom49 = new Mushroom();
        addObject(mushroom49,9,7);
        Mushroom mushroom50 = new Mushroom();
        addObject(mushroom50,9,6);
        Mushroom mushroom51 = new Mushroom();
        addObject(mushroom51,10,6);
        Mushroom mushroom52 = new Mushroom();
        addObject(mushroom52,10,7);
        Mushroom mushroom53 = new Mushroom();
        addObject(mushroom53,10,8);
        Mushroom mushroom54 = new Mushroom();
        addObject(mushroom54,11,8);
        Mushroom mushroom55 = new Mushroom();
        addObject(mushroom55,11,7);
        Mushroom mushroom56 = new Mushroom();
        addObject(mushroom56,11,6);
        MyKara myKara = new MyKara();
        addObject(myKara,5,4);
    }
}
