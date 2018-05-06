package pet;
import pet.obj.LeagueGroup;

// TODO: Auto-generated Javadoc
/**
 * The Class MainPerform.
 *
 * @author NGUYENCA
 */
public class MainPerform {
	
	/** The leagua group. */
	static LeagueGroup leaguaGroup = null;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String... args) {
		leaguaGroup = new LeagueGroup();
		leaguaGroup.getClubsTask("clubs.txt");
		leaguaGroup.getResultsTask("results.txt");
		leaguaGroup.setResultMatchTask();
		leaguaGroup.printStandingResultTask();
		leaguaGroup.setInfo("Latest status");
	}
	
}
