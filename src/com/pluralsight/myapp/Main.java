package com.pluralsight.myapp;
import com.pluralsight.calcengine.*;

public class Main {

    public static void main(String[] args) {

        String[] statements = {
                "add 25.0 92.0",
                "power 5.0 2.0"
        };

        DinamicHelper helper = new DinamicHelper(new MathProcessing[]{
                new Adder(),
                new PoverOf()
        });

        for (String statement : statements) {
            String output = helper.process(statement);
            System.out.println(output);

        }

    }

       /* static void useCalculateHelper() {
            String[] statements = {
                    "add 1.0", // incorrect number of values
                    "add xx 25.0", // non-numeric data
                    "addX 0.0 0.0", //  invalis command
                    "divide 100.0 50.0",
                    "add 25.0 92.0",
                    "substact 225.0 17.0",
                    "multiply 11.0 3.0"
            };

        }

        /*CalculateHelper helper = new CalculateHelper();
        for(String statement : statements) {
            try {
                helper.proccess(statement);
                System.out.println(helper);
            } catch (InvalidStatementExeption e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println("Original exeption: " + e.getCause().getMessage());
            }

        }
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d );
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);


            for (MathEquation equation : equations) {
                equation.execute();
                System.out.print("The result is ");
                System.out.println(equation.getResult());
            }

        System.out.println();
        System.out.println("Using overloade");
        System.out.println();

        double leftDouble = 9.0d;
        double rightVal = 4.0d;

        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightVal);
        System.out.println("result is " + equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.println("result is " + equationOverload.getResult());

        equationOverload.execute((double) leftInt, (double) rightInt);
        System.out.println("result is " + equationOverload.getResult());

        System.out.println("Using inheritance");

        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtractor(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d)
        };

        for (CalculateBase calculator: calculators) {
            calculator.calculate();
            System.out.println("result = " + calculator.getResult());

        }

        }*/


}