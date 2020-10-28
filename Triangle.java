public class Triangle{
  private Point v1, v2, v3;

  public  Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1.x = x1;
    v1.y = y1;
    v2.x = x2;
    v2.y = y2;
    v3.x = x3;
    v3.y = y3;
  }
}
