package de.ifgi.itsp.task4.shapes;

public class Polyline extends Shape{
    private Point[] points;
    private int numPoints;


    public Polyline(Point[] points) {
        this.points = points;
        this.numPoints = this.points.length;
    }

    public Polyline() {
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public int getNumPoints() {
        return numPoints;
    }

    public void setNumPoints(int numPoints) {
        this.numPoints = numPoints;
    }
}
