package com.yygc.realtime.bean;

import lombok.Data;

@Data
public class OrderInfo {
     Long create_date;
     Long order_id;
     Integer order_state;
     Long tenant_id;
     Integer org_id;
     Integer source_region;
     Integer des_region;
     Integer source_province;
     Integer des_province;
}
