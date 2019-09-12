package com.yqwl.controller; /**
 * Created by Administrator on 2019/9/4.
 */
import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Constants;

import com.yqwl.common.utils.Pager;
import com.yqwl.common.utils.UpdateFile;
import com.yqwl.common.web.BaseController;
import com.yqwl.common.web.BizException;
import com.yqwl.pojo.NewsTrends;
import com.yqwl.service.NewsTrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 新闻动态控制层
 * @author LiuHangjing
 * @date 2019/9/4 13:50
 */
@Controller
@RequestMapping("news")
public class NewsTrendController extends BaseController{

    private final NewsTrendService newsTrendService;

    @Autowired
    public NewsTrendController(NewsTrendService newsTrendService) {
        this.newsTrendService = newsTrendService;
    }

    /**
     * 后台-添加新闻动态
     * @author liuhangjing
     * @date 2019/9/4 14:12
     */
    @RequestMapping(value="/insertNewsTrend",method = RequestMethod.POST,produces = HTML_PRODUCE_TYPE)
    @ResponseBody
    public String insertNewsTrend(NewsTrends newsTrends,Long orderTime) {
        try {
            Integer num = newsTrendService.insertNewsTrend(newsTrends,orderTime);
            return dealSuccessResult("添加成功",num);
        }catch (Exception e){
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 后台-修改新闻动态
     * @author liuhangjing
     * @date 2019/9/4 15:02
     */
    @RequestMapping(value="/updateNewsTrend",method = RequestMethod.POST,produces = HTML_PRODUCE_TYPE)
    @ResponseBody
    public String updateNewsTrend(NewsTrends newsTrends,Long orderTime) {
        try {
            Integer num = newsTrendService.updateNewsTrend(newsTrends,orderTime);
            return dealSuccessResult("修改成功",num);
        }catch (Exception e){
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 后台-列表(分页)显示新闻动态
     * @author liuhangjing
     * @date 2019/9/4 15:16
     */
    @RequestMapping(value = "showListNewsTrend",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String showListNewsTrend(Pager pager){
        try {
            PageInfo<NewsTrends> newsTrendList = newsTrendService.showListNewsTrend(pager);
            return dealQueryResult(newsTrendList.getList(),newsTrendList);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 后台-删除该条新闻动态(单个)
     * @author liuhangjing
     * @date 2019/9/4 15:21e
     */
    @ResponseBody
    @RequestMapping(value = "deleteNewsTrend",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    public String deleteNewsTrend(Long newsId){
        System.out.println("删除：" + newsId);
        try {
            Integer num = newsTrendService.deleteNewsTrend(newsId);
            if (num>0){
                return dealSuccessResult("删除成功",num);

            }
            return dealFaidResult("删除失败",null);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 后台-批量删除新闻动态
     * @author liuhangjing
     * @date 2019/9/4 15:31e
     */
    @RequestMapping(value = "deleteSelectNewsTrend",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String deleteSelectNewsTrend(Long... newsIds){
        try {
            Integer num = newsTrendService.deleteSelectNewsTrend(newsIds);
            return dealSuccessResult("删除成功",num);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 后台-修改新闻上下架状态
     * @author liuhangjing
     * @date 2019/9/4 15:52e
     */
    @RequestMapping(value = "updateStatusById",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String updateStatusById(Long newsId){
        try {
            Integer num = newsTrendService.updateStatusById(newsId);
            return dealSuccessResult("修改成功",num);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 后台-修改新闻首页是否显示
     * @author liuhangjing
     * @date 2019/9/5 13:35e
     */
    @RequestMapping(value = "updateFirstShowById",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String updateFirstShowById(Long newsId){
        try {
            Integer num = newsTrendService.updateFirstShowById(newsId);
            return dealSuccessResult("修改成功",num);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 上传图片
     * @author liuhangjing
     * @date 2019/9/10 14:11e
     */
    @ResponseBody
    @RequestMapping(value = "uploadNewTrendImg",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    public String toUploadImg(MultipartFile file){
        String url = UpdateFile.update(file);

        return dealSuccessResult("上传成功",url);
    }


    /**
     * 前台 -根据状态以及是否展示查询显示新闻动态
     * @author liuhangjing
     * @date 2019/9/9 10:38e
     */
    @RequestMapping(value = "showFrontNewsTrend",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String showFrontNewsTrend(){

        try {
            List<NewsTrends>  newsTrendsList = newsTrendService.showFrontNewsTrend();
            return dealQueryResult(newsTrendsList,newsTrendsList);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }

    }
    /**
     * 前台-根据id查询新闻
     * @author liuhangjing
     * @date 2019/9/10 11:50e
     */
    @RequestMapping(value = "showNewsTrendById",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String showNewsTrendById(Long id){
        try {
            NewsTrends newsTrends = newsTrendService.showNewsTrendById(id);
            return dealQueryResult(newsTrends,newsTrends);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }

    }


}
