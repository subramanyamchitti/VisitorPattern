package com.schitti.projects;

public interface IShapeVisitor<T> {
        T visit(Circle c);
        T visit(Rectangle r);
        T visit(Triangle t);
}
