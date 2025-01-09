package com.dkd.manage.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * 售货机货道对象 tb_channel
 *
 * @author kkk
 * @date 2025-01-09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Channel extends BaseEntity
        {   private static final long serialVersionUID = 1L;
        /** 主键 */
            private Long id;

        /** 货道编号 */
                    @Excel(name = "货道编号")
    private String channelCode;

        /** 商品Id */
                    @Excel(name = "商品Id")
    private Long skuId;

        /** 售货机Id */
                    @Excel(name = "售货机Id")
    private Long vmId;

        /** 售货机软编号 */
                    @Excel(name = "售货机软编号")
    private String innerCode;

        /** 货道最大容量 */
                    @Excel(name = "货道最大容量")
    private Long maxCapacity;

        /** 货道当前容量 */
                    @Excel(name = "货道当前容量")
    private Long currentCapacity;

        /** 上次补货时间 */
                    @JsonFormat(pattern = "yyyy-MM-dd")
            @Excel(name = "上次补货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastSupplyTime;

        


        }
