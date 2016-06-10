package com.improuv.katas.rolf;

public class Address {
    String street;
    int plz = -1;
    String town;

    public Address(){}

    public Address(String street, int plz, String town) {
        setStreet(street);
        setPlz(plz);
        setTown(town);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPlz(int plz) {
        if(plz < 1000 || plz > 10000)
            throw new RuntimeException("PLZ muss vierstellig sein");
        this.plz = plz;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public boolean containsPlz() {
        return plz != -1;
    }
}
