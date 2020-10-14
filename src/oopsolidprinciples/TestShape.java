/*
 * Copyright (C) 2020 Aviator
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package oopsolidprinciples;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aviator
 */
public class TestShape {

    public static void main(String[] args) {

        /*
         Test the shape class and is children
         */
        showMenu();
    }

    static void showMenu() {
        ArrayList<Shape> shapes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT SHAPE TO TEST").append("\n").append("\n")
                .append("1").append(" ").append(new Rectangle().getShapeName()).append("\n")
                .append("2").append(" ").append(new Box().getShapeName()).append("\n")
                .append("3").append(" ").append(new Circle().getShapeName()).append("\n")
                .append("4").append(" ").append(new Cube().getShapeName()).append("\n")
                .append("5").append(" ").append(new Elipse().getShapeName()).append("\n")
                .append("6").append(" ").append(new Sphere().getShapeName()).append("\n")
                .append("7").append(" ").append(new Square().getShapeName()).append("\n")
                .append("8").append(" ").append(new Tetrahedron().getShapeName()).append("\n")
                .append("9").append(" ").append(new Triangle().getShapeName()).append("\n")
                .append("0").append(" ").append("Exit");

        System.out.println(sb.toString());
        int choice = 0;
        do {
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    Rectangle rectangle = new Rectangle();
                    rectangle.setData();
                    shapes.add(rectangle);
                    break;
                case 2:
                    Box box = new Box();
                    box.setData();
                    shapes.add(box);
                    break;
                case 3:
                    Shape circle = new Circle();
                    circle.setData();
                    shapes.add(circle);
                    break;
                case 4:
                    Shape cube = new Cube();
                    cube.setData();
                    shapes.add(cube);
                    break;
                case 5:
                    Shape elipse = new Elipse();
                    elipse.setData();
                    shapes.add(elipse);
                    break;
                case 6:
                    Shape sphere = new Sphere();
                    sphere.setData();
                    shapes.add(sphere);
                    break;
                case 7:
                    Shape square = new Square();
                    square.setData();
                    shapes.add(square);
                    break;
                case 8:
                    Shape tetrahedron = new Tetrahedron();
                    tetrahedron.setData();
                    shapes.add(tetrahedron);
                    break;
                case 9:
                    Shape triangle = new Triangle();
                    triangle.setData();
                    shapes.add(triangle);
                    break;
                default:
            }

            if (choice != 0) {
                showMenu();
            }

        } while (choice != 0);

        System.out.println("***************************************");
        shapes.forEach(shape -> {
            System.out.println(shape.toString());
        });

    }

}
