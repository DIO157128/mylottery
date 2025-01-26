package com.ste1la.lottery.interfaces;

import com.ste1la.lottery.common.Constants;
import com.ste1la.lottery.common.Result;
import com.ste1la.lottery.infrastructure.dao.IActivityDao;
import com.ste1la.lottery.infrastructure.po.Activity;
import com.ste1la.lottery.rpc.IActivityBooth;
import com.ste1la.lottery.rpc.dto.ActivityDto;
import com.ste1la.lottery.rpc.req.ActivityReq;
import com.ste1la.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-01-25 16:45
 **/
@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }

}

