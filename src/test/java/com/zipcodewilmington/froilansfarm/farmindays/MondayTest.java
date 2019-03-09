package com.zipcodewilmington.froilansfarm.farmindays;

import com.zipcodewilmington.froilansfarm.people.*;
import org.junit.Before;

import static org.junit.Assert.*;

public class MondayTest {

    private Person farmer;

    @Before
    public void setUp() throws Exception {
        FarmWorker worker = new FarmWorker();

        farmer = new FarmerDecorator(new PilotDecorator(worker));


    }

}