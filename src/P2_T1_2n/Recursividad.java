package P2_T1_2n;

public class Recursividad {
    public static void main(String[] args) {
        System.out.println(result(3, 4));
    }

    public static int result(int x, int y){
        if(x==0){
            return 0;
        } else if (y==0) {
            return 1;
        }
        else {
            return (x+y) * result(x, y-1);
        }
    }

    public double result4 ( double x, int y, double z, int v) {
        double sum = x + y + z;
        if (sum > 12*v){
            return result( v , y );
        }
        else {
            if ((y < x/2) && (v-3 >= 0 && y-3 >= 0)){
                return result4( x, y-3, z, v-3);
            }
            else {
                return result( 0 , 0 );
            }
        }
    }

}
