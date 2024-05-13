package com.example.camunda.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Random;

@Slf4j
@Component
public class CaptchaWorker {

    @JobWorker
    public Map<String, Object> getRandomNumbersToSum() {
        int MAX_NUMBER_COUNT = 4;
        int MAX_NUMBER = 10;
        int count = new Random().nextInt(2, MAX_NUMBER_COUNT + 1); // Generate at least 2 numbers, but no more than 4
        List<Integer> numbers = new Random().ints(count, 1, MAX_NUMBER + 1).boxed().toList();
        return Map.of(
                "numbers", numbers,
                "result", numbers.stream().reduce(0, Integer::sum)
        );
    }

}
