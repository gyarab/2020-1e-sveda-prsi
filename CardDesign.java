/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prsi_rocnikovyprojekt;

/**
 *
 * @author jakub.sveda
 */
public class CardDesign {
    // Text colors
    private final String RESET_TEXT_COLOR = "\u001B[0m";
    private final String BLACK_TEXT = "\u001B[30m";
    private final String WHITE_TEXT = "\u001B[37m";

    // Background colors
    private final String RED_BACKGROUND = "\u001B[41m";
    private final String GREEN_BACKGROUND = "\u001B[42m";
    private final String YELLOW_BACKGROUND = "\u001B[43m";
    private final String BLUE_BACKGROUND = "\u001B[44m";
    private final String PURPLE_BACKGROUND = "\u001B[45m";
    private final String WHITE_BACKGROUND = "\u001B[47m";
    
    // Other text design
    private final String setBoldText = "\033[0;1m";

    public CardDesign() {
    }
    
    //KARTY
    /*
    *** GREEN CARDS ********************************
     */
    private final String[] greenOne = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "                X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "               X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] greenKing = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] greenSeven = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X          " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "          X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "         X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] greenEight = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] greenNine = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X          " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "          X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] greenTen = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] greenAce = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] greenChanger = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "                X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "               X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    /*
    *** YELLOW CARDS ********************************
     */
    private final String[] yellowOne = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "                X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "               X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] yellowKing = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] yellowSeven = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X          " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "          X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "         X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] yellowEight = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] yellowNine = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X          " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "          X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] yellowTen = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] yellowAce = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] yellowChanger = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "," + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "                X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "               X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    /*
    *** BLUE CARDS **********************************
     */
    private final String[] blueOne = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "               X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "               X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] blueKing = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] blueSeven = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "         X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "         X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] blueEight = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] blueNine = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "         X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] blueTen = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] blueAce = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] blueChanger = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + " _ " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "               X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "(O)" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "               X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    /*
    *** RED CARDS *******************************
     */
    private final String[] redOne = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "               X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "                X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] redKing = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] redSeven = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "         X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X          " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "          X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] redEight = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] redNine = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "         X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] redTen = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] redAce = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "         " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "   X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + WHITE_TEXT + "           " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "    X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] redChanger = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X   " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "< >" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "               X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X    " + RESET_TEXT_COLOR + setBoldText + RED_BACKGROUND + WHITE_TEXT + "V" + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "                X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    /*
    *** SPECIÁLNÍ KARTY ******************************
     */
    private final String[] emptyCard = {" " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};
    
    private final String[] nonameCard = {" " + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X                     X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X                     X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X       " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "******" + RESET_TEXT_COLOR + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "        X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X      " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "**" + RESET_TEXT_COLOR + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "    " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "**" + RESET_TEXT_COLOR + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "       X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X      " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "**" + RESET_TEXT_COLOR + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "    " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "**" + RESET_TEXT_COLOR + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "       X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X            " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "**" + RESET_TEXT_COLOR + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "       X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X          " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "**" + RESET_TEXT_COLOR + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "         X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X          " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "**" + RESET_TEXT_COLOR + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "         X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X                     X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X                     X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X          " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "**" + RESET_TEXT_COLOR + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "         X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X          " + RESET_TEXT_COLOR + setBoldText + WHITE_BACKGROUND + BLACK_TEXT + "**" + RESET_TEXT_COLOR + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "         X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X                     X",
        setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "X                     X",
        RESET_TEXT_COLOR + " " + setBoldText + PURPLE_BACKGROUND + WHITE_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] fullGreen = {" " + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        RESET_TEXT_COLOR + " " + setBoldText + GREEN_BACKGROUND + WHITE_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};
    
    private final String[] fullYellow = {" " + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        RESET_TEXT_COLOR + " " + setBoldText + YELLOW_BACKGROUND + WHITE_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] fullBlue = {" " + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        RESET_TEXT_COLOR + " " + setBoldText + BLUE_BACKGROUND + WHITE_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    private final String[] fullRed = {" " + setBoldText + RED_BACKGROUND + WHITE_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " ",
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        setBoldText + RED_BACKGROUND + WHITE_TEXT + "X                     X" + RESET_TEXT_COLOR,
        RESET_TEXT_COLOR + " " + setBoldText + RED_BACKGROUND + WHITE_TEXT + "XXXXXXXXXXXXXXXXXXXXX" + RESET_TEXT_COLOR + " "};

    
    
    
    // GREEN GETTERS
    public String[] getGreenOne() {
        return greenOne;
    }

    public String[] getGreenKing() {
        return greenKing;
    }

    public String[] getGreenSeven() {
        return greenSeven;
    }

    public String[] getGreenEight() {
        return greenEight;
    }

    public String[] getGreenNine() {
        return greenNine;
    }

    public String[] getGreenTen() {
        return greenTen;
    }

    public String[] getGreenAce() {
        return greenAce;
    }

    public String[] getGreenChanger() {
        return greenChanger;
    }

    // YELLOW GETTERS
    public String[] getYellowOne() {
        return yellowOne;
    }

    public String[] getYellowKing() {
        return yellowKing;
    }
    
    public String[] getYellowSeven() {
        return yellowSeven;
    }

    public String[] getYellowEight() {
        return yellowEight;
    }

    public String[] getYellowNine() {
        return yellowNine;
    }

    public String[] getYellowTen() {
        return yellowTen;
    }

    public String[] getYellowAce() {
        return yellowAce;
    }
    
    public String[] getYellowChanger() {
        return yellowChanger;
    }

    // BLUE GETTERS
    public String[] getBlueOne() {
        return blueOne;
    }

    public String[] getBlueKing() {
        return blueKing;
    }

    public String[] getBlueSeven() {
        return blueSeven;
    }

    public String[] getBlueEight() {
        return blueEight;
    }

    public String[] getBlueNine() {
        return blueNine;
    }

    public String[] getBlueTen() {
        return blueTen;
    }

    public String[] getBlueAce() {
        return blueAce;
    }

    public String[] getBlueChanger() {
        return blueChanger;
    }
    
    // RED GETTERS
    public String[] getRedOne() {
        return redOne;
    }

    public String[] getRedKing() {
        return redKing;
    }

    public String[] getRedSeven() {
        return redSeven;
    }

    public String[] getRedEight() {
        return redEight;
    }

    public String[] getRedNine() {
        return redNine;
    }

    public String[] getRedTen() {
        return redTen;
    }

    public String[] getRedAce() {
        return redAce;
    }

    public String[] getRedChanger() {
        return redChanger;
    }
    
    // OTHER CARDS
    public String[] getEmptyCard() {
        return emptyCard;
    }
    public String[] getNonameCard() {
        return nonameCard;
    }

    public String[] getFullGreen() {
        return fullGreen;
    }

    public String[] getFullYellow() {
        return fullYellow;
    }

    public String[] getFullBlue() {
        return fullBlue;
    }

    public String[] getFullRed() {
        return fullRed;
    }
}
