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
        addObject(tree,4,5);
        Tree tree2 = new Tree();
        addObject(tree2,5,5);
        Tree tree3 = new Tree();
        addObject(tree3,6,5);
        Tree tree4 = new Tree();
        addObject(tree4,7,5);
        Tree tree5 = new Tree();
        addObject(tree5,8,5);
        Tree tree6 = new Tree();
        addObject(tree6,9,5);
        Tree tree7 = new Tree();
        addObject(tree7,10,6);
        Tree tree8 = new Tree();
        addObject(tree8,9,6);
        Tree tree9 = new Tree();
        addObject(tree9,8,6);
        Tree tree10 = new Tree();
        addObject(tree10,7,6);
        Tree tree11 = new Tree();
        addObject(tree11,6,6);
        Tree tree12 = new Tree();
        addObject(tree12,7,7);
        Tree tree13 = new Tree();
        addObject(tree13,6,7);
        Tree tree14 = new Tree();
        addObject(tree14,5,7);
        Tree tree15 = new Tree();
        addObject(tree15,4,7);
        Tree tree16 = new Tree();
        addObject(tree16,3,7);
        Tree tree17 = new Tree();
        addObject(tree17,7,8);
        Tree tree18 = new Tree();
        addObject(tree18,6,8);
        Tree tree19 = new Tree();
        addObject(tree19,5,8);
        Tree tree20 = new Tree();
        addObject(tree20,4,8);
        Tree tree21 = new Tree();
        addObject(tree21,3,8);
        Tree tree22 = new Tree();
        addObject(tree22,9,8);
        Tree tree23 = new Tree();
        addObject(tree23,10,8);
        Tree tree24 = new Tree();
        addObject(tree24,10,9);
        Tree tree25 = new Tree();
        addObject(tree25,9,9);
        Tree tree26 = new Tree();
        addObject(tree26,8,9);
        Tree tree27 = new Tree();
        addObject(tree27,7,9);
        Tree tree28 = new Tree();
        addObject(tree28,6,9);
        Tree tree29 = new Tree();
        addObject(tree29,5,9);
        Tree tree30 = new Tree();
        addObject(tree30,4,9);
        Tree tree31 = new Tree();
        addObject(tree31,7,10);
        Tree tree32 = new Tree();
        addObject(tree32,8,10);
        Tree tree33 = new Tree();
        addObject(tree33,6,11);
        Leaf leaf = new Leaf();
        addObject(leaf,5,4);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,7,4);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,10,4);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,11,5);
        Leaf leaf5 = new Leaf();
        addObject(leaf5,11,6);
        Leaf leaf6 = new Leaf();
        addObject(leaf6,10,7);
        Leaf leaf7 = new Leaf();
        addObject(leaf7,8,7);
        Leaf leaf8 = new Leaf();
        addObject(leaf8,8,8);
        Leaf leaf9 = new Leaf();
        addObject(leaf9,11,8);
        Leaf leaf10 = new Leaf();
        addObject(leaf10,10,10);
        Leaf leaf11 = new Leaf();
        addObject(leaf11,8,11);
        Leaf leaf12 = new Leaf();
        addObject(leaf12,6,12);
        Leaf leaf13 = new Leaf();
        addObject(leaf13,3,9);
        Leaf leaf14 = new Leaf();
        addObject(leaf14,2,8);
        Leaf leaf15 = new Leaf();
        addObject(leaf15,4,6);
        MyKara myKara = new MyKara();
        addObject(myKara,4,4);
    }
}
