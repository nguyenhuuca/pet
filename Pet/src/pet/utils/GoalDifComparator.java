package pet.utils;
import java.util.Comparator;

import pet.obj.FootballClub;

// TODO: Auto-generated Javadoc
/**
 * The Class GoalDifComparator.
 *
 * @author NGUYENCA
 */
public class GoalDifComparator implements Comparator<FootballClub> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(FootballClub o1, FootballClub o2) {
		return o2.getStandingData().getGoalDif() - o1.getStandingData().getGoalDif();
	}
}

