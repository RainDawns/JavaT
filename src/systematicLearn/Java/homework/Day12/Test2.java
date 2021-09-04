package systematicLearn.Java.homework.Day12;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/11 17:06<br/>
 *
 * @author lnh<br />
 */
public class Test2 {
    public static void main(String[] args) {
        Circle c1=new Circle(5.8);
        Circle c2=new Circle(5.9);
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
class GeometricObject{

}
class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    public String toString() {
        return new String("radius="+radius);
    }
}
