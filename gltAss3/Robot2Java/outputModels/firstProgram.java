

class firstProgram extends RobotFrame {

	protected void perform() {
		while(isFull()) {
			for (int ii = 0; ii < 4; ii++) {
				turnLeft();
			}
			if (isWall()) {
				trace("oh oh");
			}	
			if (heading(Direction.south)) {
				addMark();
			} else {
				removeMark();
			}
		}
	}
	
	public static void main(String[] args) {
		firstProgram o = new firstProgram();
		o.initializeComponents();
		o.run();
	}	
}
