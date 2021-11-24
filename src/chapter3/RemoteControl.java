package chapter3;

// abstract class => interface
public interface RemoteControl {
	public static final int MAX_VOLUME = 100;
	public static final int MIN_VOLUME = 0;
	// public abstract => 생략
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음으로 변경");
		} else {
			System.out.println("음소거 해제");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
