package com.ste1la.lottery.domain.rule.service.logic.impl;

import com.ste1la.lottery.domain.rule.model.req.DecisionMatterReq;
import com.ste1la.lottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-03 12:35
 **/
@Component
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("gender").toString();
    }

}

