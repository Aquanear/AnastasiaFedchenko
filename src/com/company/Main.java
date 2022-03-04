package com.company;
import com.company.models.Box;
import com.company.models.Color;
import com.company.models.ColorBox;
import com.company.models.Material;
import com.company.stack.exceptions.EmptyStackException;
import com.company.stack.implemantation.Warehouse;
import com.company.stack.interfaces.Stack;
import com.example.exceptions.ConstructorException;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Warehouse(10);
        try {
            stack.pop();

        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
        try {
            Box boxOne = new Box(11, 12, 13);
            System.out.print("Volume = " + boxOne.getVolume() + ";\n");
            String s = boxOne.toString();
            System.out.println(s);

            Box boxTwo = new Box(67, 99, 15);
            System.out.print("Volume = " + boxTwo.getVolume() + ";\n");

            Box boxThree = new Box(54, 62, 686);
            System.out.print("Volume = " + boxThree.getVolume() + ";\n");

            Box boxFour = new Box(367, 16, 38);
            System.out.print("Volume = " + boxFour.getVolume() + ";\n");

            Box boxFive = new Box(1, 732, 99);
            System.out.print("Volume = " + boxFive.getVolume() + ";\n");

            Box boxSix = new Box(3, 17, 5, Material.ROCK);
            boxSix.setWidth(2);
            System.out.println(boxSix);
            System.out.print("Volume = " + boxSix.getVolume() + ";\n");

            Box colorBoxOne = new ColorBox(3, 4, 5, Material.CERAMICS, Color.GREEN);
            colorBoxOne.setHeight(5);
            System.out.println(colorBoxOne);
            System.out.print("Volume = " + colorBoxOne.getVolume() + ";\n");

            Box colorBoxTwo = new ColorBox(17, 23, 11, Material.CARDBOARD, Color.BLACK);
            System.out.println(colorBoxTwo);
            System.out.print("Volume = " + colorBoxTwo.getVolume() + ";\n");

            stack.push(boxOne);
            stack.push(boxTwo);
            stack.push(boxThree);
            stack.push(boxFour);
            stack.push(boxFive);
            stack.push(boxSix);
            stack.push(colorBoxOne);
            stack.push(colorBoxTwo);

            System.out.println(stack);

            stack.pop();
            stack.pop();

            System.out.println(stack);

        } catch (ConstructorException e) {
            System.out.println(e.getMessage());
        }
    }
}