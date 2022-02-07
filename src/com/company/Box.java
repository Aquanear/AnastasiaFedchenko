package com.company;

public class Box {
    protected int width;
    protected int height;
    protected int length;
    protected Material material;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(int width, int height, int length, Material material) {
        this(width, height, length);
        this.material = material;
    }

    public int getVolume() {
        int volume = width * height * length;
        return volume;
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

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
