package com.Krystiano;

import java.util.ArrayList;

public class League<T extends Team>{
    private ArrayList<T> ranking = new ArrayList<>();
    private String name;

    public League(String name) {
        this.name=name;
        System.out.println("League " + this.getName() + " created");
    }

    public void addTeam(T team){
        if (ranking==null){
            ranking.add(team);
            System.out.println("Team " + team.getName() + " added");
        } else if(!ranking.contains(team)){
            ranking.add(team);
            System.out.println("Team " + team.getName() + " added");
        } else {
            System.out.println("Team " + team.getName() + " is already in this League");
        }
    }


    public String getName() {
        return name;
    }

    public ArrayList<T> getRanking() {
        return ranking;
    }

    public void printRanking(){
        for(T team : ranking){
            team.printTeamScore();
        }
    }
}
