package com.ste1la.lottery.rpc;


import com.ste1la.lottery.rpc.req.DrawReq;
import com.ste1la.lottery.rpc.req.QuantificationDrawReq;
import com.ste1la.lottery.rpc.res.DrawRes;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-03 15:00
 **/
public interface ILotteryActivityBooth {

    /**
     * 指定活动抽奖
     * @param drawReq 请求参数
     * @return        抽奖结果
     */
    DrawRes doDraw(DrawReq drawReq);

    /**
     * 量化人群抽奖
     * @param quantificationDrawReq 请求参数
     * @return                      抽奖结果
     */
    DrawRes doQuantificationDraw(QuantificationDrawReq quantificationDrawReq);

}
