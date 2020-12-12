package 反射;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@Slf4j
public class MethodTest {

    @Test
    public void test1() throws InvocationTargetException {
        Class<?> clazz = MethodTest. class ;
        try {
            Method test = clazz.getMethod("test", Integer.class);
            test.invoke(clazz.newInstance(),0);
        } catch (NoSuchMethodException e) {
            log.error("错误1为{}", e);
        } catch  (IllegalAccessException e) {
            log.error("错误2为{}", e);
        }
        catch (InvocationTargetException e) {
            log.error("错误3为{}", e);
            throw e;
        } catch  (InstantiationException e) {
            log.error("错误4为{}", e);
        }

    }

    @Test
    public void test2(){
        try {
            test1();
        } catch (InvocationTargetException e) {
            log.error("错误3111为{}", e);
        }
    }



    public void test(Integer num){
        int i = 1 / num;
    }


    @Test
    public void test3(){
        System.out.println("        '        \\'        \\\\\\'SELECT \\\\\\\\nttrr.id AS id,\\\\\\\\ncinema.cinema_code AS cinema_code,\\\\\\\\ntotd.tenant_code AS tenant_code,\\\\\\\\ntotd.order_no AS order_no,\\\\\\\\ntoi.channel_order_no AS channel_order_no,\\\\\\\\n2 AS sale_type,\\\\\\\\nUNIX_TIMESTAMP(DATE_FORMAT(DATE_ADD(FROM_UNIXTIME(ttrr.gmt_create/1000), INTERVAL -6 HOUR), \\\\\\\\\\\\\\'%Y-%m-%d\\\\\\\\\\\\\\')) * 1000 AS sale_business_date,\\\\\\\\nttrr.gmt_create AS sale_ref_time,\\\\\\\\nbfi.film_name AS film_name,\\\\\\\\nts.film_code AS film_code,\\\\\\\\nts.language AS film_language,\\\\\\\\ntsp.hall_code AS hall_code,\\\\\\\\nbhi.hall_name AS hall_name,\\\\\\\\nts.session_code AS session_code,\\\\\\\\nts.plan_code AS plan_code,\\\\\\\\nSP_FUNC_CONVERT_SHOW_TYPE(ts.film_code, ts.d4d) AS show_type,\\\\\\\\nts.show_start_time AS show_start_time,\\\\\\\\nts.show_end_time AS show_end_time,\\\\\\\\ntotd.ticket_code AS ticket_code,\\\\\\\\ntotd.seat_code AS seat_code,\\\\\\\\ntotd.marketing_type AS marketing_type,\\\\\\\\ntotd.marketing_id AS marketing_id,\\\\\\\\ntotd.marketing_name AS marketing_name,\\\\\\\\ntotd.ticket_price_type_name AS ticket_name,\\\\\\\\nCONCAT(REPLACE(totd.seat_location,\\\\\\\\\\\\\\'_\\\\\\\\\\\\\\',\\\\\\\\\\\\\\'排\\\\\\\\\\\\\\'),\\\\\\\\\\\\\\'座\\\\\\\\\\\\\\') AS seat_location,\\\\\\\\ntotd.plan_business_date AS business_date,\\\\\\\\ntoi.pay_ditch_code AS pay_ditch_code,\\\\\\\\nCASE toi.pay_ditch_code WHEN 1 THEN \\\\\\\\\\\\\\'影院前台\\\\\\\\\\\\\\' WHEN 2 THEN \\\\\\\\\\\\\\'自助终端\\\\\\\\\\\\\\' WHEN 3 THEN \\\\\\\\\\\\\\'网络售卖\\\\\\\\\\\\\\' END AS pay_ditch_name, \\\\\\\\ntotd.ticket_price AS ticket_price,\\\\\\\\ntotd.amount_price AS amount_price,\\\\\\\\ntotd.pay_price AS pay_price,\\\\\\\\ntotd.privilege_money AS privilege_price,\\\\\\\\nCASE WHEN totd.cinema_subsidy > 0 THEN 2 WHEN totd.third_subsidy > 0 THEN 3 WHEN totd.hq_subsidy > 0 THEN 4 ELSE 1 END AS balance_resource,\\\\\\\\nCASE WHEN totd.cinema_subsidy > 0 THEN \\\\\\\\\\\\\\'影院补差\\\\\\\\\\\\\\' WHEN totd.third_subsidy > 0 THEN \\\\\\\\\\\\\\'第三方补差\\\\\\\\\\\\\\' WHEN totd.hq_subsidy > 0 THEN \\\\\\\\\\\\\\'总部补差\\\\\\\\\\\\\\' ELSE \\\\\\\\\\\\\\'用户补差\\\\\\\\\\\\\\' END AS balance_resource_name,\\\\\\\\nCASE WHEN totd.cinema_subsidy > 0 THEN totd.cinema_subsidy WHEN totd.third_subsidy > 0 THEN totd.third_subsidy WHEN totd.hq_subsidy > 0 THEN totd.hq_subsidy ELSE 0 END AS balance_price,\\\\\\\\ntotd.settlement_price AS settlement_price,\\\\\\\\ntotd.ticket_channel_fee AS ticket_channel_fee,\\\\\\\\ntotd.report_price AS report_price,\\\\\\\\ntotd.charge_price AS charge_price,\\\\\\\\ntotd.ticket_channel_fee AS net_channel_fee,\\\\\\\\ntotd.net_sale_price AS net_sale_price,\\\\\\\\ntotd.base_tax_rate AS ticket_tax_rate,\\\\\\\\ntotd.member_special_price AS member_special_price,\\\\\\\\ntotd.member_special_price_flag AS member_special_price_flag,\\\\\\\\n0 AS past_status,\\\\\\\\nIF(tsp.join_flag = 0, ts.sub_account_rate, ts.sharing_rate) AS sharing_rate,\\\\\\\\ntotd.base_special_funds AS special_funds,\\\\\\\\nttrr.refund_ditch AS refund_ditch_code,\\\\\\\\nCASE ttrr.refund_ditch WHEN 1 THEN \\\\\\\\\\\\\\'影院前台\\\\\\\\\\\\\\' WHEN 2 THEN \\\\\\\\\\\\\\'自助终端\\\\\\\\\\\\\\' WHEN 3 THEN \\\\\\\\\\\\\\'网络售卖\\\\\\\\\\\\\\' ELSE \\\\\\\\\\\\\\'超时退票\\\\\\\\\\\\\\' END AS refund_ditch_name,\\\\\\\\nttrr.refund_reason_name AS refund_reason,\\\\\\\\nIF(ttrr.refund_type = 1, totd.pay_type, 1) AS pay_type,\\\\\\\\nSP_FUNC_CONVERT_PAY_TYPE(IF(ttrr.refund_type = 1, totd.pay_type, 1)) AS pay_type_name,\\\\\\\\nSUM(CASE tprb.pay_type WHEN 1 THEN (tprb.money) ELSE 0 END) AS cash_pay,\\\\\\\\nSUM(CASE tprb.pay_type WHEN 2 THEN (tprb.money) ELSE 0 END) AS bank_pay,\\\\\\\\nSUM(CASE tprb.pay_type WHEN 6 THEN (tprb.money) ELSE 0 END) AS member_pay,\\\\\\\\nSUM(CASE tprb.pay_type WHEN 13 THEN (tprb.money) ELSE 0 END) AS member_hq_pay,\\\\\\\\nSUM( case tprb.pay_type WHEN 6 Then (member.member_balance_pay_money) ELSE 0 END) AS member_balance_pay_money,\\\\\\\\nSUM( case tprb.pay_type WHEN 6 Then (member.member_give_amount_pay_money) ELSE 0 END) AS member_give_amount_pay_money,\\\\\\\\nSUM( case tprb.pay_type WHEN 13 Then (member_hq.member_balance_pay_money) ELSE 0 END) AS member_hq_balance_pay_money,\\\\\\\\nSUM( case tprb.pay_type WHEN 13 Then (member_hq.member_give_amount_pay_money) ELSE 0 END) AS member_hq_give_amount_pay_money,\\\\\\\\nSUM(CASE tprb.pay_type WHEN 7 THEN (tprb.money) ELSE 0 END) AS coupon_pay,\\\\\\\\nSUM(CASE tprb.pay_type WHEN 12 THEN (tprb.money) ELSE 0 END) AS coupon_hq_pay,\\\\\\\\nSUM(CASE tprb.pay_type WHEN 14 THEN (tprb.money) ELSE 0 END) AS coupon_dy_pay,\\\\\\\\nSUM(CASE tprb.pay_type WHEN 3 THEN (tprb.money) ELSE 0 END) AS check_pay,\\\\\\\\nSUM(CASE tprb.pay_type WHEN 4 THEN (tprb.money) ELSE 0 END) AS ali_pay,\\\\\\\\nCASE tprb.pay_type WHEN 4 THEN tprt.third_order_no END AS api_pay_trade_no,\\\\\\\\nSUM(CASE tprb.pay_type WHEN 5 THEN (tprb.money) ELSE 0 END) AS wechat_pay,\\\\\\\\nCASE tprb.pay_type WHEN 5 THEN tprt.third_order_no END AS wechat_pay_trade_no,\\\\\\\\n\\\\\\\\\\\\\\'0.00\\\\\\\\\\\\\\' AS integral_pay,\\\\\\\\nSUM(CASE tprb.pay_type WHEN 8 THEN (tprb.money) ELSE 0 END) AS net_pay,\\\\\\\\nIFNULL(GROUP_CONCAT(DISTINCT member.gift_integral), GROUP_CONCAT(DISTINCT member_hq.gift_integral)) AS gift_integral,\\\\\\\\ntoi.order_phone AS order_phone, \\\\\\\\ntoi.channel_code AS channel_code,\\\\\\\\ntoi.channel_name AS channel_name,\\\\\\\\nttrr.create_user_id AS sale_user_id,\\\\\\\\nttrr.create_user_name AS sale_user_name,\\\\\\\\nIFNULL(GROUP_CONCAT(DISTINCT coupon_hq.coupon_no), IFNULL(GROUP_CONCAT(DISTINCT dyCoupon.coupon_no), GROUP_CONCAT(DISTINCT coupon.coupon_no))) AS coupon_code,\\\\\\\\nIFNULL(GROUP_CONCAT(DISTINCT coupon_hq.coupon_policy_name), IFNULL(GROUP_CONCAT(DISTINCT dyCoupon.coupon_policy_name), GROUP_CONCAT(DISTINCT coupon.coupon_policy_name))) AS coupon_policy_name,\\\\\\\\nIFNULL(GROUP_CONCAT(DISTINCT member.member_card_no), GROUP_CONCAT(DISTINCT member_hq.member_card_no)) AS member_card_code,\\\\\\\\nIFNULL(GROUP_CONCAT(DISTINCT member.policy_id), GROUP_CONCAT(DISTINCT member_hq.policy_id)) AS member_policy_id,\\\\\\\\nIFNULL(GROUP_CONCAT(DISTINCT member.policy_name), GROUP_CONCAT(DISTINCT member_hq.policy_name)) AS member_policy_name,\\\\\\\\nGROUP_CONCAT(DISTINCT member.group_name) AS member_group_name,\\\\\\\\nIFNULL(GROUP_CONCAT(DISTINCT member.card_type), GROUP_CONCAT(DISTINCT member_hq.card_type)) AS member_card_type,\\\\\\\\nIFNULL(GROUP_CONCAT(DISTINCT member.policy_type), GROUP_CONCAT(DISTINCT member_hq.policy_type)) AS member_policy_type,\\\\\\\\nIFNULL(GROUP_CONCAT(DISTINCT member.cinema_code_put), GROUP_CONCAT(DISTINCT member_hq.cinema_code_put)) AS cinema_code_put,\\\\\\\\nIFNULL(GROUP_CONCAT(DISTINCT member.cinema_name_put), GROUP_CONCAT(DISTINCT member_hq.cinema_name_put)) AS cinema_name_put,\\\\\\\\nIFNULL(GROUP_CONCAT(DISTINCT member.validdate_end), GROUP_CONCAT(DISTINCT member_hq.validdate_end)) AS validdate_end,\\\\\\\\nttrr.update_time_for_report AS update_time_for_report\\\\\\\\nFROM trade_ticket_refund_record ttrr\\\\\\\\nLEFT JOIN trade_order_ticket_detail totd ON totd.id = ttrr.ticket_detail_id\\\\\\\\nINNER JOIN base_cinema_info cinema ON cinema.tenant_code = totd.tenant_code\\\\\\\\nLEFT JOIN ticket_session ts ON ts.session_code = totd.session_code AND ts.tenant_code = ttrr.tenant_code\\\\\\\\nLEFT JOIN base_film_info bfi ON bfi.film_code = ts.film_code\\\\\\\\nLEFT JOIN ticket_screen_plan tsp ON tsp.plan_code = totd.plan_code\\\\\\\\nLEFT JOIN base_hall_info bhi ON bhi.hall_code = tsp.hall_code AND bhi.delstatus = 1\\\\\\\\nLEFT JOIN trade_order_info toi ON (toi.order_no = totd.order_no AND toi.order_status = 1)\\\\\\\\nLEFT JOIN trade_pay_record_base tprb ON (tprb.detail_type = 1 AND tprb.service_type = 0 AND tprb.detail_id = totd.id)\\\\\\\\nLEFT JOIN trade_pay_record_third tprt ON tprt.pay_record_base_id = tprb.id\\\\\\\\nLEFT JOIN trade_pay_record_member_card member ON member.pay_record_base_id = tprb.id\\\\\\\\nLEFT JOIN trade_pay_record_hq_member_card member_hq ON member_hq.pay_record_base_id = tprb.id\\\\\\\\nLEFT JOIN trade_pay_record_hq_coupon coupon_hq ON (coupon_hq.pay_record_base_id = tprb.id AND FIND_IN_SET(\\\\\\\\\\\\\\'12\\\\\\\\\\\\\\', tprb.pay_type) > 0)\\\\\\\\nLEFT JOIN trade_pay_record_coupon coupon ON (coupon.pay_record_base_id = tprb.id AND FIND_IN_SET(\\\\\\\\\\\\\\'12\\\\\\\\\\\\\\', tprb.pay_type) = 0)\\\\\\\\nLEFT JOIN trade_pay_record_dy_coupon dyCoupon ON (dyCoupon.pay_record_base_id = tprb.id AND tprb.pay_type=14)\\\\\\\\nWHERE tprb.detail_type = 1 \\\\\\\\nGROUP BY ttrr.id\\\\\\'\\\\n\\'\\n'\n");
    }

}
