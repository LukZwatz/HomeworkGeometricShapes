package fh.java.geometry.model2d.quadrilateral;

/**
 * Created by Lukas on 13.11.2016.
 */
public class Parallelogram extends QuadrangularShape{
    private double sideA;
    private double sideB;
    private double alpha;

    public Parallelogram(double sideA, double sideB, double alpha){
        this.sideA=sideA;
        this.sideB=sideB;
        this.alpha=alpha;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }


    @Override
    public double calculateArea() {
        return sideA*(sideB*Math.cos(Math.toRadians(alpha)));
    }

    @Override
    public double calculatePerimeter() {
        return 2*sideA+2*sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Parallelogram that = (Parallelogram) o;

        if (Double.compare(that.sideA, sideA) != 0) return false;
        if (Double.compare(that.sideB, sideB) != 0) return false;
        return Double.compare(that.alpha, alpha) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(alpha);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Parallelogram{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", Alpha=").append(alpha);
        sb.append(", area=").append(calculateArea());
        sb.append(", perimeter=").append(calculatePerimeter());

        sb.append('}');
        return sb.toString();

    }
}
