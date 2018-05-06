package pet.task;
import java.util.List;

import pet.obj.FootballClub;
import pet.obj.StandingData;

// TODO: Auto-generated Javadoc
/**
 * The Interface Task.
 *
 * @author NGUYENCA
 */
public interface Task {
	
	/**
	 * Task.
	 *
	 * @param club the club
	 * @param rs the rs
	 * @return the standing data
	 */
	public StandingData task(FootballClub club, List<String> rs);
	
	/**
	 * Prints the standing result.
	 *
	 * @param clubs the clubs
	 */
	public void printStandingResult(List<FootballClub> clubs);
	
	/**
	 * Gets the c lubs from file.
	 *
	 * @param fileName the file name
	 * @return the c lubs from file
	 */
	public List<FootballClub> getCLubsFromFile(String fileName);
	
	/**
	 * Gets the result from file.
	 *
	 * @param fileName the file name
	 * @return the result from file
	 */
	public List<String> getResultFromFile(String fileName);
}
