package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Player {
    private String name;
    private VARIANTS var;

    public Player() {
        this.name = "bot";
        this.var = getRandom();
    }

    public Player(String name, VARIANTS var) {
        this.name = name;
        this.var = var;
    }

    private VARIANTS getRandom() {
        return VARIANTS.values()[new Random().nextInt(VARIANTS.values().length)];
    }

    public String WhoWin(Player player1, Player player2) {
        System.out.println(player1.name + " выбрал " + player1.var);
        System.out.println(player2.name + " выбрал " + player2.var);

        ArrayList<VARIANTS> variants = new ArrayList<VARIANTS>();
        variants.add(VARIANTS.ROCK);
        variants.add(VARIANTS.PAPER);
        variants.add(VARIANTS.SCISSORS);

        int choose1 = variants.indexOf(player1.var);
        int choose2 = variants.indexOf(player2.var);

        if (choose1 == choose2) {
            return "Ничья!";
        }
        if ((choose1 - choose2) == -2 || (choose1 - choose2) == 1) {
            return player1.name + " Одержал победу!!!";
        } else {
            return player2.name + " Одержал победу!!!";
        }
    }
}
