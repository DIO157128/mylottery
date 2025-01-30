package com.ste1la.lottery.domain.support.ids.policy;

import com.ste1la.lottery.domain.support.ids.IIdGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-01-29 17:31
 **/
@Component
public class RandomNumeric implements IIdGenerator {

    @Override
    public long nextId() {
        return Long.parseLong(RandomStringUtils.randomNumeric(11));
    }

}
