
package lab3;


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

	boolean compareXY (Point x,Point y){
		if (x.getX()==y.getX() && x.getY()==y.getY()) return true;
		return false;
	}

 	double getDistance (Point p){
		return Math.sqrt(p.getX()*p.getX()+p.getY()*p.getY());
	}

	double getDistance (Point p,Point pFrom){
		double x=Math.abs(p.getX()-pFrom.getX());
		double y=Math.abs(p.getY()-pFrom.getY());
		return Math.sqrt(x*x+y*y);
	}
}