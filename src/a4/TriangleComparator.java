package a4;

import java.util.ArrayList;

public class TriangleComparator {
    ArrayList<Triangle> triangles;
    int size = 4;
    double hDimension = (Math.log(3))/(Math.log(2));

    public TriangleComparator() {

    }

    public TriangleComparator (ArrayList<Triangle> triangles) {
        this.triangles = new ArrayList<>(triangles.size());
        this.triangles.addAll(triangles);
//        this.size = triangles[0].size;
    }

    public void setTriangles(ArrayList<Triangle> triangles) {
        this.triangles = new ArrayList<>(triangles.size());
        this.triangles.addAll(triangles);
//        this.size = triangles.getFirst().size;
    }

    public double distance(){
        double maxDist = 0;
        for (Triangle triangle1 : triangles) {
            for (Triangle triangle2 : triangles) {
                for (Point point1: triangle1.corners) {
                    for (Point point2: triangle2.corners) {
                        if (pointDistance(point1, point2) > maxDist){
                            maxDist = pointDistance(point1, point2);
                        }
                    }
                }
            }
        }
        return maxDist;
    }

    public double pointDistance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.coordX - p2.coordX, 2) + Math.pow(p1.coordY - p2.coordY, 2));
    }

    public double ratio() {
        double numerator = Math.pow(distance(), hDimension);
//        System.out.println("Distance: " + distance());
//        System.out.println("Numerator: " + numerator);
        double denominator = triangles.size()/Math.pow(3, size);
//        System.out.println("Denominator: " + denominator);
        return numerator/denominator;
    }

}
