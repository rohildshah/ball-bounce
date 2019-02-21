import processing.core.PApplet;

public class Main extends PApplet{
	
	Ball b1;
	
	public static void main(String[] args) {
		PApplet.main("Main");
	}

	public void settings() {
		size(500,500);
	}
	

	public void setup() {
		b1 = new Ball(this, 250, 200);
	}


	public void draw() {
		background(255);

		b1.display();
		b1.move();
	}
}