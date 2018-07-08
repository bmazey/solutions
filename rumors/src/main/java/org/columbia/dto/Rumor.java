package org.columbia.dto;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="rumors")
public class Rumor {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @Column(name="name")
    private String name;

    @Column(name="rumor")
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
