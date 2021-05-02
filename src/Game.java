/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prsi_rocnikovyprojekt;

import java.util.Scanner;

/**
 *
 * @author jakub.sveda
 */
public class Game {

    /*
    * VARIABLES
     */
    CardOperations cards = new CardOperations();
    Scanner scan = new Scanner(System.in);
    
    private int itsYourTurn;
    private boolean hideHiddenCardDialog;
    private boolean clearConsole = false;
    private String scanInput;
    private int player1ListSize;
    private int player2ListSize;
    private int player3ListSize;
    
    Player player1 = new Player("");
    Player player2 = new Player("");
    Player player3 = new Player("");

    // TEXT COLORS
    private final String RESET_TEXT_COLOR = "\u001B[0m";
    private final String RED_TEXT = "\u001B[31m";
    private final String GREEN_TEXT = "\u001B[32m";
    private final String YELLOW_TEXT = "\u001B[33m";
    private final String BLUE_TEXT = "\u001B[34m";
    private final String PURPLE_TEXT = "\u001B[35m";

    // BACKGROUND COLORS
    private static final String BLUE_BACKGROUND = "\u001B[44m";

    /*
    * CONSTRUCTOR
     */
    public Game() {
    }

    /*
    * LAUNCH METHODS
     */
    public void launch() {
        startDialog();
        while (mainMenu()) {
        }
    }
    
    private void startDialog() {
        System.out.println("********************************************************************************************************");
        System.out.println("* " + PURPLE_TEXT + "------------------------------------- VÍTEJTE V APLIKACI PRŠÍ --------------------------------------" + RESET_TEXT_COLOR + " *");
        System.out.println("********************************************************************************************************");
        System.out.println("* ---------------------------------------------------------------------------------------------------- *");
        System.out.println("* " + GREEN_TEXT + "PRAVIDLA PRŠÍ - " + RESET_TEXT_COLOR + BLUE_BACKGROUND + "https://karetnihry.blogspot.com/2010/05/prsi-pravidla.html" + RESET_TEXT_COLOR + " nebo " + YELLOW_TEXT + "dokumentace programu" + RESET_TEXT_COLOR + " *");
        System.out.println("* ---------------------------------------------------------------------------------------------------- *");
        System.out.println("********************************************************************************************************");
    }

    /*
    * MAIN MENU
     */
    private boolean mainMenu() {
        player1.setName("");
        player2.setName("");
        player3.setName("");
        itsYourTurn = 1;
        scanInput = "";
        hideHiddenCardDialog = false;
        
        cards.resetPlayerCardList1();
        cards.resetPlayerCardList2();
        cards.resetPlayerCardList3();
        cards.resetOutCardList();
        cards.resetTakeCardList();
        
        cards.resetAceOnTheTable();
        cards.resetChangedColor();
        cards.resetSevenCombo();
        
        System.out.println("\n***************************************");
        System.out.println("* " + PURPLE_TEXT + "----------- HLAVNÍ MENU -----------" + RESET_TEXT_COLOR + " *");
        System.out.println("***************************************");
        System.out.println("* ----------------------------------- *");
        System.out.println("* " + GREEN_TEXT + "HRÁČ VS POČÍTAČ:" + RESET_TEXT_COLOR + "             " + YELLOW_TEXT + "1" + RESET_TEXT_COLOR + "      *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* " + GREEN_TEXT + "HRÁČ VS HRÁČ:" + RESET_TEXT_COLOR + "                " + YELLOW_TEXT + "2" + RESET_TEXT_COLOR + "      *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* " + GREEN_TEXT + "HRÁČ VS POČÍTAČ VS POČÍTAČ:" + RESET_TEXT_COLOR + "  " + YELLOW_TEXT + "3" + RESET_TEXT_COLOR + "      *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* " + GREEN_TEXT + "HRÁČ VS HRÁČ    VS POČÍTAČ:" + RESET_TEXT_COLOR + "  " + YELLOW_TEXT + "4" + RESET_TEXT_COLOR + "      *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* " + GREEN_TEXT + "HRÁČ VS HRÁČ    VS HRÁČ:" + RESET_TEXT_COLOR + "     " + YELLOW_TEXT + "5" + RESET_TEXT_COLOR + "      *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* " + GREEN_TEXT + "KNIHOVNA KARET:" + RESET_TEXT_COLOR + "              " + YELLOW_TEXT + "KK" + RESET_TEXT_COLOR + "     *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* " + GREEN_TEXT + "NASTAVENÍ:" + RESET_TEXT_COLOR + "                   " + YELLOW_TEXT + "NA" + RESET_TEXT_COLOR + "     *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* " + GREEN_TEXT + "PRO UKONČENÍ ZADEJTE:" + RESET_TEXT_COLOR + "        " + YELLOW_TEXT + "ODEJÍT" + RESET_TEXT_COLOR + " *");
        System.out.println("* ----------------------------------- *");
        System.out.println("***************************************\n");
        System.out.print("VAŠE VOLBA: ");
        return mainMenuResult();
    }
    
    private boolean mainMenuResult() {
        scanInput = "";
        
        switch (getUserInput()) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                modeLauncher();
                return true;
            
            case "KK":
                toClearConsole();
                System.out.println("");
                cards.createCardLibrary(true);
                return true;
            
            case "NA":
                toClearConsole();
                optionMenu();
                return true;
            
            case "ODEJIT":
            case "ODEJÍT":
                toClearConsole();
                System.out.println("\n***************************");
                System.out.println("* " + PURPLE_TEXT + "Program bude ukončen..." + RESET_TEXT_COLOR + " *");
                System.out.println("***************************");
                return false;
            
            default:
                toClearConsole();
                
                createMistakeOutput();
                return true;
        }
    }
    
    private void modeLauncher() {
        toClearConsole();
        cards.setMode(Integer.parseInt(scanInput));
        cards.toDealCards();
        chooseName();
        gameIntro();
    }

    /*
    * OPTION MENU
     */
    private void optionMenu() {
        System.out.println("\n**********************************************************");
        System.out.println("* " + PURPLE_TEXT + "--------------------- NASTAVENÍ ----------------------" + RESET_TEXT_COLOR + " *");
        System.out.println("**********************************************************");
        System.out.println("* ------------------------------------------------------ *");
        System.out.println("* " + GREEN_TEXT + "ČERVENÁ VRACÍ DO HRY (MOMENTÁLNĚ " + RESET_TEXT_COLOR + getSettings(1) + GREEN_TEXT + "):" + RESET_TEXT_COLOR + ((getSettings(1).equals("ZAPNUTO") || getSettings(1).equals("VYPNUTO")) ? "" : "  ") + YELLOW_TEXT + "  ANO / NE" + RESET_TEXT_COLOR + " *");
        System.out.println("* ------------------------------------------------------ *");
        System.out.println("* " + GREEN_TEXT + "ZPĚT:" + RESET_TEXT_COLOR + "                                       " + YELLOW_TEXT + "ZPET" + RESET_TEXT_COLOR + "       *");
        System.out.println("* ------------------------------------------------------ *");
        System.out.println("**********************************************************\n");
        System.out.print("VAŠE VOLBA: ");
        optionMenuResult();
    }
    
    private void optionMenuResult() {
        scanInput = "";
        
        switch (getUserInput()) {
            case "ANO":
                cards.setRedSevenBack(true);
                
                toClearConsole();
                
                System.out.println("*********************************************");
                System.out.println("* " + PURPLE_TEXT + "Červená karta bude vracet hráče do hry..." + RESET_TEXT_COLOR + " *");
                System.out.println("*********************************************\n");
                optionMenu();
                break;
            
            case "NE":
                cards.setRedSevenBack(false);
                
                toClearConsole();
                
                System.out.println("***********************************************");
                System.out.println("* " + PURPLE_TEXT + "Červená karta nebude vracet hráče do hry..." + RESET_TEXT_COLOR + " *");
                System.out.println("***********************************************\n");
                optionMenu();
                break;
            
            case "ZPĚT":
            case "ZPET":
                toClearConsole();
                break;
            
            default:
                toClearConsole();
                
                createMistakeOutput();
                optionMenu();
                break;
        }
    }
    
    private String getSettings(int function) {
        switch (function) {
            case 1:
                if (cards.isRedSevenBack()) {
                    return RESET_TEXT_COLOR + YELLOW_TEXT + "ZAPNUTO" + RESET_TEXT_COLOR;
                } else {
                    return RESET_TEXT_COLOR + YELLOW_TEXT + "VYPNUTO" + RESET_TEXT_COLOR;
                }
            
            default:
                return RESET_TEXT_COLOR + RED_TEXT + "CHYBA" + RESET_TEXT_COLOR;
        }
    }

    /*
    * GAME STARTING
     */
    private void chooseName() {
        switch (cards.getMode()) {
            case 1:
            case 3:
                System.out.println("\n***************************");
                System.out.println("* " + PURPLE_TEXT + "----- JMÉNO HRÁČE -----" + RESET_TEXT_COLOR + " *");
                System.out.println("***************************\n");
                System.out.print("JMÉNO: ");
                player1.setName(getName());
                player2.setName("FRANTA VOMÁČKA (POČÍTAČ)");
                player3.setName("JAKUB NEPORAZITELNÝ (POČÍTAČ)");
                break;
            
            case 2:
            case 4:
                System.out.println("\n***************************");
                System.out.println("* " + PURPLE_TEXT + "----- JMÉNA HRÁČŮ -----" + RESET_TEXT_COLOR + " *");
                System.out.println("***************************\n");
                System.out.print("JMÉNO PRVNÍHO HRÁČE: ");
                player1.setName(getName());
                System.out.print("\nJMÉNO DRUHÉHO HRÁČE: ");
                player2.setName(getName());
                player3.setName("FRANTA VOMÁČKA (POČÍTAČ)");
                break;
            
            case 5:
                System.out.println("\n***************************");
                System.out.println("* " + PURPLE_TEXT + "----- JMÉNA HRÁČŮ -----" + RESET_TEXT_COLOR + " *");
                System.out.println("***************************\n");
                System.out.print("JMÉNO PRVNÍHO HRÁČE: ");
                player1.setName(getName());
                System.out.print("\nJMÉNO DRUHÉHO HRÁČE: ");
                player2.setName(getName());
                System.out.print("\nJMÉNO TŘETÍHO HRÁČE: ");
                player3.setName(getName());
                break;
            
            default:
                throw new AssertionError("Wrong mode number - Game.chooseName() - default");
        }
    }
    
    private String getName() {
        scanInput = "";
        String name = getUserInput();
        
        if (name.length() > 20) {
            System.out.println("*********************************************");
            System.out.println("* ----------------------------------------- *");
            System.out.println("* " + RED_TEXT + "Vaše jméno může mít maximálně 20 znaků..." + RESET_TEXT_COLOR + " *");
            System.out.println("* ----------------------------------------- *");
            System.out.println("*********************************************");
            System.out.print("JMÉNO: ");
            return getName();
        } else if (name.contains("  ") || name.endsWith(" ") || name.startsWith(" ")) {
            System.out.println("*************************************************************************");
            System.out.println("* --------------------------------------------------------------------- *");
            System.out.println("* " + RED_TEXT + "Zřejmě jste zadal/a ve svém jméně nechtěné mezery, zkuste to znovu..." + RESET_TEXT_COLOR + " *");
            System.out.println("* --------------------------------------------------------------------- *");
            System.out.println("*************************************************************************");
            System.out.print("JMÉNO: ");
            return getName();
        } else if (name.equals(player1.getName()) || name.equals(player2.getName()) || name.equals(player3.getName())) {
            System.out.println("*******************************************************************");
            System.out.println("* --------------------------------------------------------------- *");
            System.out.println("* " + RED_TEXT + "Zvolil/a jste si jméno podobné někomu před Vámi, zkuste jiné..." + RESET_TEXT_COLOR + " *");
            System.out.println("* --------------------------------------------------------------- *");
            System.out.println("*******************************************************************");
            System.out.print("JMÉNO: ");
            return getName();
        } else {
            return name;
        }
    }
    
    private void gameIntro() {
        toClearConsole();
        
        System.out.println("\n**************");
        System.out.println("* " + PURPLE_TEXT + "HRA ZAČÍNÁ" + RESET_TEXT_COLOR + " *");
        
        switch (cards.getMode()) {
            case 1:
            case 2:
                System.out.println("**************************************************************************************");
                System.out.println("* ---------------------------------------------------------------------------------- *");
                System.out.println("* " + GREEN_TEXT + "HRAJE SE V POŘADÍ – " + RESET_TEXT_COLOR + YELLOW_TEXT + player1.getName() + " >> " + player2.getName() + RESET_TEXT_COLOR + createCharacterString(" ", (29 - player1.getName().length())) + createCharacterString(" ", (29 - player2.getName().length())) + RESET_TEXT_COLOR + " *");
                System.out.println("* ---------------------------------------------------------------------------------- *");
                System.out.println("**************************************************************************************");
                break;
            
            case 3:
            case 4:
            case 5:
                System.out.println("***********************************************************************************************************************");
                System.out.println("* ------------------------------------------------------------------------------------------------------------------- *");
                System.out.println("* " + GREEN_TEXT + "HRAJE SE V POŘADÍ – " + RESET_TEXT_COLOR + YELLOW_TEXT + player1.getName() + " >> " + player2.getName() + " >> " + player3.getName() + RESET_TEXT_COLOR + createCharacterString(" ", (29 - player1.getName().length())) + createCharacterString(" ", (29 - player2.getName().length())) + createCharacterString(" ", (29 - player3.getName().length())) + RESET_TEXT_COLOR + " *");
                System.out.println("* ------------------------------------------------------------------------------------------------------------------- *");
                System.out.println("***********************************************************************************************************************");
                break;
            
            default:
                throw new AssertionError("Wrong mode number - Game.gameIntro() - default");
        }
        
        gamePlay();
    }

    /*
    * GAME
     */
    private void gamePlay() {
        if (cards.doesAnybodyWin()) {
            winDialog();
        } else {
            if (!hideHiddenCardDialog) {
                if (clearConsole) {
                    toClearConsole();
                }
                hiddenCardDialog();
            }
            
            switch (itsYourTurn) {
                case 1:
                    cards.setActualGameVersion(10);
                    
                    System.out.println("\n********************************************************");
                    System.out.println("* ---------------------------------------------------- *");
                    System.out.println("* " + GREEN_TEXT + "HRAJE:" + RESET_TEXT_COLOR + YELLOW_TEXT + "                 " + player1.getName() + createCharacterString(" ", 29 - player1.getName().length()) + RESET_TEXT_COLOR + " *");
                    System.out.println("* ---------------------------------------------------- *");
                    
                    switch (cards.getMode()) {
                        case 1:
                        case 2:
                            hideHiddenCardDialog = cards.getMode() == 1;
                            player2ListSize = cards.getPlayerCardList2().size();
                            
                            System.out.println("* " + GREEN_TEXT + "PŘÍŠTÍ NA ŘADĚ:" + RESET_TEXT_COLOR + YELLOW_TEXT + "        " + player2.getName() + createCharacterString(" ", 29 - player2.getName().length()) + RESET_TEXT_COLOR + " *");
                            System.out.println("*                        " + GREEN_TEXT + "'-> hráči " + ((player2ListSize >= 10) ? "zbývá: " : (player2ListSize >= 5) ? "zbývá:  " : (player2ListSize >= 2) ? "zbývají:" : "zbývá:  ") + RESET_TEXT_COLOR + YELLOW_TEXT + "    " + player2ListSize + " " + ((player2ListSize >= 5) ? "karet" : (player2ListSize >= 2) ? "karty" : (player2ListSize == 1) ? "karta" : "karet") + RESET_TEXT_COLOR + " *");
                            System.out.println("* ---------------------------------------------------- *");
                            System.out.println("********************************************************\n");
                            itsYourTurn++;
                            cards.cardLayout();
                            InGameInputResult();
                            break;
                        
                        case 3:
                        case 4:
                        case 5:
                            hideHiddenCardDialog = cards.getMode() == 3;
                            player2ListSize = cards.getPlayerCardList2().size();
                            player3ListSize = cards.getPlayerCardList3().size();
                            
                            System.out.println("* " + GREEN_TEXT + "PŘÍŠTÍ NA ŘADĚ:" + RESET_TEXT_COLOR + YELLOW_TEXT + "        " + player2.getName() + createCharacterString(" ", 29 - player2.getName().length()) + RESET_TEXT_COLOR + " *");
                            System.out.println("*                        " + GREEN_TEXT + "'-> hráči " + ((player2ListSize >= 10) ? "zbývá: " : (player2ListSize >= 5) ? "zbývá:  " : (player2ListSize >= 2) ? "zbývají:" : "zbývá:  ") + RESET_TEXT_COLOR + YELLOW_TEXT + "    " + player2ListSize + " " + ((player2ListSize >= 5) ? "karet" : (player2ListSize >= 2) ? "karty" : (player2ListSize == 1) ? "karta" : "karet") + RESET_TEXT_COLOR + " *");
                            System.out.println("*                        " + YELLOW_TEXT + "" + player3.getName() + createCharacterString(" ", 29 - player3.getName().length()) + "" + RESET_TEXT_COLOR + " *");
                            System.out.println("*                        " + GREEN_TEXT + "'-> hráči " + ((player3ListSize >= 10) ? "zbývá: " : (player3ListSize >= 5) ? "zbývá:  " : (player3ListSize >= 2) ? "zbývají:" : "zbývá:  ") + RESET_TEXT_COLOR + YELLOW_TEXT + "    " + player3ListSize + " " + ((player3ListSize >= 5) ? "karet" : (player3ListSize >= 2) ? "karty" : (player3ListSize == 1) ? "karta" : "karet") + RESET_TEXT_COLOR + " *");
                            System.out.println("* ---------------------------------------------------- *");
                            System.out.println("********************************************************\n");
                            itsYourTurn++;
                            cards.cardLayout();
                            InGameInputResult();
                            break;
                        
                        default:
                            throw new AssertionError("Wrong mode number - Game.gamePlay() - sw(case1) - default");
                    }
                    
                    break;
                case 2:
                    switch (cards.getMode()) {
                        case 1:
                            toClearConsole();
                            
                            cards.setActualGameVersion(21);
                            itsYourTurn--;
                            hideHiddenCardDialog = true;
                            cards.computerGame();
                            gamePlay();
                            break;
                        
                        case 2:
                            hideHiddenCardDialog = false;
                            
                            System.out.println("\n********************************************************");
                            System.out.println("* ---------------------------------------------------- *");
                            System.out.println("* " + GREEN_TEXT + "HRAJE:" + RESET_TEXT_COLOR + YELLOW_TEXT + "                 " + player2.getName() + createCharacterString(" ", 29 - player2.getName().length()) + RESET_TEXT_COLOR + " *");
                            System.out.println("* ---------------------------------------------------- *");
                            
                            player1ListSize = cards.getPlayerCardList1().size();
                            cards.setActualGameVersion(21);
                            
                            System.out.println("* " + GREEN_TEXT + "PŘÍŠTÍ NA ŘADĚ:" + RESET_TEXT_COLOR + YELLOW_TEXT + "        " + player1.getName() + createCharacterString(" ", 29 - player1.getName().length()) + RESET_TEXT_COLOR + " *");
                            System.out.println("*                        " + GREEN_TEXT + "'-> hráči " + ((player1ListSize >= 10) ? "zbývá: " : (player1ListSize >= 5) ? "zbývá:  " : (player1ListSize >= 2) ? "zbývají:" : "zbývá:  ") + RESET_TEXT_COLOR + YELLOW_TEXT + "    " + player1ListSize + " " + ((player1ListSize >= 5) ? "karet" : (player1ListSize >= 2) ? "karty" : (player1ListSize == 1) ? "karta" : "karet") + RESET_TEXT_COLOR + " *");
                            System.out.println("* ---------------------------------------------------- *");
                            System.out.println("********************************************************\n");
                            itsYourTurn--;
                            cards.cardLayout();
                            InGameInputResult();
                            break;
                        
                        case 3:
                            toClearConsole();
                            
                            cards.setActualGameVersion(22);
                            itsYourTurn++;
                            hideHiddenCardDialog = true;
                            cards.computerGame();
                            gamePlay();
                            break;
                        
                        case 4:
                        case 5:
                            hideHiddenCardDialog = cards.getMode() == 4;
                            
                            System.out.println("\n********************************************************");
                            System.out.println("* ---------------------------------------------------- *");
                            System.out.println("* " + GREEN_TEXT + "HRAJE:" + RESET_TEXT_COLOR + YELLOW_TEXT + "                 " + player2.getName() + createCharacterString(" ", 29 - player2.getName().length()) + RESET_TEXT_COLOR + " *");
                            System.out.println("* ---------------------------------------------------- *");
                            
                            player1ListSize = cards.getPlayerCardList1().size();
                            player3ListSize = cards.getPlayerCardList3().size();
                            cards.setActualGameVersion(22);
                            
                            System.out.println("* " + GREEN_TEXT + "PŘÍŠTÍ NA ŘADĚ:" + RESET_TEXT_COLOR + YELLOW_TEXT + "        " + player3.getName() + createCharacterString(" ", 29 - player3.getName().length()) + RESET_TEXT_COLOR + " *");
                            System.out.println("*                        " + GREEN_TEXT + "'-> hráči " + ((player3ListSize >= 10) ? "zbývá: " : (player3ListSize >= 5) ? "zbývá:  " : (player3ListSize >= 2) ? "zbývají:" : "zbývá:  ") + RESET_TEXT_COLOR + YELLOW_TEXT + "    " + player3ListSize + " " + ((player3ListSize >= 5) ? "karet" : (player3ListSize >= 2) ? "karty" : (player3ListSize == 1) ? "karta" : "karet") + RESET_TEXT_COLOR + " *");
                            System.out.println("*                        " + YELLOW_TEXT + "" + player1.getName() + createCharacterString(" ", 29 - player1.getName().length()) + RESET_TEXT_COLOR + " *");
                            System.out.println("*                        " + GREEN_TEXT + "'-> hráči " + ((player1ListSize >= 10) ? "zbývá: " : (player1ListSize >= 5) ? "zbývá:  " : (player1ListSize >= 2) ? "zbývají:" : "zbývá:  ") + RESET_TEXT_COLOR + YELLOW_TEXT + "    " + player1ListSize + " " + ((player1ListSize >= 5) ? "karet" : (player1ListSize >= 2) ? "karty" : (player1ListSize == 1) ? "karta" : "karet") + RESET_TEXT_COLOR + " *");
                            System.out.println("* ---------------------------------------------------- *");
                            System.out.println("********************************************************\n");
                            itsYourTurn++;
                            cards.cardLayout();
                            InGameInputResult();
                            break;
                        
                        default:
                            throw new AssertionError("Wrong mode number - Game.gamePlay() - sw(case2) - default");
                    }
                    
                    break;
                
                case 3:
                    switch (cards.getMode()) {
                        case 3:
                        case 4:
                            toClearConsole();
                            
                            cards.setActualGameVersion(30);
                            itsYourTurn -= 2;
                            hideHiddenCardDialog = cards.getMode() == 3;
                            cards.computerGame();
                            gamePlay();
                            break;
                        case 5:
                            hideHiddenCardDialog = false;
                            player1ListSize = cards.getPlayerCardList1().size();
                            player2ListSize = cards.getPlayerCardList2().size();
                            cards.setActualGameVersion(30);
                            
                            System.out.println("\n********************************************************");
                            System.out.println("* ---------------------------------------------------- *");
                            System.out.println("* " + GREEN_TEXT + "HRAJE:" + RESET_TEXT_COLOR + YELLOW_TEXT + "                 " + player3.getName() + createCharacterString(" ", 29 - player3.getName().length()) + RESET_TEXT_COLOR + " *");
                            System.out.println("* ---------------------------------------------------- *");
                            System.out.println("* " + GREEN_TEXT + "PŘÍŠTÍ NA ŘADĚ:" + RESET_TEXT_COLOR + YELLOW_TEXT + "        " + player1.getName() + createCharacterString(" ", 29 - player1.getName().length()) + RESET_TEXT_COLOR + " *");
                            System.out.println("*                        " + GREEN_TEXT + "'-> hráči " + ((player1ListSize >= 10) ? "zbývá: " : (player1ListSize >= 5) ? "zbývá:  " : (player1ListSize >= 2) ? "zbývají:" : "zbývá: ") + RESET_TEXT_COLOR + YELLOW_TEXT + "    " + player1ListSize + " " + ((player1ListSize >= 5) ? "karet" : (player1ListSize >= 2) ? "karty" : (player1ListSize == 1) ? "karta" : "karet") + RESET_TEXT_COLOR + " *");
                            System.out.println("*                        " + YELLOW_TEXT + "" + player2.getName() + createCharacterString(" ", 29 - player2.getName().length()) + RESET_TEXT_COLOR + " *");
                            System.out.println("*                        " + GREEN_TEXT + "'-> hráči " + ((player2ListSize >= 10) ? "zbývá: " : (player2ListSize >= 5) ? "zbývá:  " : (player2ListSize >= 2) ? "zbývají:" : "zbývá: ") + RESET_TEXT_COLOR + YELLOW_TEXT + "    " + player2ListSize + " " + ((player2ListSize >= 5) ? "karet" : (player2ListSize >= 2) ? "karty" : (player2ListSize == 1) ? "karta" : "karet") + RESET_TEXT_COLOR + " *");
                            System.out.println("* ---------------------------------------------------- *");
                            System.out.println("********************************************************\n");
                            itsYourTurn -= 2;
                            cards.cardLayout();
                            InGameInputResult();
                            break;
                        
                        default:
                            throw new AssertionError("Wrong mode number - Game.gamePlay() - sw(case3) - default");
                    }
                    
                    break;
                
                default:
                    throw new AssertionError("Wrong number in itsYourTurn variable - Game.gamePlay() - default");
            }
        }
    }
    
    private void InGameInputResult() {
        System.out.println("\n**********************************");
        System.out.println("* ------------------------------ *");
        System.out.println("* " + GREEN_TEXT + "ODHODIT KARTU:" + RESET_TEXT_COLOR + YELLOW_TEXT + "        1-" + cards.getActualList().size() + RESET_TEXT_COLOR + (((cards.getActualList().size()) >= 10) ? "     *" : "      *"));
        System.out.println("* " + GREEN_TEXT + "LÍZNUTÍ KARTY:" + RESET_TEXT_COLOR + YELLOW_TEXT + "        LI" + RESET_TEXT_COLOR + "       *");
        
        if (cards.isAceOnTheTable()) {
            System.out.println("* " + GREEN_TEXT + "STOJÍM:" + RESET_TEXT_COLOR + YELLOW_TEXT + "               ST" + RESET_TEXT_COLOR + "       *");
        }
        
        System.out.println("* ------------------------------ *");
        System.out.println("* " + GREEN_TEXT + "ZOBRAZENÍ PŘÍKAZŮ:" + RESET_TEXT_COLOR + YELLOW_TEXT + "    NÁPOVĚDA" + RESET_TEXT_COLOR + " *");
        System.out.println("* ------------------------------ *");
        System.out.println("**********************************\n");
        System.out.print("VOLBA: ");
        
        scanInput = "";
        
        switch (getUserInput()) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "11":
            case "12":
            case "13":
            case "14":
            case "15":
            case "16":
            case "17":
            case "18":
            case "19":
            case "20":
            case "21":
            case "22":
            case "23":
            case "24":
            case "25":
            case "26":
            case "27":
            case "28":
            case "29":
            case "30":
            case "31":
            case "32":
                toClearConsole();
                
                if ((cards.getActualList().size() + 1) < Integer.parseInt(scanInput)) {
                    createMistakeOutput();
                    samePlayerAgain();
                    gamePlay();
                } else {
                    checkPermissions();
                }
                
                break;
            
            case "LI":
                toClearConsole();
                if (!cards.isAceOnTheTable()) {
                    if (cards.getSevenCombo() > 0) {
                        try {
                            cards.takeCard((cards.getSevenCombo() * 2));
                            cards.resetSevenCombo();
                            cards.resetAceOnTheTable();
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("***********************************************************");
                            System.out.println("* ------------------------------------------------------- *");
                            System.out.println("* " + RED_TEXT + "JIŽ NELZE LÍZAT ŽÁDNOU Z KARET, MUSÍ HRÁT DALŠÍ HRÁČ..." + RESET_TEXT_COLOR + " *");
                            System.out.println("* ------------------------------------------------------- *");
                            System.out.println("***********************************************************");
                            cards.resetSevenCombo();
                            gamePlay();
                        }
                    } else {
                        try {
                            cards.takeCard(1);
                            cards.resetSevenCombo();
                            cards.resetAceOnTheTable();
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("******************************************************************************");
                            System.out.println("* -------------------------------------------------------------------------- *");
                            System.out.println("* " + RED_TEXT + "MUSÍTE HRÁT NĚJAKOU KARTU, NEBOŤ V LÍZACÍM BALÍČKU JIŽ NENÍ ŽÁDNÁ KARTA..." + RESET_TEXT_COLOR + " *");
                            System.out.println("* -------------------------------------------------------------------------- *");
                            System.out.println("******************************************************************************");
                            samePlayerAgain();
                            gamePlay();
                        }
                    }
                    
                    gamePlay();
                } else {
                    System.out.println("**********************************");
                    System.out.println("* ------------------------------ *");
                    System.out.println("* " + RED_TEXT + "NELZE LÍZAT, JSTE V EFEKTU ESA" + RESET_TEXT_COLOR + " *");
                    System.out.println("* ------------------------------ *");
                    System.out.println("**********************************");
                    samePlayerAgain();
                    gamePlay();
                }
                
                break;
            
            case "ST":
                if (cards.isAceOnTheTable()) {
                    cards.resetAceOnTheTable();
                    gamePlay();
                } else {
                    toClearConsole();
                    
                    createMistakeOutput();
                    samePlayerAgain();
                    gamePlay();
                }
                break;
            
            case "NAPOVEDA":
            case "NÁPOVĚDA":
            case "NÁPOVEDA":
            case "NAPOVĚDA":
                toClearConsole();
                
                helpDialog();
                samePlayerAgain();
                gamePlay();
                break;
            
            case "HM":
                toClearConsole();
                
                System.out.println("\n************************************************");
                System.out.println("* -------------------------------------------- *");
                System.out.println("* " + PURPLE_TEXT + "BUDETE PŘESMĚROVÁNI ZPĚT DO HLAVNÍHO MENU..." + RESET_TEXT_COLOR + " *");
                System.out.println("* -------------------------------------------- *");
                System.out.println("************************************************\n");
                break;
            
            default:
                toClearConsole();
                
                createMistakeOutput();
                samePlayerAgain();
                gamePlay();
                break;
        }
    }
    
    private void hiddenCardDialog() {
        clearConsole = true;
        
        System.out.println("\n************************************************************");
        System.out.println("* -------------------------------------------------------- *");
        System.out.println("* " + GREEN_TEXT + "POKRAČUJE " + RESET_TEXT_COLOR + PURPLE_TEXT + getPlayerName() + RESET_TEXT_COLOR + GREEN_TEXT + " PO ZADÁNÍ:" + RESET_TEXT_COLOR + YELLOW_TEXT + createCharacterString(" ", (29 - getPlayerName().length())) + "    OK" + RESET_TEXT_COLOR + " *");
        System.out.println("* -------------------------------------------------------- *");
        System.out.println("************************************************************\n");
        System.out.print("VOLBA: ");
        
        switch (getUserInput()) {
            case "OK":
                toClearConsole();
                break;
            
            default:
                toClearConsole();
                
                createMistakeOutput();
                hiddenCardDialog();
                break;
        }
    }
    
    private void helpDialog() {
        toClearConsole();
        
        System.out.println("\n**************************************************************************************");
        System.out.println("* ---------------------------------------------------------------------------------- *");
        System.out.println("* " + PURPLE_TEXT + "VE HŘE VYBERTE ČÍSLO KARTY, KTEROU CHCETE HRÁT (NACHÁZÍ SE TĚSNĚ POD KARTOU)" + RESET_TEXT_COLOR + "       *");
        System.out.println("* ---------------------------------------------------------------------------------- *");
        System.out.println("* " + PURPLE_TEXT + "PRO LÍZNUTÍ KARTY VE HŘE ZADEJTE:" + RESET_TEXT_COLOR + "                                         " + YELLOW_TEXT + "LI" + RESET_TEXT_COLOR + "       *");
        System.out.println("* ---------------------------------------------------------------------------------- *");
        System.out.println("* " + PURPLE_TEXT + "POKUD JSTE V EFEKTU ESA, PAK MŮŽETE VE HŘE PRO STÁNÍ ZADAT:" + RESET_TEXT_COLOR + "               " + YELLOW_TEXT + "ST" + RESET_TEXT_COLOR + "       *");
        System.out.println("* ---------------------------------------------------------------------------------- *");
        System.out.println("* " + PURPLE_TEXT + "PRO NAVRÁCENÍ DO HLAVNÍHO MENU VE HŘE ZADEJTE:" + RESET_TEXT_COLOR + "                            " + YELLOW_TEXT + "HM" + RESET_TEXT_COLOR + "       *");
        System.out.println("* ---------------------------------------------------------------------------------- *");
        System.out.println("* " + PURPLE_TEXT + "PRO ZOBRAZENÍ NÁPOVĚDY VE HŘE ZADEJTE:" + RESET_TEXT_COLOR + "                                    " + YELLOW_TEXT + "NÁPOVĚDA" + RESET_TEXT_COLOR + " *");
        System.out.println("* ---------------------------------------------------------------------------------- *");
        System.out.println("**************************************************************************************");
        System.out.println("* ---------------------------------------------------------------------------------- *");
        System.out.println("* " + GREEN_TEXT + "POKRAČOVAT VE HŘE:" + RESET_TEXT_COLOR + "                                                        " + YELLOW_TEXT + "OK" + RESET_TEXT_COLOR + "       *");
        System.out.println("* ---------------------------------------------------------------------------------- *");
        System.out.println("**************************************************************************************\n");
        System.out.print("VOLBA: ");
        
        switch (getUserInput()) {
            case "OK":
                toClearConsole();
                break;
            
            default:
                toClearConsole();
                
                createMistakeOutput();
                helpDialog();
                break;
        }
    }
    
    private void checkPermissions() {
        switch (cards.playerGame(Integer.parseInt(scanInput))) {
            case 11:
                colorChooser();
            case 1:
                gamePlay();
                break;
            
            case -1:
                toClearConsole();
                
                cards.createReportMessage();
                samePlayerAgain();
                gamePlay();
                break;
            
            default:
                throw new AssertionError("CardOperations returned unsupported number - Game.checkPermissions - default");
        }
    }
    
    private void colorChooser() {
        toClearConsole();
        scanInput = "";
        
        System.out.println("");
        cards.createCardNextToCard(cards.getActualList());
        
        System.out.println("\n\n*********************************************");
        System.out.println("* " + PURPLE_TEXT + "- ZVOLTE BARVU, NA KTEROU CHCETE ZMĚNIT -" + RESET_TEXT_COLOR + " *");
        System.out.println("*********************************************");
        System.out.println("* ----------------------------------------- *");
        System.out.println("* LISTY(" + GREEN_TEXT + "ZELENÁ" + RESET_TEXT_COLOR + "):                         " + YELLOW_TEXT + "ZE" + RESET_TEXT_COLOR + " *");
        System.out.println("* ŽALUDY(" + YELLOW_TEXT + "ŽLUTÁ" + RESET_TEXT_COLOR + "):                         " + YELLOW_TEXT + "ZL" + RESET_TEXT_COLOR + " *");
        System.out.println("* KULE(" + BLUE_TEXT + "MODRÁ" + RESET_TEXT_COLOR + "):                           " + YELLOW_TEXT + "MO" + RESET_TEXT_COLOR + " *");
        System.out.println("* SRDCE(" + RED_TEXT + "ČERVENÁ" + RESET_TEXT_COLOR + "):                        " + YELLOW_TEXT + "CE" + RESET_TEXT_COLOR + " *");
        System.out.println("* ----------------------------------------- *");
        System.out.println("*********************************************\n");
        System.out.print("VOLBA: ");
        
        switch (getUserInput()) {
            case "ZE":
                cards.setChangedColor(1);
                cards.setColorChoosen(true);
                break;
            
            case "ZL":
                cards.setChangedColor(2);
                cards.setColorChoosen(true);
                break;
            
            case "MO":
                cards.setChangedColor(3);
                cards.setColorChoosen(true);
                break;
            
            case "CE":
                cards.setChangedColor(4);
                cards.setColorChoosen(true);
                break;
            
            default:
                toClearConsole();
                
                createMistakeOutput();
                colorChooser();
                break;
        }
    }
    
    private void samePlayerAgain() {
        switch (cards.getActualGameVersion()) {
            case 10:
                itsYourTurn--;
                break;
            
            case 21:
                itsYourTurn++;
                break;
            
            case 22:
                itsYourTurn--;
                break;
            
            case 30:
                itsYourTurn += 2;
                break;
            
            default:
                throw new AssertionError(RED_TEXT + "Unsupported game version - Game.samePlayerAgain() - default" + RESET_TEXT_COLOR);
        }
        
        hideHiddenCardDialog = true;
    }

    /*
    * WIN
     */
    private void winDialog() {
        toClearConsole();
        
        System.out.println("******************************************************");
        System.out.println("* " + GREEN_TEXT + "VÍTĚZEM SE STÁVÁ ... " + RESET_TEXT_COLOR + YELLOW_TEXT + ((cards.getWinner() == 1) ? (player1.getName() + createCharacterString(" ", (29 - player1.getName().length()))) : (cards.getWinner() == 2) ? (player2.getName() + createCharacterString(" ", (29 - player2.getName().length()))) : (player3.getName() + createCharacterString(" ", (29 - player3.getName().length())))) + RESET_TEXT_COLOR + " *");
        System.out.println("******************************************************");
        System.out.println("* " + PURPLE_TEXT + "----------------- VELKÁ GRATULACE ----------------" + RESET_TEXT_COLOR + " *");
        System.out.println("******************************************************\n");
    }

    /*
    * OTHER METHODS
     */
    private String createCharacterString(String character, int numberOfCharacters) {
        String output = "";
        
        for (int i = 0; i < numberOfCharacters; i++) {
            output += character;
        }
        
        return output;
    }
    
    private String getPlayerName() {
        switch (itsYourTurn) {
            case 1:
                return player1.getName();
            case 2:
                return player2.getName();
            case 3:
                return player3.getName();
            default:
                throw new AssertionError("Wrong number in itsYourTurn variable - Game.getPlayerName() - default");
        }
    }
    
    private void toClearConsole() {
        for (int i = 0; i < 100; i++) {            
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
        }
    }
    
    private void createMistakeOutput() {
        System.out.println("**************************************");
        System.out.println("* ---------------------------------- *");
        System.out.println("* " + RED_TEXT + "CHYBA V ZADÁNÍ, ZKUSTE TO ZNOVU..." + RESET_TEXT_COLOR + " *");
        System.out.println("* ---------------------------------- *");
        System.out.println("**************************************");
    }
    
    private String getUserInput() {
        scanInput = scan.nextLine().toUpperCase();
        return scanInput;
    }
}
