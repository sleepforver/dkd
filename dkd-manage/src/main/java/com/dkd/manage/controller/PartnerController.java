package com.dkd.manage.controller;

import com.dkd.common.annotation.Log;
import com.dkd.common.core.controller.BaseController;
import com.dkd.common.core.domain.AjaxResult;
import com.dkd.common.core.page.TableDataInfo;
import com.dkd.common.enums.BusinessType;
import com.dkd.common.utils.SecurityUtils;
import com.dkd.common.utils.poi.ExcelUtil;
import com.dkd.manage.domain.Partner;
import com.dkd.manage.domain.vo.PartnerVo;
import com.dkd.manage.service.IPartnerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 合作商管理Controller
 *
 * @author kkk
 * @date 2025-01-06
 */
@Api(tags = "合作商管理Controller")
@RestController
@RequestMapping("/manage/partner")
public class PartnerController extends BaseController
{
    @Autowired
    private IPartnerService partnerService;

    /**
     * 查询合作商管理列表
     */
    @ApiOperation("查询合作商管理列表")
    @PreAuthorize("@ss.hasPermi('manage:partner:list')")
    @GetMapping("/list")
    public TableDataInfo list(Partner partner)
    {
        startPage();
        List<PartnerVo> voList = partnerService.selectPartnerVoList(partner);
        return getDataTable(voList);
    }

    /**
     * 导出合作商管理列表
     */
    @ApiOperation("导出合作商管理列表")
    @PreAuthorize("@ss.hasPermi('manage:partner:export')")
    @Log(title = "合作商管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Partner partner)
    {
        List<Partner> list = partnerService.selectPartnerList(partner);
        ExcelUtil<Partner> util = new ExcelUtil<Partner>(Partner.class);
        util.exportExcel(response, list, "合作商管理数据");
    }

    /**
     * 获取合作商管理详细信息
     */
    @ApiOperation("获取合作商管理详细信息")
    @PreAuthorize("@ss.hasPermi('manage:partner:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(partnerService.selectPartnerById(id));
    }

    /**
     * 新增合作商管理
     */
    @ApiOperation("新增合作商管理")
    @PreAuthorize("@ss.hasPermi('manage:partner:add')")
    @Log(title = "合作商管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Partner partner)
    {
        return toAjax(partnerService.insertPartner(partner));
    }

    /**
     * 修改合作商管理
     */
    @ApiOperation("修改合作商管理")
    @PreAuthorize("@ss.hasPermi('manage:partner:edit')")
    @Log(title = "合作商管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Partner partner)
    {
        return toAjax(partnerService.updatePartner(partner));
    }

    /**
     * 删除合作商管理
     */
    @ApiOperation("删除改合作商管理")
    @PreAuthorize("@ss.hasPermi('manage:partner:remove')")
    @Log(title = "合作商管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(partnerService.deletePartnerByIds(ids));
    }

    @ApiOperation("重置合作商密码")
    @PreAuthorize("@ss.hasPermi('manage:partner:edit')")
    @Log(title = "重置合作商密码", businessType = BusinessType.UPDATE)
    @PutMapping("/resetPwd/{id}")
    public AjaxResult resetPwd(@PathVariable("id") Long id)
    {//1.接收参数请求
        //2.创建合作商对象
        Partner partner = new Partner();
        partner.setId(id);//设置合作商id
        partner.setPassword(SecurityUtils.encryptPassword("123456"));//设置密码
        //3.调用service层方法
        return toAjax(partnerService.updatePartner(partner));
    }
}
