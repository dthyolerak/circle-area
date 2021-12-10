public class Circle {
    final double PI = Math.PI;
    double Radius = 10;
    Circle(){

    }
    public  void setRadius(double Radius){
        this.Radius = Radius;
    }
    public double getRadius(){
        return Radius;
    }

    public double getArea(){
        double area = Radius*Radius*PI;
        return area;
    }
}
