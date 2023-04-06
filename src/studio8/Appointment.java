package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
//	private String event;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
//		this.event = event;
	}
	
	public String toString() {
		String s = "";
		s = date.toString() + " " +  time.toString();
//		s = date + " "+ time;
		return s;
	}
	

	public static void main(String[] args) {
		HashSet<Appointment> set = new HashSet<Appointment>();
		Date date1 = new Date(4,6,2023);
		Date date2 = new Date(4,9,2023);
		Time time1 = new Time(12, 18);
		Time time2 = new Time(13, 24);
		
		Appointment ap1 = new Appointment(date1, time1);
		Appointment ap2 = new Appointment(date2, time2);
		set.add(ap1);
		set.add(ap2);
		System.out.println(set);
		
		
		
//		LinkedList<Appointment> list = new LinkedList<Appointment>();
//		list.add(ap1);
//		list.add(ap2);
//		System.out.println(list);

	}



	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}




}
