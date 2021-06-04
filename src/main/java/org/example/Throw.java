package org.example;

public class Throw {

    private double x;
    private double y;
    private boolean successful;

    public Throw(double x, double y, boolean successful) {
        this.x = x;
        this.y = y;
        this.successful = successful;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }


}
