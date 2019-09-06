package com.yqwl.controller;/**
 * Created by Administrator on 2019/9/5.
 */

import com.yqwl.common.utils.Constants;
import com.yqwl.common.web.BaseController;
import com.yqwl.common.web.BizException;
import com.yqwl.pojo.ColumnPrograma;
import com.yqwl.service.ColumnProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author LiuHangjing
 * @date 2019/9/5 14:19
 */
@Controller
@RequestMapping("column")
public class ColumnProgramController extends BaseController {

    private final ColumnProgramService columnProgramService;
    @Autowired
    public ColumnProgramController(ColumnProgramService columnProgramService) {
        this.columnProgramService = columnProgramService;
    }
    /**
     * 列表显示栏目
     * @return
     * @exception
     * @author liuhangjing
     * @date 2019/9/5 14:28e
     */
    @RequestMapping(value = "showColumn",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String showColumn(){

        try {
            List<ColumnPrograma> column = columnProgramService.showColumn();
            return dealQueryResult(column,column);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }
    }
}
