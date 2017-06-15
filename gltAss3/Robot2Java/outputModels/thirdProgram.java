

class thirdProgram extends RobotFrame {

	protected void perform() {
		
		if (isMark() && !isFull() || heading(Direction.north)) {
			if (isWall()) {
				addWall(13, 25);
			} else {
				addMark();
			}
			for (int i = 0; i < 5; i++) {
				moveRobot();
				while(isWall()) {
					addMark(24, 323);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		thirdProgram o = new thirdProgram();
		o.initializeComponents();
		o.run();
	}	
}
