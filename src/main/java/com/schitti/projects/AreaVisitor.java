package com.schitti.projects;

import java.lang.Math;
import java.util.function.Function;

public class AreaVisitor implements IShapeVisitor<Double>, Function<IShape, Double> {

    public Double visit(Rectangle r) {
        return r.getHeight() * r.getWidth();
    }

    public Double visit(Triangle t) {
        return (0.5) * t.getBase() * t.getHeight();
    }

    public Double visit(Circle c) {
        return Math.PI * c.getRadius() * c.getRadius();
    }

    @Override
    public Double apply(IShape iShape) {
        return iShape.accept(this);
    }
}
