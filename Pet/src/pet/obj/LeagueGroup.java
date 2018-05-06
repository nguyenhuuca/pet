package pet.obj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pet.task.Task;
import pet.taskImpl.LeagueTask;
import pet.utils.FootballClubChainedComparator;
import pet.utils.GoalDifComparator;
import pet.utils.GoalForComparator;
import pet.utils.PointComparator;

// TODO: Auto-generated Javadoc
/**
 * The Class LeagueGroup.
 *
 * @author NGUYENCA
 */
public class LeagueGroup {

	/** The football clubs. */
	private List<FootballClub> footballClubs = new ArrayList<FootballClub>();
	
	/** The results. */
	private List<String> results = new ArrayList<String>();
	
	/** The cal task. */
	Task calTask = new LeagueTask();// default

	/**
	 * Adds the foot ball club.
	 *
	 * @param club the club
	 */
	public void addFootBallClub(FootballClub club) {
		footballClubs.add(club);
	}

	/**
	 * Removes the football club.
	 *
	 * @param club the club
	 */
	public void removeFootballClub(FootballClub club) {
		footballClubs.remove(club);
	}

	/**
	 * Adds the results.
	 *
	 * @param rs the rs
	 */
	public void addResults(String rs) {
		results.add(rs);
	}

	/**
	 * Sets the info.
	 *
	 * @param info the new info
	 */
	public void setInfo(String info) {
		Update upd = new Update(info);
		for (FootballClub club : footballClubs) {
			club.print(upd);
		}

	}

	/**
	 * Sets the task.
	 *
	 * @param task the new task
	 */
	public void setTask(Task task) {
		this.calTask = task;
	}

	/**
	 * Gets the clubs task.
	 *
	 * @param fileName the file name
	 * 
	 */
	public void getClubsTask(String fileName) {
		footballClubs = calTask.getCLubsFromFile(fileName);
	}

	/**
	 * Gets the results task.
	 *
	 * @param fileName the file name
	 * 
	 */
	public void getResultsTask(String fileName) {
		results = calTask.getResultFromFile(fileName);
	}

	/**
	 * Sets the result match task.
	 */
	public void setResultMatchTask() {
		for (FootballClub club : footballClubs) {
			StandingData standingDataDto = calTask.task(club, results);
			club.setStandingData(standingDataDto);

		}
		Collections.sort(footballClubs, new FootballClubChainedComparator(new PointComparator(),
				new GoalDifComparator(), new GoalForComparator()));
	}

	/**
	 * Prints the standing result task.
	 */
	public void printStandingResultTask() {
		calTask.printStandingResult(footballClubs);
	}

}
