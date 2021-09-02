package com.bankofwuhai.core.controller;


import com.alibaba.excel.EasyExcel;
import com.bankofwuhai.core.pojo.DTO.ExcelChannelDTO;
import com.bankofwuhai.core.pojo.entity.Channel;
import com.bankofwuhai.core.service.ChannelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liulg
 * @since 2021-09-01
 */
@RestController
@RequestMapping("/channel")
public class ChannelController {

    @Resource
    private ChannelService channelService;


    @GetMapping("/list")
    public List<Channel> getChannelList(){
        List<Channel> list = channelService.list();
        return list;
    }


    @GetMapping("/export")
    public void export(HttpServletResponse response) {

        try {
            // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
            String fileName = URLEncoder.encode("channel", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
            EasyExcel.write(response.getOutputStream(), ExcelChannelDTO.class).sheet("渠道主表").doWrite(channelService.listDictData());

        } catch (IOException e) {
            //EXPORT_DATA_ERROR(104, "数据导出失败"),
            throw new RuntimeException("数据导出失败");
        }
    }

    // 测试第二次提交
    public void test(){

    }
}

