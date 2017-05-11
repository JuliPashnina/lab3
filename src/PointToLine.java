

public class PointToLine {
   
      
    public static void main(String[] args){
        BrokenLine line=new BrokenLine();
        boolean isX=true;
        double x=0,y=0;
        for (String num:args){
            if (isX) {
                x=Double.valueOf(num);
                isX=false;
            }
            else {
                y=Double.valueOf(num);
                isX=true;
            }
            if (isX){
                line.addPoint(new Point(x,y));
            }            
        }
        if (isX){
            int cnt=line.getLength();
            for (int i=0;i<cnt-1;i++){
                System.out.println(line.getLengthPart(i, i+1));
            }
            System.out.println(line.stringLine());
        }
        else{
            System.out.println("Последняя точка не имеет второй координаты.");
        }
        
        //part 2
        float c = 13.8f;
        while(c==c+1){
            System.out.println(c);
        }
        
        float nan = 0f/0f;
        float infinity = 3.0f/0f;
        
        System.out.println(nan);
        System.out.println(infinity);
        
        float t = 3.3f;
        float t1 = 9.9f;
        float t2 = 3f;
        
        if (t==t1/t2) System.out.println("true");
        else System.out.println("false");
        
        float f1 = 0.0f/1.f;
        float f2 = 0.0f/-1.0f;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(Float.floatToIntBits(f1)==Float.floatToIntBits(f2));
    }
}
