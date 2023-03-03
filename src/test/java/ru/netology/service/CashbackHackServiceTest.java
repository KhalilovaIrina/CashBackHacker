package ru.netology.service;


import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldFindNeedAmountBefore1000() {

        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldFindNeedAmountAbove1000() {

       Assert.assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldFindNeedAmountIf1000() {

        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldFindNeedAmountIfNull() {

        Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldFindNeedAmountIfOne() {

        Assert.assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldFindNeedAmountIfNegative() {

        Assert.assertEquals(1001, service.remain(-1));
    }
}