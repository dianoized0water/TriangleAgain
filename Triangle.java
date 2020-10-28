public class Triangle{
  private Point v1, v2, v3;

  public  Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter(){
    double side1 = v1.distanceTo(v2);
    double side2 = v2.distanceTo(v3);
    double side3 = v3.distanceTo(v1);
    return (double) (side1 + side2 + side3);
  }

  public double getArea(){
    double semiPerimeter = (this.getPerimeter() / 2);
    double squareArea = (semiPerimeter*(semiPerimeter-v1.distanceTo(v2))*(semiPerimeter-v2.distanceTo(v3))*(semiPerimeter-v3.distanceTo(v1)));
    return (double) (Math.sqrt(squareArea));
  }

  public String classify(){
    double side1 = (Math.round(10000.0*v1.distanceTo(v2))/ 10000.0);
    double side2 = (Math.round(10000.0*v2.distanceTo(v3))/ 10000.0);
    double side3 = (Math.round(10000.0*v3.distanceTo(v1))/ 10000.0);
    if (side1==side2){
      if (side2==side3){
        return "equilateral";
      }
      else{
        return "isosceles";
      }
    }
    else{
      if (side2==side3){
        return "isoceles";
      }
      else{
        return "scalene";
      }
    }
  }

  public String toString(){
    return "v1(" + v1.getX() + ", " + v1.getY() + ") v2(" + v2.getX() + ", " + v2.getY() + ") v3(" + v3.getX()+ ", " + v3.getY() + ")";
  }

  public void setVertex(int index, Point newP){
    if (index==0){
      v1 = newP;
    }
    if (index==1){
      v2 = newP;
    }
    if (index==2){
      v3 = newP;
    }
  }
}
