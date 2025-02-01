package com.ste1la.lottery.domain.activity.service.partake;

import com.ste1la.lottery.domain.activity.model.req.PartakeReq;
import com.ste1la.lottery.domain.activity.model.res.PartakeResult;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-01-28 16:15
 **/
public interface IActivityPartake {

    /**
     * 参与活动
     * @param req 入参
     * @return    领取结果
     */
    PartakeResult doPartake(PartakeReq req);

}
