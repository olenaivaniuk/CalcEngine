package com.pluralsight.calcengine;

public class Divider  extends CalculateBase{
    public Divider() {}
    public Divider(double leftVal, double righVal) {
        super(leftVal, righVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
