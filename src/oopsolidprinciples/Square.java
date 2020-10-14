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
public class Square extends Rectangle {

    @Override
    public void setData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        setHeight(in.nextDouble());
        in.nextLine();

        setWidth(getLength());
        setHeight(getLength());
    }

    @Override
    public String getShapeName() {
        return Square.class.getSimpleName();
    }

}