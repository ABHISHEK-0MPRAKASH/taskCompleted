package com.java.professsional.common;

public class Result {
    private Object expected;
    private Object actual;

    private Object status;


    public Object getExpected() {
        return expected;
    }

    public void setExpected(Object expected) {
        this.expected = expected;
    }

    public Object getActual() {
        return actual;
    }

    public void setActual(Object actual) {
        this.actual = actual;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Expected=" + expected + ", Actual=" + actual + " , Result="+expected.equals(actual) ;
    }
}
