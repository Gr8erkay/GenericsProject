package org.gr8erkay;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//        System.out.println(items);
//        printDoubled(items);

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");

        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(ronaldo);
        System.out.println(adelaideCrows.numPlayers());Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(ronaldo);
        brokenTeam.addPlayer(ronaldo);    }
    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println( i * 2);
        }
    }
}
