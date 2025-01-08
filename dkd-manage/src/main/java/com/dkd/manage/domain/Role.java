package com.dkd.manage.domain;

import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * 工单角色对象 tb_role
 *
 * @author kkk
 * @date 2025-01-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role extends BaseEntity
        {   private static final long serialVersionUID = 1L;
        /** $column.columnComment */
            private Long roleId;

        /** 角色编码
 */
                    @Excel(name = "角色编码")
    private String roleCode;

        /** 角色名称
 */
                    @Excel(name = "角色名称")
    private String roleName;

        }
