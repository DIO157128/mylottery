package com.ste1la.lottery.domain.rule.repository;

import com.ste1la.lottery.domain.rule.model.aggregates.TreeRuleRich;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-03 12:33
 **/
public interface IRuleRepository {

    /**
     * 查询规则决策树配置
     *
     * @param treeId    决策树ID
     * @return          决策树配置
     */
    TreeRuleRich queryTreeRuleRich(Long treeId);

}
