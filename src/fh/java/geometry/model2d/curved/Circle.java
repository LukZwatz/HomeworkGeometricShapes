package fh.java.geometry.model2d.curved;

/**
 * Created by Lukas on 13.11.2016.
 */
public class Circle extends CurvedShape {
    private double radius;

    public Circle(int x, int y, double radius) {
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circle{");
        sb.append("radius=").append(radius);
        sb.append(", area=").append(calculateArea());
        sb.append(", perimeter=").append(calculatePerimeter());

        sb.append('}');
        return sb.toString();
    }
}
