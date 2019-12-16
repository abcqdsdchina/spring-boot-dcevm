package club.avence.spring.boot.mapper.product;

import club.avence.spring.boot.model.product.Product;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);
}