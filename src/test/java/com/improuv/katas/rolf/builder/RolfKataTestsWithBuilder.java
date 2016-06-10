package com.improuv.katas.rolf.builder;

import com.improuv.katas.rolf.Address;
import com.improuv.katas.rolf.AddressPrinter;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static com.improuv.katas.rolf.builder.AddressBuilder.anAddress;

public class RolfKataTestsWithBuilder {

    @Test
    public void addressPrinter_shouldAlsoPrintPLZAndTown() throws Exception {
        AddressPrinter printer = new AddressPrinter();
        Address address = anAddress().withStreet("An der Heide 1").withPlz(8304).withTown("Mallersdorf").build();
        assertThat(printer.print(address), is("An der Heide 1\n8304 Mallersdorf"));
    }

    @Test
    public void addressPrinter_shouldAlsoOtherPLZAndTown() throws Exception {
        AddressPrinter printer = new AddressPrinter();
        Address address = anAddress().withStreet("Am Kirchplatz 7").withPlz(8307).withTown("Laberweinting").build();
        assertThat(printer.print(address), is("Am Kirchplatz 7\n8307 Laberweinting"));
    }

    @Test(expected = RuntimeException.class)
    public void address_shouldContainPlz() throws Exception {
        AddressPrinter printer = new AddressPrinter();
        Address address = anAddress().withStreet("Am Kirchplatz 7").build();
        printer.print(address);
    }
}
