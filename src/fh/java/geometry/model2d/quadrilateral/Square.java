package fh.java.geometry.model2d.quadrilateral;

/**
 * Created by Lukas on 13.11.2016.
 */
public class Square extends QuadrangularShape {
    private double sideA;

    public Square(int x,int y,double sideA){
        this.x=x;
        this.y=y;
        this.sideA=sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }


    @Override
    public double calculateArea() {
        return sideA*sideA;
    }

    @Override
    public double calculatePerimeter() {
        return 4*sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Square square = (Square) o;

        return Double.compare(square.sideA, sideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Square{");
        sb.append("sideA=").append(sideA);
        sb.append(", area=").append(calculateArea());
        sb.append(", perimeter=").append(calculatePerimeter());

        sb.append('}');
        return sb.toString();

    }
}