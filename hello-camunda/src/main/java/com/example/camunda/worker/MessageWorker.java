package com.example.camunda.worker;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Random;

@Slf4j
@Component
public class MessageWorker {

    @JobWorker
    public void sendMessage(final JobClient client, final ActivatedJob job) {
        log.info((String)job.getVariable("message"));
    }

}
