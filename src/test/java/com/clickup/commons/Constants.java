package com.clickup.commons;

public class Constants {

    // ------------- EXPECTED VALUES ------------
    public static final String TOAST = Labels.getExpected("settings.preferences.toast");
    public static final String TEST_SPACE = Labels.getProp("test_space.name");
    public static final String TEST_TASK = Labels.getProp("test_task.name");

    // --------------- FILE PATHS ---------------
    public static final String RESOURCES_DIR = "src/test/resources";
    public static final String TESTDATA_DIR = RESOURCES_DIR + "/testdata";
    public static final String ACTORS_FILE = TESTDATA_DIR + "/actors.json";
    public static final String EN_LANG_FILE = TESTDATA_DIR + "/en_EN.properties";
    public static final String PROP_NAMES_FILE = TESTDATA_DIR + "/testprops.properties";
    public static final String API_PROPERTIES = RESOURCES_DIR + "/api.properties";

    // ------------ LOCATOR DATA-TEST ------------
    public static final String TASK_CTX_DATA_TEST = "[data-test=task-row-menu__ellipsis-v3-button]";

    // -------------- LOCATOR XPATH --------------
    public static final String PREFERENCES_SECTION_XPATH = ".//h2[contains(text(), 'Preferences')]/parent::header/parent::section";

    // ------------------ USERS ------------------
    public static final String DEFAULT_USER = "Testerski";

}
