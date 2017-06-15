

class circles extends RobotFrame {

	protected void perform() {
		while(!heading(Direction.south)) {
			turnLeft();
			minipause();
		}
		while(!isWall()) {
			moveRobot();
			minipause();
		}
		for (int i = 0; i < 10; i++) {
			turnLeft();
			minipause();
			for (int ii = 0; ii < 2; ii++) {
				if (!isWall()) {
					moveRobot();
					minipause();
				}		
			}
			addWall(5, 5);
			pause();
			addMark(4, 4);
			pause();
		}
	}
	
	public static void main(String[] args) {
		circles o = new circles();
		o.initializeComponents();
		o.run();
	}	
}
