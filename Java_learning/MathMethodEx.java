package Java_learning;
/**
 * input: coordinate of three points
 * output:  the length of each side of the triangle
 *          the degree of each angle (in degree mode)
 */



public class MathMethodEx {
    public static void main(String[] arg){
        int x1 = 90, x2 = 205, x3 = 310;
        int y1 = 180, y2 = 85, y3 = 240;
        double a  = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b  = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c  = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        double radA = Math.acos((a*a - b*b - c*c) / (-2 * b * c));
        double radB = Math.acos((b*b - a*a - c*c) / (-2 * a * c));
        double radC = Math.acos((c*c - b*b - a*a) / (-2 * b * a));

        double DegA = Math.toDegrees(radA);
        double DegB = Math.toDegrees(radB);
        double DegC = Math.toDegrees(radC);

        System.out.println("the length of the three sides are: " + a + ", " + b + ", " + c + " .");
        System.out.println("the length of the three angles are: " + DegA + ", " + DegB + ", " + DegC + " .");


    }
}
