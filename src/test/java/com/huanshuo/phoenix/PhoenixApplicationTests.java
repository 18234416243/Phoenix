package com.huanshuo.phoenix;

import com.huanshuo.phoenix.entity.Order;
import com.huanshuo.phoenix.entity.User;
import com.huanshuo.phoenix.mapper.OrderMapper;
import com.huanshuo.phoenix.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoenixApplicationTests {

	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private UserMapper userMapper;


	@Test
	public void testGetOrders() {
		List<Order> orders = orderMapper.getOrders("A");
		orders.forEach(System.out::println);
	}

	@Test
	public void testUpdateOrder() {
		orderMapper.updateOrder(2L, BigDecimal.valueOf(88.8));
	}


	@Test
	public void selectAllUser(){
		List<User> list = userMapper.selectAll();
		list.forEach(System.out::println);
	}

}
