package com.pluralsight.calcengine;

public class InvalidStatementExeption extends Exception{
    public InvalidStatementExeption(String reason, String statement) {
        super(reason + ": " + statement);

    }

    public InvalidStatementExeption(String reason, String statement, Throwable cause) {
        super(reason + ": " + statement, cause);

    }
}
