package com.huanshuo.phoenix.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
@RequiredArgsConstructor
public class Order {
    private Long id;
    private String orderCode;
    private BigDecimal totalAmount;
    private Date createTime;
    private Long userId;
}
