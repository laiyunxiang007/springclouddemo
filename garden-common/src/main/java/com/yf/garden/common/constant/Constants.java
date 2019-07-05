package com.yf.garden.common.constant;

/**
 * @author 张继生
 * @date 2019/4/24 15:56
 */
public interface Constants {
    String ORCHARD_CACHE_MAP = "orchardMap";
    String GROUND_BLOCK_CACHE_MAP = "groundBlockMap";
    String CROP_CACHE_MAP = "cropMap";
    String DICT_CACHE_MAP = "dictionaryMap";
    String USER_CACHE_MAP = "userMap";
    String SUCCESS_CODE = "200";

    String SESSION_KEY = "session_";
    String FM_SESSION_KEY = "FM_SESSION1";
    String CAMERA_TOKEN = "CAMERA_TOKEN";

    //==========字典类型常量=============
    /**
     * 农事类型
     */
    String FARM_WORK_TYPE_CODE = "farm_work_type";

    public static final String SPLIT_CHAR = "$";

    //反馈类型
    public static final String SUGGEST_TYPE = "suggest_type";

    //资讯类型
    public static final String INFO_TYPE = "info_type";

    //农事类型
    public static final String FARM_WORK_TYPE = "farm_work_type";

    //作物分类
    public static final String CROP_TYPE = "crop_type";

    //消息类型
    public static final String MSG_TYPE = "msg_type";

    //消息类型
    public static final String MSG_ICON = "msg_icon";

    //天气类型
    public static final String WEATHER_TYPE = "weather_type";

    //包装规格
    public static final String PACKAGE_STD = "package_std";

    //设备类型
    public static final String DEVICE_TYPE = "device_type";

    //果品等级
    public static final String COMMODITY_GRADE = "fruit_grade";

    //果品甜度
    public static final String COMMODITY_SWEETNESS = "fruit_sweet";

    public static final String WEATHER_TYPE_CODE = "weather_type";

    //设备状态
    public static final String DEVICE_STATUS = "device_status";
    //用药品种
    public static final String DRUP_TYPE = "drug_type";

    //包装品质
    public static final String PACKAGE_QUALITY = "package_quality";

    //施肥类型
    public static final String FERTILIZE_TYPE = "fertilize_type";

    //用户类型
    public static final String USER_ROLE ="user_role";

    //用户状态
    public static final String USER_STATUS ="user_status";

    //果品大小
    public static final String FRUIT_SIZE ="fruit_size";

    //精品码量
    public static final String KG_A_FEW ="kg_a_few";




    //================END======================
    //================设备类型======================
    /**
     * 枪机类型
     */
    char DEVICE_TYPE_QIANG_JI = 'A';
    /**
     * 球机类型
     */
    char DEVICE_TYPE_QIU_JI = 'B';

    /**
     * 全景类型
     */
    char DEVICE_TYPE_QUAN_JING = 'C';
    /**
     * FM1类型
     */
    char DEVICE_TYPE_FM1 = 'D';
    /**
     * FM2类型
     */
    char DEVICE_TYPE_FM2 = 'E';
    //==================END================
    /**
     * 待审核
     */
    String WAIT_APPROVE_STATUS = "CP";
    /**
     * 驳回
     */
    public static final String REJECT_APPROVE_STATUS = "RJ";
    /**
     * 审核通过
     */
    public static final String PASS_APPROVE_STATUS = "PS";
    /**
     * 删除、作废
     */
    public static final String DELETE_APPROVE_STATUS = "RJ";
    /**
     * 用户冻结状态
     */
    public static final int USER_FREEZE_STATUS = 0;
    /**
     * 用户激活状态
     */
    public static final int USER_ACTIVE_STATUS = 1;
    /**
     * APP用户类型
     */
    public static final int APP_USER_TYPE = 0;
    /**
     * 后台用户类型
     */
    public static final int PC_USER_TYPE = 1;
    /**
     * 用户地址类型
     */
    public static final String USER_ADDRESS_TYPE="A";
    /**
     * 果园地址类型
     */
    public static final String ORCHARD_ADDRESS_TYPE="B";
    /**
     * 地块地址类型
     */
    public static final String BLOCK_ADDRESS_TYPE="C";

    /**
     * 摄像头地址类型
     */
    public static final String CARMERA_ADDRESS_TYPE="D";
    /**
     * FM1地址类型
     */
    public static final String FM1_ADDRESS_TYPE="E";
    /**
     * FM2地址类型
     */
    public static final String FM2_ADDRESS_TYPE="F";
    /**
     * EM1地址类型
     */
    public static final String EM1_ADDRESS_TYPE="G";
    /**
     * 农场主角色
     */
    public static final int FARMOR_ROLE = 0;
    /**
     * 工人角色
     */
    public static final int WORKER_ROLE = 1;
    /**
     * 施工角色
     */
    public static final int CONSTRUCTION_ROLE = 2;
    /**
     * 后台管理员角色
     */
    public static final int MANAGER_ROLE = 3;
    /**
     * 七天
     */
    public static final String SEVEN_DAY_RANGE="七天";
    /**
     * 一个月
     */
    public static final String ONE_MONTH_RANGE="一个月";
    /**
     * 三个月
     */
    public static final String THREE_MONTH_RANGE="三个月";
    /**
     * 一年
     */
    public static final String ONE_YEAR_RANGE="一年";
    /**
     * 小码类型
     */
    public static final int BOUTIQUE_CODE_TYPE=1;
    /**
     * 大码类型
     */
    public static final int BOX_CODE_TYPE=0;
    /**
     * FM1
     */
    public static final String FM1_MODEL="FM1";
    /**
     * FM2
     */
    public static final String FM2_MODEL="FM2";

    public static final boolean FALSE=false;

    public static final boolean TRUE=true;
    /**
     * 设备列表api
     */
    public static final String DEVICE_LIST_API = "http://api.farm.stdag.cn/external/third/v1/device/list/{}?{}&page_no={}&page_size={}";

    /**
     * 固定设备最新数据api  针对设备类型 1，2，9
     */
    public static final String LATEST_NORMAL_DATA_API = "http://api.farm.stdag.cn/external/third/v1/collection/catcher/latest/{}/{}?{}";

    /**
     * 拔插式 可变传感器最新数据api  针对设备类型 5，6
     */
    public static final String LATEST_SENSOR_DATA_API = "http://api.farm.stdag.cn/external/third/v1/collection/node/latest/{}/{}?{}";

    /**
     * 登陆 api
     */
    public static final String LOGIN_API = "http://api.farm.stdag.cn/external/third/v1/user/login";

    /**
     * 获取用户绑定的设备类型列表
     */
    public static final String DEVICE_TYPE_LIST_API = "http://api.farm.stdag.cn/external/third/v1/device/type/list?";

    public static final String CLIENT_ID = "kpktc3d";

    public static final String SECRET_KEY = "smahg80pifql4s5rrrrzvvqgb8jz756i";
    /**
     * 测试账号
     */
    public static final String ACCOUNT = "10002";
    /**
     * 测试密码
     */
    public static final String PASSWORD = "111111";

    public static final String PLANT_TYPE="PLANT_TYPE";

    /**
     * 添加消息维护默认
     */
    public static final int MSG_DELETE_FLAG=1;

    /**
     * 添加百科维护默认
     */
    public static final Long CROP_DELETE_FLAG= Long.valueOf(0);

    public static final int RELEASE_GUIDE=1;

    public static final int RELEASE_GUIDE_FALSE=0;
    /**
     * 添加消息维护默认
     */
    public static final boolean MSG_STATUS=true;
    /**
     * 资讯截取字符串长度
     */
    public static final int LENGHT=28;
}
