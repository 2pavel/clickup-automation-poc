package com.clickup.commons;

public class Endpoints {

    public static final String BASE_URL = "https://api.clickup.com";
    public static final String API_V2 =  BASE_URL + "/api/v2";
    public static final String TEAM = API_V2 + "/team";
    public static final String TASK = API_V2 + "/task";
    public static final String SPACE = API_V2 + "/space";
    public static final String UPDATED_TASK = TASK + "/" + Constants.UPDATED_TASK_ID;
    public static final String CREATE_FOLDER = SPACE + "/" + Constants.TEAM_SPACE_ID + "/folder";
    public static final String FOLDER = API_V2 + "/folder";
    public static final String MY_WORKSPACE = TEAM + "/" + Constants.WORKSPACE_ID;
    public static final String TEAM_SPACES = MY_WORKSPACE + "/space";
    public static final String GOAL = MY_WORKSPACE + "/goal";

}
