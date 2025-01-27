package com.ste1la.lottery.domain.strategy.service.draw;

import com.ste1la.lottery.domain.strategy.model.req.DrawReq;
import com.ste1la.lottery.domain.strategy.model.res.DrawResult;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-01-26 16:07
 **/
public interface IDrawExec {

    /**
     * 抽奖方法
     * @param req 抽奖参数；用户ID、策略ID
     * @return    中奖结果
     */
    DrawResult doDrawExec(DrawReq req);

}
