package com.bankofwuhai.core.service;

import com.bankofwuhai.core.pojo.entity.Channel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liulg
 * @since 2021-09-01
 */
public interface ChannelService extends IService<Channel> {
    List listDictData();
}
