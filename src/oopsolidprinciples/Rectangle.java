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

import java.util.Scanner;

/**
 *
 * @author Aviator
 */
public class Rectangle extends Shape {

    private double length, width, height;

    @Override
    public void setData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        setHeight(in.nextDouble());
        in.nextLine();

        System.out.println("Enter Width");
        setWidth(in.nextDouble());
        in.nextLine();

        System.out.println("Enter height");
        setHeight(in.nextDouble());
        in.nextLine();
    }

    @Override
    public double calculateArea() {
        return getLength() * getWidth();
    }

    @Override
    public double calculateVolume() {
        return getLength() * getWidth() * getHeight();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (getLength() + getWidth());
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return Rectangle.class.getSimpleName();
    }

}
