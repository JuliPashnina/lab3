



public class Point {

	private double x;
	private double y;

	Point () {
	}

	
	Point (double x,double y) {
		setX(x);
		setY(y);
	}

	void setX(double x) {
		this.x=x;
	}

	double getX() {
		return x;
	}

	void setY(double y) {
		this.y=y;
	}

	double getY() {
		return y;
	}

	void moveXY (double newX, double newY) {
		setX(newX);
		setY(newY);
	}

	String getStringXY () {
		return "("+Double.toString(getX())+","+Double.toString(getY())+")";
	}

	boolean compareXY (Point p){
		if (this.getX()==p.getX() && this.getY()==p.getY()) return true;
		return false;
	}


	double getDistance (Point p){
		double x=Math.abs(p.getX()-this.getX());
		double y=Math.abs(p.getY()-this.getY());
		return Math.sqrt(x*x+y*y);
	}
    
}
