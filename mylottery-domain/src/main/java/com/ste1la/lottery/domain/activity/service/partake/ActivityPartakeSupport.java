package com.ste1la.lottery.domain.activity.service.partake;

import com.ste1la.lottery.domain.activity.model.req.PartakeReq;
import com.ste1la.lottery.domain.activity.model.vo.ActivityBillVO;
import com.ste1la.lottery.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-01-31 18:35
 **/
public class ActivityPartakeSupport {

    @Resource
    protected IActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req){
        return activityRepository.queryActivityBill(req);
    }

}

