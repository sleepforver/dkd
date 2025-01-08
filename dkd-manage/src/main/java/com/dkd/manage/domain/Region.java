package com.dkd.manage.domain;

import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * 区域管理对象 tb_region
 *
 * @author kkk
 * @date 2025-01-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Region extends BaseEntity
        {   private static final long serialVersionUID = 1L;
        /** 主键id */
            private Long id;

        /** 区域名称 */
                    @Excel(name = "区域名称")
    private String regionName;

                    


        }
