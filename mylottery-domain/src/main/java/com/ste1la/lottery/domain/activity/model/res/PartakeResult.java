package com.ste1la.lottery.domain.activity.model.res;

import com.ste1la.lottery.common.Result;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-01-31 18:32
 **/
public class PartakeResult extends Result {

    /**
     * 策略ID
     */
    private Long strategyId;

    public PartakeResult(String code, String info) {
        super(code, info);
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}

