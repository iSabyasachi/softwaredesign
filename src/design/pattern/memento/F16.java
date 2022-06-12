package design.pattern.memento;

public class F16 {
	BlackBox blackBox;
	F16(){
		initiateBlackBox();		
	}
	
	public void initiateBlackBox() {
		this.blackBox = new BlackBox(1L, 60.5, 165F);
	}

	public BlackBox getBlackBox() {
		return blackBox;
	}
	
}
