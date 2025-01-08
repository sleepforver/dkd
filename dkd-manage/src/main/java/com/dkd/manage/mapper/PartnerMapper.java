package com.dkd.manage.mapper;

import com.dkd.manage.domain.Partner;
import com.dkd.manage.domain.vo.PartnerVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 合作商管理Mapper接口
 *
 * @author kkk
 * @date 2025-01-06
 */
@Mapper
public interface PartnerMapper
{
    /**
     * 查询合作商管理
     *
     * @param id 合作商管理主键
     * @return 合作商管理
     */
    public Partner selectPartnerById(Long id);

    /**
     * 查询合作商管理列表
     *
     * @param partner 合作商管理
     * @return 合作商管理集合
     */
    public List<Partner> selectPartnerList(Partner partner);

    /**
     * 新增合作商管理
     *
     * @param partner 合作商管理
     * @return 结果
     */
    public int insertPartner(Partner partner);

    /**
     * 修改合作商管理
     *
     * @param partner 合作商管理
     * @return 结果
     */
    public int updatePartner(Partner partner);

    /**
     * 删除合作商管理
     *
     * @param id 合作商管理主键
     * @return 结果
     */
    public int deletePartnerById(Long id);

    /**
     * 批量删除合作商管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePartnerByIds(Long[] ids);

    /**
     * 查询合作商的点位数量
     * @param partner
     * @return PartnerVo集合
     */
    public List<PartnerVo> selectPartnerVoList(Partner partner);
}
