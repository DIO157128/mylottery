package com.ste1la.lottery.application.process;

import com.ste1la.lottery.application.process.req.DrawProcessReq;
import com.ste1la.lottery.application.process.res.DrawProcessResult;
import com.ste1la.lottery.application.process.res.RuleQuantificationCrowdResult;
import com.ste1la.lottery.domain.rule.model.req.DecisionMatterReq;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-01 20:25
 **/
public interface IActivityProcess {

    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);

    /**
     * 规则量化人群，返回可参与的活动ID
     * @param req   规则请求
     * @return      量化结果，用户可以参与的活动ID
     */
    RuleQuantificationCrowdResult doRuleQuantificationCrowd(DecisionMatterReq req);

}