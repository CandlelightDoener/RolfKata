package com.improuv.katas.rolf.parameterized;

import com.improuv.katas.rolf.Address;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class AddressTestParameterized {

    @Test(expected = RuntimeException.class)
    @Parameters({"999","10000" })
    public void plz_shouldFailWhenNot4Digits(int plz) throws Exception {
        Address address = new Address();
        address.setPlz(plz);
    }

    @Test
    @Parameters({"1000","9999" })
    public void plz_shouldBeAllowedWhen4Digits(int plz) throws Exception {
        Address address = new Address();
        address.setPlz(plz);
    }
}
