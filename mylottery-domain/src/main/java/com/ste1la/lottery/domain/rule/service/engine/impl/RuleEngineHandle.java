package com.ste1la.lottery.domain.rule.service.engine.impl;

import com.ste1la.lottery.domain.rule.model.aggregates.TreeRuleRich;
import com.ste1la.lottery.domain.rule.model.req.DecisionMatterReq;
import com.ste1la.lottery.domain.rule.model.res.EngineResult;
import com.ste1la.lottery.domain.rule.model.vo.TreeNodeVO;
import com.ste1la.lottery.domain.rule.repository.IRuleRepository;
import com.ste1la.lottery.domain.rule.service.engine.EngineBase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-03 12:35
 **/
@Service("ruleEngineHandle")
public class RuleEngineHandle extends EngineBase {

    @Resource
    private IRuleRepository ruleRepository;

    @Override
    public EngineResult process(DecisionMatterReq matter) {
        // 决策规则树
        TreeRuleRich treeRuleRich = ruleRepository.queryTreeRuleRich(matter.getTreeId());
        if (null == treeRuleRich) {
            throw new RuntimeException("Tree Rule is null!");
        }

        // 决策节点
        TreeNodeVO treeNodeInfo = engineDecisionMaker(treeRuleRich, matter);

        // 决策结果
        return new EngineResult(matter.getUserId(), treeNodeInfo.getTreeId(), treeNodeInfo.getTreeNodeId(), treeNodeInfo.getNodeValue());
    }

}

