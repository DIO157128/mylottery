package com.ste1la.lottery.infrastructure.dao;

import com.ste1la.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface IActivityDao {

    void insert(Activity req);

    Activity queryActivityById(Long activityId);

}
