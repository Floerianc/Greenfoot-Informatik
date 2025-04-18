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
        addObject(tree,3,3);
        Tree tree2 = new Tree();
        addObject(tree2,4,3);
        Tree tree3 = new Tree();
        addObject(tree3,5,3);
        Tree tree4 = new Tree();
        addObject(tree4,6,3);
        Tree tree5 = new Tree();
        addObject(tree5,7,3);
        Tree tree6 = new Tree();
        addObject(tree6,8,3);
        Tree tree7 = new Tree();
        addObject(tree7,9,3);
        Tree tree8 = new Tree();
        addObject(tree8,10,3);
        Tree tree9 = new Tree();
        addObject(tree9,11,3);
        Kara kara = new Kara();
        addObject(kara,3,4);
        Tree tree10 = new Tree();
        addObject(tree10,3,5);
        Tree tree11 = new Tree();
        addObject(tree11,4,5);
        Tree tree12 = new Tree();
        addObject(tree12,3,6);
        Tree tree13 = new Tree();
        addObject(tree13,4,6);
        Tree tree14 = new Tree();
        addObject(tree14,4,7);
        Tree tree15 = new Tree();
        addObject(tree15,3,7);
        Tree tree16 = new Tree();
        addObject(tree16,3,8);
        Tree tree17 = new Tree();
        addObject(tree17,3,9);
        Tree tree18 = new Tree();
        addObject(tree18,3,10);
        Tree tree19 = new Tree();
        addObject(tree19,3,11);
        Tree tree20 = new Tree();
        addObject(tree20,4,11);
        Tree tree21 = new Tree();
        addObject(tree21,5,11);
        Tree tree22 = new Tree();
        addObject(tree22,6,11);
        Tree tree23 = new Tree();
        addObject(tree23,7,11);
        Tree tree24 = new Tree();
        addObject(tree24,7,10);
        Tree tree25 = new Tree();
        addObject(tree25,5,8);
        Tree tree26 = new Tree();
        addObject(tree26,5,9);
        Tree tree27 = new Tree();
        addObject(tree27,7,8);
        Tree tree28 = new Tree();
        addObject(tree28,8,8);
        Tree tree29 = new Tree();
        addObject(tree29,9,8);
        Tree tree30 = new Tree();
        addObject(tree30,9,9);
        Tree tree31 = new Tree();
        addObject(tree31,9,10);
        Tree tree32 = new Tree();
        addObject(tree32,11,9);
        Tree tree33 = new Tree();
        addObject(tree33,11,10);
        Tree tree34 = new Tree();
        addObject(tree34,11,11);
        Tree tree35 = new Tree();
        addObject(tree35,9,7);
        Tree tree36 = new Tree();
        addObject(tree36,9,6);
        Tree tree37 = new Tree();
        addObject(tree37,10,6);
        Tree tree38 = new Tree();
        addObject(tree38,10,7);
        Tree tree39 = new Tree();
        addObject(tree39,7,6);
        Tree tree40 = new Tree();
        addObject(tree40,6,6);
        Tree tree41 = new Tree();
        addObject(tree41,6,5);
        Tree tree42 = new Tree();
        addObject(tree42,6,4);
        Tree tree43 = new Tree();
        addObject(tree43,8,4);
        Tree tree44 = new Tree();
        addObject(tree44,9,4);
        Tree tree45 = new Tree();
        addObject(tree45,9,5);
        Tree tree46 = new Tree();
        addObject(tree46,11,4);
        Leaf leaf = new Leaf();
        addObject(leaf,10,4);
    }
}
