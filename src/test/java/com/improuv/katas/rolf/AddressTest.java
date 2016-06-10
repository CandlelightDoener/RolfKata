package com.improuv.katas.rolf;

import org.junit.Test;

public class AddressTest {

    @Test(expected = RuntimeException.class)
    public void plz_shouldNotBeAllowedWithLessThan4Digits() throws Exception {
        Address address = new Address();
        address.setPlz(123);
    }

    @Test(expected = RuntimeException.class)
    public void plz_shouldNotBeAllowedWithMoreThan4Digits() throws Exception {
        Address address = new Address();
        address.setPlz(12345);
    }

    @Test
    public void plz_shouldBeAllowedWhen4Digits() throws Exception {
        Address address = new Address();
        address.setPlz(1234);
    }
}
