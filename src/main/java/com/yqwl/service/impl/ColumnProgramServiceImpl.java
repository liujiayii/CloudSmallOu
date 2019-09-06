package com.yqwl.service.impl;/**
 * Created by Administrator on 2019/9/5.
 */

import com.yqwl.common.web.BizException;
import com.yqwl.dao.ColumnProgramaMapper;
import com.yqwl.pojo.ColumnPrograma;
import com.yqwl.service.ColumnProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiuHangjing
 * @date 2019/9/5 14:20
 */
@Service("ColumnProgramService")
public class ColumnProgramServiceImpl implements ColumnProgramService{

    private final ColumnProgramaMapper columnProgramaMapper;
    @Autowired
    public ColumnProgramServiceImpl(ColumnProgramaMapper columnProgramaMapper) {
        this.columnProgramaMapper = columnProgramaMapper;
    }

    @Override
    public List<ColumnPrograma> showColumn() throws BizException {
        return columnProgramaMapper.showColumn();
    }
}
