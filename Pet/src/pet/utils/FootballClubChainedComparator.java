package pet.utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import pet.obj.FootballClub;

/**
 * @author NGUYENCA
 *
 */
public class FootballClubChainedComparator implements Comparator<FootballClub> {

	private List<Comparator<FootballClub>> listComparators;

	@SafeVarargs
	public FootballClubChainedComparator(Comparator<FootballClub>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}

	@Override
	public int compare(FootballClub o1, FootballClub o2) {
		for (Comparator<FootballClub> comparator : listComparators) {
			int result = comparator.compare(o1, o2);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}

}
