package by.jrr.circle.service;

import by.jrr.circle.bean.Circle;

public class CircleService {
    Circle circle = new Circle();



    public double calculateArea() {

        return (circle.getR()*circle.getR()) *3.14;
    }
}
