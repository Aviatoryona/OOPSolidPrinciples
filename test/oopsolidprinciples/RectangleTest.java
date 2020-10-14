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

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Aviator
 */
public class RectangleTest {

    public RectangleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setData method, of class Rectangle.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Rectangle instance = new Rectangle();
        instance.setData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateArea method, of class Rectangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Rectangle instance = new Rectangle();
        double expResult = 0.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateVolume method, of class Rectangle.
     */
    @Test
    public void testCalculateVolume() {
        System.out.println("calculateVolume");
        Rectangle instance = new Rectangle();
        double expResult = 0.0;
        double result = instance.calculateVolume();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePerimeter method, of class Rectangle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Rectangle instance = new Rectangle();
        double expResult = 0.0;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
