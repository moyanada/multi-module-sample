package com.sample.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(properties = "app.scheduling.enable=false")
class SchedulerTasksTest {

    @Autowired
    private SchedulerTasks schedulerTasks;

    @Test
    public void testTask() {
        schedulerTasks.taskTestScheduler();
    }

}