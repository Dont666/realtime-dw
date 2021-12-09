package com.yygc.realtime.bean;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Timestamp;


@Data
@ToString
public class OrderWidth {
    String	order_create_date;
    String	order_create_month;
    String	order_depend_date;
    String	order_depend_month;
    Long	order_id;
    Long	order_state;
    Long	tenant_id;
    Long	org_id;
    Long	vehicle_class;
    Long	licence_type;
    String	plate_number;
    Long	payment_way;
    Long	source_id;
    Long    car_depend_date;
    Long	car_start_date;
    Long	car_arrive_date;
    Long	car_driver_id;
    Long	copilot_user_id;
    Timestamp depend_time;
    Integer	source_region;
    Integer	des_region;
    Integer	source_province;
    Integer	des_province;
    Long	fuel_type;
    Long	run_way;
    Long	custom_user_id;
    String	company_name;
    BigDecimal distance;
    BigDecimal	order_mileage_number;
    BigDecimal mileage_number;
    Integer	is_full_oil;
    BigDecimal	empty_run_distance;
    BigDecimal	run_distance;
    BigDecimal	total_distance;
    BigDecimal	report_oil_amount;
    BigDecimal	report_oil_rise;
    BigDecimal	pay_amt;
    BigDecimal oil_litre;
    Long trailer_id;
    String	trailer_plate;

}
