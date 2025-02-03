package com.ste1la.lottery.domain.rule.service.logic;

import com.ste1la.lottery.domain.rule.model.req.DecisionMatterReq;
import com.ste1la.lottery.domain.rule.model.vo.TreeNodeLineVO;

import java.util.List;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-03 12:34
 **/
public interface LogicFilter {

    /**
     * 逻辑决策器
     * @param matterValue          决策值
     * @param treeNodeLineInfoList 决策节点
     * @return                     下一个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLineVO> treeNodeLineInfoList);

    /**
     * 获取决策值
     *
     * @param decisionMatter 决策物料
     * @return               决策值
     */
    String matterValue(DecisionMatterReq decisionMatter);

}

