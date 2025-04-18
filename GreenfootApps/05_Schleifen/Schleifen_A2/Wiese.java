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

        Tree tree = new Tree();
        addObject(tree,1,1);
        Tree tree2 = new Tree();
        addObject(tree2,2,1);
        Tree tree3 = new Tree();
        addObject(tree3,3,1);
        Tree tree4 = new Tree();
        addObject(tree4,4,1);
        Tree tree5 = new Tree();
        addObject(tree5,5,1);
        Tree tree6 = new Tree();
        addObject(tree6,6,1);
        Tree tree7 = new Tree();
        addObject(tree7,7,1);
        Tree tree8 = new Tree();
        addObject(tree8,8,1);
        Tree tree9 = new Tree();
        addObject(tree9,9,1);
        Tree tree10 = new Tree();
        addObject(tree10,10,1);
        Tree tree11 = new Tree();
        addObject(tree11,11,1);
        Tree tree12 = new Tree();
        addObject(tree12,12,1);
        Tree tree13 = new Tree();
        addObject(tree13,13,1);
        Tree tree14 = new Tree();
        addObject(tree14,13,2);
        Tree tree15 = new Tree();
        addObject(tree15,13,3);
        Tree tree16 = new Tree();
        addObject(tree16,13,4);
        Tree tree17 = new Tree();
        addObject(tree17,13,5);
        Tree tree18 = new Tree();
        addObject(tree18,13,6);
        Tree tree19 = new Tree();
        addObject(tree19,13,7);
        Tree tree20 = new Tree();
        addObject(tree20,13,8);
        Tree tree21 = new Tree();
        addObject(tree21,13,9);
        Tree tree22 = new Tree();
        addObject(tree22,13,10);
        Tree tree23 = new Tree();
        addObject(tree23,13,11);
        Tree tree24 = new Tree();
        addObject(tree24,13,12);
        Tree tree25 = new Tree();
        addObject(tree25,13,13);
        Tree tree26 = new Tree();
        addObject(tree26,12,13);
        Tree tree27 = new Tree();
        addObject(tree27,11,13);
        Tree tree28 = new Tree();
        addObject(tree28,10,13);
        Tree tree29 = new Tree();
        addObject(tree29,9,13);
        Tree tree30 = new Tree();
        addObject(tree30,8,13);
        Tree tree31 = new Tree();
        addObject(tree31,7,13);
        Tree tree32 = new Tree();
        addObject(tree32,6,13);
        Tree tree33 = new Tree();
        addObject(tree33,5,13);
        Tree tree34 = new Tree();
        addObject(tree34,4,13);
        Tree tree35 = new Tree();
        addObject(tree35,3,13);
        Tree tree36 = new Tree();
        addObject(tree36,2,13);
        Tree tree37 = new Tree();
        addObject(tree37,1,13);
        Tree tree38 = new Tree();
        addObject(tree38,1,12);
        Tree tree39 = new Tree();
        addObject(tree39,1,11);
        Tree tree40 = new Tree();
        addObject(tree40,1,10);
        Tree tree41 = new Tree();
        addObject(tree41,1,9);
        Tree tree42 = new Tree();
        addObject(tree42,1,8);
        Tree tree43 = new Tree();
        addObject(tree43,1,7);
        Tree tree44 = new Tree();
        addObject(tree44,1,6);
        Tree tree45 = new Tree();
        addObject(tree45,1,5);
        Tree tree46 = new Tree();
        addObject(tree46,1,4);
        Tree tree47 = new Tree();
        addObject(tree47,1,3);
        Tree tree48 = new Tree();
        addObject(tree48,2,3);
        Tree tree49 = new Tree();
        addObject(tree49,3,3);
        Tree tree50 = new Tree();
        addObject(tree50,4,3);
        Tree tree51 = new Tree();
        addObject(tree51,5,3);
        Tree tree52 = new Tree();
        addObject(tree52,6,3);
        Tree tree53 = new Tree();
        addObject(tree53,7,3);
        Tree tree54 = new Tree();
        addObject(tree54,9,3);
        Tree tree56 = new Tree();
        addObject(tree56,8,3);
        Tree tree57 = new Tree();
        addObject(tree57,10,3);
        Tree tree58 = new Tree();
        addObject(tree58,11,3);
        Tree tree59 = new Tree();
        addObject(tree59,11,4);
        Tree tree60 = new Tree();
        addObject(tree60,11,5);
        Tree tree61 = new Tree();
        addObject(tree61,11,6);
        Tree tree62 = new Tree();
        addObject(tree62,11,7);
        Tree tree63 = new Tree();
        addObject(tree63,11,8);
        Tree tree64 = new Tree();
        addObject(tree64,11,9);
        Tree tree65 = new Tree();
        addObject(tree65,11,10);
        Tree tree66 = new Tree();
        addObject(tree66,11,11);
        Tree tree67 = new Tree();
        addObject(tree67,10,11);
        Tree tree68 = new Tree();
        addObject(tree68,9,11);
        Tree tree69 = new Tree();
        addObject(tree69,8,11);
        Tree tree70 = new Tree();
        addObject(tree70,7,11);
        Tree tree71 = new Tree();
        addObject(tree71,6,11);
        Tree tree72 = new Tree();
        addObject(tree72,5,11);
        Tree tree73 = new Tree();
        addObject(tree73,4,11);
        Tree tree74 = new Tree();
        addObject(tree74,3,11);
        Tree tree75 = new Tree();
        addObject(tree75,3,10);
        Tree tree76 = new Tree();
        addObject(tree76,3,8);
        Tree tree77 = new Tree();
        addObject(tree77,3,9);
        Tree tree78 = new Tree();
        addObject(tree78,3,7);
        Tree tree79 = new Tree();
        addObject(tree79,3,6);
        Tree tree80 = new Tree();
        addObject(tree80,3,5);
        Tree tree81 = new Tree();
        addObject(tree81,4,5);
        Tree tree82 = new Tree();
        addObject(tree82,5,5);
        Tree tree83 = new Tree();
        addObject(tree83,6,5);
        Tree tree84 = new Tree();
        addObject(tree84,7,5);
        Tree tree85 = new Tree();
        addObject(tree85,8,5);
        Tree tree86 = new Tree();
        addObject(tree86,9,5);
        Tree tree87 = new Tree();
        addObject(tree87,9,6);
        Tree tree88 = new Tree();
        addObject(tree88,9,7);
        Tree tree89 = new Tree();
        addObject(tree89,9,8);
        Tree tree90 = new Tree();
        addObject(tree90,9,9);
        Tree tree91 = new Tree();
        addObject(tree91,8,9);
        Tree tree92 = new Tree();
        addObject(tree92,7,9);
        Tree tree93 = new Tree();
        addObject(tree93,6,9);
        Tree tree94 = new Tree();
        addObject(tree94,5,9);
        Tree tree95 = new Tree();
        addObject(tree95,5,8);
        Tree tree96 = new Tree();
        addObject(tree96,5,7);
        Tree tree97 = new Tree();
        addObject(tree97,6,7);
        Tree tree98 = new Tree();
        addObject(tree98,7,7);
        Leaf leaf = new Leaf();
        addObject(leaf,6,8);
        MyKara myKara = new MyKara();
        addObject(myKara,1,2);
    }
}
