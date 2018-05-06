package pet.obj;
import pet.utils.Constants;

/**
 * @author NGUYENCA
 *
 */
public class FootballClub {

	String clubName = "";
	StandingData standingData;
	

	public FootballClub(String clubName) {
		this.clubName = clubName;
	}

	public FootballClub() {
		// TODO Auto-generated constructor stub
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public void print(Update update) {
		System.out.println(clubName + " gets:" + update.getInfo());
		System.out.println(Constants.HEADER);
		System.out.println(standingData.standardString());
	}

	public StandingData getStandingData() {
		return standingData;
	}

	public void setStandingData(StandingData standingData) {
		this.standingData = standingData;
	}

}
