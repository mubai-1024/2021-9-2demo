package com.bankofwuhai.core.service.impl;

import com.bankofwuhai.core.mapper.ChannelMapper;
import com.bankofwuhai.core.pojo.DTO.ExcelChannelDTO;
import com.bankofwuhai.core.pojo.entity.Channel;
import com.bankofwuhai.core.service.ChannelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liulg
 * @since 2021-09-01
 */
@Service
public class ChannelServiceImpl extends ServiceImpl<ChannelMapper, Channel> implements ChannelService {

    @Override
    public List<ExcelChannelDTO> listDictData() {
        List<Channel> channels = baseMapper.selectList(null);

        ArrayList<ExcelChannelDTO> excelChannelDTOS = new ArrayList<>();

        channels.forEach(channel ->{
//            System.out.println("channel"+channel.toString());
            ExcelChannelDTO excelChannelDTO = new ExcelChannelDTO();
            BeanUtils.copyProperties(channel,excelChannelDTO);
//            System.out.println("excelChannelDTO:"+excelChannelDTO.toString());
            excelChannelDTOS.add(excelChannelDTO);
        });
        return excelChannelDTOS;
    }
}
