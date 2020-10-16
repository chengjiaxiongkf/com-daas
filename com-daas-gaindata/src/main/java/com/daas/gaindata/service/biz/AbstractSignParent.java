package com.daas.gaindata.service.biz;

import com.daas.commmon.vo.ResultPageVO;
import com.daas.commmon.vo.ResultVO;
import com.daas.gaindata.constant.EnumSignType;
import com.daas.gaindata.service.SignHandle;
import com.daas.gaindata.service.provider.SignProvider;
import com.daas.gaindata.vo.SignVO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 签到父类，实现查询签到列表
 * @author v_jxjxcheng
 * @date 2020-10-16 20:51
 */
public abstract class AbstractSignParent implements SignHandle {
    private EnumSignType enumSignType;

    AbstractSignParent(EnumSignType enumSignType){
        this.enumSignType = enumSignType;
    }

    @Override
    public <T> ResultVO sign(T t) {
        return null;
    }

    /**
     * 获取签到列表
     * @param signVO
     * @return
     */
    public ResultPageVO<SignVO> getSignList(SignVO signVO) {
        return SignProvider.provider().getSignList((SignVO) signVO);
    }

    public void exportSignList(List<SignVO> list, HttpServletResponse httpServletResponse) {
        this.getSignList(null);
        //导出
    }
}
