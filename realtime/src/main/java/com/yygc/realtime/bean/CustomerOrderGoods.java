package com.yygc.realtime.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderGoods {
    public Long id,co_id,freight;
    public Integer valuation_class,goods_count,carriage_goods_count;
    public BigDecimal weight,volume,carriage_weight,carriage_volume;
}
