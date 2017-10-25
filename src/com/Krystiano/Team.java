package com.Krystiano;

public abstract class Team implements Comparable<Team> {
    private String name;
    private int score;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Team team) {
        if(this.getScore()>team.getScore()){
            return -1;
        } else if(this.getScore()==team.getScore()){
            return 0;
        } else {
            return 0;
        }
    }

    public void printTeamScore(){
        System.out.println("Team " + getName() + " with " + getScore() + " points");
    }
}
