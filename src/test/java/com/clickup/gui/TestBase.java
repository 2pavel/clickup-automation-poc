package com.clickup.gui;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;

public class TestBase {

    private Logger logger = LogManager.getLogger(this.getClass().getName());

    protected Logger log() { return logger; }

}
