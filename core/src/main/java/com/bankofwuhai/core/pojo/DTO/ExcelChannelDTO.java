package com.bankofwuhai.core.pojo.DTO;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExcelChannelDTO {

    @ExcelProperty("id")
    private BigDecimal id;

    @ExcelProperty("渠道名称")
    private String name;

    @ExcelProperty("渠道类型编码")
    private String channelTypeCode;

    @ExcelProperty("渠道子类型编码")
    private String subType;

    @ExcelProperty("描述")
    private String description;

}
