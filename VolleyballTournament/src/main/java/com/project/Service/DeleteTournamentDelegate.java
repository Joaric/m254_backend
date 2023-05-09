package com.project.Service;

import com.project.Repository.TournamentRepository;
import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Log4j2
public class DeleteTournamentDelegate implements JavaDelegate {
    @Autowired
    private TournamentRepository tournamentRepository;
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("DeleteTaskById");
        String taskId = (String) delegateExecution.getVariable("tournamentId");
        if(taskId == null) {
            log.info("TournamentId is null");
            delegateExecution.setVariable("Participant", "False");
            return;
        }

        log.info("Deleting task by id, success");
        tournamentRepository.deleteById(UUID.fromString(taskId));
    }
}
