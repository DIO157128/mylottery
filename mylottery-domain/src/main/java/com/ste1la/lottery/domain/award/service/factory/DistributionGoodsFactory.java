package com.ste1la.lottery.domain.award.service.factory;

import com.ste1la.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Service;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-01-27 15:34
 **/
@Service
public class DistributionGoodsFactory extends GoodsConfig {

    public IDistributionGoods getDistributionGoodsService(Integer awardType){
        return goodsMap.get(awardType);
    }

}

