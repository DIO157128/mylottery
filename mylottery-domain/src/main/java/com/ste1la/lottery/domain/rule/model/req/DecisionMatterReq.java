package com.ste1la.lottery.domain.rule.model.req;

import java.util.Map;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-03 12:32
 **/
public class DecisionMatterReq {

    /** 规则树ID */
    private Long treeId;
    /** 用户ID */
    private String userId;
    /** 决策值 */
    private Map<String, Object> valMap;

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Object> getValMap() {
        return valMap;
    }

    public void setValMap(Map<String, Object> valMap) {
        this.valMap = valMap;
    }

}

