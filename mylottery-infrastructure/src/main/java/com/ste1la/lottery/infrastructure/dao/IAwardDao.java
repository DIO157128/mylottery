package com.ste1la.lottery.infrastructure.dao;

import com.ste1la.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);

}

