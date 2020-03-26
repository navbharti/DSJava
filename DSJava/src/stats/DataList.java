package stats;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DataList {

	// mean value if we throw away invalid datapoints
	private double nipMean;

	// mean value if we set invalid datapoints to 0 and count them valid
	private double nilMean;

	private int nipCount; // Count of datapoints that are valid

	private int countInvalidValues; // Count of datapoints that are invalid
	// Thus, the full count of all values are
	// nipCount + countInvalidValues
	private int fullCount;

	// sum and sumSquared are unaffected by the nil or nip consideration
	private double sum;
	private double sumSquared;

	// Variance calculations when invalid datapoints are thrown away
	private double nipVariance;
	// Variance calculations when invalid datapoints are set to 0
	private double nilVariance;

	// set the number of decimal places to consider significant
	// -1 indicates assume all digits significant
	private int accuracy;

	// only calculate median and modes for valid values
	private double median;

	private ArrayList<DataPoint> list;

	private ArrayList<Double> modes;

	private Map<Double, Integer> uniqueValues;

	DataList() {
		setList(new ArrayList<DataPoint>());
		setModes(new ArrayList<Double>());
		setUniqueValues(new HashMap<Double, Integer>());
		setNilMean(0);
		setNipMean(0);
		setNilVariance(0);
		setNipVariance(0);
		setNipCount(0);
		setSum(0);
		setSumSquared(0);
		setCountInvalidValues(0);
		setFullCount(0);
		setMedian(0);
		// default to all digits significant -- no rounding
		setAccuracy(-1);
	}

	void addPoint(String number) {
		DataPoint d = new DataPoint(number);
		// Only add valid data to the list
		if (d.isValid() == true) {
			list.add(d);
			setNipCount(list.size());
		} else {
			setCountInvalidValues(getCountInvalidValues() + 1);
		}
		setFullCount(getNipCount() + getCountInvalidValues());
		// This method dynamically calculates the mean and
		// the variance. It uses the raw score method to calculate
		// the variance.
		calculateMeanVariance(d);
	}

	void calculateMeanVariance(DataPoint d) {
		setSum(getSum() + d.getNumber());
		setNipMean(getSum() / getNipCount());
		setSumSquared(getSumSquared() + Math.pow(d.getNumber(), 2));
		setNipVariance((getSumSquared() - Math.pow(getSum(), 2) / getNipCount())
				/ getNipCount());
		setNilMean(getSum() / getFullCount());
		setNilVariance((getSumSquared() - Math.pow(getSum(), 2)
				/ getFullCount())
				/ getFullCount());
	}

	// calculating variance after the mean is known
	double calculateVariance() {
		double variance = 0.0;
		double sumSquaredDelta = 0.0;
		int elementsInArray = getList().size();

		int count = 0;

		// set median at 0 and return if no valid datapoints
		if (elementsInArray == 0) {
			return variance;
		}

		while (count < elementsInArray) {
			// We are only going to count nip median and mode
			if (getList().get(count).isValid() == true) {
				// Again, mean MUST be known at this point
				sumSquaredDelta += Math.pow(getList().get(count).getNumber()
						- getNipMean(), 2);
			}
			++count;
		}

		variance = sumSquaredDelta / count;

		return variance;

	}

	double roundData(DataPoint d) {
		if (getAccuracy() != -1) {
			BigDecimal bigDecimal = new BigDecimal(Double.toString(d
					.getNumber()));
			bigDecimal = bigDecimal.setScale(this.accuracy,
					BigDecimal.ROUND_HALF_UP);
			return bigDecimal.doubleValue();
		} else {
			return d.getNumber();
		}

	}

	void calculateMedian() {
		int elementsInArray = getList().size();
		double[] tempArray = new double[elementsInArray];
		int count = 0;

		// set median at 0 and return if no valid datapoints
		if (elementsInArray == 0) {
			setMedian(0);
			return;
		}

		while (count < elementsInArray) {
			// We are only going to count nip median and mode
			if (getList().get(count).isValid() == true) {
				tempArray[count] = roundData(getList().get(count));
			}
			++count;
		}

		Arrays.sort(tempArray);
		
		//Actually count and getNipCount are the same value at this point
		// Using getNipCount() to underscore this is a count of only valid 
		// data
		int midPoint = (int) getNipCount() / 2;
		
		// take the average of the two middle values
		// when we have an even number of valid values
		if (getNipCount() % 2 == 0) {
			setMedian((tempArray[midPoint] + tempArray[midPoint - 1]) / 2);
		} else {
			setMedian(tempArray[midPoint]);
		}

	}

	public void tallyFrequencyModes() {
		Integer highestFrequency = 0;

		Iterator<DataPoint> iterator = getList().iterator();
		while (iterator.hasNext()) {
			DataPoint dataPoint = iterator.next();
			// Only tally data that is valid
			if (dataPoint.isValid() == true) {
				// Round data based on rounding
				double effectiveValue = roundData(dataPoint);
				Integer frequency = uniqueValues.get(effectiveValue);
				frequency = (frequency == null) ? 1 : frequency + 1;
				uniqueValues.put(effectiveValue, frequency);
				if (frequency > highestFrequency) {
					// Set the max frequency to the new max
					highestFrequency = frequency;
				}
			}
		}

		for (Double key : uniqueValues.keySet()) {
			// Important note: there can be more than one mode
			// So we are storing the modal values in an array
			if (uniqueValues.get(key) == highestFrequency) {
				modes.add(key);

			}
		}
	}

	public ArrayList<DataPoint> getList() {
		return list;
	}

	public void setList(ArrayList<DataPoint> list) {
		this.list = list;
	}

	public ArrayList<Double> getModes() {
		return modes;
	}

	public void setModes(ArrayList<Double> modes) {
		this.modes = modes;
	}

	public Map<Double, Integer> getUniqueValues() {
		return uniqueValues;
	}

	public void setUniqueValues(Map<Double, Integer> uniqueValues) {
		this.uniqueValues = uniqueValues;
	}

	public double getMedian() {
		return median;
	}

	public void setMedian(double median) {
		this.median = median;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getCountInvalidValues() {
		return countInvalidValues;
	}

	public void setCountInvalidValues(int countInvalidValues) {
		this.countInvalidValues = countInvalidValues;
	}

	public double getNilVariance() {
		return nilVariance;
	}

	public void setNilVariance(double variance) {
		this.nilVariance = variance;
	}

	public int getNipCount() {
		return nipCount;
	}

	public void setNipCount(int count) {
		this.nipCount = count;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getNipMean() {
		return nipMean;
	}

	public void setNipMean(double nipMean) {
		this.nipMean = nipMean;
	}

	public double getNilMean() {
		return nilMean;
	}

	public void setNilMean(double nilMean) {
		this.nilMean = nilMean;
	}

	public double getSumSquared() {
		return sumSquared;
	}

	public void setSumSquared(double sumSquared) {
		this.sumSquared = sumSquared;
	}

	public double getNipVariance() {
		return nipVariance;
	}

	public void setNipVariance(double nipVariance) {
		this.nipVariance = nipVariance;
	}

	public int getFullCount() {
		return fullCount;
	}

	public void setFullCount(int fullCount) {
		this.fullCount = fullCount;
	}

}
