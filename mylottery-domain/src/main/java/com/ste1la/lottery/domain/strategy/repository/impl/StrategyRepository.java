package com.ste1la.lottery.domain.strategy.repository.impl;

import com.ste1la.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.ste1la.lottery.domain.strategy.repository.IStrategyRepository;
import com.ste1la.lottery.infrastructure.dao.IAwardDao;
import com.ste1la.lottery.infrastructure.dao.IStrategyDao;
import com.ste1la.lottery.infrastructure.dao.IStrategyDetailDao;
import com.ste1la.lottery.infrastructure.po.Award;
import com.ste1la.lottery.infrastructure.po.Strategy;
import com.ste1la.lottery.infrastructure.po.StrategyDetail;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-01-26 16:01
 **/
@Component
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetailList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }

    @Override
    public List<String> queryNoStockStrategyAwardList(Long strategyId) {
        return strategyDetailDao.queryNoStockStrategyAwardList(strategyId);
    }

    @Override
    public boolean deductStock(Long strategyId, String awardId) {
        StrategyDetail req = new StrategyDetail();
        req.setStrategyId(strategyId);
        req.setAwardId(awardId);
        int count = strategyDetailDao.deductStock(req);
        return count == 1;
    }

}

