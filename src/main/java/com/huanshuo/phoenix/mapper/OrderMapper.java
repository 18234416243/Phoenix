package com.huanshuo.phoenix.mapper;

import com.huanshuo.phoenix.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrderMapper {

    List<Order> getOrders(@Param("name")String name);

    void updateOrder(@Param("id") Long id, @Param("totalAmount") BigDecimal totalAmount);
}
