package com.bankofwuhai.core.mapper;

import com.bankofwuhai.core.pojo.DTO.ExcelChannelDTO;
import com.bankofwuhai.core.pojo.entity.Channel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liulg
 * @since 2021-09-01
 */
public interface ChannelMapper extends BaseMapper<Channel> {

    void insertBatch(List<ExcelChannelDTO> list);
}
