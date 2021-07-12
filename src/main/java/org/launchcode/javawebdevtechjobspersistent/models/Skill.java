package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Skill extends AbstractEntity {

    @NotNull
    @Size(max = 500)
    public String description;

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}