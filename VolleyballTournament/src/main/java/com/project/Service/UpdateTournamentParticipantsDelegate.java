package com.project.Service;

import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class UpdateTournamentParticipantsDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception { // Your custom logic goes here
        log.info("Update tournament participants");
        String taskId = (String) delegateExecution.getVariable("claimId");
    }
}
