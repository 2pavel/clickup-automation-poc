package com.clickup.gui;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestBase {

    private Logger logger = LogManager.getLogger(this.getClass().getName());

    protected Logger log() { return logger; }

}
