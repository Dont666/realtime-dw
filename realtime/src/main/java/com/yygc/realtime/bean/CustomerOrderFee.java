package com.yygc.realtime.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderFee {
    public Long co_id,total_fee,total_freight,total_incidental;
}
