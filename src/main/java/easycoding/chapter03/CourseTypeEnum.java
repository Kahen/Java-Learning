package easycoding.chapter03;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-04-27 16:06
 */
public enum CourseTypeEnum {
    /**
     * 允许官方和僵尸创建和运营
     */
    VIDEO_COURSE(1, "录播课程"),
    /**
     * 只允许官方创建和运营，初始化必须设置合理的报名人数上限
     */
    LIVE_COURSE(2, "直播课程"),
    
    /**
     * 只允许官方创建和运营
     */
    OFFLINE_COURSE(3, "线下课程");
    private int seq;
    private String desc;

    CourseTypeEnum(int seq, String desc) {
        this.desc = desc;
        this.seq = seq;
    }

    public int getSeq() {
        return seq;
    }

    public String getDesc() {
        return desc;
    }
}
