package process;

import process.req.DrawProcessReq;
import process.res.DrawProcessResult;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-01 20:25
 **/
public interface IActivityProcess {

    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);

}