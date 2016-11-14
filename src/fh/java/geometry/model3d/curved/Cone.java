package fh.java.geometry.model3d.curved;

/**
 * Created by Lukas on 13.11.2016.
 */
public class Cone extends CurvedShape{
    private double radius;
    private double height;

    public Cone(int x, int y, int z, double radius, double height){
        this.x=x;
        this.y=y;
        this.z=z;
        this.radius=radius;
        this.height=height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double calculateVolume() {
        return 1/3*Math.PI*radius*radius*height;
    }

    @Override
    public double calculateSurfaceArea() {
        return Math.PI*radius*(radius+(Math.sqrt(radius*radius+height*height)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cone cone = (Cone) o;

        if (Double.compare(cone.radius, radius) != 0) return false;
        return Double.compare(cone.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cone{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", volume=").append(calculateVolume());
        sb.append(", surfaceArea=").append(calculateSurfaceArea());

        sb.append('}');
        return sb.toString();

    }
}
