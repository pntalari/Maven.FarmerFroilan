package com.zipcodewilmington.froilansfarm.farmindays;

import com.zipcodewilmington.froilansfarm.people.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SundayTest {

    private Person farmer;

    @Before
    public void setUp() throws Exception {
        FarmWorker worker = new FarmWorker();

        farmer = new FarmerDecorator(new BotanistDecorator(new PilotDecorator(worker)));


    }

    @Test
    public void workTest(){
        farmer.work();
    }
}