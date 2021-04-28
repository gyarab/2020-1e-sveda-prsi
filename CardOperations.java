/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prsi_rocnikovyprojekt;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jakub.sveda
 */
public class CardOperations {

    CardDesign cd = new CardDesign();

    // barvy textu
    private final String RESET_TEXT_COLOR = "\u001B[0m";
    private final String BLACK_TEXT = "\u001B[30m";
    private final String RED_TEXT = "\u001B[31m";
    private final String GREEN_TEXT = "\u001B[32m";
    private final String YELLOW_TEXT = "\u001B[33m";
    private final String BLUE_TEXT = "\u001B[34m";
    private final String PURPLE_TEXT = "\u001B[35m";
    private final String CYAN_TEXT = "\u001B[36m";
    private final String WHITE_TEXT = "\u001B[37m";

    // barvy pozadí
    private final String BLACK_BACKGROUND = "\u001B[40m";
    private final String RED_BACKGROUND = "\u001B[41m";
    private final String GREEN_BACKGROUND = "\u001B[42m";
    private final String YELLOW_BACKGROUND = "\u001B[43m";
    private final String BLUE_BACKGROUND = "\u001B[44m";
    private final String PURPLE_BACKGROUND = "\u001B[45m";
    private final String CYAN_BACKGROUND = "\u001B[46m";
    private final String WHITE_BACKGROUND = "\u001B[47m";

    // jine funkce console
    private final String setPlainText = "\033[0;0m";
    private final String setBoldText = "\033[0;1m";

    /*
    *** POLE POLÍ KARET *****************************
     */

 /*
    *** BALÍČKY KARET *******************************
     */

    private ArrayList<Integer> playerCardList1 = new ArrayList<>();
    private ArrayList<Integer> playerCardList2 = new ArrayList<>();
    private ArrayList<Integer> playerCardList3 = new ArrayList<>();

    private ArrayList<Integer> outCardList = new ArrayList<>();
    private ArrayList<Integer> takeCardList = new ArrayList<>();

    private int mode = 0;
    private int actualGameVersion = 0;
    private int sevenCombo = 0;
    private boolean aceOnTheTable = false;
    private boolean colorChoosen = false;
    private int changedColor = 0;
    private int winner = 0;

    /*
    *** HLAVNÍ KÓD **********************************
     */
    // KONSTRUKTOR
    public CardOperations() {
    }

    private void toStringCardInfo(int karta, boolean infoKarty, boolean nahledKarty) {
        switch (karta) {
            case 1:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getGreenOne()));
                }
                if (infoKarty) {
                    System.out.println("ZELENÝ SPODEK");
                }
                break;

            case 2:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getGreenChanger()));
                }
                if (infoKarty) {
                    System.out.println("ZELENÝ KRÁL");
                }
                break;

            case 3:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getGreenSeven()));
                }
                if (infoKarty) {
                    System.out.println("ZELENÁ SEDMIČKA");
                }
                break;

            case 4:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getGreenEight()));
                }
                if (infoKarty) {
                    System.out.println("ZELENÁ OSMIČKA");
                }
                break;

            case 5:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getGreenNine()));
                }
                if (infoKarty) {
                    System.out.println("ZELENÁ DEVÍTKA");
                }
                break;

            case 6:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getGreenTen()));
                }
                if (infoKarty) {
                    System.out.println("ZELENÁ DESÍTKA");
                }
                break;

            case 7:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getGreenAce()));
                }
                if (infoKarty) {
                    System.out.println("ZELENÉ ESO");
                }
                break;

            case 8:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getGreenChanger()));
                }
                if (infoKarty) {
                    System.out.println("ZELENÝ MĚNIČ");
                }
                break;

            case 9:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getYellowOne()));
                }
                if (infoKarty) {
                    System.out.println("ŽALUDOVÝ SPODEK");
                }
                break;

            case 10:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getYellowKing()));
                }
                if (infoKarty) {
                    System.out.println("ŽALUDOVÝ KRÁL");
                }
                break;

            case 11:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getYellowSeven()));
                }
                if (infoKarty) {
                    System.out.println("ŽALUDOVÁ SEDMA");
                }
                break;

            case 12:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getYellowEight()));
                }
                if (infoKarty) {
                    System.out.println("ŽALUDOVÁ OSMIČKA");
                }
                break;

            case 13:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getYellowNine()));
                }
                if (infoKarty) {
                    System.out.println("ŽALUDOVÁ DEVÍTKA");
                }
                break;

            case 14:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getYellowTen()));
                }
                if (infoKarty) {
                    System.out.println("ŽALUDOVÁ DESÍTKA");
                }
                break;

            case 15:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getYellowAce()));
                }
                if (infoKarty) {
                    System.out.println("ŽALUDOVÉ ESO");
                }
                break;

            case 16:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getYellowChanger()));
                }
                if (infoKarty) {
                    System.out.println("ŽALUDOVÝ MĚNIČ");
                }
                break;

            case 17:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getBlueOne()));
                }
                if (infoKarty) {
                    System.out.println("KULOVÝ SPODEK");
                }
                break;

            case 18:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getBlueKing()));
                }
                if (infoKarty) {
                    System.out.println("KULOVÝ KRÁL");
                }
                break;

            case 19:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getBlueSeven()));
                }
                if (infoKarty) {
                    System.out.println("KULOVÁ SEDMIČKA");
                }
                break;

            case 20:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getBlueEight()));
                }
                if (infoKarty) {
                    System.out.println("KULOVÁ OSMIČKA");
                }
                break;

            case 21:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getBlueNine()));
                }
                if (infoKarty) {
                    System.out.println("KULOVÁ DEVÍTKA");
                }
                break;

            case 22:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getBlueTen()));
                }
                if (infoKarty) {
                    System.out.println("KULOVÁ DESÍTKA");
                }
                break;

            case 23:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getBlueAce()));
                }
                if (infoKarty) {
                    System.out.println("KULOVÉ ESO");
                }
                break;

            case 24:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getBlueChanger()));
                }
                if (infoKarty) {
                    System.out.println("KULOVÝ MĚNIČ");
                }
                break;

            case 25:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getRedOne()));
                }
                if (infoKarty) {
                    System.out.println("SRDCOVÝ SPODEK");
                }
                break;

            case 26:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getRedKing()));
                }
                if (infoKarty) {
                    System.out.println("SRDCOVÝ KRÁL");
                }
                break;

            case 27:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getRedSeven()));
                }
                if (infoKarty) {
                    System.out.println("SRDCOVÁ SEDMIČKA");
                }
                break;

            case 28:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getRedEight()));
                }
                if (infoKarty) {
                    System.out.println("SRDCOVÁ OSMIČKA");
                }
                break;

            case 29:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getRedNine()));
                }
                if (infoKarty) {
                    System.out.println("SRDCOVÁ DEVÍTKA");
                }
                break;

            case 30:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getRedTen()));
                }
                if (infoKarty) {
                    System.out.println("SRDCOVÁ DESÍTKA");
                }
                break;

            case 31:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getRedAce()));
                }
                if (infoKarty) {
                    System.out.println("SRDCOVÉ ESO");
                }
                break;

            case 32:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getRedChanger()));
                }
                if (infoKarty) {
                    System.out.println("SRDCOVÝ MĚNIČ");
                }
                break;

            case 33:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getEmptyCard()));
                }
                if (infoKarty) {
                    System.out.println("PRAZDNA KARTA");
                }
                break;

            case 34:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getNonameCard()));
                }
                if (infoKarty) {
                    System.out.println("NONAME KARTA");
                }
                break;

            case 35:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getFullGreen()));
                }
                if (infoKarty) {
                    System.out.println("CELÁ ZELENÁ KARTA");
                }
                break;
            case 36:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getFullYellow()));
                }
                if (infoKarty) {
                    System.out.println("CELÁ ŽADLUDOVÁ KARTA");
                }
                break;

            case 37:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getFullBlue()));
                }
                if (infoKarty) {
                    System.out.println("CELÁ KULOVÁ KARTA");
                }
                break;

            case 38:
                if (nahledKarty) {
                    System.out.println(toStringSingleCard(cd.getFullRed()));
                }
                if (infoKarty) {
                    System.out.println("CELÁ ČERVENÁ KARTA");
                }
                break;

            default:
                System.out.println("------------------------------------------------------------------------");
                System.out.println(RED_TEXT + "ŠPATNÝ VÝBĚR KARTY (ŠPATNÉ ČÍSLO) -> SWITCH: vypisKartu(karta) - default");
                System.out.println(RESET_TEXT_COLOR + "------------------------------------------------------------------------");
        }
    }

    private String[] getCardField(int numberOfCard) {
        switch (numberOfCard) {
            case 1:
                return cd.getGreenOne();
            case 2:
                return cd.getGreenKing();
            case 3:
                return cd.getGreenSeven();
            case 4:
                return cd.getGreenEight();
            case 5:
                return cd.getGreenNine();
            case 6:
                return cd.getGreenTen();
            case 7:
                return cd.getGreenAce();
            case 8:
                return cd.getGreenChanger();
            case 9:
                return cd.getYellowOne();
            case 10:
                return cd.getYellowKing();
            case 11:
                return cd.getYellowSeven();
            case 12:
                return cd.getYellowEight();
            case 13:
                return cd.getYellowNine();
            case 14:
                return cd.getYellowTen();
            case 15:
                return cd.getYellowAce();
            case 16:
                return cd.getYellowChanger();
            case 17:
                return cd.getBlueOne();
            case 18:
                return cd.getBlueKing();
            case 19:
                return cd.getBlueSeven();
            case 20:
                return cd.getBlueEight();
            case 21:
                return cd.getBlueNine();
            case 22:
                return cd.getBlueTen();
            case 23:
                return cd.getBlueAce();
            case 24:
                return cd.getBlueChanger();
            case 25:
                return cd.getRedOne();
            case 26:
                return cd.getRedKing();
            case 27:
                return cd.getRedSeven();
            case 28:
                return cd.getRedEight();
            case 29:
                return cd.getRedNine();
            case 30:
                return cd.getRedTen();
            case 31:
                return cd.getRedAce();
            case 32:
                return cd.getRedChanger();
            case 33:
                return cd.getEmptyCard();
            case 34:
                return cd.getNonameCard();
            case 35:
                return cd.getFullGreen();
            case 36:
                return cd.getFullYellow();
            case 37:
                return cd.getFullBlue();
            case 38:
                return cd.getFullRed();

            default:
                throw new AssertionError("wrong card to get its field");
        }
    }

    public void createCardLibrary(boolean nahledKarty) {
        for (int i = 1; i <= 38; i++) {
            toStringCardInfo(i, true, nahledKarty);
            System.out.println("\n");
        }
    }

    public void createCardNextToCard(ArrayList<Integer> cardList) {
        for (int i = 0; i < 16; i++) {
            for (int j : cardList) {
                System.out.print(getCardField(j)[i] + RESET_TEXT_COLOR + "  ");
            }

            System.out.println("");
        }
    }

    private void createTableLayout() {
        System.out.println("");

        for (int i = 0; i < 16; i++) {
            System.out.print(getCardField((outCardList.get(outCardList.size() - 1)))[i] + RESET_TEXT_COLOR + "  " + ((changedColor == 0) ? "                       " : (changedColor == 1) ? cd.getFullGreen()[i] : (changedColor == 2) ? cd.getFullYellow()[i] : (changedColor == 3) ? cd.getFullBlue()[i] : cd.getFullRed()[i]) + "                           " + getCardField(34)[i] + "\n");
        }

        System.out.println("                                                                            =----=");
        System.out.println("                                                                            | LI |");
        System.out.println("                                                                            =----=");
    }

    private String toStringCardNumbers(int arrayListSize) {
        String topAndBottomString = "";
        String middleString = "";

        for (int i = 1; i <= arrayListSize; i++) {
            if (i >= 10) {
                topAndBottomString += " =----=                  ";
                middleString += " | " + i + " |                  ";
            } else {
                topAndBottomString += " =---=                   ";
                middleString += " | " + i + " |                   ";
            }
        }

        return topAndBottomString + "\n" + middleString + "\n" + topAndBottomString;
    }

    public void cardLayout() {
        createCardNextToCard(getActualList());
        System.out.println(toStringCardNumbers(getActualList().size()) + "\n");
        createTableLayout();
    }

    private String toStringSingleCard(String[] inputField) {
        String outputString = "";

        for (int i = 0; i < inputField.length; i++) {
            outputString += inputField[i] + "\n";
        }

        return outputString;
    }

    public int playerGame(int input) {
        int cardNumber = getActualList().get(input - 1);
        int tableCard = outCardList.get(outCardList.size() - 1);

        if (sevenCombo > 0) {
            if (cardNumber == 3 || cardNumber == 11 || cardNumber == 19 || cardNumber == 27) {
                sevenCombo++;
                getActualList().remove(input - 1);
                outCardList.add(cardNumber);
                takeCardList.add(outCardList.get(0));
                outCardList.remove(0);
                return 1;
            } else {
                return -1;
            }
        } else if (aceOnTheTable) {
            if (cardNumber == 7 || cardNumber == 15 || cardNumber == 23 || cardNumber == 31) {
                getActualList().remove(input - 1);
                outCardList.add(cardNumber);
                takeCardList.add(outCardList.get(0));
                outCardList.remove(0);
                return 1;
            } else {
                return -1;
            }
        } else if (cardNumber == 8 || cardNumber == 16 || cardNumber == 24 || cardNumber == 32) {
            getActualList().remove(input - 1);
            outCardList.add(cardNumber);
            takeCardList.add(outCardList.get(0));
            outCardList.remove(0);
            return 11;
        } else if (colorChoosen) {
            if (isSameColor(cardNumber)) {
                return noExceptionPlay(input, cardNumber, tableCard, true);
            } else {
                return -1;
            }
        } else {
            return noExceptionPlay(input, cardNumber, tableCard, false);
        }
    }

    private int noExceptionPlay(int input, int cardNumber, int tableCard, boolean differentColorChooser) {
        if (differentColorChooser || (((cardNumber - tableCard < 8 && cardNumber - tableCard > -8) || (tableCard - cardNumber > -8 && tableCard - cardNumber < 8)) || (cardNumber == tableCard + 8 || cardNumber == tableCard + 16 || cardNumber == tableCard + 24 || cardNumber == tableCard - 8 || cardNumber == tableCard - 16 || cardNumber == tableCard - 24))) {
            switch (cardNumber) {
                case 3:
                case 11:
                case 19:
                case 27:
                    sevenCombo++;
                    break;

                case 7:
                case 15:
                case 23:
                case 31:
                    aceOnTheTable = true;
                    break;
            }

            changedColor = 0;
            colorChoosen = false;
            getActualList().remove(input - 1);
            outCardList.add(cardNumber);
            takeCardList.add(outCardList.get(0));
            outCardList.remove(0);
            return 1;
        } else {
            return -1;
        }
    }

    public void computerGame() {
        ArrayList<Integer> canBeUsed = new ArrayList<>();
        int tableCard = outCardList.get(outCardList.size() - 1);

        getActualList().stream().filter((cardNumber) -> (checkIfCanPlayThisCard(cardNumber, tableCard))).forEachOrdered((cardNumber) -> {
            canBeUsed.add(cardNumber);
        });

        if (canBeUsed.size() == 1) {
            int canBeUsedByIndexOfZero = canBeUsed.get(0);
            
            switch (canBeUsedByIndexOfZero) {
                case 3:
                case 11:
                case 19:
                case 27:
                    // pokud hraje sedmičku, musí dát vědět!
                    sevenCombo++;
                    resetAceOnTheTable();
                    resetChangedColor();
                    break;
                case 7:
                case 15:
                case 23:
                case 31:
                    // pokud hraje eso, musí dát vědět! - snad vyřešeno
                    aceOnTheTable = true;
                    resetSevenCombo();
                    resetChangedColor();
                    break;

                case 8:
                case 16:
                case 24:
                case 32:
                    // pokud hraje měniče, musí změnit barvu!
                    colorChoosen = true;
                    setChangedColor(getTheMostUsedColor(false));
                    resetSevenCombo();
                    resetAceOnTheTable();
                    break;
            }

            playCard(canBeUsedByIndexOfZero);
        } else {
            if (aceOnTheTable) {
                if (canBeUsed.isEmpty()) {
                    resetAceOnTheTable();
                    // nothing just wait because of the ace on the table
                } else {
                    aceOnTheTable = true;
                    resetChangedColor();
                    resetSevenCombo();
                    playCard(canBeUsed.get(0));
                }
            } else if (sevenCombo > 0) {
                if (canBeUsed.isEmpty()) {
                    takeCard(sevenCombo * 2);
                    resetSevenCombo();
                } else {
                    sevenCombo++;
                    resetAceOnTheTable();
                    resetChangedColor();

                    if (canBeUsed.get(0) == 27) {
                        playCard(canBeUsed.get(1));
                    } else {
                        playCard(canBeUsed.get(0));
                    }
                }
            } else {
                if (canBeUsed.isEmpty()) {
                    takeCard(1);
                    resetAceOnTheTable();
                    resetSevenCombo();
                } else {
                    if (canBeUsed.contains(8) && doesAnybodyHaveOneCardLeft()) {
                        changeColor();
                        resetSevenCombo();
                        resetAceOnTheTable();
                        playCard(8);
                    } else if (canBeUsed.contains(16) && doesAnybodyHaveOneCardLeft()) {
                        changeColor();
                        resetSevenCombo();
                        resetAceOnTheTable();
                        playCard(16);
                    } else if (canBeUsed.contains(24) && doesAnybodyHaveOneCardLeft()) {
                        changeColor();
                        resetSevenCombo();
                        resetAceOnTheTable();
                        playCard(24);
                    } else if (canBeUsed.contains(32) && doesAnybodyHaveOneCardLeft()) {
                        changeColor();
                        resetSevenCombo();
                        resetAceOnTheTable();
                        playCard(32);
                    } else if (canBeUsed.contains(3) && doesAnybodyHaveOneCardLeft()) {
                        sevenCombo++;
                        resetAceOnTheTable();
                        resetChangedColor();
                        playCard(3);
                    } else if (canBeUsed.contains(11) && doesAnybodyHaveOneCardLeft()) {
                        sevenCombo++;
                        resetAceOnTheTable();
                        resetChangedColor();
                        playCard(11);
                    } else if (canBeUsed.contains(19) && doesAnybodyHaveOneCardLeft()) {
                        sevenCombo++;
                        resetAceOnTheTable();
                        resetChangedColor();
                        playCard(19);
                    } else if (canBeUsed.contains(27) && doesAnybodyHaveOneCardLeft()) {
                        sevenCombo++;
                        resetAceOnTheTable();
                        resetChangedColor();
                        playCard(27);
                    } else {
                        clasicComputerPlay(canBeUsed);
                    }
                }
            }
        }
    }

    private void clasicComputerPlay(ArrayList<Integer> canBeUsed) {
        int cardToPlay = canBeUsed.get(0);
        int mostUsedColor = getTheMostUsedColor(false);
        boolean stopLoop = false;

        for (int cardNumber : canBeUsed) {
            switch (mostUsedColor) {
                case 1:
                    if (cardNumber > 0 && cardNumber <= 8) {
                        stopLoop = true;
                        cardToPlay = cardNumber;
                    }
                    break;
                case 2:
                    if (cardNumber > 8 && cardNumber <= 16) {
                        stopLoop = true;
                        cardToPlay = cardNumber;
                    }
                    break;
                case 3:
                    if (cardNumber > 24 && cardNumber <= 24) {
                        stopLoop = true;
                        cardToPlay = cardNumber;
                    }
                    break;
                case 4:
                    if (cardNumber > 32 && cardNumber <= 32) {
                        stopLoop = true;
                        cardToPlay = cardNumber;
                    }
                    break;
            }
            
            if (stopLoop) {
                break;
            }
        }

        playCard(cardToPlay);
    }

    private void playCard(int cardToPlay) {
        switch (cardToPlay) {
            case 3:
                case 11:
                case 19:
                case 27:
                    // pokud hraje sedmičku, musí dát vědět!
                    sevenCombo++;
                    resetAceOnTheTable();
                    resetChangedColor();
                    break;
                case 7:
                case 15:
                case 23:
                case 31:
                    // pokud hraje eso, musí dát vědět! - snad vyřešeno
                    aceOnTheTable = true;
                    resetSevenCombo();
                    resetChangedColor();
                    break;

                case 8:
                case 16:
                case 24:
                case 32:
                    // pokud hraje měniče, musí změnit barvu!
                    colorChoosen = true;
                    setChangedColor(getTheMostUsedColor(false));
                    resetAceOnTheTable();
                    resetSevenCombo();
                    break;
        }
        getActualList().remove(getActualList().indexOf(cardToPlay));
        outCardList.add(cardToPlay);
        takeCardList.add(outCardList.get(0));
        outCardList.remove(0);
    }

    private void changeColor() {
        int mostUsedColor = getTheMostUsedColor(false);
        switch (changedColor) {
            case 1:
                if (mostUsedColor != 1) {
                    setChangedColor(mostUsedColor);
                } else {
                    setChangedColor(getTheMostUsedColor(true));
                }

                break;

            case 2:
                if (mostUsedColor != 2) {
                    setChangedColor(mostUsedColor);
                } else {
                    setChangedColor(getTheMostUsedColor(true));
                }

                break;

            case 3:
                if (mostUsedColor != 3) {
                    setChangedColor(mostUsedColor);
                } else {
                    setChangedColor(getTheMostUsedColor(true));
                }

                break;

            case 4:
                if (mostUsedColor != 4) {
                    setChangedColor(mostUsedColor);
                } else {
                    setChangedColor(getTheMostUsedColor(true));
                }

                break;
            default:
                throw new AssertionError("color is not set - CardOperations.changeClolor(secondMostUsed) - default");
        }
    }

    private int getTheMostUsedColor(boolean secondMostUsed) {
        int[] colorCounter = {0, 0, 0, 0};

        getActualList().forEach((currentCard) -> {
            if (currentCard > 0 && currentCard <= 8) {
                colorCounter[0]++;
            } else if (currentCard > 8 && currentCard <= 16) {
                colorCounter[1]++;
            } else if (currentCard > 16 && currentCard <= 24) {
                colorCounter[2]++;
            } else {
                colorCounter[3]++;
            }
        });

        int biggestNumberCounter;

        biggestNumberCounter = colorCounter[0];
        int mostUsedColor = 1;

        // source: https://www.sanfoundry.com/java-program-find-largest-number-array/
        for (int i = 0; i < colorCounter.length; i++) {
            if (biggestNumberCounter < colorCounter[i]) {
                biggestNumberCounter = colorCounter[i];
                mostUsedColor = i + 1;
            }
        }

        if (secondMostUsed) {
            int newBiggestNumberCounter = 0;
            int secondMostUsedNumber = 1;

            for (int i = 0; i < colorCounter.length; i++) {
                if (newBiggestNumberCounter < colorCounter[i] && biggestNumberCounter != colorCounter[i]) {
                    newBiggestNumberCounter = colorCounter[i];
                    secondMostUsedNumber = i + 1;
                }
            }

            return secondMostUsedNumber;
        }

        return mostUsedColor;
    }

    private boolean checkIfCanPlayThisCard(int cardNumber, int tableCard) {
        if (sevenCombo > 0) {
            return cardNumber == 3 || cardNumber == 11 || cardNumber == 19 || cardNumber == 27;
        } else if (aceOnTheTable) {
            return cardNumber == 7 || cardNumber == 15 || cardNumber == 23 || cardNumber == 31;
        } else if (cardNumber == 8 || cardNumber == 16 || cardNumber == 24 || cardNumber == 32) {
            return true;
        } else if (colorChoosen) {
            if (isSameColor(cardNumber)) {
                return ((true || (((cardNumber - tableCard < 8 && cardNumber - tableCard > -8) || (tableCard - cardNumber > -8 && tableCard - cardNumber < 8)))) || (cardNumber == tableCard + 8 || cardNumber == tableCard + 16 || cardNumber == tableCard + 24 || cardNumber == tableCard - 8 || cardNumber == tableCard - 16 || cardNumber == tableCard - 24));
            } else {
                return false;
            }
        } else {
            return ((false || (((cardNumber - tableCard < 8 && cardNumber - tableCard > -8) || ((tableCard - cardNumber > -8 && tableCard - cardNumber < 8)))) || (cardNumber == tableCard + 8 || cardNumber == tableCard + 16 || cardNumber == tableCard + 24 || cardNumber == tableCard - 8 || cardNumber == tableCard - 16 || cardNumber == tableCard - 24)));
        }
    }

    private boolean doesAnybodyHaveOneCardLeft() {
        switch (mode) {
            case 1:
            case 2:
                return getPlayerCardList1().size() == 1 || getPlayerCardList2().size() == 1;

            case 3:
            case 4:
                return getPlayerCardList1().size() == 1 || getPlayerCardList2().size() == 1 || getPlayerCardList3().size() == 1;

            default:
                throw new AssertionError("wrong mode - doesAnybodyHaveOneCardLeft() - default");
        }
    }

    public boolean doesAnybodyWin() {
        switch (mode) {
            case 1:
            case 2:
                if (getPlayerCardList1().isEmpty()) {
                    winner = 1;
                } else if (getPlayerCardList2().isEmpty()) {
                    winner = 2;
                } else {
                    return false;
                }
                break;

            case 3:
            case 4:
            case 5:
                if (getPlayerCardList1().isEmpty()) {
                    winner = 1;
                } else if (getPlayerCardList2().isEmpty()) {
                    winner = 2;
                } else if (getPlayerCardList3().isEmpty()) {
                    winner = 3;
                } else {
                    return false;
                }
                break;

            default:
                throw new AssertionError("wrong mode - CardOperations.doesAnybodyWin() - default");
        }

        return true;
    }

    public void takeCard(int numberOfCards) {
        for (int i = 0; i < numberOfCards; i++) {
            getActualList().add(takeCardList.get(0));
            takeCardList.remove(0);
        }
    }

    private int[] toMixCards() {
        int[] cardDatabase = new int[32];
        boolean again;
        Random r = new Random();
        int randomNumber;
        int cardDatabazeLength = cardDatabase.length;

        for (int i = 0; i < cardDatabazeLength; i++) {
            again = false;
            randomNumber = r.nextInt(cardDatabazeLength) + 1;

            for (int j = 0; j < cardDatabazeLength; j++) {
                if (randomNumber == cardDatabase[j]) {
                    again = true;
                    break;
                }
            }

            if (again == true) {
                i--;
                continue;
            }

            cardDatabase[i] = randomNumber;
        }
        
        return cardDatabase;
    }

    public void toDealCards() {
        switch (getMode()) {
            case 1:
            case 2:
                createListsForMode1_2(toMixCards());
                break;

            case 3:
            case 4:
            case 5:
                createListsForMode3_4_5(toMixCards());
                break;

            default:
                throw new AssertionError("wrong mode number");
        }
    }

    private void createListsForMode1_2(int[] cardDatabase) {
        for (int i = 0; i <= 3; i++) {
            playerCardList1.add(cardDatabase[i]);
            playerCardList2.add(cardDatabase[i + 4]);
        }

        for (int i = 8; i <= 30; i++) {
            takeCardList.add(cardDatabase[i]);
        }

        outCardList.add(cardDatabase[31]);
    }

    private void createListsForMode3_4_5(int[] cardDatabase) {
        for (int i = 0; i <= 3; i++) {
            playerCardList1.add(cardDatabase[i]);
            playerCardList2.add(cardDatabase[i + 4]);
            playerCardList3.add(cardDatabase[i + 8]);
        }

        for (int i = 12; i <= 30; i++) {
            takeCardList.add(cardDatabase[i]);
        }

        outCardList.add(cardDatabase[31]);
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public boolean isAceOnTheTable() {
        return aceOnTheTable;
    }

    public void resetAceOnTheTable() {
        aceOnTheTable = false;
    }

    private boolean isSameColor(int card) {
        switch (changedColor) {
            case 1:
                return card > 0 && card <= 8;

            case 2:
                return card > 8 && card <= 16;

            case 3:
                return card > 16 && card <= 24;

            case 4:
                return card > 24 && card <= 32;

            default:
                throw new AssertionError("wrong color in changerColor variable - isSameColor(card) - default");
        }
    }

    public void setChangedColor(int changedColor) {
        this.changedColor = changedColor;
    }
    
    public void resetChangedColor() {
        changedColor = 0;
        colorChoosen = false;
    }

    public void setColorChoosen(boolean colorChoosen) {
        this.colorChoosen = colorChoosen;
    }

    public int getActualGameVersion() {
        return actualGameVersion;
    }

    public void setActualGameVersion(int actualGameVersion) {
        this.actualGameVersion = actualGameVersion;
    }

    public int getWinner() {
        return winner;
    }

    public int getSevenCombo() {
        return sevenCombo;
    }

    public void resetSevenCombo() {
        sevenCombo = 0;
    }

    public ArrayList<Integer> getTakeCardList() {
        return takeCardList;
    }

    public ArrayList<Integer> getOutCardList() {
        return outCardList;
    }

    public ArrayList<Integer> getPlayerCardList1() {
        return playerCardList1;
    }

    public ArrayList<Integer> getPlayerCardList2() {
        return playerCardList2;
    }

    public ArrayList<Integer> getPlayerCardList3() {
        return playerCardList3;
    }

    public ArrayList<Integer> getActualList() {
        switch (actualGameVersion) {
            case 10:
                return playerCardList1;

            case 21:
            case 22:
                return playerCardList2;

            case 30:
                return playerCardList3;

            default:
                throw new AssertionError();
        }
    }

//    private void addElement(ArrayList<Integer> list, int element) {
//        list.add(element);
//    }
//
//    private void removeElement(ArrayList<Integer> list, int removeIndex) {
//        list.remove(removeIndex);
//    }
//    
//    private void writeInConsole(String vstupniString) throws InterruptedException {
//        for (int i = 0; i < vstupniString.length(); i++) {
//            System.out.print(vstupniString.charAt(i));
//
//            if (i + 1 == (vstupniString.length())) {
//                System.out.println("");
//            }
//            if (vstupniString.charAt(i) != '~' && !Character.isWhitespace(vstupniString.charAt(i))) {
//                Thread.sleep(300);
//            }
//        }
//    }
}
