package com.company;

public class Main {

    public static void main(String[] args) {
        Box boxOne = new Box(11, 12, 13);
        boxOne.printVolume();

        Box boxTwo = new Box(67, 99, 15);
        boxTwo.printVolume();

        Box boxThree = new Box(54,62,686);
        boxThree.printVolume();

        Box boxFour = new Box(367, 16,38);
        boxFour.printVolume();

        Box boxFive = new Box(78,732,99);
        boxFive.printVolume();

        Box boxSix = new Box(1, 17, 5, "purple", "steel");
        boxSix.setWidth(0);
        boxSix.printVolume();
    }
}