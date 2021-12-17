package com.sample.core.dao;

import com.sample.core.dto.TestData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class TestDaoImpl implements TestDao {
    @Override
    public TestData getTestData() {
        log.info("TestDaoImpl.getTestData");
        TestData testData = new TestData();
        testData.setId("moya");
        testData.setName("junhyun");
        return testData;
    }
}
