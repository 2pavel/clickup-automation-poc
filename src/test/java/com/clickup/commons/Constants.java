package com.clickup.commons;

import java.util.List;

public class Constants {

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

    // --------------- BACKEND ID ---------------
    public static final String UPDATED_TASK_ID = Labels.getProp("updated_task.id");
    public static final String WORKSPACE_ID = Labels.getProp("team.id");
    public static final String TEAM_SPACE_ID = Labels.getProp("team_space.id");

    // ------------- EXPECTED VALUES ------------
    public static final String TEST_SPACE = Labels.getProp("test_space.name");
    public static final String TEST_TASK = Labels.getProp("test_task.name");
    public static final String TOAST = Labels.getExpected("settings.preferences.toast");
    public static final String ENTER_COMMENTS = Labels.getExpected("settings.preferences.enter_comments");
    public static final String MARKDOWN = Labels.getExpected("settings.preferences.markdown");
    public static final String HOTKEYS = Labels.getExpected("settings.preferences.hotkeys");
    public static final String NOTEPAD = Labels.getExpected("settings.preferences.notepad");
    public static final String HIGH_CONTRAST = Labels.getExpected("settings.preferences.high_contrast");
    public static final String DARK_MODE = Labels.getExpected("settings.preferences.dark_mode");
    public static final String SHOW_QUOTES = Labels.getExpected("settings.preferences.show_quotes");
    public static final String SHOW_CELEBRATIONS = Labels.getExpected("settings.preferences.show_celebrations");
    public static final String SYNC_DATA = Labels.getExpected("settings.preferences.sync_data");
    public static final String VERIFIED = Labels.getExpected("settings.preferences.verified");
    public static final String PLAIN_LINKS = Labels.getExpected("settings.preferences.plain_links");
    public static final String DESKTOP_APP = Labels.getExpected("settings.preferences.desktop_app");
    public static final List<String> PREFERENCES = List.of(
            TOAST, ENTER_COMMENTS, MARKDOWN, HOTKEYS, NOTEPAD, HIGH_CONTRAST, DARK_MODE, SHOW_QUOTES, SHOW_CELEBRATIONS,
            SYNC_DATA, VERIFIED, PLAIN_LINKS, DESKTOP_APP
    );
}
