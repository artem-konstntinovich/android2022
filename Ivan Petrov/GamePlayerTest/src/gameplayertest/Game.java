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
public class Game {
    private String title;
    private String score;
    public Game(String Title)
    {
        this.title = Title;
    }

    @Override
    public String toString() {
        return "Game{" + "title=" + title + ", score=" + score + '}';
    }
    public void setScore(String Score)
    {
        score = Score;
    }
    
}
