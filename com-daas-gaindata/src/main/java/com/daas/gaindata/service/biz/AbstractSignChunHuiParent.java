package com.daas.gaindata.service.biz;

import com.daas.commmon.vo.ResultVO;
import com.daas.gaindata.constant.EnumSignType;
import java.io.File;

/**
 * 春晖智慧签到
 * @author v_jxjxcheng
 * @date 2020-10-15 10:39
 */
public abstract class AbstractSignChunHuiParent extends AbstractSignParent {
    AbstractSignChunHuiParent() {
        super(EnumSignType.CHUN_HUI);
    }

    /**
     * 导入签到数据，根据File对象
     * @param file
     */
    protected abstract void importSignByFile(File file);

    @Override
    public <T> ResultVO sign(T t) {
        this.importSignByFile((File) t);
        return null;
    }
}
