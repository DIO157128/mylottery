package com.ste1la.lottery.domain.award.service.goods.impl;

import com.ste1la.lottery.common.Constants;
import com.ste1la.lottery.domain.award.model.req.GoodsReq;
import com.ste1la.lottery.domain.award.model.res.DistributionRes;
import com.ste1la.lottery.domain.award.service.goods.DistributionBase;
import com.ste1la.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-01-27 15:36
 **/
@Component
public class RedeemCodeGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用兑换码
        logger.info("模拟调用兑换码 uId：{} awardContent：{}", req.getuId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.RedeemCodeGoods.getCode();
    }

}

