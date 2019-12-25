package com.sdl.comp.service.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "sys_menu")
public class SysMenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 菜单编码
     */
    private String code;

    /**
     * 父菜单ID
     */
    @Column(name = "p_id")
    private String pId;

    /**
     * 菜单父编码
     */
    @Column(name = "p_code")
    private String pCode;

    /**
     * 名称
     */
    private String name;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 菜单层级
     */
    private Integer level;

    /**
     * 菜单排序
     */
    private Integer sort;

    /**
     * 是否是菜单(1.菜单。2.按钮)
     */
    @Column(name = "is_menu")
    private Boolean isMenu;

    private String icon;

    private Boolean valid;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取菜单编码
     *
     * @return code - 菜单编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置菜单编码
     *
     * @param code 菜单编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取父菜单ID
     *
     * @return p_id - 父菜单ID
     */
    public String getpId() {
        return pId;
    }

    /**
     * 设置父菜单ID
     *
     * @param pId 父菜单ID
     */
    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    /**
     * 获取菜单父编码
     *
     * @return p_code - 菜单父编码
     */
    public String getpCode() {
        return pCode;
    }

    /**
     * 设置菜单父编码
     *
     * @param pCode 菜单父编码
     */
    public void setpCode(String pCode) {
        this.pCode = pCode == null ? null : pCode.trim();
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取请求地址
     *
     * @return url - 请求地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置请求地址
     *
     * @param url 请求地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取菜单层级
     *
     * @return level - 菜单层级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置菜单层级
     *
     * @param level 菜单层级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取菜单排序
     *
     * @return sort - 菜单排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置菜单排序
     *
     * @param sort 菜单排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取是否是菜单(1.菜单。2.按钮)
     *
     * @return is_menu - 是否是菜单(1.菜单。2.按钮)
     */
    public Boolean getIsMenu() {
        return isMenu;
    }

    /**
     * 设置是否是菜单(1.菜单。2.按钮)
     *
     * @param isMenu 是否是菜单(1.菜单。2.按钮)
     */
    public void setIsMenu(Boolean isMenu) {
        this.isMenu = isMenu;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * @return valid
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * @param valid
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", pId=").append(pId);
        sb.append(", pCode=").append(pCode);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", level=").append(level);
        sb.append(", sort=").append(sort);
        sb.append(", isMenu=").append(isMenu);
        sb.append(", icon=").append(icon);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}