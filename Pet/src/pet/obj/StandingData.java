package pet.obj;

import pet.utils.Constants;

// TODO: Auto-generated Javadoc
/**
 * The Class StandingData.
 *
 * @author NGUYENCA
 */
public class StandingData {
	
	/** The club. */
	private String club;
	
	/** The match player. */
	private int matchPlayer;
	
	/** The win. */
	private int win;
	
	/** The draws. */
	private int draws;
	
	/** The losses. */
	private int losses;
	
	/** The goal for. */
	private int goalFor;
	
	/** The goal against. */
	private int goalAgainst;
	
	/** The goal dif. */
	private int goalDif;
	
	/** The point. */
	private int point;

	/**
	 * Gets the club.
	 *
	 * @return the club
	 */
	public String getClub() {
		return club;
	}

	/**
	 * Sets the club.
	 *
	 * @param club the new club
	 */
	public void setClub(String club) {
		this.club = club;
	}

	/**
	 * Gets the match player.
	 *
	 * @return the match player
	 */
	public int getMatchPlayer() {
		return matchPlayer;
	}

	/**
	 * Sets the match player.
	 *
	 * @param matchPlayer the new match player
	 */
	public void setMatchPlayer(int matchPlayer) {
		this.matchPlayer = matchPlayer;
	}

	/**
	 * Gets the win.
	 *
	 * @return the win
	 */
	public int getWin() {
		return win;
	}

	/**
	 * Sets the win.
	 *
	 * @param win the new win
	 */
	public void setWin(int win) {
		this.win = win;
	}

	/**
	 * Gets the draws.
	 *
	 * @return the draws
	 */
	public int getDraws() {
		return draws;
	}

	/**
	 * Sets the draws.
	 *
	 * @param draws the new draws
	 */
	public void setDraws(int draws) {
		this.draws = draws;
	}

	/**
	 * Gets the losses.
	 *
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * Sets the losses.
	 *
	 * @param losses the new losses
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}

	/**
	 * Gets the goal for.
	 *
	 * @return the goal for
	 */
	public int getGoalFor() {
		return goalFor;
	}

	/**
	 * Sets the goal for.
	 *
	 * @param goalFor the new goal for
	 */
	public void setGoalFor(int goalFor) {
		this.goalFor = goalFor;
	}

	/**
	 * Gets the goal against.
	 *
	 * @return the goal against
	 */
	public int getGoalAgainst() {
		return goalAgainst;
	}

	/**
	 * Sets the goal against.
	 *
	 * @param goalAgainst the new goal against
	 */
	public void setGoalAgainst(int goalAgainst) {
		this.goalAgainst = goalAgainst;
	}

	/**
	 * Gets the goal dif.
	 *
	 * @return the goal dif
	 */
	public int getGoalDif() {
		goalDif = (goalFor - goalAgainst);
		return goalDif;
	}

	/**
	 * Sets the goal dif.
	 *
	 * @param goalDif the new goal dif
	 */
	public void setGoalDif(int goalDif) {
		this.goalDif = goalDif;
	}

	/**
	 * Gets the point.
	 *
	 * @return the point
	 */
	public int getPoint() {
		 point = (win * 3 + draws * 1);
		 return point;
	}

	/**
	 * Sets the point.
	 *
	 * @param point the new point
	 */
	public void setPoint(int point) {
		this.point = point;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "" + club + ", matchPlayer=" + matchPlayer + ", win=" + win + ", draws=" + draws + ", losses=" + losses
				+ ", goalFor=" + goalFor + ", goalAgainst=" + goalAgainst + ", goalDif=" + getGoalDif() + ", point="
				+ getPoint() + "]";
	}

	/**
	 * Standard string.
	 *
	 * @return the string
	 */
	public String standardString() {
		return String.format(Constants.FORMAT_STR,getClub(), getMatchPlayer(), getWin(), getDraws(), getLosses(), getGoalFor(),
				getGoalAgainst(), getGoalDif(), getPoint());
	}

}
