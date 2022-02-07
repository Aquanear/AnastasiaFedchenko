package com.company;

public class Main {

    public static void main(String[] args) {
        Box boxOne = new Box(11, 12, 13);
        System.out.print("Volume = " + boxOne.getVolume() + ";\n");

        Box boxTwo = new Box(67, 99, 15);
        System.out.print("Volume = " + boxTwo.getVolume() + ";\n");

        Box boxThree = new Box(54,62,686);
        System.out.print("Volume = " + boxThree.getVolume() + ";\n");

        Box boxFour = new Box(367, 16,38);
        System.out.print("Volume = " + boxFour.getVolume() + ";\n");

        Box boxFive = new Box(78,732,99);
        System.out.print("Volume = " + boxFive.getVolume() + ";\n");

        Box boxSix = new Box(1, 17, 5, Material.ROCK);
        boxSix.setWidth(2);
        System.out.print("Volume = " + boxSix.getVolume() + ";\n");
        System.out.print("Material - " + boxSix.getMaterial() + ";\n");

        ColorBox colorBoxOne = new ColorBox(3, 4, 5, Material.CERAMICS, Color.GREEN);
        colorBoxOne.setHeight(5);
        System.out.print("Volume = " + colorBoxOne.getVolume() + ";\n");
        System.out.print("Color - " + colorBoxOne.getColor() + ";\n");

        ColorBox colorBoxTwo = new ColorBox(67,23,11,Material.CARDBOARD, Color.BLACK);
        colorBoxTwo.setColor(Color.WHITE);
        System.out.print("Color - " + colorBoxTwo.getColor() + ";\n");
    }
}