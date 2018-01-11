package com.yonyou.ifbp.demo.entity.order;

import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Column;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Entity;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.GeneratedValue;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Id;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.FK;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.OneToMany;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Stragegy;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Table;
import com.yonyou.ifbp.persistence.vo.BaseEntity;


/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加类的描述信息
 * </p>
 *  创建日期:2017-12-14
 * @author 
 * @version 
 */
@Entity(namespace = "demo-public",name = "OrderEntity")
@Table(name = "demo_order")
public class OrderEntity extends BaseEntity{
	
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "id")
    private java.lang.String id;
      
    @Column(name = "order_no")
    private java.lang.String order_no;
      
    @Column(name = "order_type")
    private java.lang.Integer order_type;
      
    @Column(name = "order_name")
    private java.lang.String order_name;
      
    @Column(name = "money")
    private java.lang.Double money;
      
    @Column(name = "memo")
    private java.lang.String memo;
      
    @Column(name = "address")
    private java.lang.String address;
      
    @Column(name = "linkman")
    private java.lang.String linkman;
      
    @Column(name = "phone")
    private java.lang.String phone;
      
    @Column(name = "telephone")
    private java.lang.String telephone;
      
    @Column(name = "email")
    private java.lang.String email;
      
    @Column(name = "creator")
    private java.lang.String creator;
      
    @Column(name = "creationtime")
    private java.lang.String creationtime;
      
    @Column(name = "modifier")
    private java.lang.String modifier;
      
    @Column(name = "modifiedtime")
    private java.lang.String modifiedtime;
      
    @Column(name = "def1")
    private java.lang.String def1;
      
    @Column(name = "def2")
    private java.lang.String def2;
      
    @Column(name = "def3")
    private java.lang.String def3;
      
    @Column(name = "def4")
    private java.lang.String def4;
      
    @Column(name = "def5")
    private java.lang.String def5;
      
    @Column(name = "def6")
    private java.lang.String def6;
      
    @Column(name = "def7")
    private java.lang.String def7;
      
    @Column(name = "def8")
    private java.lang.String def8;
      
    @Column(name = "def9")
    private java.lang.String def9;
      
    @Column(name = "def10")
    private java.lang.String def10;
      
    @Column(name = "def11")
    private java.lang.String def11;
      
    @Column(name = "def12")
    private java.lang.String def12;
      
    @Column(name = "def13")
    private java.lang.String def13;
      
    @Column(name = "def14")
    private java.lang.String def14;
      
    @Column(name = "def15")
    private java.lang.String def15;
      
    @Column(name = "def16")
    private java.lang.String def16;
      
    @Column(name = "def17")
    private java.lang.String def17;
      
    @Column(name = "def18")
    private java.lang.String def18;
      
    @Column(name = "def19")
    private java.lang.String def19;
      
    @Column(name = "def20")
    private java.lang.String def20;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
    @OneToMany(targetEntity = com.yonyou.ifbp.demo.entity.order.OrderDetailEntity.class)
    private java.util.List<com.yonyou.ifbp.demo.entity.order.OrderDetailEntity> pk_order;
	

	/**
	 * 属性 id的Getter方法.属性名：主键
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getId () {
		return id;
	}
	   
	/**
	 * 属性id的Setter方法.属性名：主键
	 * 创建日期:2017-12-14
	 * @param newId java.lang.String
	 */
	public void setId (java.lang.String newId ) {
	 	this.id = newId;
	} 	 
	
	/**
	 * 属性 order_no的Getter方法.属性名：订单编码
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getOrder_no () {
		return order_no;
	}
	   
	/**
	 * 属性order_no的Setter方法.属性名：订单编码
	 * 创建日期:2017-12-14
	 * @param newOrder_no java.lang.String
	 */
	public void setOrder_no (java.lang.String newOrder_no ) {
	 	this.order_no = newOrder_no;
	} 	 
	
	/**
	 * 属性 order_type的Getter方法.属性名：订单类型
	 *  创建日期:2017-12-14
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getOrder_type () {
		return order_type;
	}
	   
	/**
	 * 属性order_type的Setter方法.属性名：订单类型
	 * 创建日期:2017-12-14
	 * @param newOrder_type java.lang.Integer
	 */
	public void setOrder_type (java.lang.Integer newOrder_type ) {
	 	this.order_type = newOrder_type;
	} 	 
	
	/**
	 * 属性 order_name的Getter方法.属性名：订单名称
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getOrder_name () {
		return order_name;
	}
	   
	/**
	 * 属性order_name的Setter方法.属性名：订单名称
	 * 创建日期:2017-12-14
	 * @param newOrder_name java.lang.String
	 */
	public void setOrder_name (java.lang.String newOrder_name ) {
	 	this.order_name = newOrder_name;
	} 	 
	
	/**
	 * 属性 money的Getter方法.属性名：订单金额
	 *  创建日期:2017-12-14
	 * @return java.lang.Double
	 */
	public java.lang.Double getMoney () {
		return money;
	}
	   
	/**
	 * 属性money的Setter方法.属性名：订单金额
	 * 创建日期:2017-12-14
	 * @param newMoney java.lang.Double
	 */
	public void setMoney (java.lang.Double newMoney ) {
	 	this.money = newMoney;
	} 	 
	
	/**
	 * 属性 memo的Getter方法.属性名：订单备注
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getMemo () {
		return memo;
	}
	   
	/**
	 * 属性memo的Setter方法.属性名：订单备注
	 * 创建日期:2017-12-14
	 * @param newMemo java.lang.String
	 */
	public void setMemo (java.lang.String newMemo ) {
	 	this.memo = newMemo;
	} 	 
	
	/**
	 * 属性 address的Getter方法.属性名：地址
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getAddress () {
		return address;
	}
	   
	/**
	 * 属性address的Setter方法.属性名：地址
	 * 创建日期:2017-12-14
	 * @param newAddress java.lang.String
	 */
	public void setAddress (java.lang.String newAddress ) {
	 	this.address = newAddress;
	} 	 
	
	/**
	 * 属性 linkman的Getter方法.属性名：联系人
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getLinkman () {
		return linkman;
	}
	   
	/**
	 * 属性linkman的Setter方法.属性名：联系人
	 * 创建日期:2017-12-14
	 * @param newLinkman java.lang.String
	 */
	public void setLinkman (java.lang.String newLinkman ) {
	 	this.linkman = newLinkman;
	} 	 
	
	/**
	 * 属性 phone的Getter方法.属性名：手机
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getPhone () {
		return phone;
	}
	   
	/**
	 * 属性phone的Setter方法.属性名：手机
	 * 创建日期:2017-12-14
	 * @param newPhone java.lang.String
	 */
	public void setPhone (java.lang.String newPhone ) {
	 	this.phone = newPhone;
	} 	 
	
	/**
	 * 属性 telephone的Getter方法.属性名：电话
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getTelephone () {
		return telephone;
	}
	   
	/**
	 * 属性telephone的Setter方法.属性名：电话
	 * 创建日期:2017-12-14
	 * @param newTelephone java.lang.String
	 */
	public void setTelephone (java.lang.String newTelephone ) {
	 	this.telephone = newTelephone;
	} 	 
	
	/**
	 * 属性 email的Getter方法.属性名：邮箱
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getEmail () {
		return email;
	}
	   
	/**
	 * 属性email的Setter方法.属性名：邮箱
	 * 创建日期:2017-12-14
	 * @param newEmail java.lang.String
	 */
	public void setEmail (java.lang.String newEmail ) {
	 	this.email = newEmail;
	} 	 
	
	/**
	 * 属性 pk_order的Getter方法.属性名：pk_order
	 *  创建日期:2017-12-14
	 * @return java.util.List<com.yonyou.ifbp.demo.entity.order.OrderDetailEntity>
	 */
	public java.util.List<com.yonyou.ifbp.demo.entity.order.OrderDetailEntity> getPk_order () {
		return pk_order;
	}
	   
	/**
	 * 属性pk_order的Setter方法.属性名：pk_order
	 * 创建日期:2017-12-14
	 * @param newPk_order java.util.List<com.yonyou.ifbp.demo.entity.order.OrderDetailEntity>
	 */
	public void setPk_order (java.util.List<com.yonyou.ifbp.demo.entity.order.OrderDetailEntity> newPk_order ) {
	 	this.pk_order = newPk_order;
	} 	 
	
	/**
	 * 属性 creator的Getter方法.属性名：创建人
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getCreator () {
		return creator;
	}
	   
	/**
	 * 属性creator的Setter方法.属性名：创建人
	 * 创建日期:2017-12-14
	 * @param newCreator java.lang.String
	 */
	public void setCreator (java.lang.String newCreator ) {
	 	this.creator = newCreator;
	} 	 
	
	/**
	 * 属性 creationtime的Getter方法.属性名：创建时间
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getCreationtime () {
		return creationtime;
	}
	   
	/**
	 * 属性creationtime的Setter方法.属性名：创建时间
	 * 创建日期:2017-12-14
	 * @param newCreationtime java.lang.String
	 */
	public void setCreationtime (java.lang.String newCreationtime ) {
	 	this.creationtime = newCreationtime;
	} 	 
	
	/**
	 * 属性 modifier的Getter方法.属性名：修改人
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getModifier () {
		return modifier;
	}
	   
	/**
	 * 属性modifier的Setter方法.属性名：修改人
	 * 创建日期:2017-12-14
	 * @param newModifier java.lang.String
	 */
	public void setModifier (java.lang.String newModifier ) {
	 	this.modifier = newModifier;
	} 	 
	
	/**
	 * 属性 modifiedtime的Getter方法.属性名：修改时间
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getModifiedtime () {
		return modifiedtime;
	}
	   
	/**
	 * 属性modifiedtime的Setter方法.属性名：修改时间
	 * 创建日期:2017-12-14
	 * @param newModifiedtime java.lang.String
	 */
	public void setModifiedtime (java.lang.String newModifiedtime ) {
	 	this.modifiedtime = newModifiedtime;
	} 	 
	
	/**
	 * 属性 def1的Getter方法.属性名：自定义项1
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef1 () {
		return def1;
	}
	   
	/**
	 * 属性def1的Setter方法.属性名：自定义项1
	 * 创建日期:2017-12-14
	 * @param newDef1 java.lang.String
	 */
	public void setDef1 (java.lang.String newDef1 ) {
	 	this.def1 = newDef1;
	} 	 
	
	/**
	 * 属性 def2的Getter方法.属性名：自定义项2
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef2 () {
		return def2;
	}
	   
	/**
	 * 属性def2的Setter方法.属性名：自定义项2
	 * 创建日期:2017-12-14
	 * @param newDef2 java.lang.String
	 */
	public void setDef2 (java.lang.String newDef2 ) {
	 	this.def2 = newDef2;
	} 	 
	
	/**
	 * 属性 def3的Getter方法.属性名：自定义项3
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef3 () {
		return def3;
	}
	   
	/**
	 * 属性def3的Setter方法.属性名：自定义项3
	 * 创建日期:2017-12-14
	 * @param newDef3 java.lang.String
	 */
	public void setDef3 (java.lang.String newDef3 ) {
	 	this.def3 = newDef3;
	} 	 
	
	/**
	 * 属性 def4的Getter方法.属性名：自定义项4
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef4 () {
		return def4;
	}
	   
	/**
	 * 属性def4的Setter方法.属性名：自定义项4
	 * 创建日期:2017-12-14
	 * @param newDef4 java.lang.String
	 */
	public void setDef4 (java.lang.String newDef4 ) {
	 	this.def4 = newDef4;
	} 	 
	
	/**
	 * 属性 def5的Getter方法.属性名：自定义项5
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef5 () {
		return def5;
	}
	   
	/**
	 * 属性def5的Setter方法.属性名：自定义项5
	 * 创建日期:2017-12-14
	 * @param newDef5 java.lang.String
	 */
	public void setDef5 (java.lang.String newDef5 ) {
	 	this.def5 = newDef5;
	} 	 
	
	/**
	 * 属性 def6的Getter方法.属性名：自定义项6
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef6 () {
		return def6;
	}
	   
	/**
	 * 属性def6的Setter方法.属性名：自定义项6
	 * 创建日期:2017-12-14
	 * @param newDef6 java.lang.String
	 */
	public void setDef6 (java.lang.String newDef6 ) {
	 	this.def6 = newDef6;
	} 	 
	
	/**
	 * 属性 def7的Getter方法.属性名：自定义项7
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef7 () {
		return def7;
	}
	   
	/**
	 * 属性def7的Setter方法.属性名：自定义项7
	 * 创建日期:2017-12-14
	 * @param newDef7 java.lang.String
	 */
	public void setDef7 (java.lang.String newDef7 ) {
	 	this.def7 = newDef7;
	} 	 
	
	/**
	 * 属性 def8的Getter方法.属性名：自定义项8
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef8 () {
		return def8;
	}
	   
	/**
	 * 属性def8的Setter方法.属性名：自定义项8
	 * 创建日期:2017-12-14
	 * @param newDef8 java.lang.String
	 */
	public void setDef8 (java.lang.String newDef8 ) {
	 	this.def8 = newDef8;
	} 	 
	
	/**
	 * 属性 def9的Getter方法.属性名：自定义项9
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef9 () {
		return def9;
	}
	   
	/**
	 * 属性def9的Setter方法.属性名：自定义项9
	 * 创建日期:2017-12-14
	 * @param newDef9 java.lang.String
	 */
	public void setDef9 (java.lang.String newDef9 ) {
	 	this.def9 = newDef9;
	} 	 
	
	/**
	 * 属性 def10的Getter方法.属性名：自定义项10
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef10 () {
		return def10;
	}
	   
	/**
	 * 属性def10的Setter方法.属性名：自定义项10
	 * 创建日期:2017-12-14
	 * @param newDef10 java.lang.String
	 */
	public void setDef10 (java.lang.String newDef10 ) {
	 	this.def10 = newDef10;
	} 	 
	
	/**
	 * 属性 def11的Getter方法.属性名：自定义项11
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef11 () {
		return def11;
	}
	   
	/**
	 * 属性def11的Setter方法.属性名：自定义项11
	 * 创建日期:2017-12-14
	 * @param newDef11 java.lang.String
	 */
	public void setDef11 (java.lang.String newDef11 ) {
	 	this.def11 = newDef11;
	} 	 
	
	/**
	 * 属性 def12的Getter方法.属性名：自定义项12
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef12 () {
		return def12;
	}
	   
	/**
	 * 属性def12的Setter方法.属性名：自定义项12
	 * 创建日期:2017-12-14
	 * @param newDef12 java.lang.String
	 */
	public void setDef12 (java.lang.String newDef12 ) {
	 	this.def12 = newDef12;
	} 	 
	
	/**
	 * 属性 def13的Getter方法.属性名：自定义项13
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef13 () {
		return def13;
	}
	   
	/**
	 * 属性def13的Setter方法.属性名：自定义项13
	 * 创建日期:2017-12-14
	 * @param newDef13 java.lang.String
	 */
	public void setDef13 (java.lang.String newDef13 ) {
	 	this.def13 = newDef13;
	} 	 
	
	/**
	 * 属性 def14的Getter方法.属性名：自定义项14
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef14 () {
		return def14;
	}
	   
	/**
	 * 属性def14的Setter方法.属性名：自定义项14
	 * 创建日期:2017-12-14
	 * @param newDef14 java.lang.String
	 */
	public void setDef14 (java.lang.String newDef14 ) {
	 	this.def14 = newDef14;
	} 	 
	
	/**
	 * 属性 def15的Getter方法.属性名：自定义项15
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef15 () {
		return def15;
	}
	   
	/**
	 * 属性def15的Setter方法.属性名：自定义项15
	 * 创建日期:2017-12-14
	 * @param newDef15 java.lang.String
	 */
	public void setDef15 (java.lang.String newDef15 ) {
	 	this.def15 = newDef15;
	} 	 
	
	/**
	 * 属性 def16的Getter方法.属性名：自定义项16
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef16 () {
		return def16;
	}
	   
	/**
	 * 属性def16的Setter方法.属性名：自定义项16
	 * 创建日期:2017-12-14
	 * @param newDef16 java.lang.String
	 */
	public void setDef16 (java.lang.String newDef16 ) {
	 	this.def16 = newDef16;
	} 	 
	
	/**
	 * 属性 def17的Getter方法.属性名：自定义项17
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef17 () {
		return def17;
	}
	   
	/**
	 * 属性def17的Setter方法.属性名：自定义项17
	 * 创建日期:2017-12-14
	 * @param newDef17 java.lang.String
	 */
	public void setDef17 (java.lang.String newDef17 ) {
	 	this.def17 = newDef17;
	} 	 
	
	/**
	 * 属性 def18的Getter方法.属性名：自定义项18
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef18 () {
		return def18;
	}
	   
	/**
	 * 属性def18的Setter方法.属性名：自定义项18
	 * 创建日期:2017-12-14
	 * @param newDef18 java.lang.String
	 */
	public void setDef18 (java.lang.String newDef18 ) {
	 	this.def18 = newDef18;
	} 	 
	
	/**
	 * 属性 def19的Getter方法.属性名：自定义项19
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef19 () {
		return def19;
	}
	   
	/**
	 * 属性def19的Setter方法.属性名：自定义项19
	 * 创建日期:2017-12-14
	 * @param newDef19 java.lang.String
	 */
	public void setDef19 (java.lang.String newDef19 ) {
	 	this.def19 = newDef19;
	} 	 
	
	/**
	 * 属性 def20的Getter方法.属性名：自定义项20
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getDef20 () {
		return def20;
	}
	   
	/**
	 * 属性def20的Setter方法.属性名：自定义项20
	 * 创建日期:2017-12-14
	 * @param newDef20 java.lang.String
	 */
	public void setDef20 (java.lang.String newDef20 ) {
	 	this.def20 = newDef20;
	} 	 
	
	/**
	 * 属性 dr的Getter方法.属性名：dr
	 *  创建日期:2017-12-14
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}
	   
	/**
	 * 属性dr的Setter方法.属性名：dr
	 * 创建日期:2017-12-14
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	 
	
	/**
	 * 属性 ts的Getter方法.属性名：ts
	 *  创建日期:2017-12-14
	 * @return java.util.Date
	 */
	public java.util.Date getTs () {
		return ts;
	}
	   
	/**
	 * 属性ts的Setter方法.属性名：ts
	 * 创建日期:2017-12-14
	 * @param newTs java.util.Date
	 */
	public void setTs (java.util.Date newTs ) {
	 	this.ts = newTs;
	} 	 
	
    @Override
    public String getMetaDefinedName() {
        return "OrderEntity";
    }

    @Override
    public String getNamespace() {
        return "demo-public";
    }
}