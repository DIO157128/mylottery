package com.ste1la.lottery.domain.rule.service.engine;

import com.ste1la.lottery.domain.rule.model.req.DecisionMatterReq;
import com.ste1la.lottery.domain.rule.model.res.EngineResult;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-03 12:34
 **/
public interface EngineFilter {

    /**
     * 规则过滤器接口
     *
     * @param matter      规则决策物料
     * @return            规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);

}
