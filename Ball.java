import processing.core.PApplet;

class Ball {
	private float x;
	private float y;
	PApplet canvas;
	private float speed = 0;
	
	
	public Ball(PApplet np, float nx, float ny) {
		x = nx;
		y = ny;
		canvas = np;
	}
		
		
	public void display() {
		canvas.ellipse(x, y, 30, 30);
	}

		
	public void move() {
		if(canvas.mousePressed) {
			y = y + speed;
			speed++;
			if(y > canvas.mouseY) {
				speed = (int) (-(speed*0.64));
			}
			if(y-canvas.mouseY > 10) {
				y = canvas.mouseY;
			}
			System.out.println(speed);
		}
	}
}