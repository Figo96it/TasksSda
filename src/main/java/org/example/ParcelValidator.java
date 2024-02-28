package org.example;

//Exercise 8
public class ParcelValidator implements Validator {
    @Override
    public boolean validate(Parcel parcel) {
        if ((parcel.getxLength() + parcel.getyLength() + parcel.getzLength()) > 300) {
            System.out.println("Suma wymiarów przekracza 300.");
            return false;
        } else if (parcel.getxLength() < 30 || parcel.getyLength() < 30 || parcel.getzLength() < 30) {
            System.out.println("Każdy z wymiarów powinien być większy bądź równy 30.");
            return false;
        } else if ((parcel.getWeight() > 30.0 && Boolean.FALSE.equals(parcel.isExpress())) || (parcel.getWeight() > 15.0 && Boolean.TRUE.equals(parcel.isExpress()))) {
            System.out.println("Waga została przekroczona.");
            return false;
        }
        return true;
    }
}
