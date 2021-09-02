package com.bankofwuhai.core.pojo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author liulg
 * @since 2021-09-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("CHANNEL")
public class Channel implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "ID", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @TableField("NAME")
    private String name;

    @TableField("CHANNEL_TYPE_CODE")
    private String channelTypeCode;

    @TableField("SUB_TYPE")
    private String subType;

    @TableField("DESCRIPTION")
    private String description;


}
