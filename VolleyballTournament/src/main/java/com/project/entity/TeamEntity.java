package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class TeamEntity {
    @Id
    private UUID team_id;
    private String securityCode;

    public TeamEntity(UUID team_id) {
        this.team_id = team_id;
        this.securityCode = UUID.randomUUID().toString().substring(0, 5);
    }

    public TeamEntity() {}

    public UUID getTeam_id() {
        return team_id;
    }

    public String getSecurityCode() {
        return securityCode;
    }
}
