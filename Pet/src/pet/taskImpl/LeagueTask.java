package pet.taskImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pet.obj.FootballClub;
import pet.obj.StandingData;
import pet.task.Task;
import pet.utils.Constants;

// TODO: Auto-generated Javadoc
/**
 * The Class LeagueTask.
 *
 * @author NGUYENCA
 */
public class LeagueTask implements Task {

	/** The pattern. */
	Pattern pattern = Pattern.compile("([a-zA-Z ]+)(\\d):(\\d)\\s+([a-zA-Z ]+)");
	
	/** The matcher. */
	Matcher matcher = null;
	
	/** The stand. */
	StandingData stand = null;

	/* (non-Javadoc)
	 * @see pet.task.Task#task(pet.obj.FootballClub, java.util.List)
	 */
	@Override
	public StandingData task(FootballClub club, List<String> rs) {
		stand = new StandingData();
		int match = 0;
		stand.setClub(club.getClubName());
		for (String strRs : rs) {
			if (strRs.contains(club.getClubName())) {
				matcher = pattern.matcher(strRs);
				stand.setMatchPlayer(++match);
				populateStadingData(matcher, club.getClubName());
			}
		}
		return stand;

	}

	/* (non-Javadoc)
	 * @see pet.task.Task#printStandingResult(java.util.List)
	 */
	@Override
	public void printStandingResult(List<FootballClub> clubs) {
		String fileName = "standing.txt";

		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			String headerWithRank = String.format("%-5s %-10s", "RANK", Constants.HEADER);
			bufferedWriter.write(headerWithRank);
			bufferedWriter.newLine();
			String line = null;
			int rank = 0;
			try {
				for (FootballClub club : clubs) {
					rank++;
					line = String.format("%-5s %-10s", rank, club.getStandingData().standardString());
					bufferedWriter.write(line);
					bufferedWriter.newLine();
				}
			} finally {
				bufferedWriter.close();
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/* (non-Javadoc)
	 * @see pet.task.Task#getCLubsFromFile(java.lang.String)
	 */
	@Override
	public List<FootballClub> getCLubsFromFile(String fileName) {
		List<FootballClub> clubs = new ArrayList<FootballClub>();
		String line = null;
		FootballClub foolBallClub = null;
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buff = new BufferedReader(fileReader);
			try {
				while ((line = buff.readLine()) != null) {
					foolBallClub = new FootballClub(line);
					clubs.add(foolBallClub);
				}

			} finally {
				buff.close();
			}

		} catch (Exception e) {
			System.out.println(e);

		}
		return clubs;

	}

	/* (non-Javadoc)
	 * @see pet.task.Task#getResultFromFile(java.lang.String)
	 */
	@Override
	public List<String> getResultFromFile(String fileName) {
		List<String> results = new ArrayList<String>();
		String line = null;
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buff = new BufferedReader(fileReader);
			try {
				while ((line = buff.readLine()) != null) {
					if (!line.isEmpty() && !line.startsWith("Matchday")) {
						results.add(line);
					}
				}

			} finally {
				buff.close();
			}

		} catch (Exception e) {
			System.out.println(e);

		}

		return results;
	}

	/**
	 * Populate stading data.
	 *
	 * @param matcher the matcher
	 * @param clubName the club name
	 */
	void populateStadingData(Matcher matcher, String clubName) {
		int scoreHome = 0;
		int scoreGuest = 0;
		while (matcher.find()) {
			if (matcher.group(1).contains(clubName)) {
				scoreHome = Integer.parseInt(matcher.group(2));
				scoreGuest = Integer.parseInt(matcher.group(3));
			} else {
				scoreHome = Integer.parseInt(matcher.group(3));
				scoreGuest = Integer.parseInt(matcher.group(2));
			}
			if (scoreHome > scoreGuest) {
				stand.setWin(stand.getWin() + 1);

			} else if (scoreHome == scoreGuest) {
				stand.setDraws(stand.getDraws() + 1);

			} else {
				stand.setLosses(stand.getLosses() + 1);
			}
			stand.setGoalFor(stand.getGoalFor() + scoreHome);
			stand.setGoalAgainst(stand.getGoalAgainst() + scoreGuest);
		}

	}

}
