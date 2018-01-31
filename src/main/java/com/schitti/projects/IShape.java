package com.schitti.projects;

public interface IShape {
    <T> T accept(IShapeVisitor<T> visitor);
}
