package com.schitti.projects;

public final class Triangle implements IShape {

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public <T> T accept(IShapeVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("Triangle{%s, %s}", base, height);
    }

    private double base, height;
}
