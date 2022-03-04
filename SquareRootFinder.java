import java.lang.Math;
public class SquareRootFinder {
    public static double main(int a){
        double answer = Math.sqrt(a);
        double start = 1.0;
        double e = 0.0;
        boolean end = true;
        do{
            e = start*start;
            start+=0.0001;
            if(e >= answer){
                end = false;
            }
        }while(end);
        return e;
    }
}
