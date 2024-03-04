package org.example.shape;

public abstract class ThreeDShape extends Shape implements Fillable {

    public abstract double calculateVolume();

    @Override
    public int fill(int amount) {
        double volume = calculateVolume();
        double percentFilled = (amount / volume) * 100;

        if (percentFilled > 100) {
            return 0;
        } else if (percentFilled == 100) {
            return 1;
        } else {
            return -1;
        }
    }
}
