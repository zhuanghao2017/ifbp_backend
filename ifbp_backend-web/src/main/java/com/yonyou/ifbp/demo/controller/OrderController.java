package com.yonyou.ifbp.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yonyou.ifbp.base.PageParam;
import com.yonyou.ifbp.persistence.vo.ResultMsg;
import com.yonyou.ifbp.base.BaseController;
import com.yonyou.ifbp.demo.service.OrderService;
import com.yonyou.ifbp.demo.entity.order.OrderDetailEntity;
import com.yonyou.ifbp.demo.entity.order.OrderEntity;

@Controller
@RequestMapping("/order")
// 请配置具体的controller路径
public class OrderController extends BaseController<OrderEntity> {

	@Autowired
	OrderService service;

	@Override
	public ResultMsg page(@RequestBody PageParam pageParam) {
		try {
			Page<OrderEntity> page = service.retrieveByPage(OrderEntity.class, pageParam.getPageRequest(), pageParam.getSearchParams(), true);
			return this.buildSuccess(page);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg create(@RequestBody OrderEntity entity) {
		try {
			service.create(entity, false);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg update(@RequestBody OrderEntity entity) {
		try {
			service.update(entity);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody OrderEntity entity) {
		try {
			service.delete(entity);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody String id) {
		try {
			service.deleteByPK(OrderEntity.class, id);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg getById(@RequestBody String id) {
		try {
			List<Class> clzList = new ArrayList<Class>();
			clzList.add(OrderDetailEntity.class);
			OrderEntity entity = service.retrieveByPK(OrderEntity.class, clzList,id,true);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			e.printStackTrace();
			return this.buildError(e.getMessage());
		}
	}

}
