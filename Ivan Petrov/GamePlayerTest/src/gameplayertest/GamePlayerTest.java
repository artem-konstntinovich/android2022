/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplayertest;

/**
 *
 * @author T530
 */
public class GamePlayerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello from GamePlayerTest");
        Game game = new Game("Tic-Tac-Toe");
        game.setScore("1:1");
        System.out.println(game);
    }
    
}
