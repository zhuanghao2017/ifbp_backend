package com.yonyou.ifbp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yonyou.ifbp.base.PageParam;
import com.yonyou.ifbp.context.InvocationInfoProxy;
import com.yonyou.ifbp.persistence.vo.ResultMsg;
import com.yonyou.ifbp.base.BaseController;
import com.yonyou.ifbp.demo.service.MaterialService;
import com.yonyou.ifbp.metadata.spi.Const;
import com.yonyou.ifbp.demo.entity.material.MaterialEntity;

@Controller
@RequestMapping("/material")
// 请配置具体的controller路径
public class MaterialController extends BaseController<MaterialEntity> {

	@Autowired
	MaterialService service;

	@Override
	public ResultMsg page(@RequestBody PageParam pageParam) {
		try {
//			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"00"});
			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"1115","00"});
			Page<MaterialEntity> page = service.retrieveByPage(MaterialEntity.class, pageParam.getPageRequest(), pageParam.getSearchParams(), true);
			return this.buildSuccess(page);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg create(@RequestBody MaterialEntity entity) {
		try {
			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"00"});
//			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"1115","00"});
			service.create(entity, false);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			e.printStackTrace();
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg update(@RequestBody MaterialEntity entity) {
		try {
			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"00"});
//			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"1115","00"});
			service.update(entity);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody MaterialEntity entity) {
		try {
			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"00"});
//			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"1115","00"});
			service.delete(entity);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody String id) {
		try {
			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"00"});
//			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"1115","00"});
			service.deleteByPK(MaterialEntity.class, id);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg getById(@RequestBody String id) {
		try {
//			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"00"});
			InvocationInfoProxy.setExtendAttribute(Const.METADATA_INVOCATIONINFOPROXY_KEY_INDUSTRY_VERSIONTYPES, new String[]{"1115","00"});
			MaterialEntity entity = service.retrieveByPK(MaterialEntity.class, id);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

}
