package com.improuv.katas.rolf;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RolfKataTests {

    @Test
    public void addressPrinter_shouldPrintStreetAndPLZAndTown() throws Exception {
        AddressPrinter printer = new AddressPrinter();
        Address address = new Address();
        address.setStreet("An der Heide 1");
        address.setPlz(8304);
        address.setTown("Mallersdorf");
        MatcherAssert.assertThat(printer.print(address), is("An der Heide 1\n8304 Mallersdorf"));
    }

    @Test
    public void addressPrinter_shouldAlsoOtherPLZAndTown() throws Exception {
        AddressPrinter printer = new AddressPrinter();
        Address address = new Address();
        address.setStreet("Am Kirchplatz 7");
        address.setPlz(8307);
        address.setTown("Laberweinting");
        MatcherAssert.assertThat(printer.print(address), is("Am Kirchplatz 7\n8307 Laberweinting"));
    }

    @Test(expected = RuntimeException.class)
    public void address_shouldContainPlz() throws Exception {
        AddressPrinter printer = new AddressPrinter();
        Address address = new Address();
        address.setStreet("Am Kirchplatz 7");
        printer.print(address);
    }
}
