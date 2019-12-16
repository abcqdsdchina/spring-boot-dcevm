package club.avence.spring.boot.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void test() {
        BoundValueOperations<String, String> valueOperations = redisTemplate.boundValueOps("test");
        valueOperations.set("haha");
        log.info(valueOperations.get());
    }

}
