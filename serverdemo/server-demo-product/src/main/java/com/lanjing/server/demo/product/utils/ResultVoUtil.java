package com.lanjing.server.demo.product.utils;

import com.lanjing.server.demo.product.vo.ResultVo;

public class ResultVoUtil {

    public static ResultVo success(Object object) {
        ResultVo resultVO = new ResultVo();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
