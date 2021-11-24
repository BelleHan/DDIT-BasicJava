package chapter3;

public class TimeVo {
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		}
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	}
}
