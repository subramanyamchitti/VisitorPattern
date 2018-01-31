package com.schitti.projects;

public final class Rectangle implements IShape {
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public <T> T accept(IShapeVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle{%s, %s}", width, height);
    }

    private double width;
    private double height;
}
