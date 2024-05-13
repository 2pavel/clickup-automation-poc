package com.clickup.commons.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class GoalRequestBody {

    private String name;
    private Long dueDate;
    private String description;
    private boolean multipleOwners;
    private ArrayList<Integer> owners;
    private String color;

    GoalRequestBody() {
        this.name = "Default goal name";
        this.description = "Default goal description";
        this.dueDate = 1747066552000L;
        this.multipleOwners = false;
        this.owners.add(68606069);
        this.color = "#32a852";
    }

}
