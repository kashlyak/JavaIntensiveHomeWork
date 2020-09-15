package by.jrr.circle.service;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleServiceTest {

    @Test
    public void calculateArea() {

        CircleService circleService = new CircleService();
        circleService.circle.setR(5);
        double expected = 78.5;
        double actual = circleService.calculateArea();

        assertEquals(expected,actual,1);

    }
}