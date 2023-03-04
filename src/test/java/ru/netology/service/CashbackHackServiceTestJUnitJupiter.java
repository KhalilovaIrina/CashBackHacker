package ru.netology.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTestJUnitJupiter {
    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldFindNeedAmountBefore1000() {

        Assertions.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldFindNeedAmountAbove1000() {

        Assertions.assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldFindNeedAmountIf1000() {

        Assertions.assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldFindNeedAmountIfNull() {

        Assertions.assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldFindNeedAmountIfOne() {

        Assertions.assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldFindNeedAmountIfNegative() {

        Assertions.assertEquals(1001, service.remain(-1));
    }
}
