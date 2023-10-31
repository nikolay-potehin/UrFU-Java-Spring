package org.example;

public class Main {
    public static void main(String[] args) {
        Player bot = new Player();
        Player alex = new Player("Alex", VARIANTS.SCISSORS);

        System.out.println(bot.WhoWin(bot, alex));
    }
}