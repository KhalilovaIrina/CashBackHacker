package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldFindNeedAmountBefore1000() {

        assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldFindNeedAmountAbove1000() {

        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void shouldFindNeedAmountIf1000() {

        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldFindNeedAmountIfNull() {

        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldFindNeedAmountIfOne() {

        assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldFindNeedAmountIfNegative() {

        assertEquals(service.remain(-1), 1001);
    }
}