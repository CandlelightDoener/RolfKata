package com.improuv.katas.rolf.builder;

import com.improuv.katas.rolf.Address;

public class AddressBuilder {
    private String street;
    private int plz = -1;
    private String town;

    public static AddressBuilder anAddress() {
        return new AddressBuilder();
    }

    public static AddressBuilder aValidAddress() {
        return new AddressBuilder().
                withStreet("Hauptstrasse").
                withPlz(5270).
                withTown("Gummersbach");
    }

    public AddressBuilder withStreet(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder withPlz(int plz) {
        this.plz = plz;
        return this;
    }

    public AddressBuilder withTown(String town) {
        this.town = town;
        return this;
    }

    public Address build() {
        return new Address(street, plz, town);
    }
}
