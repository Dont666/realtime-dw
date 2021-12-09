package com.yygc.realtime.bean;

import lombok.Data;

@Data
public class OrderScheduler {
    Long order_id;
    Long  car_depend_date;
    Long  car_start_date;
    Long  car_arrive_date;
    Long car_driver_id;
    Long copilot_user_id;
    Long  depend_time;
    Integer fuel_type;
    Long  distance;
    Long  mileage_number;
    Long trailer_id;
    String trailer_plate;
    String vehicle_class;
    Integer licence_type;
    String plate_number;
    Integer source_id;
    Long create_date;
}
