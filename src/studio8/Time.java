package studio8;

public class Time {
	private int hour;
	private int min;

	
	/**
	 * 
	 * @param hour: the hour
	 * @param min: the minitue
	 */
	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;

	}
	
	public String toString() {
		String s = "";
		s = hour + ":" + min;
		return s;
	}

	public static void main(String[] args) {
		Time time = new Time(11, 23);
		System.out.println(time.toString());
	}

}