package pet.utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import pet.obj.FootballClub;

// TODO: Auto-generated Javadoc
/**
 * The Class FootballClubChainedComparator.
 *
 * @author NGUYENCA
 */
public class FootballClubChainedComparator implements Comparator<FootballClub> {

	/** The list comparators. */
	private List<Comparator<FootballClub>> listComparators;

	/**
	 * Instantiates a new football club chained comparator.
	 *
	 * @param comparators the comparators
	 */
	@SafeVarargs
	public FootballClubChainedComparator(Comparator<FootballClub>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
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
