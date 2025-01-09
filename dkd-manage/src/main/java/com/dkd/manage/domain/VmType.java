package com.dkd.manage.domain;

import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * 设备类型管理对象 tb_vm_type
 *
 * @author kkk
 * @date 2025-01-09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VmType extends BaseEntity
        {   private static final long serialVersionUID = 1L;
        /** 主键 */
            private Long id;

        /** 型号名称 */
                    @Excel(name = "型号名称")
    private String name;

        /** 型号编码 */
                    @Excel(name = "型号编码")
    private String model;

        /** 设备图片 */
                    @Excel(name = "设备图片")
    private String image;

        /** 货道行 */
                    @Excel(name = "货道行")
    private Long vmRow;

        /** 货道列 */
                    @Excel(name = "货道列")
    private Long vmCol;

        /** 设备容量 */
                    @Excel(name = "设备容量")
    private Long channelMaxCapacity;




        }
