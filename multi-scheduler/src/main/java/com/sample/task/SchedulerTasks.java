package com.sample.task;

import com.sample.core.dto.TestData;
import com.sample.core.service.TestServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component("schedulerTasks")
@RequiredArgsConstructor
public class SchedulerTasks {

    private final TestServiceImpl testService;

    @Scheduled(fixedDelay = 5000)
    public void taskTestScheduler() {
        log.info("[taskTestScheduler] START");
        TestData testData = testService.doAnything();
        log.info("[taskTestScheduler] ID : {}", testData.getId());
        log.info("[taskTestScheduler] NAME :{}", testData.getName());
    }
}
