package ie.murph.classifier.algorithm.model;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class Fittness {
	private static final Logger LOGGER = Logger.getLogger(Fittness.class.getSimpleName());
	private Map<String, Integer> organinizedMapValueFitness;

	public static int[] getRandomNumberIntegers(int limit, int min, int max) {
		return new Random().ints(limit, min, max).toArray();
	}

	public void createOrganisedMapWithFitness() {
		// Maps always order according to the key, so I had to use a comparator
		// to order the values the way I wanted instead (Best/Highest fitness
		// first in list)
		LOGGER.info("++createOrganisedMapWithFitness()\n");
		this.organinizedMapValueFitness = new TreeMap<String, Integer>();
		LOGGER.info("--createOrganisedMapWithFitness()\n");
	}
}
