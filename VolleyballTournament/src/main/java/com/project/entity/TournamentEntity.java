package com.project.entity;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class TournamentEntity {
    @Id
    private UUID task_id;
    @ManyToOne
    @Nullable
    private TeamEntity[] team;


    public TournamentEntity(@Nullable TeamEntity[] team) {
        this.task_id = UUID.randomUUID();
        this.team = team;
    }

    public TournamentEntity() {
        this.task_id = UUID.randomUUID();
    }
    public UUID getTask_id() {
        return task_id;
    }

    public void setTask_id(UUID task_id) {
        this.task_id = task_id;
    }

    @Nullable
    public TeamEntity[] getTeam() {
        return team;
    }

    public void setTeam(@Nullable TeamEntity[] team) {
        this.team = team;
    }
}
