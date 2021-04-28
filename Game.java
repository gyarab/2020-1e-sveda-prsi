/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prsi_rocnikovyprojekt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author jakub.sveda
 */
public class Game {

    CardOperations cards = new CardOperations();
    Scanner scan = new Scanner(System.in);

    private int itsYourTurn = 1;
    private boolean redSevenBack = true;
    private boolean exit = true;
    private String scanInput;
    private int player1ListSize;
    private int player2ListSize;
    private int player3ListSize;

    Player player1 = new Player("");
    Player player2 = new Player("");
    Player player3 = new Player("");

    // barvy textu
    private static final String RESET_TEXT_COLOR = "\u001B[0m";
    private static final String BLACK_TEXT = "\u001B[30m";
    private static final String RED_TEXT = "\u001B[31m";
    private static final String GREEN_TEXT = "\u001B[32m";
    private static final String YELLOW_TEXT = "\u001B[33m";
    private static final String BLUE_TEXT = "\u001B[34m";
    private static final String PURPLE_TEXT = "\u001B[35m";
    private static final String CYAN_TEXT = "\u001B[36m";
    private static final String WHITE_TEXT = "\u001B[37m";

    // barvy pozadí
    private static final String BLACK_BACKGROUND = "\u001B[40m";
    private static final String RED_BACKGROUND = "\u001B[41m";
    private static final String GREEN_BACKGROUND = "\u001B[42m";
    private static final String YELLOW_BACKGROUND = "\u001B[43m";
    private static final String BLUE_BACKGROUND = "\u001B[44m";
    private static final String PURPLE_BACKGROUND = "\u001B[45m";
    private static final String CYAN_BACKGROUND = "\u001B[46m";
    private static final String WHITE_BACKGROUND = "\u001B[47m";

    /*
    MÓD 1 -> hráč vs počítač
    MÓD 2 -> hráč vs hráč
    MÓD 3 -> hráč vs počítač vs počítač
    MÓD 4 -> hráč vs hráč    vs počítač
    MÓD 5 -> hráč vs hráč    vs hráč
     */
    public Game() {
    }

    public void launch() throws InterruptedException, AWTException {
        startText();
        mainMenu();
    }

    private void startText() {
        System.out.println("-----------------------");
        System.out.println("VÍTEJTE V APLIKACI PRŠÍ");
        System.out.println("-----------------------");
    }

    private void mainMenu() throws InterruptedException, AWTException {
        System.out.println("\n***************************************");
        System.out.println("* ----------- HLAVNÍ MENU ----------- *");
        System.out.println("***************************************");
        System.out.println("* ----------------------------------- *");
        System.out.println("* HRÁČ VS POČÍTAČ:             1      *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* HRÁČ VS HRÁČ:                2      *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* HRÁČ VS POČÍTAČ VS POČÍTAČ:  3      *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* HRÁČ VS HRÁČ    VS POČÍTAČ:  4      *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* HRÁČ VS HRÁČ    VS HRÁČ:     5      *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* KNIHOVNA KARET:              KK     *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* NASTAVENÍ:                   NA     *");
        System.out.println("* ----------------------------------- *");
        System.out.println("* PRO UKONČENÍ ZADEJTE:        ODEJÍT *");
        System.out.println("* ----------------------------------- *");
        System.out.println("***************************************\n");
        System.out.print("VAŠE VOLBA: ");
        mainMenuResult();
    }

    private void optionMenu() throws InterruptedException, AWTException {
        System.out.println("\n**********************************************************");
        System.out.println("* --------------------- NASTAVENÍ ---------------------- *");
        System.out.println("**********************************************************");
        System.out.println("* ------------------------------------------------------ *");
        System.out.println("* ČERVENÁ VRACÍ DO HRY (MOMENTÁLNĚ " + getSettings(1) + "):  ANO1 / NE1 *");
        System.out.println("* ------------------------------------------------------ *");
        System.out.println("* ZPĚT:                                       ZPET       *");
        System.out.println("* ------------------------------------------------------ *");
        System.out.println("**********************************************************\n");
        System.out.print("VAŠE VOLBA: ");
        optionMenuResult();
    }

    private void chooseName() throws InterruptedException, AWTException {
        switch (cards.getMode()) {
            case 1:
            case 3:
                System.out.println("\n-----------");
                System.out.println("JMÉNO HRÁČE");
                System.out.println("-----------\n");
                System.out.print("JMÉNO: ");
                player1.setName(getName());
                player2.setName("FRANTA VOMÁČKA (POČÍTAČ)");
                player3.setName("JAKUB NEPORAZITELNÝ (POČÍTAČ)");
                toClearConsole();
                Thread.sleep(500);
                break;

            case 2:
            case 4:
                System.out.println("\n-----------------------");
                System.out.println("     JMÉNA HRÁČŮ");
                System.out.println("-----------------------\n");
                System.out.print("JMÉNO PRVNÍHO HRÁČE: ");
                player1.setName(getName());
                System.out.print("\nJMÉNO DRUHÉHO HRÁČE: ");
                player2.setName(getName());
                player3.setName("FRANTA VOMÁČKA (POČÍTAČ)");
                toClearConsole();
                Thread.sleep(500);
                break;

            case 5:
                System.out.println("\n-----------------------");
                System.out.println("     JMÉNA HRÁČŮ");
                System.out.println("-----------------------\n");
                System.out.print("JMÉNO PRVNÍHO HRÁČE: ");
                player1.setName(getName());
                System.out.print("\nJMÉNO DRUHÉHO HRÁČE: ");
                player2.setName(getName());
                System.out.print("\nJMÉNO TŘETÍHO HRÁČE: ");
                player3.setName(getName());
                toClearConsole();
                Thread.sleep(500);
                break;

            default:
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println(RED_TEXT + "ŠPATNÝ POČET HRÁČŮ (ŠPATNÉ ČÍSLO) -> chooseName() - default");
                System.out.println(RESET_TEXT_COLOR + "---------------------------------------------------------------------------------------");
                break;
        }
    }

    private void gameIntro() throws InterruptedException, AWTException {
        System.out.println("\n----------");
        System.out.println("HRA ZAČÍNÁ");
        System.out.println("----------\n");

        switch (cards.getMode()) {
            case 1:
            case 2:
                System.out.println("HRAJE SE V POŘADÍ – " + player1.getName() + " >> " + player2.getName());
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("HRAJE SE V POŘADÍ – " + player1.getName() + " >> " + player2.getName() + " >> " + player3.getName());
                break;

            default:
                throw new AssertionError("wrong mode number");
        }

        System.out.println("\n-------------------------------------------------");
        System.out.println("HRAJE " + player1.getName() + " PO ZADÁNÍ:  START");
        System.out.println("-------------------------------------------------");
        System.out.print("VOLBA: ");
        readyResult();
    }

    private void gamePlay() throws AWTException, InterruptedException {
        switch (itsYourTurn) {
            case 1:
                cards.setActualGameVersion(10);

                System.out.println("\n********************************************************");
                System.out.println("* ---------------------------------------------------- *");
                System.out.println("* HRAJE:                 " + player1.getName() + createSpaces(29 - player1.getName().length()) + " *");
                System.out.println("* ---------------------------------------------------- *");

                switch (cards.getMode()) {
                    case 1:
                    case 2:
                        player2ListSize = cards.getPlayerCardList2().size();

                        System.out.println("* PŘÍŠTÍ NA ŘADĚ:        " + player2.getName() + createSpaces(29 - player2.getName().length()) + " *");
                        System.out.println("*                        '-> hráči " + ((player2ListSize >= 10) ? "zbývá: " : (player2ListSize >= 5) ? "zbývá:  " : (player2ListSize >= 2) ? "zbývají:" : "zbývá:  ") + "    " + player2ListSize + " " + ((player2ListSize >= 5) ? "karet" : (player2ListSize >= 2) ? "karty" : (player2ListSize == 1) ? "karta" : "karet") + " *");
                        System.out.println("* ---------------------------------------------------- *");
                        System.out.println("********************************************************\n");
                        itsYourTurn++;
                        cards.cardLayout();
                        InGameInputResult();
                        break;

                    case 3:
                    case 4:
                    case 5:
                        player2ListSize = cards.getPlayerCardList2().size();
                        player3ListSize = cards.getPlayerCardList3().size();

                        System.out.println("* PŘÍŠTÍ NA ŘADĚ:        " + player2.getName() + createSpaces(29 - player2.getName().length()) + " *");
                        System.out.println("*                        '-> hráči " + ((player2ListSize >= 10) ? "zbývá: " : (player2ListSize >= 5) ? "zbývá:  " : (player2ListSize >= 2) ? "zbývají:" : "zbývá:  ") + "    " + player2ListSize + " " + ((player2ListSize >= 5) ? "karet" : (player2ListSize >= 2) ? "karty" : (player2ListSize == 1) ? "karta" : "karet") + " *");
                        System.out.println("*                        " + player3.getName() + createSpaces(29 - player3.getName().length()) + " *");
                        System.out.println("*                        '-> hráči " + ((player3ListSize >= 10) ? "zbývá: " : (player3ListSize >= 5) ? "zbývá:  " : (player3ListSize >= 2) ? "zbývají:" : "zbývá:  ") + "    " + player3ListSize + " " + ((player3ListSize >= 5) ? "karet" : (player3ListSize >= 2) ? "karty" : (player3ListSize == 1) ? "karta" : "karet") + " *");
                        System.out.println("* --------------------------------------------------- *");
                        System.out.println("*******************************************************\n");
                        itsYourTurn++;
                        cards.cardLayout();
                        InGameInputResult();
                        break;

                    default:
                        throw new AssertionError("wrong mode - Game.gamePlay() - sw(case1) - default");
                }

                break;

            case 2:
                switch (cards.getMode()) {
                    case 1:
                        toClearConsole();
                        Thread.sleep(500);

                        cards.setActualGameVersion(21);
                        itsYourTurn--;
                        cards.computerGame();
                        gamePlay();
                        break;

                    case 3:
                        toClearConsole();
                        Thread.sleep(500);

                        cards.setActualGameVersion(22);
                        itsYourTurn++;
                        cards.computerGame();
                        gamePlay();
                        break;

                    case 2:
                        System.out.println("\n********************************************************");
                        System.out.println("* ---------------------------------------------------- *");
                        System.out.println("* HRAJE:                 " + player2.getName() + createSpaces(29 - player2.getName().length()) + " *");
                        System.out.println("* ---------------------------------------------------- *");

                        player1ListSize = cards.getPlayerCardList1().size();
                        cards.setActualGameVersion(21);

                        System.out.println("* PŘÍŠTÍ NA ŘADĚ:        " + player1.getName() + createSpaces(29 - player1.getName().length()) + " *");
                        System.out.println("*                        '-> hráči " + ((player1ListSize >= 10) ? "zbývá: " : (player1ListSize >= 5) ? "zbývá:  " : (player1ListSize >= 2) ? "zbývají:" : "zbývá:  ") + "    " + player1ListSize + " " + ((player1ListSize >= 5) ? "karet" : (player1ListSize >= 2) ? "karty" : (player1ListSize == 1) ? "karta" : "karet") + " *");
                        System.out.println("* ---------------------------------------------------- *");
                        System.out.println("********************************************************\n");
                        itsYourTurn--;
                        cards.cardLayout();
                        InGameInputResult();
                        break;

                    case 4:
                    case 5:
                        System.out.println("\n********************************************************");
                        System.out.println("* ---------------------------------------------------- *");
                        System.out.println("* HRAJE:                 " + player2.getName() + createSpaces(29 - player2.getName().length()) + " *");
                        System.out.println("* ---------------------------------------------------- *");

                        player1ListSize = cards.getPlayerCardList1().size();
                        player3ListSize = cards.getPlayerCardList3().size();
                        cards.setActualGameVersion(22);

                        System.out.println("* PŘÍŠTÍ NA ŘADĚ:        " + player3.getName() + createSpaces(29 - player3.getName().length()) + " *");
                        System.out.println("*                        '-> hráči " + ((player3ListSize >= 10) ? "zbývá: " : (player3ListSize >= 5) ? "zbývá:  " : (player3ListSize >= 2) ? "zbývají:" : "zbývá:  ") + "    " + player3ListSize + " " + ((player3ListSize >= 5) ? "karet" : (player3ListSize >= 2) ? "karty" : (player3ListSize == 1) ? "karta" : "karet") + " *");
                        System.out.println("*                        " + player1.getName() + createSpaces(29 - player1.getName().length()) + " *");
                        System.out.println("*                        '-> hráči " + ((player1ListSize >= 10) ? "zbývá: " : (player1ListSize >= 5) ? "zbývá:  " : (player1ListSize >= 2) ? "zbývají:" : "zbývá:  ") + "    " + player1ListSize + " " + ((player1ListSize >= 5) ? "karet" : (player1ListSize >= 2) ? "karty" : (player1ListSize == 1) ? "karta" : "karet") + " *");
                        System.out.println("* ---------------------------------------------------- *");
                        System.out.println("********************************************************\n");
                        itsYourTurn++;
                        cards.cardLayout();
                        InGameInputResult();
                        break;

                    default:
                        throw new AssertionError("wrong mode - Game.gamePlay() - sw(case2) - default");
                }

                break;

            case 3:
                switch (cards.getMode()) {
                    case 3:
                    case 4:
                        toClearConsole();
                        Thread.sleep(500);

                        cards.setActualGameVersion(30);
                        itsYourTurn -= 2;
                        cards.computerGame();
                        gamePlay();
                        break;
                    case 5:
                        player1ListSize = cards.getPlayerCardList1().size();
                        player2ListSize = cards.getPlayerCardList2().size();
                        cards.setActualGameVersion(30);

                        System.out.println("\n********************************************************");
                        System.out.println("* ---------------------------------------------------- *");
                        System.out.println("* HRAJE:                 " + player3.getName() + createSpaces(29 - player3.getName().length()) + " *");
                        System.out.println("* ---------------------------------------------------- *");
                        System.out.println("* PŘÍŠTÍ NA ŘADĚ:        " + player1.getName() + createSpaces(29 - player1.getName().length()) + " *");
                        System.out.println("*                        '-> hráči " + ((player1ListSize >= 10) ? "zbývá: " : (player1ListSize >= 5) ? "zbývá:  " : (player1ListSize >= 2) ? "zbývají:" : "zbývá:") + "    " + player1ListSize + " " + ((player1ListSize >= 5) ? "karet" : (player1ListSize >= 2) ? "karty" : (player1ListSize == 1) ? "karta" : "karet") + " *");
                        System.out.println("*                        " + player2.getName() + createSpaces(29 - player2.getName().length()) + " *");
                        System.out.println("*                        '-> hráči " + ((player2ListSize >= 10) ? "zbývá: " : (player2ListSize >= 5) ? "zbývá" : (player2ListSize >= 2) ? "zbývají" : "zbývá") + ":    " + player2ListSize + " " + ((player2ListSize >= 5) ? "karet" : (player2ListSize >= 2) ? "karty" : (player2ListSize == 1) ? "karta" : "karet") + " *");
                        System.out.println("* ---------------------------------------------------- *");
                        System.out.println("********************************************************\n");
                        itsYourTurn -= 2;
                        cards.cardLayout();
                        InGameInputResult();
                        break;

                    default:
                        throw new AssertionError("wrong mode - Game.gamePlay() - sw(case3) - default");
                }
                
                break;

            default:
                throw new AssertionError("wrong number in itsYourTurn variable");
        }
    }

    private void mainMenuResult() throws InterruptedException, AWTException {
        switch (getUserInput()) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                modeLauncher();
                break;

            case "KK":
                toClearConsole();
                Thread.sleep(500);
                System.out.println("");
                cards.createCardLibrary(true);
                mainMenu();
                break;

            case "NA":
                toClearConsole();
                Thread.sleep(500);
                optionMenu();
                break;

            case "ODEJIT":
            case "ODEJÍT":
                toClearConsole();
                Thread.sleep(500);
                System.out.println("\n-----------------------");
                System.out.println("Program bude ukončen...");
                System.out.println("-----------------------");
                System.exit(0);
                break;

            default:
                toClearConsole();
                Thread.sleep(500);

                createMistakeOutput();
                mainMenu();
                break;
        }
    }

    private void optionMenuResult() throws InterruptedException, AWTException {
        switch (getUserInput()) {
            case "ANO1":
                setRedSevenBack(true);

                toClearConsole();
                Thread.sleep(500);

                System.out.println("\n-----------------------------------------");
                System.out.println("Červená karta bude vracet hráče do hry...");
                System.out.println("-----------------------------------------\n");
                optionMenu();
                break;

            case "NE1":
                setRedSevenBack(false);

                toClearConsole();
                Thread.sleep(500);

                System.out.println("\n-------------------------------------------");
                System.out.println("Červená karta nebude vracet hráče do hry...");
                System.out.println("-------------------------------------------\n");
                optionMenu();
                break;

            case "ZPĚT":
            case "ZPET":
                toClearConsole();
                Thread.sleep(500);

                mainMenu();
                break;

            default:
                toClearConsole();
                Thread.sleep(500);

                createMistakeOutput();
                optionMenu();
                break;
        }
    }

    private String getName() throws InterruptedException {
        String name = getUserInput();

        if (name.length() > 20) {
            System.out.println("\n-----------------------------------------");
            System.out.println("Vaše jméno může mít maximálně 20 znaků...");
            System.out.println("-----------------------------------------\n");
            System.out.print("JMÉNO: ");
            return getName();
        } else if (name.contains("  ") || name.endsWith(" ") || name.startsWith(" ")) {
            System.out.println("\n---------------------------------------------------------------------");
            System.out.println("Zřejmě jste zadal/a ve svém jméně nechtěné mezery, zkuste to znovu...");
            System.out.println("---------------------------------------------------------------------\n");
            System.out.print("JMÉNO: ");
            return getName();
        } else if (name.equals(player1.getName()) || name.equals(player2.getName()) || name.equals(player3.getName())) {
            System.out.println("\n---------------------------------------------------------------");
            System.out.println("Zvolil/a jste si jméno podobné někomu před Vámi, zkuste jiné...");
            System.out.println("---------------------------------------------------------------\n");
            System.out.print("JMÉNO: ");
            return getName();
        } else {
            return name;
        }
    }

    private void InGameInputResult() throws AWTException, InterruptedException {
        System.out.println("\n**********************************");
        System.out.println("* ------------------------------ *");
        System.out.println("* ODHODIT KARTU:        1-" + cards.getActualList().size() + (((cards.getActualList().size()) >= 10) ? "     *" : "      *"));
        System.out.println("* LÍZNUTÍ KARTY:        LI       *");
        if (cards.isAceOnTheTable()) {
            System.out.println("* STOJÍM:               ST       *");
        }
        System.out.println("* ------------------------------ *");
        System.out.println("* ZOBRAZENÍ PŘÍKAZŮ:    NÁPOVĚDA *");
        System.out.println("* ------------------------------ *");
        System.out.println("**********************************\n");
        System.out.print("VOLBA: ");

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
                Thread.sleep(500);

                if ((cards.getActualList().size() + 1) < Integer.parseInt(scanInput)) {
                    createMistakeOutput();
                    samePlayerAgain();
                    gamePlay();
                } else {
                    checkPermissions(scanInput);
                }

                break;

            case "LI":
                toClearConsole();
                Thread.sleep(500);

                if (cards.getSevenCombo() > 0) {
                    try {
                        cards.takeCard((cards.getSevenCombo() * 2));
                    } catch (IndexOutOfBoundsException e) {
                        throw new IndexOutOfBoundsException("there is no more cards in takeCardList");
                    }

                    cards.resetSevenCombo();
                } else {
                    try {
                        cards.takeCard(1);
                    } catch (IndexOutOfBoundsException e) {
                        throw new IndexOutOfBoundsException("there is no more cards in takeCardList");
                    }
                }

                if (cards.doesAnybodyWin()) {
                    System.out.println("\n*** VYHRÁČ || " + ((cards.getWinner() == 1) ? player1.getName() : (cards.getWinner() == 2) ? player2.getName() : player3.getName()) + " ||");
                    System.out.println("*** VELKÁ GRATULACE!!!");
                } else {
                    hiddenCardDialog();
                    gamePlay();
                }

                break;

            case "ST":
                if (cards.isAceOnTheTable()) {
                    cards.resetAceOnTheTable();
                    if (cards.doesAnybodyWin()) {
                        System.out.println("\n*** VYHRÁč || " + ((cards.getWinner() == 1) ? player1.getName() : (cards.getWinner() == 2) ? player2.getName() : player3.getName()) + " ||");
                        System.out.println("*** VELKÁ GRATULACE!!!");
                    } else {
                        hiddenCardDialog();
                        gamePlay();
                    }

                } else {
                    toClearConsole();
                    Thread.sleep(500);

                    createMistakeOutput();
                    samePlayerAgain();
                    gamePlay();
                }
                break;

            case "NAP":
                toClearConsole();
                Thread.sleep(500);

                System.out.println(RED_TEXT + "Not avaible yet - NÁPOVĚDA\n\n" + RESET_TEXT_COLOR);
                samePlayerAgain();
                gamePlay();
                break;

            case "POMOC":
                toClearConsole();
                Thread.sleep(500);

                System.out.println(RED_TEXT + "Not avaible yet - POMOC\n\n" + RESET_TEXT_COLOR);
                samePlayerAgain();
                gamePlay();
                break;

            case "HM":
                toClearConsole();
                Thread.sleep(500);

                player1.setName("");
                player2.setName("");
                player3.setName("");
                itsYourTurn = 1;
                scanInput = "";

                mainMenu();
                break;

            case "VZD":
                toClearConsole();
                Thread.sleep(500);

                System.out.println(RED_TEXT + "Not avaible yet - VZDÁVÁM\n\n" + RESET_TEXT_COLOR);
                samePlayerAgain();
                gamePlay();
                break;

            case "ZPET":
            case "ZPĚT":
                toClearConsole();
                Thread.sleep(500);

                System.out.println(RED_TEXT + "Not avaible yet - ZPĚT\n\n" + RESET_TEXT_COLOR);
                samePlayerAgain();
                gamePlay();
                break;

            default:
                toClearConsole();
                Thread.sleep(500);

                createMistakeOutput();
                samePlayerAgain();
                gamePlay();
                break;
        }
    }

    private void readyResult() throws InterruptedException, AWTException {
        switch (getUserInput()) {
            case "START":
                toClearConsole();
                Thread.sleep(500);

                System.out.print("");
                gamePlay();
                break;

            default:
                toClearConsole();
                Thread.sleep(500);

                createMistakeOutput();
                gameIntro();
                break;
        }
    }

    private String getSettings(int function) {
        switch (function) {
            case 1:
                if (isRedSevenBack()) {
                    return RESET_TEXT_COLOR + YELLOW_TEXT + "ZAPNUTO" + RESET_TEXT_COLOR;
                } else {
                    return RESET_TEXT_COLOR + YELLOW_TEXT + "VYPNUTO" + RESET_TEXT_COLOR;
                }

            default:
                return RESET_TEXT_COLOR + RED_TEXT + "CHYBA" + RESET_TEXT_COLOR;
        }
    }

    private void modeLauncher() throws AWTException, InterruptedException {
        toClearConsole();
        Thread.sleep(500);
        cards.setMode(Integer.parseInt(scanInput));
        cards.toDealCards();
        chooseName();
        gameIntro();
    }

    private void hiddenCardDialog() throws AWTException, InterruptedException {
        toClearConsole();
        Thread.sleep(500);

        System.out.println("\n*****************************************");
        System.out.println("* ------------------------------------- *");
        System.out.println("* POKRAČUJE DALŠÍ HRÁČ PO ZADÁNÍ:    OK *");
        System.out.println("* ------------------------------------- *");
        System.out.println("*****************************************\n");
        System.out.print("VOLBA: ");

        switch (getUserInput()) {
            case "OK":
                toClearConsole();
                Thread.sleep(500);
                break;

            default:
                toClearConsole();
                Thread.sleep(500);

                createMistakeOutput();
                hiddenCardDialog();
                break;
        }
    }

    private void checkPermissions(String input) throws AWTException, InterruptedException {
        switch (cards.playerGame(Integer.parseInt(input))) {
            case 11:
                if (cards.doesAnybodyWin()) {
                    toClearConsole();
                    Thread.sleep(500);

                    System.out.println("\n*** VYHRÁČ || " + ((cards.getWinner() == 1) ? player1.getName() : (cards.getWinner() == 2) ? player2.getName() : player3.getName()) + " ||");
                    System.out.println("*** VELKÁ GRATULACE!!!");
                } else {
                    colorChooser();
                }

            case 1:
                // simple cards - everything is okk

                if (cards.doesAnybodyWin()) {
                    toClearConsole();
                    Thread.sleep(500);

                    System.out.println("\n*** VYHRÁČ || " + ((cards.getWinner() == 1) ? player1.getName() : (cards.getWinner() == 2) ? player2.getName() : player3.getName()) + " ||");
                    System.out.println("*** VELKÁ GRATULACE!!!");
                } else {
                    hiddenCardDialog();
                    gamePlay();
                }

                break;

            case -1:
                // input failed - not supported

                toClearConsole();
                Thread.sleep(500);

                // will be good to describe output fail (game variable -> switch)
                createMistakeOutput();

                samePlayerAgain();
                gamePlay();
                break;

            default:
                throw new AssertionError("Exception in method checkPermissions(input) - default");
        }
    }

    private void colorChooser() throws AWTException, InterruptedException {
        toClearConsole();
        Thread.sleep(500);

        System.out.println("");
        cards.createCardNextToCard(cards.getActualList());

        System.out.println("\n\n*********************************************");
        System.out.println("* - ZVOLTE BARVU, NA KTEROU CHCETE ZMĚNIT - *");
        System.out.println("*********************************************");
        System.out.println("* ----------------------------------------- *");
        System.out.println("* LISTY(" + GREEN_TEXT + "ZELENÁ" + RESET_TEXT_COLOR + "):                         ZE *");
        System.out.println("* ŽALUDY(" + YELLOW_TEXT + "ŽLUTÁ" + RESET_TEXT_COLOR + "):                         ZL *");
        System.out.println("* KULE(" + BLUE_TEXT + "MODRÁ" + RESET_TEXT_COLOR + "):                           MO *");
        System.out.println("* SRDCE(" + RED_TEXT + "ČERVENÁ" + RESET_TEXT_COLOR + "):                        CE *");
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
                Thread.sleep(500);

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
                throw new AssertionError(RED_TEXT + "Exception in checkPermissions(playerList, input, gamePlayVersion) - else - switch(gamePlayVersion)" + RESET_TEXT_COLOR);
        }
    }

    private String createSpaces(int numberOfSpaces) {
        String spaces = "";

        for (int i = 0; i < numberOfSpaces; i++) {
            spaces += " ";
        }

        return spaces;
    }

    private void toClearConsole() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
    }

    private void createMistakeOutput() {
        System.out.println("\n----------------------------------");
        System.out.println(RED_TEXT + "CHYBA V ZADÁNÍ, ZKUSTE TO ZNOVU...");
        System.out.println(RESET_TEXT_COLOR + "----------------------------------\n");
    }

    private String getUserInput() {
        scanInput = scan.nextLine().toUpperCase();
        return scanInput;
    }

    public void setRedSevenBack(boolean redSevenBack) {
        this.redSevenBack = redSevenBack;
    }

    public boolean isRedSevenBack() {
        return redSevenBack;
    }
}
