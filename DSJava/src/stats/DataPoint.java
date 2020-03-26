package stats;

public class DataPoint {
	private double number;
	private boolean valid; // true = good data, false = trash

	DataPoint(String string) {
		if ((string == null)) {
			setNumber(Double.valueOf("0"));
			setValid(false);
		} else {
			try {
				setNumber(Double.parseDouble(string));
				setValid(true);
			} catch (NumberFormatException exception) {
				setNumber(Double.valueOf("0"));
				setValid(false);
			}
		}
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

}
