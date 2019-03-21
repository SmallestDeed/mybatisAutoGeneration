package model;

import java.util.Date;

/**
 * 描述:supply_demand_pic表的实体类
 * @version
 * @author:  Sandu
 * @创建时间: 2019-03-14
 */
public class SupplyDemandPic {
    /**
     * 
     */
    private Long id;

    /**
     * 图片名称
     */
    private String picName;

    /**
     * 图片大小
     */
    private Integer picSize;

    /**
     * 图片长
     */
    private String picWeight;

    /**
     * 图片高
     */
    private String picHigh;

    /**
     * 图片格式
     */
    private String picFormat;

    /**
     * 图片路径
     */
    private String picPath;

    /**
     * 系统编码
     */
    private String sysCode;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 是否删除（0:否，1:是）
     */
    private Integer isDeleted;

    /**
     * 备注
     */
    private String remark;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 图片名称
     * @return pic_name 图片名称
     */
    public String getPicName() {
        return picName;
    }

    /**
     * 图片名称
     * @param picName 图片名称
     */
    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    /**
     * 图片大小
     * @return pic_size 图片大小
     */
    public Integer getPicSize() {
        return picSize;
    }

    /**
     * 图片大小
     * @param picSize 图片大小
     */
    public void setPicSize(Integer picSize) {
        this.picSize = picSize;
    }

    /**
     * 图片长
     * @return pic_weight 图片长
     */
    public String getPicWeight() {
        return picWeight;
    }

    /**
     * 图片长
     * @param picWeight 图片长
     */
    public void setPicWeight(String picWeight) {
        this.picWeight = picWeight == null ? null : picWeight.trim();
    }

    /**
     * 图片高
     * @return pic_high 图片高
     */
    public String getPicHigh() {
        return picHigh;
    }

    /**
     * 图片高
     * @param picHigh 图片高
     */
    public void setPicHigh(String picHigh) {
        this.picHigh = picHigh == null ? null : picHigh.trim();
    }

    /**
     * 图片格式
     * @return pic_format 图片格式
     */
    public String getPicFormat() {
        return picFormat;
    }

    /**
     * 图片格式
     * @param picFormat 图片格式
     */
    public void setPicFormat(String picFormat) {
        this.picFormat = picFormat == null ? null : picFormat.trim();
    }

    /**
     * 图片路径
     * @return pic_path 图片路径
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * 图片路径
     * @param picPath 图片路径
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    /**
     * 系统编码
     * @return sys_code 系统编码
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * 系统编码
     * @param sysCode 系统编码
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    /**
     * 创建者
     * @return creator 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建者
     * @param creator 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 创建时间
     * @return gmt_create 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 创建时间
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 修改人
     * @return modifier 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 修改人
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 修改时间
     * @return gmt_modified 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 修改时间
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 是否删除（0:否，1:是）
     * @return is_deleted 是否删除（0:否，1:是）
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 是否删除（0:否，1:是）
     * @param isDeleted 是否删除（0:否，1:是）
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}