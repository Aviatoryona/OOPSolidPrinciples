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
public class Triangle extends Shape {

    private double height, base, hypotenuse;

    @Override
    public void setData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height");
        setHeight(in.nextDouble());
        in.nextLine();

        System.out.println("Enter base");
        setBase(in.nextDouble());
        in.nextLine();

        System.out.println("Enter hypotenuse");
        setHeight(in.nextDouble());
        in.nextLine();
    }

    @Override
    public double calculateArea() {
        return (1 / 2) * getBase() * getHeight();
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    /*
    Assumes the two sides equal 0f the shape
     */
    @Override
    public double calculatePerimeter() {
        return getBase() + (getHypotenuse() * 2);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public String getShapeName() {
        return Triangle.class.getSimpleName();
    }

}
