package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void Purchase100Test() {
        CashbackHackService remain = new CashbackHackService();
        int actual = remain.remain(100);

        Assert.assertEquals(actual, 900);
    }

    @Test
    public void Purchase900Test() {
        CashbackHackService remain = new CashbackHackService();
        int actual = remain.remain(900);

        Assert.assertEquals(actual, 100);
    }

    @Test
    public void Purchase1100Test() {
        CashbackHackService remain = new CashbackHackService();
        int actual = remain.remain(1100);

        Assert.assertEquals(actual, 900);
    }

    @Test
    public void Purchase1900Test() {
        CashbackHackService remain = new CashbackHackService();
        int actual = remain.remain(1900);

        Assert.assertEquals(actual, 100);
    }

    @Test
    public void Purchase1000Test() {
        CashbackHackService remain = new CashbackHackService();
        int actual = remain.remain(1000);

        Assert.assertEquals(actual, 0);
    }

    @Test
    public void Purchase2000Test() {
        CashbackHackService remain = new CashbackHackService();
        int actual = remain.remain(2000);

        Assert.assertEquals(actual, 0);
    }
}
