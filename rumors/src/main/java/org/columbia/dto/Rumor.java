package org.columbia.dto;

import java.util.UUID;


public class Rumor {

    private UUID id;
    private String name;
    private String rumor;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRumor() {
        return rumor;
    }

    public void setRumor(String rumor) {
        this.rumor = rumor;
    }

}
