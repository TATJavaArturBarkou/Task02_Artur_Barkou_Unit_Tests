package com.epam.training.tsylko.andrei.excercise3;


class Triangle implements Shape {

    private double sizeA;
    private double sizeB;

    public Triangle(double sizeA, double sizeB) {
        super();
        this.sizeA = sizeA;
        this.sizeB = sizeB;

    }

    public double getSizeA() {
        return sizeA;
    }

    public double getSizeB() {
        return sizeB;
    }

    @Override
    public double getArea() {
        return 0.5 * sizeA * sizeB;
    }

    @Override
    public double getPerimeter() {

        return Math.sqrt(Math.pow(sizeA, 2) + Math.pow(sizeB, 2)) + sizeA + sizeB;
    }

}