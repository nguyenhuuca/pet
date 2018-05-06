package pet.task;
import java.util.List;

import pet.obj.FootballClub;
import pet.obj.StandingData;

/**
 * @author NGUYENCA
 *
 */
public interface Task {
	public StandingData task(FootballClub club, List<String> rs);
	public void printStandingResult(List<FootballClub> clubs);
	public List<FootballClub> getCLubsFromFile(String fileName);
	public List<String> getResultFromFile(String fileName);
}
