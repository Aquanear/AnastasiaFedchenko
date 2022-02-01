package com.company;

public class Box {
    private int width;
    private int height;
    private int length;
    private String colour;
    private String material;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(int width, int height, int length, String colour, String material) {
        this(width, height, length);
        this.colour = colour;
        this.material = material;
    }

    void printVolume() {
        System.out.println("Volume = " + width * height * length + ".");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Error. Only positive numbers.");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Error. Only positive numbers.");
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Error. Only positive numbers.");
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
