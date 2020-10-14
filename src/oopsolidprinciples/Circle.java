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
public class Circle extends Shape {

    private double radius;

    @Override
    public void setData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius");
        setRadius(in.nextDouble());
        in.nextLine();
    }

    @Override
    public double calculateArea() {
        return P_I * (Math.pow(getRadius(), 2));
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return P_I * (2 * getRadius());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return Circle.class.getSimpleName();
    }
}
