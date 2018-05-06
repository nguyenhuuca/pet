package pet.utils;
import java.util.Comparator;

import pet.obj.FootballClub;

/**
 * 
 * @author NGUYENCA
 *
 */
public class GoalForComparator implements Comparator<FootballClub> {

	@Override
	public int compare(FootballClub o1, FootballClub o2) {
		return o2.getStandingData().getGoalFor() - o1.getStandingData().getGoalFor();
	}
}