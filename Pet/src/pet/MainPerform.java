package pet;
import pet.obj.LeagueGroup;

/**
 * 
 * @author NGUYENCA
 *
 */
public class MainPerform {
	static LeagueGroup leaguaGroup = new LeagueGroup();
	public static void main(String... args) {
		leaguaGroup = new LeagueGroup();
		leaguaGroup.getClubsTask("clubs.txt");
		leaguaGroup.getResultsTask("results.txt");
		leaguaGroup.setResultMatchTask();
		leaguaGroup.printStandingResultTask();
		leaguaGroup.setInfo("Latest status");
	}
	
}
