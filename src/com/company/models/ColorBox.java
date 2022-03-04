package com.company.models;
import com.example.exceptions.ConstructorException;

public class ColorBox extends Box {
    private Color color;

    public ColorBox(int width, int height, int length, Material material, Color color) throws ConstructorException {
        super(width, height, length, material);
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorBox{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}
