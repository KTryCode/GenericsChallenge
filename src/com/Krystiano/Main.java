package com.Krystiano;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    SoccerTeam A = new SoccerTeam("A", 10);
	    SoccerTeam B = new SoccerTeam("B", 5);
	    SoccerTeam C = new SoccerTeam("C", 12);

	    SwimmingTeam Q = new SwimmingTeam("Q", 1);
	    SwimmingTeam W = new SwimmingTeam("W", 3);
	    SwimmingTeam E = new SwimmingTeam("E", 10);

	    VolleyBall Z = new VolleyBall("Z", -11);
	    VolleyBall X = new VolleyBall("X", 0);
	    VolleyBall V = new VolleyBall("V", 10);

        League<VolleyBall> volleyLeague = new League<>("V_League");
		League<SoccerTeam> soccerLeague = new League<>("S_League");
		League<VolleyBall> swimming = new League<>("SW_League");

		//adding teams to proper leagues
		volleyLeague.addTeam(Z);
		volleyLeague.addTeam(X);
		volleyLeague.addTeam(V);


		volleyLeague.printRanking();
		Collections.sort(volleyLeague.getRanking());
		System.out.println("\n");
		volleyLeague.printRanking();

		soccerLeague.addTeam(A);
		soccerLeague.addTeam(B);
		soccerLeague.addTeam(C);
		soccerLeague.printRanking();
		Collections.sort(soccerLeague.getRanking());
		soccerLeague.printRanking();

	}
}
