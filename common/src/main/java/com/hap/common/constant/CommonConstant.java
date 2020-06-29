package com.hap.common.constant;

/**
 * @author robin
 * @date 2017/10/29
 */


public interface CommonConstant {
    /**
     * token请求头名称
     */
    String REQ_HEADER = "Authorization";

    /**
     * token分割符
     */
    String TOKEN_SPLIT = "Bearer ";

    /**
     * jwt签名
     */
    String SIGN_KEY = "PIG";
    /**
     * 删除
     */
    Integer STATUS_DEL = 1;
    /**
     * 正常
     * status
     */
    Integer STATUS_NORMAL = 0;

    /**
     * 消息已读
     */
    Integer IS_READ = 1;

    /**
     * 消息未读
     */
    Integer UN_READ = 0;

    /**
     * 锁定
     */
    Integer STATUS_LOCK = 9;

    /**
     * 菜单
     */
    Integer MENU = 0;

    /**
     * 按钮
     */
    Integer BUTTON = 1;

    /**
     * 删除标记
     */
    String DEL_FLAG = "del_flag";

    /**
     * 状态标记
     */
    String STATUS = "status";

    /**
     * 编码
     */
    String UTF8 = "UTF-8";

    /**
     * JSON 资源
     */
    String CONTENT_TYPE = "application/json; charset=utf-8";

    /**
     * 阿里大鱼
     */
    String ALIYUN_SMS = "aliyun_sms";

    /**
     * 路由信息Redis保存的key
     */
    String ROUTE_KEY = "_ROUTE_KEY";

    /**
     * 图床地址
     */
    String SM_MS_URL = "https://sm.ms/api/upload";

    public static final String HEADER_KEY = "access-token";
    public static final String HEADER_SERVICE_ID = "SERVICE-ID";

    /**
     *
     * 供应商商品审核状态:未审核
     */
    Integer SUPPLIER_PRODUCT_EXAMINE_STATUS_ZERO = 0;

    /**
     * 供应商商品审核状态:待审核
     */
    Integer SUPPLIER_PRODUCT_EXAMINE_STATUS_ONE = 1;

    /**
     * 供应商商品审核状态:审核完成
     */
    Integer SUPPLIER_PRODUCT_EXAMINE_STATUS_TWO = 2;

    /**
     * 供应商商品审核状态:拒绝通过
     */
    Integer SUPPLIER_PRODUCT_EXAMINE_STATUS_THREE = 3;

    /**
     * 供应商商品审核状态:下架
     */
    Integer SUPPLIER_PRODUCT_EXAMINE_STATUS_FOUR = 4;


    /**
     * 商家商品状态:下架
     */
    Integer SHOP_PRODUCT_EXAMINE_STATUS_THREE = 3;

    /**
     * 商家商品状态:失效
     */
    Integer SHOP_PRODUCT_EXAMINE_STATUS_FOUR = 4;


    /**
     * 保证金审核条件:自动审核
     */
    Integer GUARANTEE_AUTO_EXAMINE_CONDITION = 0;

    /**
     * 保证金审核条件:人工审核
     */
    Integer GUARANTEE_ARTI_EXAMINE_CONDITION = 1;
    /**
     * 平台审核状态(-1:待平台人工审核)
     */
    Integer GUARANTEE_ARTI_EXAMINE_STATUS = -1;
    /**
     * 平台审核状态(0:平台审核通过,1:平台审核驳回,2:财务审核通过,3:财务审核驳回,4:出纳审核通过,5:出纳审核驳回,
     * 6:缴存完成,7：打款中，8：退回完成，10：自动审核通过)
     */
    Integer GUARANTEE_ARTI_EXAMINE_STATUS_ZERO = 0;

    /**
     * 保证金审核状态:平台审核驳回
     */
    Integer GUARANTEE_ARTI_EXAMINE_STATUS_ONE = 1;

    /**
     * 保证金审核状态:财务审核通过
     */
    Integer GUARANTEE_ARTI_EXAMINE_STATUS_TWO = 2;

    /**
     * 保证金审核状态:财务审核驳回
     */
    Integer GUARANTEE_ARTI_EXAMINE_STATUS_THREE = 3;

    /**
     * 保证金审核状态:出纳审核通过
     */
    Integer GUARANTEE_ARTI_EXAMINE_STATUS_FOUR = 4;
    /**
     * 保证金审核状态：出纳审核驳回
     */
    Integer GUARANTEE_ARTI_EXAMINE_STATUS_FIVE = 5;

    /**
     * 保证金审核状态:缴存完成
     */
    Integer GUARANTEE_ARTI_EXAMINE_STATUS_SIX = 6;

    /**
     * 保证金审核状态:退回打款中
     */
    Integer GUARANTEE_ARTI_EXAMINE_STATUS_SEVEN = 7;

    /**
     * 保证金审核状态:退回完成
     */
    Integer GUARANTEE_ARTI_EXAMINE_STATUS_EIGHT = 8;
    /**
     * 保证金审核状态：自动审核通过
     */
    Integer GUARANTEE_ARTI_EXAMINE_STATUS_TEN = 10;

    /**
     * 支付状态（0，支付中、1:支付成功,2,支付失败
     */
    Integer GUARANTEE_PAY_EXAMINE_STATUS_ZERO = 0;

    /**
     * 支付状态:支付成功
     */
    Integer GUARANTEE_PAY_EXAMINE_STATUS_ONE = 1;

    /**
     * 支付状态:支付失败
     */
    Integer GUARANTEE_PAY_EXAMINE_STATUS_TWO = 2;
    /**
     * 支付状态:原路退回
     */
    Integer GUARANTEE_PAY_EXAMINE_STATUS_THREE = 3;


    /**
     * 平台审核结果：审核通过
     */
    Integer GUARANTEE_EXAMINE_STATUS_SUCCESS = 0;

    /**
     * 平台审核结果:审核驳回
     */
    Integer GUARANTEE_EXAMINE_STATUS_FAIL = 1;

    /**
     * 保证金审核类型：平台审核
     */
    Integer GUARANTEE_ROLE_EXAMINE_STATUS_ZERO = 0;

    /**
     * 保证金审核类型:财务审核
     */
    Integer GUARANTEE_ROLE_EXAMINE_STATUS_ONE = 1;

    /**
     * 保证金审核类型:出纳审核
     */
    Integer GUARANTEE_ROLE_EXAMINE_STATUS_TWO = 2;
    /**
     * 退款状态(0:退款中,1:退款成功,2:退款失败)
     */
    Integer GUARANTEE_REFUND_EXAMINE_STATUS_ZERO = 0;

    /**
     * 退款状态:退款成功
     */
    Integer GUARANTEE_REFUND_EXAMINE_STATUS_ONE = 1;

    /**
     * 退款状态:退款失败
     */
    Integer GUARANTEE_REFUND_EXAMINE_STATUS_TWO = 2;
    /**
     * 缴纳保证金状态（0：未缴纳，1：已缴纳，2：待补缴，3：已退回）
     */
    Integer GUARANTEE_PAY_STATUS_ZERO = 0;

    /**
     * 缴纳保证金状态:已缴纳
     */
    Integer GUARANTEE_PAY_STATUS_ONE = 1;

    /**
     * 缴纳保证金状态:待补缴
     */
    Integer GUARANTEE_PAY_STATUS_TWO = 2;
    /**
     * 缴纳保证金状态:已退回
     */
    Integer GUARANTEE_PAY_STATUS_THREE = 3;

}
