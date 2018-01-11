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
@Entity(namespace = "demo-public",name = "OrderStatus" )
public class OrderStatusEnum extends MDEnum{
	public OrderStatusEnum(EnumItem enumvalue){
		super(enumvalue);
	}

	
	
	public static final OrderStatusEnum 未生效 = MDEnum.valueOf(OrderStatusEnum.class, String.valueOf("1"));
	
	
	public static final OrderStatusEnum 已生效 = MDEnum.valueOf(OrderStatusEnum.class, String.valueOf("2"));
	
	
	public static final OrderStatusEnum 进行中 = MDEnum.valueOf(OrderStatusEnum.class, String.valueOf("3"));
	
	
	public static final OrderStatusEnum 结束 = MDEnum.valueOf(OrderStatusEnum.class, String.valueOf("4"));
	

}