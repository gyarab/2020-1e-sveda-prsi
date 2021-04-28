/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prsi_rocnikovyprojekt;

import java.awt.*;
import java.io.IOException;

/**
 *
 * @author jakub.sveda
 */
public class PrsiLaunchApp {
    public static void main(String[] args) throws InterruptedException, AWTException, IOException {         
        Game game = new Game();
        game.launch();
    }
}
