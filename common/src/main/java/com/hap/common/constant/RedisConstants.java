package com.hap.common.constant;

/**
 * @author Administrator
 * @Title: RedisConstants
 * @ProjectName project
 * @Description:Resis常量
 * @date 2018/12/26 002610:33
 */
public class RedisConstants {
    /**
     * 登录认证
     */
    public static final String AUTHORIZATION = "Authorization";
    /**
     * 用户信息
     **/
    public static final String USER_CACHE_NAMESPACE = "U:USER:INFO:";

    /**
     * 用户信息Token
     **/
    public static final String USERTOKEN_CACHE_NAMESPACE = "U:USER:TOKEN:";

    /**
     * 获取当前登录用户信息
     */
    public static final String USERLOGIN_CACHE_NAMESPACE = "U:USER:CURR:";

    /**
     * 用户WX信息
     **/
    public static final String USER_WX_NAMESPACE = "U:USER:WX:INFO:";

    public static final String USER_GROWTH_SETTING = "U:USER:GROWTH:";

    /**
     * 用户WX TOKEN信息
     **/
    public static final String USER_WX_TOKEN_NAMESPACE = "U:USER:WX:TOKEN:INFO:";

    /**
     * 总管理员信息Token
     **/
    public static final String ADMINTOKEN_CACHE_NAMESPACE = "U:ADMIN:TOKEN:";

    /**
     * 供应商店铺ID-Token
     **/
    public static final String SUPPLIER_SELLERID_CACHE_NAMESPACE = "U:SUPPLIER:SELLERID:TOKEN:";

    /**
     * 公会ID-Token
     **/
    public static final String LEAGUE_SELLERID_CACHE_NAMESPACE = "U:LEAGUE:SELLERID:TOKEN:";

    /**
     * 音乐引用次数
     */
    public static final String MUSIC_CHCHE_COUNT = "M:MUSIC";
    /**
     * 短视频动态数据
     */
    public static final String VIDEO_DYNAMIC_COUNT = "VIDEO:DYNAMIC:";
    /**
     * 用户动态数据
     */
    public static final String USER_DYNAMIC_COUNT = "USER:DYNAMIC:";

    /**
     * 记录用户的播放记录
     * 音乐引用次数
     */
    public static final String USER_PLAYRECORD = "U:PLAYRECORD:";

    /**
     * 系统启动首屏
     */
    public static final String SYSTEM_CACHE_STARTPIC = "S:STARTPIC:";

    /**
     * 用户消息评论数冒泡
     */
    public static final String MESSAGE_COMMENT_COUNT = "M:COMMENT";

    /**
     * 短视频评论数动态数据
     */
    public static final String COMMENT_CACHE_COUNT = "C:COMMENT";

    /**
     * 短视频点赞数动态数据
     */
    public static final String PRAISE_CACHE_COUNT = "P:PARISE";

    /**
     * 用户消息点赞冒泡
     */
    public static final String MESSAGE_PRAISE_COUNT = "M:PARISE";

    /**
     * 会员魅力值配置数据
     */
    public static final String USER_CHARM_CONFIG = "CHARM:CONFIG";

    /**
     * 会员魅力值认证字典
     */
    public static final String AUTH_CENTER_DICT = "CHARM:DICT";

    /**
     * 用户操作的魅力值大小和次数
     */
    public static final String USER_CHARM_NUM = "U:CHARM:";

    /**
     * 用户类型
     */
    public static final String USER_TYPECLASS_INFO = "U:TYPECLASS";

    /**
     * 结算配置表
     */
    public static final String SETTLEMENT_CONFIG = "U:SETCONFIG";

    /**
     * 供货商名称外键
     */
    public static final String SUPPLIER_NAME = "SU:NAME";

    /**
     * 店铺名称外键
     */
    public static final String SHOP_NAME = "SH:NAME";

    /**
     * @Author
     * @Description ADDPLAYCOUNT
     * @Date 11:08 2019/4/24 0024
     * @Param
     * @return
     */
    public static final String CHARM_CONFIG_CHARMVALUE_ADDPLAYCOUNT = "C:ADDPLAYCOUNT:";
    public static final String CHARM_CONFIG_OPERATIONNUM_ADDPLAYCOUNT = "O:ADDPLAYCOUNT:";

    /**
     * 根据产品编号列表获取团购产品列表
     * http://{{supplier_team_api}}/group/listbyIds
     */
    public static final String GROUP_LIST_URL = "http://47.111.146.24:1115/group/listbyIds";
    /**
     * 微信授权规则平台信息
     **/
    public static final String USER_WX_PLATFORM_CACHE_NAMESPACE = "U:USER:WX:PLATFORM:";

    /**
     * 订单配置的键
     */
    public static final String ORDER_DISPOSE = "O:DISPOSEVALUE";

    /**
     * 通过主播销售的外键
     */
    public static final String ANCHOR_SELLER = "A:ANCHORSELLER:";

    /**
     * 本场次主播消费额
     */
    public static final String ANCHOR_LIVER_AMOUNT = "A:LIVER";
    /**
     * 累计主播消费额
     */
    public static final String ANCHOR_SUM_AMOUNT = "A:SUM";

    /**
     * 订单用户信息缓存
     */
    public static final String ORDER_USER_INFO = "O:USER:";

    /**
     * 礼物缓存信息
     */
    public static final String ORDER_GIFT_INFO = "O:GIFT:";

    /**
     * 主播信息缓存
     */
    public static final String ORDER_ANCHOR_INFO = "O:ANCHOR:";
    /**
     * 主播配置缓存
     */
    public static final String ORDER_ANCHOR_CONFIG_INFO = "O:ANCHORCONFIG:";

    /**
     * 工会分成配置信息缓存
     */
    public static final String LEAGUE_INCOME_CONFIG = "L:LEAGUEINCOME:";
    /**
     * 经纪人分成配置信息缓存
     */
    public static final String AGENT_INCOME_CONFIG = "A:AGENTINCOME:";

    /**
     * 物流外键
     */
    public static final String FAST_DATA_CACHE = "O:FASTCACHE:";

    /**
     * 用户对应对应机器人配置信息
     **/
    public static final String LiveRobotConfig_CACHE_NAMESPACE = "U:USER:LiveRobotConfig:";

    /**
     * 用户对应对应机器人配置信息
     **/
    public static final String LiveGradeDto_CACHE_NAMESPACE = "U:USER:LiveGradeDto:";

    /**
     * 会员等级信息key
     */
    public static final String MANGER_MEMBER_LEVEL = "m:member:level:";
    //会员分组
    public static final String MANGER_GROUP_NAME = "m:member:group:";
    //会员类型
    public static final String MANGER_USER_TYPE = "m:member:type:";
    //背景图
    public static final String MANGER_BACKGROUND_TYPE = "m:background:type:";
    //会员等级列表
    public static final String MANGER_LEVEL = "m:level:grade:";
    //会员等级分类列表
    public static final String MANGER_LEVEL_TYPE = "m:level:type";
    //店铺等级信息
    public static final String SHOP_GRADE_INFO = "s:grade:";
    //根据店铺id关联店铺信息
    public static final String SHOP_INFO_SHOPID = "s:info:shopId:";
    //根据店铺用户id关联店铺信息
    public static final String SHOP_INFO_USERID = "s:info:userId:";
    //关注店铺列表
    public static final String SHOP_USER_ATTENTION = "s:user:attention:";
    //关注店铺数
    public static final String SHOP_USER_ATTENTION_COUNT = "s:user:attention:count:";
    //商品数量
    public static final String PRODUCT_NUMBER = "g:product:count:";
    //购物车数
    public static final String CART_NUMBER = "g:product:cart:";
    //直播状态
    public static final String LIVE_STATUS = "l:live:status:";
    //直播等级
    public static final String LIVE_LEVEL = "l:live:level:";
    public static final String LIVE_LEVELS = "l:lives:level:";
    //直播收藏数
    public static final String LIVE_COLLECTION_COUNT = "l:live:coll:count:";
    //直播打赏状态
    public static final String LIVE_GIFT_STATUS = "l:live:gift:status:";
    //用户资金
    public static final String CAPITAL_MONEY_USERID = "c:capital:userId:";
    //用户充值记录
    public static final String CAPITAL_RECHARGE_RECORD = "c:charge:userId:";
    //用户提现记录
    public static final String CAPITAL_WITHDRWAL_RECORD = "c:withdrawal:userId:";
    //用户消费记录
    public static final String ORDER_CONSUME_USERID = "o:consume:userId:";
    //订单金额
    public static final String ORDER_SALARY = "o:salary";
    //用户购买订单记录
    public static final String ORDER_BUYER_USERIDS = "o:buyers:userIds:";
    public static final String ORDER_BUYER_USERID = "o:buyer:userId:";
    //平安提现账号绑定列表
    public static final String PINGAN_TIXIAN_USERID = "p:tixian:userId:";
    //平安充值账号绑定列表
    public static final String PINGAN_PAY_USERID = "p:pay:userId:";
    //店铺id查询供应商信息
    public static final String SUPPLIER_INFO_SUPPLIERID = "su:info:supplierId:";
    //用户id查询供应商信息
    public static final String SUPPLIER_INFO_USERID = "su:info:userId:";
    //关注供应商店铺列表
    public static final String SUPPLIER_USER_ATTENTION = "su:user:attention:";
    //关注供应商店铺数
    public static final String SUPPLIER_USER_ATTENTION_COUNT = "su:user:attention:count:";
    //供应商商品信息
    public static final String SUPPLIER_GOODS_INFO = "su:goods:info:";
    //商品状态
    public static final String SUPPLIER_GOODS_STATUS = "su:goods:status:";
    //商品数量
    public static final String SUPPLIER_GOODS_COUNT = "su:goods:count:";
    //用户关注列表
    public static final String USER_ATTENTION = "u:user:attention:";
    //用户粉丝列表
    public static final String USER_FANS = "u:user:fans:";
    //用户好友列表
    public static final String USER_FRIENDS = "u:user:friends:";
    //用户收货地址列表
    public static final String USER_SHOP_ADDRESS = "u:shop:address:";
    //举报类型
    public static final String USER_REPORT_TYPE = "u:report:type:";


    /**
     * 订单冒泡数
     */
    public static final String ORDER_BUBBLE_COUNT = "order:bubble:count";
    //会员基本信息列表分页缓存
    public static final String USER_INFO_PAGE = "u:userInfo:page:";
    //会员认证列表信息分页缓存
    public static final String AUTH_INFO_PAGE = "u:authInfo:page:";

    /**
     * 分享参数
     */
    public static final String WX_SHARE_SCENE = "wx:share:scene:";

    /**
     * 放重复点击的key
     */
    public static final String PREVENT_DUPLICATE_CLICKS = "c:click:";
}
