package fh.java.geometry;

import fh.java.geometry.model2d.GeometricShape;
import fh.java.geometry.model2d.curved.Circle;
import fh.java.geometry.model2d.quadrilateral.Parallelogram;
import fh.java.geometry.model2d.quadrilateral.Square;
import fh.java.geometry.model3d.curved.Cone;
import fh.java.geometry.model3d.curved.Sphere;
import fh.java.geometry.model3d.quadrilateral.Cube;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukas on 13.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Main main= new Main();

        main.doIt();
    }

    private void doIt() {
        List<fh.java.geometry.GeometricShape> shapeList = new ArrayList<>();
        fillList(shapeList);

        List<GeometricShape> list2d = new ArrayList<>();
        List<fh.java.geometry.model3d.GeometricShape> list3d = new ArrayList<>();

        for (fh.java.geometry.GeometricShape geometricShape : shapeList){
            if (geometricShape instanceof GeometricShape){
                list2d.add((GeometricShape)geometricShape);
            }
            if (geometricShape instanceof fh.java.geometry.model3d.GeometricShape){
                list3d.add((fh.java.geometry.model3d.GeometricShape) geometricShape);

            }

        }
        printList2d(list2d);
        printList3d(list3d);
        sumList2d(list2d);
        sumList3d(list3d);



    }

    private void printList3d(List<fh.java.geometry.model3d.GeometricShape> list3d) {
        System.out.println("---------ShapeList3d-------");
        list3d.stream().forEach(System.out::println);
    }

    private void printList2d(List<GeometricShape> list2d) {
        System.out.println("---------ShapeList2d-------");
        list2d.stream().forEach(System.out::println);
    }
    double areaSum=0;
    double perSum=0;
    double volSum=0;
    double surfSum=0;

    private void sumList3d(List<fh.java.geometry.model3d.GeometricShape> list3d) {
        System.out.println("-------------------");
        for(fh.java.geometry.model3d.GeometricShape shape : list3d){
            volSum=volSum+shape.calculateVolume();
            surfSum=surfSum+shape.calculateSurfaceArea();
        }
        System.out.println("Sum of all Volume: "+volSum);
        System.out.println("Sum of all Surface: "+surfSum);

    }



    private void sumList2d(List<GeometricShape> list2d) {
        System.out.println("-------------------");
        for(GeometricShape shape : list2d){
            areaSum = areaSum+shape.calculateArea();
            perSum = perSum+shape.calculatePerimeter();

        }
        System.out.println("Sum of all Areas: "+areaSum);
        System.out.println("Sum of all Perimeter: "+perSum);


    }


    public void fillList(List<fh.java.geometry.GeometricShape> shapeList) {
        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(2,3,3.0));
        shapeList.add(new Circle(7,6,3.0));
        
        shapeList.add(new Parallelogram(3,4,45.0));
        shapeList.add(new Parallelogram(8,2,60.0));
        
        shapeList.add(new Square(5,3,10.0));
        shapeList.add(new Square(8,2,60.0));
        
        shapeList.add(new Sphere(4,5,2,10.0));
        shapeList.add(new Sphere(6,10,2,5.0));
        
        shapeList.add(new Cone(5,3,21,5.0,10.0));
        shapeList.add(new Cone(5,6,10,4.0,10.0));
        
        shapeList.add(new Cube(4,5,6,1));
        shapeList.add(new Cube(4,9,6,6));
                
                
    }


}
