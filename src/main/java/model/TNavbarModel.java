package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/7/29.
 */
@Entity
@Table(name = "t_navbar", schema = "", catalog = "vdomain")
public class TNavbarModel {
    private int id;
    private String navName;
    private String navUrl;
    private Integer parentId;
    private Integer orderNo;


    @Id
    @Column(name = "Id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "navName", nullable = true, insertable = true, updatable = true, length = 45)
    public String getNavName() {
        return navName;
    }

    public void setNavName(String navName) {
        this.navName = navName;
    }

    @Basic
    @Column(name = "navUrl", nullable = true, insertable = true, updatable = true, length = 400)
    public String getNavUrl() {
        return navUrl;
    }

    public void setNavUrl(String navUrl) {
        this.navUrl = navUrl;
    }

    @Basic
    @Column(name = "parentId", nullable = true, insertable = true, updatable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "orderNo", nullable = true, insertable = true, updatable = true)
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TNavbarModel that = (TNavbarModel) o;

        if (id != that.id) return false;
        if (navName != null ? !navName.equals(that.navName) : that.navName != null) return false;
        if (navUrl != null ? !navUrl.equals(that.navUrl) : that.navUrl != null) return false;
        if (orderNo != null ? !orderNo.equals(that.orderNo) : that.orderNo != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (navName != null ? navName.hashCode() : 0);
        result = 31 * result + (navUrl != null ? navUrl.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (orderNo != null ? orderNo.hashCode() : 0);
        return result;
    }
}
