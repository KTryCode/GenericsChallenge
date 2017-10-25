package com.Krystiano;

import java.util.ArrayList;

public class League<T extends Team> implements Comparable<Team> {
    private ArrayList<T> ranking;
    private String name;

    public League(String name) {
        this.name=name;
        System.out.println("League " + this.getName() + " created");
    }
    public boolean addTeam(T team){
        return false;
    }

    @Override
    public int compareTo(Team o) {
        return 0;
    }

    public String getName() {
        return name;
    }
}
