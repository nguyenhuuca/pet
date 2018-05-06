package pet.utils;
import java.util.Comparator;

import pet.obj.FootballClub;

/**
 * @author NGUYENCA
 *
 */
public class GoalDifComparator implements Comparator<FootballClub> {

	@Override
	public int compare(FootballClub o1, FootballClub o2) {
		return o2.getStandingData().getGoalDif() - o1.getStandingData().getGoalDif();
	}
}

