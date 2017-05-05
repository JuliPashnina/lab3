
package lab3;

import lab3.Point;

public class BrokenLine {
	private Point[] brokenLine;
	
	BrokenLine(){
            double from=0;
            double to=0;
            for (int i=0; i<3;i++){
                brokenLine[i]=new Point(from,to);
                from=Math.random();
                to=Math.random();
            }
        }
    
	BrokenLine(int cnt){
            double from=0;
            double to=0;
            for (int i=0; i<cnt;i++){
                brokenLine[i]=new Point(from,to);
                from=Math.random();
                to=Math.random();
            }
        }
        
        void addPoint (Point p){
            brokenLine[brokenLine.length+1]=p;
        }
        
        Point getPoint(int ind){
            return brokenLine[ind];
        }
}
