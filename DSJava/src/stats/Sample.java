package stats;

import java.util.Random;

public class Sample {
	
	private int numberSamples;
	private int maxValue;
	private Integer[] samples;
	private Random generator;
	private static int currentSample = 0;
	
	Sample (int maximum, int numberSamples ) {
		setGenerator(new Random());
		setNumberSamples(numberSamples);
		setMaxValue(maximum);
		setSamples(new Integer[numberSamples]);
		init();
	}
	
	public int next() {
		// a safety valve in case we cycle through more values than we expected
		if ( getCurrentSample() == getMaxValue() ) {
			setCurrentSample(0);
		}
		setCurrentSample(getCurrentSample() + 1);
		return getSamples()[getCurrentSample() - 1];
	}
	
	void init() {
		for ( int count = 0; count < getNumberSamples(); count++ ) {
			getSamples()[count] = getGenerator().nextInt(getMaxValue());
		}
	}

	
	
	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public static int getCurrentSample() {
		return currentSample;
	}

	public static void setCurrentSample(int currentSample) {
		Sample.currentSample = currentSample;
	}

	public Integer[] getSamples() {
		return samples;
	}

	public void setSamples(Integer[] samples) {
		this.samples = samples;
	}

	public Random getGenerator() {
		return generator;
	}

	public void setGenerator(Random generator) {
		this.generator = generator;
	}

	public int getNumberSamples() {
		return numberSamples;
	}

	public void setNumberSamples(int numberSamples) {
		this.numberSamples = numberSamples;
	}

	
}
