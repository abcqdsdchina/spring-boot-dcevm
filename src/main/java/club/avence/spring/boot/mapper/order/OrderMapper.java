package club.avence.spring.boot.mapper.order;

import club.avence.spring.boot.model.order.Order;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);
}