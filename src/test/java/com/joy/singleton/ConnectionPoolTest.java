package com.joy.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ConnectionPoolTest {

    @Test
    void getInstance() {
        ConnectionPool instance1 = ConnectionPool.getInstance();
        ConnectionPool instance2 = ConnectionPool.getInstance();

        assertEquals(instance1, instance2);
    }
}
