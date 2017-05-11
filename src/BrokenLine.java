

import java.util.Arrays;

public class BrokenLine {
	private Point[] brokenLine;
        private int maxInd;
	
	BrokenLine(){
            brokenLine = new Point[3];
            maxInd=0;
        }
    
	BrokenLine(int l){
            brokenLine = new Point[l];
            maxInd=0;
        }
        
        void addPoint (Point p){
            if (maxInd==brokenLine.length) addLength ();
            brokenLine[maxInd]=p;
            maxInd++;
        }
        
        Point getPoint(int ind){
            return brokenLine[ind];
        }
        
        void addLength (){
            brokenLine = Arrays.copyOf(brokenLine, 2*brokenLine.length);
        }

        double getLengthPart (int from,int to){
            return brokenLine[from].getDistance(brokenLine[to]);
        }
        
        Point[] findPoint (Point p){
            int l=brokenLine.length;
            Point[] list=new Point[l];
            int indL=0;
            for (int i=0;i<=maxInd;i++){
                if (p.compareXY(brokenLine[i])) {
                    list[indL]=brokenLine[i];
                    indL++;
                }
            }
            list = Arrays.copyOf(list, indL);   
            return list;
        }
        
        String stringLine (){
            String res=null;
            for (int i=0;i<maxInd;i++){
                if (res==null){
                    res=brokenLine[i].getStringXY();
                }
                else{
                    res+="-"+brokenLine[i].getStringXY();
                }
            }
            return res;
        }
        
        int getLength(){
            return maxInd;
        }
}
