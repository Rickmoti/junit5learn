package com.example.junit5learn.test1;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Junit5StandardTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(Junit5StandardTests.class);

    @BeforeAll
    static void beforeAll() {
        LOGGER.info("call beforeAll()");
    }

    @BeforeEach
    void beforeEach() {
        LOGGER.info("call beforeEach()");
    }

    @Test
    void succeedingTest() {
        LOGGER.info("call succeedingTest()");
    }

    @Test
    void failingTest() {
        LOGGER.info("call failingTest()");
        // fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        LOGGER.info("call skippedTest()");
        // not executed
    }

    @AfterEach
    void afterEach() {
        LOGGER.info("call afterEach()");
    }

    @AfterAll
    static void afterAll() {
        LOGGER.info("call afterAll()");
    }
}