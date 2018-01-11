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
@Entity(namespace = "demo-public",name = "OrderDetailEntity")
@Table(name = "demo_order_detail")
public class OrderDetailEntity extends BaseEntity{
	 
    @FK(name = "pk_order", referenceTableName = "demo_order", referencedColumnName = "id") 
    @Column(name = "pk_order")
    private java.lang.String pk_order;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "id")
    private java.lang.String id;
      
    @Column(name = "pk_material")
    private java.lang.String pk_material;
      
    @Column(name = "num")
    private java.lang.Double num;
      
    @Column(name = "price")
    private java.lang.Double price;
      
    @Column(name = "money")
    private java.lang.Double money;
      
    @Column(name = "memo")
    private java.lang.String memo;
      
    @Column(name = "creator")
    private java.lang.String creator;
      
    @Column(name = "creationtime")
    private java.lang.String creationtime;
      
    @Column(name = "modifier")
    private java.lang.String modifier;
      
    @Column(name = "modifiedtime")
    private java.lang.String modifiedtime;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
	

	/**
	 * 属性 pk_order的Getter方法.属性名：parentPK
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getPk_order () {
		return pk_order;
	}
	   
	/**
	 * 属性pk_order的Setter方法.属性名：parentPK
	 * 创建日期:2017-12-14
	 * @param newPk_order java.lang.String
	 */
	public void setPk_order (java.lang.String newPk_order ) {
	 	this.pk_order = newPk_order;
	} 	 
	
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
	 * 属性 pk_material的Getter方法.属性名：物料
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getPk_material () {
		return pk_material;
	}
	   
	/**
	 * 属性pk_material的Setter方法.属性名：物料
	 * 创建日期:2017-12-14
	 * @param newPk_material java.lang.String
	 */
	public void setPk_material (java.lang.String newPk_material ) {
	 	this.pk_material = newPk_material;
	} 	 
	
	/**
	 * 属性 num的Getter方法.属性名：数量
	 *  创建日期:2017-12-14
	 * @return java.lang.Double
	 */
	public java.lang.Double getNum () {
		return num;
	}
	   
	/**
	 * 属性num的Setter方法.属性名：数量
	 * 创建日期:2017-12-14
	 * @param newNum java.lang.Double
	 */
	public void setNum (java.lang.Double newNum ) {
	 	this.num = newNum;
	} 	 
	
	/**
	 * 属性 price的Getter方法.属性名：单价
	 *  创建日期:2017-12-14
	 * @return java.lang.Double
	 */
	public java.lang.Double getPrice () {
		return price;
	}
	   
	/**
	 * 属性price的Setter方法.属性名：单价
	 * 创建日期:2017-12-14
	 * @param newPrice java.lang.Double
	 */
	public void setPrice (java.lang.Double newPrice ) {
	 	this.price = newPrice;
	} 	 
	
	/**
	 * 属性 money的Getter方法.属性名：金额
	 *  创建日期:2017-12-14
	 * @return java.lang.Double
	 */
	public java.lang.Double getMoney () {
		return money;
	}
	   
	/**
	 * 属性money的Setter方法.属性名：金额
	 * 创建日期:2017-12-14
	 * @param newMoney java.lang.Double
	 */
	public void setMoney (java.lang.Double newMoney ) {
	 	this.money = newMoney;
	} 	 
	
	/**
	 * 属性 memo的Getter方法.属性名：备注
	 *  创建日期:2017-12-14
	 * @return java.lang.String
	 */
	public java.lang.String getMemo () {
		return memo;
	}
	   
	/**
	 * 属性memo的Setter方法.属性名：备注
	 * 创建日期:2017-12-14
	 * @param newMemo java.lang.String
	 */
	public void setMemo (java.lang.String newMemo ) {
	 	this.memo = newMemo;
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
        return "OrderDetailEntity";
    }

    @Override
    public String getNamespace() {
        return "demo-public";
    }
}