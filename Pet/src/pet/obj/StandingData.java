package pet.obj;

import pet.utils.Constants;

/**
 * @author NGUYENCA
 *
 */
public class StandingData {
	private String club;
	private int matchPlayer;
	private int win;
	private int draws;
	private int losses;
	private int goalFor;
	private int goalAgainst;
	private int goalDif;
	private int point;

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public int getMatchPlayer() {
		return matchPlayer;
	}

	public void setMatchPlayer(int matchPlayer) {
		this.matchPlayer = matchPlayer;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getGoalFor() {
		return goalFor;
	}

	public void setGoalFor(int goalFor) {
		this.goalFor = goalFor;
	}

	public int getGoalAgainst() {
		return goalAgainst;
	}

	public void setGoalAgainst(int goalAgainst) {
		this.goalAgainst = goalAgainst;
	}

	public int getGoalDif() {
		goalDif = (goalFor - goalAgainst);
		return goalDif;
	}

	public void setGoalDif(int goalDif) {
		this.goalDif = goalDif;
	}

	public int getPoint() {
		 point = (win * 3 + draws * 1);
		 return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "" + club + ", matchPlayer=" + matchPlayer + ", win=" + win + ", draws=" + draws + ", losses=" + losses
				+ ", goalFor=" + goalFor + ", goalAgainst=" + goalAgainst + ", goalDif=" + getGoalDif() + ", point="
				+ getPoint() + "]";
	}

	public String standardString() {
		return String.format(Constants.FORMAT_STR,getClub(), getMatchPlayer(), getWin(), getDraws(), getLosses(), getGoalFor(),
				getGoalAgainst(), getGoalDif(), getPoint());
	}

}
