package com.yonyou.ifbp.demo.entity.order;

import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Entity;
import com.yonyou.ifbp.persistence.bs.jdbc.meta.model.MDEnum;
import com.yonyou.ifbp.metadata.spi.EnumItem;
/**
 * <b>此处简要描述此枚举的功能 </b>
 * <p>
 *   此处添加该枚举的描述信息
 * </p>
 *  创建日期:2017-12-14
 * @author 
 * @version 
 */
@Entity(namespace = "demo-public",name = "OrderType" )
public class OrderTypeEnum extends MDEnum{
	public OrderTypeEnum(EnumItem enumvalue){
		super(enumvalue);
	}

	
	
	public static final OrderTypeEnum 采购订单 = MDEnum.valueOf(OrderTypeEnum.class, Integer.valueOf(1));
	
	
	public static final OrderTypeEnum 销售订单 = MDEnum.valueOf(OrderTypeEnum.class, Integer.valueOf(2));
	

}