

class secondProgram extends RobotFrame {

	protected void perform() {
		
		if (isMark() && !isFull() || heading(Direction.south)) {
			if (isWall()) {
				removeMark();
			} else {
				addMark();
			}
			for (int i = 0; i < 5; i++) {
				moveRobot();
				while(isWall()) {
					turnLeft();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		secondProgram o = new secondProgram();
		o.initializeComponents();
		o.run();
	}	
}
