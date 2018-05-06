package pet.utils;
import java.util.Comparator;

import pet.obj.FootballClub;

// TODO: Auto-generated Javadoc
/**
 * The Class GoalForComparator.
 *
 * @author NGUYENCA
 */
public class GoalForComparator implements Comparator<FootballClub> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(FootballClub o1, FootballClub o2) {
		return o2.getStandingData().getGoalFor() - o1.getStandingData().getGoalFor();
	}
}