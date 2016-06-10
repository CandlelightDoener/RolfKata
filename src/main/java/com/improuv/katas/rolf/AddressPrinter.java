package com.improuv.katas.rolf;

public class AddressPrinter {
    public String print(Address address) {
        if(address.containsPlz()) {
            return address.street + "\n" + address.plz + " " + address.town;
        }
        else throw new RuntimeException("should contain PLZ");
    }
}
