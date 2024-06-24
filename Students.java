package jdbc;

public class Students {
	private Integer Enroll;
	private String Name,Stream;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}
	
	public Students(int enroll, String name, String stream) {
		super();
		Enroll = enroll;
		Name = name;
		Stream = stream;
	}
	public int getEnroll() {
		return Enroll;
	}

	public void setEnroll(int enroll) {
		Enroll = enroll;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	@Override
	public String toString() {
		return "Students [Enroll=" + Enroll + ", Name=" + Name + ", Stream=" + Stream + "]";
	}
	
}
