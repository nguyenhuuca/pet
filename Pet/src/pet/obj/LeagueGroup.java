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

/**
 * @author NGUYENCA
 *
 */
public class LeagueGroup {

	private List<FootballClub> footballClubs = new ArrayList<FootballClub>();
	private List<String> results = new ArrayList<String>();
	Task calTask = new LeagueTask();// default

	public void addFootBallClub(FootballClub club) {
		footballClubs.add(club);
	}

	public void removeFootballClub(FootballClub club) {
		footballClubs.remove(club);
	}

	public void addResults(String rs) {
		results.add(rs);
	}

	public void setInfo(String info) {
		Update upd = new Update(info);
		for (FootballClub club : footballClubs) {
			club.print(upd);
		}

	}

	public void setTask(Task task) {
		this.calTask = task;
	}

	public void getClubsTask(String fileName) {
		footballClubs = calTask.getCLubsFromFile(fileName);
	}

	public void getResultsTask(String fileName) {
		results = calTask.getResultFromFile(fileName);
	}

	public void setResultMatchTask() {
		for (FootballClub club : footballClubs) {
			StandingData standingDataDto = calTask.task(club, results);
			club.setStandingData(standingDataDto);

		}
		Collections.sort(footballClubs, new FootballClubChainedComparator(new PointComparator(),
				new GoalDifComparator(), new GoalForComparator()));
	}

	public void printStandingResultTask() {
		calTask.printStandingResult(footballClubs);
	}

}
