package com.example.camunda.api;

import com.example.camunda.config.ApplicationConstants;
import io.camunda.zeebe.client.ZeebeClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/processes")
public class ProcessController {

    @Autowired
    private ZeebeClient zeebe;

    @PostMapping
    public void start(@RequestBody Map<String, Object> variables) {

        log.info("Starting process {} with initial variables: {}", ApplicationConstants.BPMN_PROCESS_ID, variables);

        zeebe
                .newCreateInstanceCommand()
                .bpmnProcessId(ApplicationConstants.BPMN_PROCESS_ID)
                .latestVersion()
                .variables(variables)
                .send();
    }

}
