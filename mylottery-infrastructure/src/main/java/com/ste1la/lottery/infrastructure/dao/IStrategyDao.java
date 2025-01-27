package com.ste1la.lottery.infrastructure.dao;

import com.ste1la.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStrategyDao {

    Strategy queryStrategy(Long strategyId);

}
