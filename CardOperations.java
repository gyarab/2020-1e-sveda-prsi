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

    /*
    * VARIABLES
     */
    private ArrayList<Integer> playerCardList1 = new ArrayList<>();
    private ArrayList<Integer> playerCardList2 = new ArrayList<>();
    private ArrayList<Integer> playerCardList3 = new ArrayList<>();
    private ArrayList<Integer> outCardList = new ArrayList<>();
    private ArrayList<Integer> takeCardList = new ArrayList<>();

    private int mode = 0;
    private int actualGameVersion = 0;
    private int sevenCombo = 0;
    private int changedColor = 0;
    private int winner = 0;
    private boolean aceOnTheTable = false;
    private boolean colorChoosen = false;
    private boolean redSevenBack = true;
    private boolean redSevenOnly = false;
    private String reportMessage;

    CardDesign cd = new CardDesign();

    // TEXT COLORS
    private final String RESET_TEXT_COLOR = "\u001B[0m";
    private final String RED_TEXT = "\u001B[31m";
    private final String GREEN_TEXT = "\u001B[32m";
    private final String YELLOW_TEXT = "\u001B[33m";
    private final String BLUE_TEXT = "\u001B[34m";
    private final String PURPLE_TEXT = "\u001B[35m";

    /*
    * CONSTRUCTOR
     */
    public CardOperations() {
    }

    /*
    * DEALING AND MIXING CARDS
     */
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
            } else {
                cardDatabase[i] = randomNumber;
            }
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
        for (int i = 0; i < 4; i++) {
            playerCardList1.add(cardDatabase[i]);
            playerCardList2.add(cardDatabase[i + 4]);
        }

        for (int i = 8; i <= 30; i++) {
            takeCardList.add(cardDatabase[i]);
        }

        outCardList.add(cardDatabase[31]);
    }

    private void createListsForMode3_4_5(int[] cardDatabase) {
        for (int i = 0; i < 4; i++) {
            playerCardList1.add(cardDatabase[i]);
            playerCardList2.add(cardDatabase[i + 4]);
            playerCardList3.add(cardDatabase[i + 8]);
        }

        for (int i = 12; i <= 30; i++) {
            takeCardList.add(cardDatabase[i]);
        }

        outCardList.add(cardDatabase[31]);
    }

    /*
    * CARD LIBRARY
     */
    public void createCardLibrary(boolean nahledKarty) {
        for (int i = 1; i <= 38; i++) {
            toStringCardInfo(i, true, nahledKarty);
            System.out.println("\n");
        }
    }

    private void toStringCardInfo(int card, boolean cardInfo, boolean cardView) {
        switch (card) {
            case 1:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getGreenOne()));
                }
                if (cardInfo) {
                    System.out.println(GREEN_TEXT + "ZELENÝ SPODEK" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - zelená karta tvořící barvu pomocí listu" + RESET_TEXT_COLOR);
                }
                break;

            case 2:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getGreenChanger()));
                }
                if (cardInfo) {
                    System.out.println(GREEN_TEXT + "ZELENÝ KRÁL" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - zelená karta tvořící barvu pomocí listu" + RESET_TEXT_COLOR);
                }
                break;

            case 3:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getGreenSeven()));
                }
                if (cardInfo) {
                    System.out.println(GREEN_TEXT + "ZELENÁ SEDMIČKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - zelená karta tvořící barvu pomocí listu" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - může jiným hráčům přidat 2 karty" + RESET_TEXT_COLOR);
                }
                break;

            case 4:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getGreenEight()));
                }
                if (cardInfo) {
                    System.out.println(GREEN_TEXT + "ZELENÁ OSMIČKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - zelená karta tvořící barvu pomocí listu" + RESET_TEXT_COLOR);
                }
                break;

            case 5:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getGreenNine()));
                }
                if (cardInfo) {
                    System.out.println(GREEN_TEXT + "ZELENÁ DEVÍTKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - zelená karta tvořící barvu pomocí listu" + RESET_TEXT_COLOR);
                }
                break;

            case 6:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getGreenTen()));
                }
                if (cardInfo) {
                    System.out.println(GREEN_TEXT + "ZELENÁ DESÍTKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - zelená karta tvořící barvu pomocí listu" + RESET_TEXT_COLOR);
                }
                break;

            case 7:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getGreenAce()));
                }
                if (cardInfo) {
                    System.out.println(GREEN_TEXT + "ZELENÉ ESO" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - zelená karta tvořící barvu pomocí listu" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - může pozastavit tah dalšího hráče" + RESET_TEXT_COLOR);
                }
                break;

            case 8:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getGreenChanger()));
                }
                if (cardInfo) {
                    System.out.println(GREEN_TEXT + "ZELENÝ MĚNIČ (FILEK)" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - zelená karta tvořící barvu pomocí listu" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - umožňuje změnit herní barvu" + RESET_TEXT_COLOR);
                }
                break;

            case 9:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getYellowOne()));
                }
                if (cardInfo) {
                    System.out.println(YELLOW_TEXT + "ŽALUDOVÝ SPODEK" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - žlutá karta tvořící barvu pomocí tvaru žaludu" + RESET_TEXT_COLOR);
                }
                break;

            case 10:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getYellowKing()));
                }
                if (cardInfo) {
                    System.out.println(YELLOW_TEXT + "ŽALUDOVÝ KRÁL" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - žlutá karta tvořící barvu pomocí tvaru žaludu" + RESET_TEXT_COLOR);
                }
                break;

            case 11:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getYellowSeven()));
                }
                if (cardInfo) {
                    System.out.println(YELLOW_TEXT + "ŽALUDOVÁ SEDMA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - žlutá karta tvořící barvu pomocí tvaru žaludu" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - může jiným hráčům přidat 2 karty" + RESET_TEXT_COLOR);
                }
                break;

            case 12:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getYellowEight()));
                }
                if (cardInfo) {
                    System.out.println(YELLOW_TEXT + "ŽALUDOVÁ OSMIČKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - žlutá karta tvořící barvu pomocí tvaru žaludu" + RESET_TEXT_COLOR);
                }
                break;

            case 13:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getYellowNine()));
                }
                if (cardInfo) {
                    System.out.println(YELLOW_TEXT + "ŽALUDOVÁ DEVÍTKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - žlutá karta tvořící barvu pomocí tvaru žaludu" + RESET_TEXT_COLOR);
                }
                break;

            case 14:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getYellowTen()));
                }
                if (cardInfo) {
                    System.out.println(YELLOW_TEXT + "ŽALUDOVÁ DESÍTKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - žlutá karta tvořící barvu pomocí tvaru žaludu" + RESET_TEXT_COLOR);
                }
                break;

            case 15:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getYellowAce()));
                }
                if (cardInfo) {
                    System.out.println(YELLOW_TEXT + "ŽALUDOVÉ ESO" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - žlutá karta tvořící barvu pomocí tvaru žaludu" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - může pozastavit tah dalšího hráče" + RESET_TEXT_COLOR);
                }
                break;

            case 16:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getYellowChanger()));
                }
                if (cardInfo) {
                    System.out.println(YELLOW_TEXT + "ŽALUDOVÝ MĚNIČ (FILEK)" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - žlutá karta tvořící barvu pomocí tvaru žaludu" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - umožňuje změnit herní barvu" + RESET_TEXT_COLOR);
                }
                break;

            case 17:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getBlueOne()));
                }
                if (cardInfo) {
                    System.out.println(BLUE_TEXT + "KULOVÝ SPODEK" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - modrá karta tvořící barvu pomocí tvaru koule" + RESET_TEXT_COLOR);
                }
                break;

            case 18:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getBlueKing()));
                }
                if (cardInfo) {
                    System.out.println(BLUE_TEXT + "KULOVÝ KRÁL" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - modrá karta tvořící barvu pomocí tvaru koule" + RESET_TEXT_COLOR);
                }
                break;

            case 19:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getBlueSeven()));
                }
                if (cardInfo) {
                    System.out.println(BLUE_TEXT + "KULOVÁ SEDMIČKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - modrá karta tvořící barvu pomocí tvaru koule" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - může jiným hráčům přidat 2 karty" + RESET_TEXT_COLOR);
                }
                break;

            case 20:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getBlueEight()));
                }
                if (cardInfo) {
                    System.out.println(BLUE_TEXT + "KULOVÁ OSMIČKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - modrá karta tvořící barvu pomocí tvaru koule" + RESET_TEXT_COLOR);
                }
                break;

            case 21:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getBlueNine()));
                }
                if (cardInfo) {
                    System.out.println(BLUE_TEXT + "KULOVÁ DEVÍTKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - modrá karta tvořící barvu pomocí tvaru koule" + RESET_TEXT_COLOR);
                }
                break;

            case 22:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getBlueTen()));
                }
                if (cardInfo) {
                    System.out.println(BLUE_TEXT + "KULOVÁ DESÍTKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - modrá karta tvořící barvu pomocí tvaru koule" + RESET_TEXT_COLOR);
                }
                break;

            case 23:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getBlueAce()));
                }
                if (cardInfo) {
                    System.out.println(BLUE_TEXT + "KULOVÉ ESO" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - modrá karta tvořící barvu pomocí tvaru koule" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - může pozastavit tah dalšího hráče" + RESET_TEXT_COLOR);
                }
                break;

            case 24:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getBlueChanger()));
                }
                if (cardInfo) {
                    System.out.println(BLUE_TEXT + "KULOVÝ MĚNIČ (FILEK)" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - modrá karta tvořící barvu pomocí tvaru koule" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - umožňuje změnit herní barvu" + RESET_TEXT_COLOR);
                }
                break;

            case 25:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getRedOne()));
                }
                if (cardInfo) {
                    System.out.println(RED_TEXT + "SRDCOVÝ SPODEK" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - červená karta tvořící barvu pomocí tvaru srdce" + RESET_TEXT_COLOR);
                }
                break;

            case 26:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getRedKing()));
                }
                if (cardInfo) {
                    System.out.println(RED_TEXT + "SRDCOVÝ KRÁL" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - červená karta tvořící barvu pomocí tvaru srdce" + RESET_TEXT_COLOR);
                }
                break;

            case 27:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getRedSeven()));
                }
                if (cardInfo) {
                    System.out.println(RED_TEXT + "SRDCOVÁ SEDMIČKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - červená karta tvořící barvu pomocí tvaru srdce" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - může jiným hráčům přidat 2 karty" + RESET_TEXT_COLOR);
                }
                break;

            case 28:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getRedEight()));
                }
                if (cardInfo) {
                    System.out.println(RED_TEXT + "SRDCOVÁ OSMIČKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - červená karta tvořící barvu pomocí tvaru srdce" + RESET_TEXT_COLOR);
                }
                break;

            case 29:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getRedNine()));
                }
                if (cardInfo) {
                    System.out.println(RED_TEXT + "SRDCOVÁ DEVÍTKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - červená karta tvořící barvu pomocí tvaru srdce" + RESET_TEXT_COLOR);
                }
                break;

            case 30:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getRedTen()));
                }
                if (cardInfo) {
                    System.out.println(RED_TEXT + "SRDCOVÁ DESÍTKA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - červená karta tvořící barvu pomocí tvaru srdce" + RESET_TEXT_COLOR);
                }
                break;

            case 31:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getRedAce()));
                }
                if (cardInfo) {
                    System.out.println(RED_TEXT + "SRDCOVÉ ESO" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - červená karta tvořící barvu pomocí tvaru srdce" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - může pozastavit tah dalšího hráče" + RESET_TEXT_COLOR);
                }
                break;

            case 32:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getRedChanger()));
                }
                if (cardInfo) {
                    System.out.println(RED_TEXT + "SRDCOVÝ MĚNIČ (FILEK)" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - červená karta tvořící barvu pomocí tvaru srdce" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - umožňuje změnit herní barvu" + RESET_TEXT_COLOR);
                }
                break;

            case 33:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getEmptyCard()));
                }
                if (cardInfo) {
                    System.out.println(PURPLE_TEXT + "PRAZDNA KARTA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - karta, bez žádného určení a žádné barvy" + RESET_TEXT_COLOR);
                }
                break;

            case 34:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getNonameCard()));
                }
                if (cardInfo) {
                    System.out.println(PURPLE_TEXT + "NONAME KARTA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - karta, jejíž funkce není předem určena" + RESET_TEXT_COLOR);
                }
                break;

            case 35:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getFullGreen()));
                }
                if (cardInfo) {
                    System.out.println(GREEN_TEXT + "CELÁ ZELENÁ KARTA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - zelená karta, která určuje přehledně barvu, která byla vybrána filkem" + RESET_TEXT_COLOR);
                }
                break;
            case 36:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getFullYellow()));
                }
                if (cardInfo) {
                    System.out.println(YELLOW_TEXT + "CELÁ ŽADLUDOVÁ KARTA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - žlutá karta, která určuje přehledně barvu, která byla vybrána filkem" + RESET_TEXT_COLOR);
                }
                break;

            case 37:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getFullBlue()));
                }
                if (cardInfo) {
                    System.out.println(BLUE_TEXT + "CELÁ KULOVÁ KARTA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - modrá karta, která určuje přehledně barvu, která byla vybrána filkem" + RESET_TEXT_COLOR);
                }
                break;

            case 38:
                if (cardView) {
                    System.out.println(toStringSingleCard(cd.getFullRed()));
                }
                if (cardInfo) {
                    System.out.println(RED_TEXT + "CELÁ ČERVENÁ KARTA" + RESET_TEXT_COLOR);
                    System.out.println(PURPLE_TEXT + " - červená karta, která určuje přehledně barvu, která byla vybrána filkem" + RESET_TEXT_COLOR);
                }
                break;

            default:
                throw new AssertionError("Wrong card number - CardOperations.toStringCardInfo(card, cardInfo, cardView) - default");
        }
    }

    private String toStringSingleCard(String[] inputField) {
        String outputString = "";

        for (int i = 0; i < inputField.length; i++) {
            outputString += inputField[i] + "\n";
        }

        return outputString;
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
                throw new AssertionError("Wrong card to get its field - CardOperations.getCardField(inputField) - default");
        }
    }

    public void cardLayout() {
        createCardNextToCard(getActualList());
        createTableLayout();
    }

    public void createCardNextToCard(ArrayList<Integer> cardList) {
        int listDevide = (int) ((double) cardList.size() / (double) 8);
        int listModulo = cardList.size() % 8;
        int card = 0;

        for (int i = 0; i < listDevide; i++) {
            int cardEight = card + 8;

            for (int row = 0; row < 16; row++) {
                for (int index = card; index < cardEight; index++) {
                    System.out.print(getCardField(cardList.get(index))[row] + RESET_TEXT_COLOR + "  ");
                }
                
                System.out.println("");
            }

            System.out.println(toStringCardNumbers(card, cardEight));
        }
        
        if (listModulo != 0) {
            int lastCardSetIndex = cardList.size() - listModulo;
            
            for (int row = 0; row < 16; row++) {
                for (int index = lastCardSetIndex; index < cardList.size(); index++) {
                    System.out.print(getCardField(cardList.get(index))[row] + RESET_TEXT_COLOR + "  ");
                }
                System.out.println("");
            }
            
            System.out.println(toStringCardNumbers(lastCardSetIndex, cardList.size()));
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

    private String toStringCardNumbers(int card, int lenght) {
        String topAndBottomString = "";
        String middleString = "";

        while (card < lenght) {
            if ((card + 1) > 9) {
                topAndBottomString += " =----=                  ";
                middleString += " | " + (card + 1) + " |                  ";
            } else {
                topAndBottomString += " =---=                   ";
                middleString += " | " + (card + 1) + " |                   ";
            }

            card++;
        }

        return topAndBottomString + "\n" + middleString + "\n" + topAndBottomString + "\n";
    }

    /*
    * GAME
     */
    private void playCard(int cardToPlay) {
        switch (cardToPlay) {
            case 3:
            case 11:
            case 19:
            case 27:
                sevenCombo++;
                resetAceOnTheTable();
                resetChangedColor();
                break;
            case 7:
            case 15:
            case 23:
            case 31:
                aceOnTheTable = true;
                resetSevenCombo();
                resetChangedColor();
                break;

            case 8:
            case 16:
            case 24:
            case 32:
                colorChoosen = true;
                setChangedColor(getTheMostUsedColor(false));
                resetAceOnTheTable();
                resetSevenCombo();
                break;

            default:
                resetAceOnTheTable();
                resetChangedColor();
                resetSevenCombo();
                break;
        }

        getActualList().remove(getActualList().indexOf(cardToPlay));
        outCardList.add(cardToPlay);
        takeCardList.add(outCardList.get(0));
        outCardList.remove(0);
    }

    // PLAYER GAME
    public int playerGame(int input) {
        int cardNumber = getActualList().get(input - 1);
        int tableCard = outCardList.get(outCardList.size() - 1);

        if (redSevenOnly) {
            if (cardNumber == 27) {
                redSevenOnly = false;
                playCard(cardNumber);
                return 1;
            } else {
                reportMessage = "\n******************************************************************************\n* " + RED_TEXT + "MUSÍTE HRÁT ČERVENOU SEDMIČKU, ABY JSTE VRÁTIL/A DRUHÉHO HRÁČE ZPĚT DO HRY" + RESET_TEXT_COLOR + " *\n******************************************************************************\n";
                return -1;
            }
        } else if (sevenCombo > 0) {
            if (cardNumber == 3 || cardNumber == 11 || cardNumber == 19 || cardNumber == 27) {
                playCard(cardNumber);
                return 1;
            } else {
                reportMessage = "************************************************************************\n* " + RED_TEXT + "JSTE V EFEKTU SEDMIČKY, HRAJTE JINOU SEDMIČKU NEBO SI MUSÍTE LÍZNOUT" + RESET_TEXT_COLOR + " *\n************************************************************************";
                return -1;
            }
        } else if (aceOnTheTable) {
            if (cardNumber == 7 || cardNumber == 15 || cardNumber == 23 || cardNumber == 31) {
                playCard(cardNumber);
                return 1;
            } else {
                reportMessage = "\n*************************************************************\n* " + RED_TEXT + "JSTE V EFEKTU ESA, HRAJTE JINÉ ESO NEBO SI MUSÍTE LÍZNOUT" + RESET_TEXT_COLOR + " *\n*************************************************************\n";
                return -1;
            }
        } else if (cardNumber == 8 || cardNumber == 16 || cardNumber == 24 || cardNumber == 32) {
            playCard(cardNumber);
            return 11;
        } else if (colorChoosen) {
            if (isSameColor(cardNumber)) {
                return noExceptionPlay(input, cardNumber, tableCard, true);
            } else {
                reportMessage = "\n**********************************************************\n* " + RED_TEXT + "VYBERTE KARTU STEJNÉ BARVY, JAKOU ZVOLIL VÁŠ PROTIVNÍK" + RESET_TEXT_COLOR + " *\n**********************************************************\n";
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
            reportMessage = "\n********************************************************\n* " + RED_TEXT + "TOUTO KARTOU SVŮJ TAH HRÁT NEMŮŽETE, ZKUSTE JINOU..." + RESET_TEXT_COLOR + " *\n********************************************************\n";
            return -1;
        }
    }

    // COMPUTER GAME
    public void computerGame() {
        ArrayList<Integer> canBeUsed = new ArrayList<>();
        int tableCard = outCardList.get(outCardList.size() - 1);

        getActualList().stream().filter((cardNumber) -> (checkIfComputerCanPlayThisCard(cardNumber, tableCard))).forEachOrdered((cardNumber) -> {
            canBeUsed.add(cardNumber);
        });

        if (redSevenOnly) {
            redSevenOnly = false;
            playCard(27);
        } else if (canBeUsed.size() == 1) {
            playCard(canBeUsed.get(0));
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
                    boolean cardLeft = doesAnybodyHaveOneCardLeft();

                    if (canBeUsed.contains(8) && cardLeft) {
                        computerColorChange();
                        resetSevenCombo();
                        resetAceOnTheTable();
                        playCard(8);
                    } else if (canBeUsed.contains(16) && cardLeft) {
                        computerColorChange();
                        resetSevenCombo();
                        resetAceOnTheTable();
                        playCard(16);
                    } else if (canBeUsed.contains(24) && cardLeft) {
                        computerColorChange();
                        resetSevenCombo();
                        resetAceOnTheTable();
                        playCard(24);
                    } else if (canBeUsed.contains(32) && cardLeft) {
                        computerColorChange();
                        resetSevenCombo();
                        resetAceOnTheTable();
                        playCard(32);
                    } else if (canBeUsed.contains(3) && cardLeft) {
                        sevenCombo++;
                        resetAceOnTheTable();
                        resetChangedColor();
                        playCard(3);
                    } else if (canBeUsed.contains(11) && cardLeft) {
                        sevenCombo++;
                        resetAceOnTheTable();
                        resetChangedColor();
                        playCard(11);
                    } else if (canBeUsed.contains(19) && cardLeft) {
                        sevenCombo++;
                        resetAceOnTheTable();
                        resetChangedColor();
                        playCard(19);
                    } else if (canBeUsed.contains(27) && cardLeft) {
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

    private void computerColorChange() {
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
                throw new AssertionError("Color is not set or set badly (number in changedColor variable) - CardOperations.computerColorChange() - default");
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

    private boolean checkIfComputerCanPlayThisCard(int cardNumber, int tableCard) {
        if (redSevenOnly) {
            return cardNumber == 27;
        } else if (sevenCombo > 0) {
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

    /*
    * OTHER METHODS
     */
    private boolean doesAnybodyHaveOneCardLeft() {
        switch (mode) {
            case 1:
            case 2:
                return getPlayerCardList1().size() == 1 || getPlayerCardList2().size() == 1;

            case 3:
            case 4:
                return getPlayerCardList1().size() == 1 || getPlayerCardList2().size() == 1 || getPlayerCardList3().size() == 1;

            default:
                throw new AssertionError("Wrong mode number - CardOperations.doesAnybodyHaveOneCardLeft() - default");
        }
    }

    public boolean doesAnybodyWin() {
        switch (mode) {
            case 1:
            case 2:
                if (getPlayerCardList1().isEmpty()) {
                    if (redSevenBack && getPlayerCardList2().contains(27)) {
                        redSevenOnly = true;
                        return false;
                    } else {
                        winner = 1;
                        return true;
                    }
                } else if (getPlayerCardList2().isEmpty()) {
                    if (redSevenBack && getPlayerCardList1().contains(27)) {
                        redSevenOnly = true;
                        return false;
                    } else {
                        winner = 2;
                        return true;
                    }
                } else {
                    return false;
                }

            case 3:
            case 4:
            case 5:
                if (getPlayerCardList1().isEmpty()) {
                    winner = 1;
                    return true;
                } else if (getPlayerCardList2().isEmpty()) {
                    winner = 2;
                    return true;
                } else if (getPlayerCardList3().isEmpty()) {
                    winner = 3;
                    return true;
                } else {
                    return false;
                }

            default:
                throw new AssertionError("Wrong mode number - CardOperations.doesAnybodyWin() - default");
        }
    }

    public void takeCard(int numberOfCards) {
        for (int i = 0; i < numberOfCards; i++) {
            getActualList().add(takeCardList.get(0));
            takeCardList.remove(0);
        }
    }

    /*
    * GETTERS AND SETTERS
     */
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
                throw new AssertionError("Wrong color choosen (number in changerColor variable) - isSameColor(card) - default");
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

    public void setRedSevenBack(boolean redSevenBack) {
        this.redSevenBack = redSevenBack;
    }

    public boolean isRedSevenBack() {
        return redSevenBack;
    }

    public void createReportMessage() {
        System.out.println(reportMessage);
    }

    public void resetPlayerCardList1() {
        playerCardList1.clear();
    }

    public void resetPlayerCardList2() {
        playerCardList2.clear();
    }

    public void resetPlayerCardList3() {
        playerCardList3.clear();
    }

    public void resetOutCardList() {
        outCardList.clear();
    }

    public void resetTakeCardList() {
        takeCardList.clear();
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
                throw new AssertionError("Wrong game version (number in actualGameVersion variable) - CardOperations.getActualList() - default");
        }
    }
}
