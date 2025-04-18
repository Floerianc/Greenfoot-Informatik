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
        Tree tree10 = new Tree();
        addObject(tree10,11,4);
        Tree tree11 = new Tree();
        addObject(tree11,11,5);
        Tree tree12 = new Tree();
        addObject(tree12,11,6);
        Tree tree13 = new Tree();
        addObject(tree13,11,7);
        Tree tree14 = new Tree();
        addObject(tree14,11,8);
        Tree tree15 = new Tree();
        addObject(tree15,11,9);
        Tree tree16 = new Tree();
        addObject(tree16,11,10);
        Tree tree17 = new Tree();
        addObject(tree17,11,11);
        Tree tree18 = new Tree();
        addObject(tree18,10,11);
        Tree tree19 = new Tree();
        addObject(tree19,9,11);
        Tree tree20 = new Tree();
        addObject(tree20,8,11);
        Tree tree21 = new Tree();
        addObject(tree21,7,11);
        Tree tree22 = new Tree();
        addObject(tree22,6,11);
        Tree tree23 = new Tree();
        addObject(tree23,5,11);
        Tree tree24 = new Tree();
        addObject(tree24,4,11);
        Tree tree25 = new Tree();
        addObject(tree25,3,11);
        Tree tree26 = new Tree();
        addObject(tree26,3,10);
        Tree tree27 = new Tree();
        addObject(tree27,3,9);
        Tree tree28 = new Tree();
        addObject(tree28,3,8);
        Tree tree29 = new Tree();
        addObject(tree29,3,7);
        Tree tree30 = new Tree();
        addObject(tree30,3,6);
        Tree tree31 = new Tree();
        addObject(tree31,3,5);
        Tree tree32 = new Tree();
        addObject(tree32,3,4);
        Tree tree33 = new Tree();
        addObject(tree33,5,5);
        Tree tree34 = new Tree();
        addObject(tree34,6,5);
        Tree tree35 = new Tree();
        addObject(tree35,7,5);
        Tree tree36 = new Tree();
        addObject(tree36,8,5);
        Tree tree37 = new Tree();
        addObject(tree37,9,5);
        Tree tree38 = new Tree();
        addObject(tree38,9,6);
        Tree tree39 = new Tree();
        addObject(tree39,9,7);
        Tree tree40 = new Tree();
        addObject(tree40,9,8);
        Tree tree41 = new Tree();
        addObject(tree41,9,9);
        Tree tree42 = new Tree();
        addObject(tree42,8,9);
        Tree tree43 = new Tree();
        addObject(tree43,7,9);
        Tree tree44 = new Tree();
        addObject(tree44,6,9);
        Tree tree45 = new Tree();
        addObject(tree45,5,9);
        Tree tree46 = new Tree();
        addObject(tree46,5,8);
        Tree tree47 = new Tree();
        addObject(tree47,5,7);
        Tree tree48 = new Tree();
        addObject(tree48,5,6);
        Leaf leaf = new Leaf();
        addObject(leaf,5,4);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,4,5);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,9,4);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,10,6);
        Leaf leaf5 = new Leaf();
        addObject(leaf5,10,7);
        Leaf leaf6 = new Leaf();
        addObject(leaf6,10,8);
        Leaf leaf7 = new Leaf();
        addObject(leaf7,10,10);
        Leaf leaf8 = new Leaf();
        addObject(leaf8,7,10);
        Leaf leaf9 = new Leaf();
        addObject(leaf9,4,10);
        Leaf leaf10 = new Leaf();
        addObject(leaf10,4,7);
        MyKara myKara = new MyKara();
        addObject(myKara,4,4);
    }
}
