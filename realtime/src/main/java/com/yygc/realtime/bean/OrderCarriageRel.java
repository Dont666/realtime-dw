package com.yygc.realtime.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCarriageRel {
    public  Long id,co_id,g_id,order_id,order_freight,create_date,tenant_id;
    public  Integer order_type,state,goods_count;
    public BigDecimal weight,volume;
}
