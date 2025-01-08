package com.dkd.manage.domain;

import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * 合作商管理对象 tb_partner
 *
 * @author kkk
 * @date 2025-01-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Partner extends BaseEntity
        {   private static final long serialVersionUID = 1L;
        /** 主键id */
            private Long id;

        /** 合作商名称 */
                    @Excel(name = "合作商名称")
    private String partnerName;

        /** 联系人 */
                    @Excel(name = "联系人")
    private String contactPerson;

        /** 联系电话 */
                    @Excel(name = "联系电话")
    private String contactPhone;

        /** 分成比例 */
                    @Excel(name = "分成比例")
    private Long profitRatio;

        /** 账号 */
                    @Excel(name = "账号")
    private String account;

        /** 密码 */
            private String password;




        }
