package com.idoescode;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted  = 5;
        int bonus = 100;

	    calculateScore(gameOver, score, levelCompleted, bonus);

	    score = 10000;
	    levelCompleted = 8;
	    bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);
        int finalScore = getScore(gameOver, score, levelCompleted, bonus);


        System.out.println("Your score is " + finalScore);

        displayScoreBoard("John Doe", 1500);
        displayScoreBoard("Jane Doe", 900);
        displayScoreBoard("Jeremy Foo", 400);
        displayScoreBoard("Janet Bar", 50);

    }

    public static void calculateScore(
            boolean gameOver,
            int score,
            int levelCompleted,
            int bonus
    ) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }
    }

    public static int getScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        }
        // we are using -1 to indicate error
        return -1;
    }

    public static void displayScoreBoard(String name, int score) {
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " is currently on position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        }

        if (score > 500) {
            return 2;
        }

        if (score > 100) {
            return 3;
        }

        return 4;
    }
}
