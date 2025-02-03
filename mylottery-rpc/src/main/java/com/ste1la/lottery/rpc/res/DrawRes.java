package com.ste1la.lottery.rpc.res;

import com.ste1la.lottery.common.Result;
import com.ste1la.lottery.rpc.dto.AwardDTO;

import java.io.Serializable;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-03 15:00
 **/
public class DrawRes extends Result implements Serializable {

    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }

}


