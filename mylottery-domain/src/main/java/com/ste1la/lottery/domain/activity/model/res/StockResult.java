package com.ste1la.lottery.domain.activity.model.res;

import com.ste1la.lottery.common.Result;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-05 22:29
 **/
public class StockResult extends Result {

    /**
     * 库存 Key
     */
    private String stockKey;
    /**
     * activity 库存剩余
     */
    private Integer stockSurplusCount;

    public StockResult(String code, String info) {
        super(code, info);
    }

    public StockResult(String code, String info, String stockKey, Integer stockSurplusCount) {
        super(code, info);
        this.stockKey = stockKey;
        this.stockSurplusCount = stockSurplusCount;
    }

    public String getStockKey() {
        return stockKey;
    }

    public void setStockKey(String stockKey) {
        this.stockKey = stockKey;
    }

    public Integer getStockSurplusCount() {
        return stockSurplusCount;
    }

    public void setStockSurplusCount(Integer stockSurplusCount) {
        this.stockSurplusCount = stockSurplusCount;
    }
}

