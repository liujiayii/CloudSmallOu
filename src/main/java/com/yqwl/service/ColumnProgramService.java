package com.yqwl.service;

import com.yqwl.common.web.BizException;
import com.yqwl.pojo.ColumnPrograma;

import java.util.List;

/**
 * Created by Administrator on 2019/9/5.
 */
public interface ColumnProgramService {

    List<ColumnPrograma> showColumn() throws BizException;

}
