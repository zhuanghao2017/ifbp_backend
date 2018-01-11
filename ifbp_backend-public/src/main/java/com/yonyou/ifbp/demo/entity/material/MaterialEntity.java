package com.yonyou.ifbp.demo.entity.material;

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
 *  创建日期:2017-10-10
 * @author 
 * @version 
 */
@Entity(namespace = "demo-public",name = "MaterialEntity")
@Table(name = "demo_material")
public class MaterialEntity extends BaseEntity{
	
	private static final long serialVersionUID = -3514937121252760787L;

	@Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "IFBPAPP")  
    @Column(name = "id")
    private java.lang.String id;
      
    @Column(name = "code")
    private java.lang.String code;
      
    @Column(name = "name")
    private java.lang.String name;
      
    @Column(name = "unit")
    private java.lang.String unit;
      
    @Column(name = "module")
    private java.lang.String module;
      
    @Column(name = "memo")
    private java.lang.String memo;
      
    @Column(name = "pk_group")
    private java.lang.String pk_group;
      
    @Column(name = "pk_org")
    private java.lang.String pk_org;
      
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
	 * 属性 id的Getter方法.属性名：主键
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getId () {
		return id;
	}
	   
	/**
	 * 属性id的Setter方法.属性名：主键
	 * 创建日期:2017-10-10
	 * @param newId java.lang.String
	 */
	public void setId (java.lang.String newId ) {
	 	this.id = newId;
	} 	 
	
	/**
	 * 属性 code的Getter方法.属性名：编码
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getCode () {
		return code;
	}
	   
	/**
	 * 属性code的Setter方法.属性名：编码
	 * 创建日期:2017-10-10
	 * @param newCode java.lang.String
	 */
	public void setCode (java.lang.String newCode ) {
	 	this.code = newCode;
	} 	 
	
	/**
	 * 属性 name的Getter方法.属性名：名称
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getName () {
		return name;
	}
	   
	/**
	 * 属性name的Setter方法.属性名：名称
	 * 创建日期:2017-10-10
	 * @param newName java.lang.String
	 */
	public void setName (java.lang.String newName ) {
	 	this.name = newName;
	} 	 
	
	/**
	 * 属性 unit的Getter方法.属性名：单位
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getUnit () {
		return unit;
	}
	   
	/**
	 * 属性unit的Setter方法.属性名：单位
	 * 创建日期:2017-10-10
	 * @param newUnit java.lang.String
	 */
	public void setUnit (java.lang.String newUnit ) {
	 	this.unit = newUnit;
	} 	 
	
	/**
	 * 属性 module的Getter方法.属性名：规格
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getModule () {
		return module;
	}
	   
	/**
	 * 属性module的Setter方法.属性名：规格
	 * 创建日期:2017-10-10
	 * @param newModule java.lang.String
	 */
	public void setModule (java.lang.String newModule ) {
	 	this.module = newModule;
	} 	 
	
	/**
	 * 属性 memo的Getter方法.属性名：描述
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getMemo () {
		return memo;
	}
	   
	/**
	 * 属性memo的Setter方法.属性名：描述
	 * 创建日期:2017-10-10
	 * @param newMemo java.lang.String
	 */
	public void setMemo (java.lang.String newMemo ) {
	 	this.memo = newMemo;
	} 	 
	
	/**
	 * 属性 pk_group的Getter方法.属性名：集团
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getPk_group () {
		return pk_group;
	}
	   
	/**
	 * 属性pk_group的Setter方法.属性名：集团
	 * 创建日期:2017-10-10
	 * @param newPk_group java.lang.String
	 */
	public void setPk_group (java.lang.String newPk_group ) {
	 	this.pk_group = newPk_group;
	} 	 
	
	/**
	 * 属性 pk_org的Getter方法.属性名：组织
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org () {
		return pk_org;
	}
	   
	/**
	 * 属性pk_org的Setter方法.属性名：组织
	 * 创建日期:2017-10-10
	 * @param newPk_org java.lang.String
	 */
	public void setPk_org (java.lang.String newPk_org ) {
	 	this.pk_org = newPk_org;
	} 	 
	
	/**
	 * 属性 creator的Getter方法.属性名：创建人
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getCreator () {
		return creator;
	}
	   
	/**
	 * 属性creator的Setter方法.属性名：创建人
	 * 创建日期:2017-10-10
	 * @param newCreator java.lang.String
	 */
	public void setCreator (java.lang.String newCreator ) {
	 	this.creator = newCreator;
	} 	 
	
	/**
	 * 属性 creationtime的Getter方法.属性名：创建时间
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getCreationtime () {
		return creationtime;
	}
	   
	/**
	 * 属性creationtime的Setter方法.属性名：创建时间
	 * 创建日期:2017-10-10
	 * @param newCreationtime java.lang.String
	 */
	public void setCreationtime (java.lang.String newCreationtime ) {
	 	this.creationtime = newCreationtime;
	} 	 
	
	/**
	 * 属性 modifier的Getter方法.属性名：修改人
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getModifier () {
		return modifier;
	}
	   
	/**
	 * 属性modifier的Setter方法.属性名：修改人
	 * 创建日期:2017-10-10
	 * @param newModifier java.lang.String
	 */
	public void setModifier (java.lang.String newModifier ) {
	 	this.modifier = newModifier;
	} 	 
	
	/**
	 * 属性 modifiedtime的Getter方法.属性名：修改时间
	 *  创建日期:2017-10-10
	 * @return java.lang.String
	 */
	public java.lang.String getModifiedtime () {
		return modifiedtime;
	}
	   
	/**
	 * 属性modifiedtime的Setter方法.属性名：修改时间
	 * 创建日期:2017-10-10
	 * @param newModifiedtime java.lang.String
	 */
	public void setModifiedtime (java.lang.String newModifiedtime ) {
	 	this.modifiedtime = newModifiedtime;
	} 	 
	
	/**
	 * 属性 dr的Getter方法.属性名：dr
	 *  创建日期:2017-10-10
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}
	   
	/**
	 * 属性dr的Setter方法.属性名：dr
	 * 创建日期:2017-10-10
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	 
	
	/**
	 * 属性 ts的Getter方法.属性名：ts
	 *  创建日期:2017-10-10
	 * @return java.util.Date
	 */
	public java.util.Date getTs () {
		return ts;
	}
	   
	/**
	 * 属性ts的Setter方法.属性名：ts
	 * 创建日期:2017-10-10
	 * @param newTs java.util.Date
	 */
	public void setTs (java.util.Date newTs ) {
	 	this.ts = newTs;
	} 	 
	
    @Override
    public String getMetaDefinedName() {
        return "MaterialEntity";
    }

    @Override
    public String getNamespace() {
        return "demo-public";
    }
}