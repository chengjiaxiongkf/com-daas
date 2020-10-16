package com.daas.gaindata.service.impl;

import com.daas.commmon.vo.ResultPageVO;
import com.daas.gaindata.service.SignService;
import com.daas.gaindata.vo.SignVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author v_jxjxcheng
 * @date 2020-10-16 20:56
 */
@Service
@Slf4j
public class SignServiceImpl implements SignService {
    @Override
    public ResultPageVO getSignList(SignVO signVO) {
        return null;
    }

    @Override
    public ResultPageVO exportSign(List<SignVO> list) {
        return null;
    }

    @Override
    public int batchInsertSign(List<SignVO> list) {
        return 0;
    }
}
