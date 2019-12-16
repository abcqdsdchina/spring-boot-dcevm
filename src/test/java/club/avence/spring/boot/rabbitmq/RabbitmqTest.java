package club.avence.spring.boot.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class RabbitmqTest {

    @Resource
    private AmqpTemplate amqpTemplate;

    @Test
    public void test() {
        amqpTemplate.convertAndSend("spring-boot-rabbitmq-exchange", "spring-boot.test", "are you ok?");
        log.info(new String(amqpTemplate.receive("spring-boot-rabbitmq-queue").getBody()));
    }

}
