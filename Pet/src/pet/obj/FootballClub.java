package pet.obj;
import pet.utils.Constants;

// TODO: Auto-generated Javadoc
/**
 * The Class FootballClub.
 *
 * @author NGUYENCA
 */
public class FootballClub {

	/** The club name. */
	String clubName = "";
	
	/** The standing data. */
	StandingData standingData;
	

	/**
	 * Instantiates a new football club.
	 *
	 * @param clubName the club name
	 */
	public FootballClub(String clubName) {
		this.clubName = clubName;
	}

	/**
	 * Instantiates a new football club.
	 */
	public FootballClub() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the club name.
	 *
	 * @return the club name
	 */
	public String getClubName() {
		return clubName;
	}

	/**
	 * Sets the club name.
	 *
	 * @param clubName the new club name
	 */
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	/**
	 * Prints the.
	 *
	 * @param update the update
	 */
	public void print(Update update) {
		System.out.println(clubName + " gets:" + update.getInfo());
		System.out.println(Constants.HEADER);
		System.out.println(standingData.standardString());
	}

	/**
	 * Gets the standing data.
	 *
	 * @return the standing data
	 */
	public StandingData getStandingData() {
		return standingData;
	}

	/**
	 * Sets the standing data.
	 *
	 * @param standingData the new standing data
	 */
	public void setStandingData(StandingData standingData) {
		this.standingData = standingData;
	}

}
