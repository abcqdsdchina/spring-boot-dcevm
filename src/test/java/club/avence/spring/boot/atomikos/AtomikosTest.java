package club.avence.spring.boot.atomikos;

import club.avence.spring.boot.mapper.order.OrderMapper;
import club.avence.spring.boot.mapper.product.ProductMapper;
import club.avence.spring.boot.model.order.Order;
import club.avence.spring.boot.model.product.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AtomikosTest {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private ProductMapper productMapper;

    @Test
    @Transactional
    public void test() {
        Order order = new Order();
        order.setId(1L);
        order.setOrderNo("0000001");
        order.setProductId(1L);
        order.setUserId(1L);
        orderMapper.insert(order);

        Product product = new Product();
        product.setId(1L);
        product.setName("绝版商品，禁止买卖");
        productMapper.insert(product);
    }

}
