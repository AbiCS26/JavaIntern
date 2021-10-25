package p1;

public class Event {
	private String names;
	private String email;
	private long eventTime;
	private long duration;
	private int ID;
	private long createdTime;

	String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getEventTime() {
		return eventTime;
	}

	public void setEventTime(long eventTime) {
		this.eventTime = eventTime;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}

	public static Event createEvent(String names, String email, long eventTime, long duration, int ID,
			long createdTime) {
		Event event = new Event();
		event.setNames(names);
		event.setEmail(email);
		event.setEventTime(eventTime);
		event.setDuration(duration);
		event.setID(ID);
		event.setCreatedTime(createdTime);
		return event;
	}

	public static void main(String args[]) {
		Event event1 = createEvent("Abi", "abc", 2000, 3000, 1, 40000);
		System.out.println(event1.getEmail());
	}
}
