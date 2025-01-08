package com.dkd.manage.domain;

import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * 点位管理对象 tb_node
 *
 * @author kkk
 * @date 2025-01-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Node extends BaseEntity
        {   private static final long serialVersionUID = 1L;
        /** 主键id */
            private Long id;

        /** 点位名称 */
                    @Excel(name = "点位名称")
    private String nodeName;

        /** 详细地址 */
                    @Excel(name = "详细地址")
    private String address;

        /** 商圈类型 */
                    @Excel(name = "商圈类型")
    private Long businessType;

        /** 区域id */
                    @Excel(name = "区域id")
    private Long regionId;

        /** 合作商id */
                    @Excel(name = "合作商id")
    private Long partnerId;




        }
