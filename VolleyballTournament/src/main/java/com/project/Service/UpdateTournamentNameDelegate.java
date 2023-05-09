package com.project.Service;

import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class UpdateTournamentNameDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String taskId = (String) delegateExecution.getVariable("ParticipantId");
        if(taskId == null) {
            log.info("TournamentId is null");
            delegateExecution.setVariable("isParticipantNameAllowed ", "False");
            return;
        }
        delegateExecution.setVariable("isParticipantNameAllowed", "true");
        return;
    }
}
