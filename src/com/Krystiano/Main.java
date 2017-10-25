package com.Krystiano;

public class Main {

    public static void main(String[] args) {
	    SoccerTeam A = new SoccerTeam("A", 10);
	    SoccerTeam B = new SoccerTeam("B", 5);
	    SoccerTeam C = new SoccerTeam("C", 12);

	    SwimmingTeam Q = new SwimmingTeam("Q", 1);
	    SwimmingTeam W = new SwimmingTeam("W", 3);
	    SwimmingTeam E = new SwimmingTeam("E", 10);

	    VolleyBall Z = new VolleyBall("Z", -1);
	    VolleyBall X = new VolleyBall("X", 0);
	    VolleyBall V = new VolleyBall("C", 10);

        League<VolleyBall> volleyLeague = new League<>("V_League");
        volleyLeague.addTeam(Z);
    }
}
