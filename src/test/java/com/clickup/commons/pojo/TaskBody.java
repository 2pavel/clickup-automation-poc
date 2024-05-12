package com.clickup.commons.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskBody {

    // TODO: this class is probably gonna be unnecessary

    private String name;
    private String description;
    private String status;
    private Integer priority;
    private Long dueDate;
    private Boolean dueDateTime;
    private Integer timeEstimate;
    private Long startDate;
    private Boolean startDateTime;
    private Boolean archived;

    TaskBody() {
        this.name = "Api Uptaded Task";
        this.description = "Random description";
        this.status = "in progress";
        this.priority = 1;
        this.dueDate = 1747066552000L;
        this.dueDateTime = false;
        this.timeEstimate = 8640000;
        this.startDate = 1567780450202L;
        this.startDateTime = false;
        this.archived = false;
    }

}
