package pet.utils;
import java.util.Comparator;

import pet.obj.FootballClub;
/**
 * 
 * @author NGUYENCA
 *
 */
public class PointComparator implements Comparator<FootballClub> {

	@Override
	public int compare(FootballClub o1, FootballClub o2) {
		return o2.getStandingData().getPoint() - o1.getStandingData().getPoint();
	}

}
