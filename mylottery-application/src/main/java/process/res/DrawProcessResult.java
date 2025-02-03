package process.res;

import com.ste1la.lottery.common.Result;
import com.ste1la.lottery.domain.strategy.model.vo.DrawAwardVO;

/**
 * @program: mylottery
 * @description:
 * @author: ste1la
 * @create: 2025-02-01 20:25
 **/
public class DrawProcessResult extends Result {

    private DrawAwardVO drawAwardInfo;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardVO drawAwardInfo) {
        super(code, info);
        this.drawAwardInfo = drawAwardInfo;
    }

    public DrawAwardVO getDrawAwardInfo() {
        return drawAwardInfo;
    }

    public void setDrawAwardInfo(DrawAwardVO drawAwardInfo) {
        this.drawAwardInfo = drawAwardInfo;
    }
}

