package com.ste1la.lottery.domain.activity.service.partake;

import com.ste1la.lottery.common.Result;
import com.ste1la.lottery.domain.activity.model.req.PartakeReq;
import com.ste1la.lottery.domain.activity.model.res.PartakeResult;
import com.ste1la.lottery.domain.activity.model.vo.DrawOrderVO;

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

    /**
     * 保存奖品单
     * @param drawOrder 奖品单
     * @return          保存结果
     */
    Result recordDrawOrder(DrawOrderVO drawOrder);

}