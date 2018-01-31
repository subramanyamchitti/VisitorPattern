package com.schitti.projects;

public final class Circle implements IShape {

    public Circle(double radius) {
        this.radius = radius;
    }

    public <T> T accept(IShapeVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("Circle{%s}", radius);
    }

    private double radius;
}

