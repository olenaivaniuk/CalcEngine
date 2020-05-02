package com.pluralsight.calcengine;

public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char SYBSTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';
    private MathCommand command;
    double leftVal;
    double rightVal;
    double result;

    public void proccess(String statement) throws InvalidStatementExeption {
        //add 1.0 2.0
        String[] parts = statement.split(" ");
        if(parts.length != 3)
            throw new InvalidStatementExeption("Incorrect number of fields", statement);

        String commendString = parts[0];
        try {
            leftVal = Double.parseDouble(parts[1]);
            rightVal = Double.parseDouble(parts[2]);
        }
        catch (NumberFormatException e) {
            throw  new InvalidStatementExeption("Non-numeric data", statement, e);
            }


        setCommadFromString(commendString);
        if(command == null)
            throw new InvalidStatementExeption("Inwalid Command", statement);

        CalculateBase calculator = null;
        switch (command) {
            case Add: calculator = new Adder(leftVal, rightVal);
            break;
            case Divide: calculator = new Divider(leftVal, rightVal);
            break;
            case Multiply: calculator = new Multiplier(leftVal, rightVal);
            break;
            case Substract: calculator = new Subtractor(leftVal, rightVal);
            break;
        }

        calculator.calculate();
        result = calculator.getResult();

    }



    private void setCommadFromString(String commandString) {
        //add  - > MathCommand.add
        if (commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;
        else if(commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;
        else if(commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else if(commandString.equalsIgnoreCase(MathCommand.Substract.toString()))
            command =MathCommand.Substract;

    }

@Override
    public String toString() {
        // 1.0 + 2.0 = 3.0
    char symbol = ' ';
    switch (command) {
        case Add:   symbol = ADD_SYMBOL;
            break;
        case Substract: symbol = SYBSTRACT_SYMBOL;
        break;
        case Divide: symbol = DIVIDE_SYMBOL;
        break;
        case Multiply: symbol = MULTIPLY_SYMBOL;
        break;
    }
    StringBuilder sb = new StringBuilder(20);
    sb.append(leftVal);
    sb.append(' ');
    sb.append(symbol);
    sb.append(' ');
    sb.append(rightVal);
    sb.append(' ');
    sb.append('=');
    sb.append(result);
    return sb.toString();

}

}
