package com.sample.core.service;

import com.sample.core.dao.TestDao;
import com.sample.core.dao.TestDaoImpl;
import com.sample.core.dto.TestData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestDaoImpl testDao;

    @Override
    public TestData doAnything() {
        log.info("TestServiceImpl.doAnything");
        return testDao.getTestData();
    }
}
