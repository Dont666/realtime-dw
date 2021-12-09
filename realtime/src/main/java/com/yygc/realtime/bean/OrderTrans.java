package com.yygc.realtime.bean;

import lombok.Data;

@Data
public class OrderTrans {
   Long ORDER_ID,CO_ID,TOTAL_FREIGHT,TOTAL_FEE,TOTAL_COST;

   @Override
   public String toString() {
      return "{" +
              "ORDER_ID:" + ORDER_ID +
              ", CO_ID:" + CO_ID +
              ", TOTAL_FREIGHT:" + TOTAL_FREIGHT +
              ", TOTAL_FEE:" + TOTAL_FEE +
              ", TOTAL_COST:" + TOTAL_COST +
              '}';
   }
}
