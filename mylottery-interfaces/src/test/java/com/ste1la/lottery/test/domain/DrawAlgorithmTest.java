package com.ste1la.lottery.test.domain;

import com.alibaba.fastjson.JSON;
import com.ste1la.lottery.common.Constants;
import com.ste1la.lottery.domain.strategy.model.req.DrawReq;
import com.ste1la.lottery.domain.strategy.model.res.DrawResult;
import com.ste1la.lottery.domain.strategy.model.vo.AwardRateVO;
import com.ste1la.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import com.ste1la.lottery.domain.strategy.service.draw.IDrawExec;
import com.ste1la.lottery.test.SpringRunnerTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-01-26 16:12
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DrawAlgorithmTest {

    private Logger logger = LoggerFactory.getLogger(SpringRunnerTest.class);

    @Resource(name = "entiretyRateRandomDrawAlgorithm")
//    @Resource(name = "singleRateRandomDrawAlgorithm")
    private IDrawAlgorithm randomDrawAlgorithm;

    @Resource(name = "drawExec")
    private IDrawExec iDrawExec;

    @Before
    public void init() {
        // 奖品信息
        List<AwardRateVO> strategyList = new ArrayList<>();
        strategyList.add(new AwardRateVO("一等奖：IMac", new BigDecimal("0.05")));
        strategyList.add(new AwardRateVO("二等奖：iphone", new BigDecimal("0.15")));
        strategyList.add(new AwardRateVO("三等奖：ipad", new BigDecimal("0.20")));
        strategyList.add(new AwardRateVO("四等奖：AirPods", new BigDecimal("0.25")));
        strategyList.add(new AwardRateVO("五等奖：充电宝", new BigDecimal("0.35")));

        // 初始数据
        randomDrawAlgorithm.initRateTuple(100001L, Constants.StrategyMode.SINGLE.getCode(), strategyList);
    }

    @Test
    public void test_randomDrawAlgorithm() {

        List<String> excludeAwardIds = new ArrayList<>();
        excludeAwardIds.add("二等奖：iphone");
        excludeAwardIds.add("四等奖：AirPods");

        for (int i = 0; i < 20; i++) {
            System.out.println("中奖结果：" + randomDrawAlgorithm.randomDraw(100001L, excludeAwardIds));
        }

    }

    @Test
    public void test_iDrawExec() {
        DrawResult drawResult = iDrawExec.doDrawExec(new DrawReq("小傅哥", 10001L));
        logger.info("测试结果：{}", JSON.toJSONString(drawResult));
    }

}

