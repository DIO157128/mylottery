package process.res;

import com.ste1la.lottery.common.Result;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-03 14:45
 **/
public class RuleQuantificationCrowdResult extends Result {

    /** 活动ID */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
