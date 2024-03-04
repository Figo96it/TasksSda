package org.example.circle;

//Exercise 8
public class Parcel {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private Boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public float getWeight() {
        return weight;
    }

    public Boolean isExpress() {
        return isExpress;
    }
}
