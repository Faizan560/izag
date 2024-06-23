package first;

public class Area {
	private int length,breath;

	
	public void setDim(int length,int breath) {
		this.length = length;
		this.breath = breath;
	}
	
	public int getArea() {
		return length * breath;
	}

	
}