package org.example.spendingtracker;

import com.rabbitmq.client.ConnectionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest
class SpendingTrackerApplicationTests {

    @MockitoBean
    private MongoTemplate mongoTemplate;

    @MockitoBean
    private ConnectionFactory connectionFactory;

    @Test
    void contextLoads() {
    }

}
