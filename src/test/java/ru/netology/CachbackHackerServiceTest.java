package ru.netology;

import static org.junit.Assert.assertEquals;

public class CachbackHackerServiceTest {
    @org.junit.Test
    public void testRemain() {
        CachbackHackerService service = new CachbackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainWithCashBack() {
        CachbackHackerService service = new CachbackHackerService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
}