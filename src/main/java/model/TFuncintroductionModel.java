package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/7/29.
 */
@Entity
@Table(name = "t_func_introduction", schema = "", catalog = "vdomain")
public class TFuncIntroductionModel {
    private int id;
    private String funcName;
    private String funcTitle;
    private String funcPicUrl;
    private String funcDesc;
    private Integer funcGuideEnable;
    private String funcGuideUrl;
    private Integer funcGuideId;
    private Integer funcTopicEnable;
    private String funcTopicUrl;
    private Integer funcTopicId;
    private String funcIconUrl;
    private Integer funcParentId;


    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FUNC_NAME", nullable = true, insertable = true, updatable = true, length = 70)
    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    @Basic
    @Column(name = "FUNC_TITLE", nullable = true, insertable = true, updatable = true, length = 70)
    public String getFuncTitle() {
        return funcTitle;
    }

    public void setFuncTitle(String funcTitle) {
        this.funcTitle = funcTitle;
    }

    @Basic
    @Column(name = "FUNC_PIC_URL", nullable = true, insertable = true, updatable = true, length = 500)
    public String getFuncPicUrl() {
        return funcPicUrl;
    }

    public void setFuncPicUrl(String funcPicUrl) {
        this.funcPicUrl = funcPicUrl;
    }

    @Basic
    @Column(name = "FUNC_DESC", nullable = true, insertable = true, updatable = true, length = 1000)
    public String getFuncDesc() {
        return funcDesc;
    }

    public void setFuncDesc(String funcDesc) {
        this.funcDesc = funcDesc;
    }

    @Basic
    @Column(name = "FUNC_GUIDE_ENABLE", nullable = true, insertable = true, updatable = true)
    public Integer getFuncGuideEnable() {
        return funcGuideEnable;
    }

    public void setFuncGuideEnable(Integer funcGuideEnable) {
        this.funcGuideEnable = funcGuideEnable;
    }

    @Basic
    @Column(name = "FUNC_GUIDE_URL", nullable = true, insertable = true, updatable = true, length = 500)
    public String getFuncGuideUrl() {
        return funcGuideUrl;
    }

    public void setFuncGuideUrl(String funcGuideUrl) {
        this.funcGuideUrl = funcGuideUrl;
    }

    @Basic
    @Column(name = "FUNC_GUIDE_ID", nullable = true, insertable = true, updatable = true)
    public Integer getFuncGuideId() {
        return funcGuideId;
    }

    public void setFuncGuideId(Integer funcGuideId) {
        this.funcGuideId = funcGuideId;
    }

    @Basic
    @Column(name = "FUNC_TOPIC_ENABLE", nullable = true, insertable = true, updatable = true)
    public Integer getFuncTopicEnable() {
        return funcTopicEnable;
    }

    public void setFuncTopicEnable(Integer funcTopicEnable) {
        this.funcTopicEnable = funcTopicEnable;
    }

    @Basic
    @Column(name = "FUNC_TOPIC_URL", nullable = true, insertable = true, updatable = true, length = 500)
    public String getFuncTopicUrl() {
        return funcTopicUrl;
    }

    public void setFuncTopicUrl(String funcTopicUrl) {
        this.funcTopicUrl = funcTopicUrl;
    }

    @Basic
    @Column(name = "FUNC_TOPIC_ID", nullable = true, insertable = true, updatable = true)
    public Integer getFuncTopicId() {
        return funcTopicId;
    }

    public void setFuncTopicId(Integer funcTopicId) {
        this.funcTopicId = funcTopicId;
    }

    @Basic
    @Column(name = "FUNC_ICON_URL", nullable = true, insertable = true, updatable = true, length = 500)
    public String getFuncIconUrl() {
        return funcIconUrl;
    }

    public void setFuncIconUrl(String funcIconUrl) {
        this.funcIconUrl = funcIconUrl;
    }

    @Basic
    @Column(name = "FUNC_PARENT_ID", nullable = true, insertable = true, updatable = true)
    public Integer getFuncParentId() {
        return funcParentId;
    }

    public void setFuncParentId(Integer funcParentId) {
        this.funcParentId = funcParentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TFuncIntroductionModel that = (TFuncIntroductionModel) o;

        if (id != that.id) return false;
        if (funcDesc != null ? !funcDesc.equals(that.funcDesc) : that.funcDesc != null) return false;
        if (funcGuideEnable != null ? !funcGuideEnable.equals(that.funcGuideEnable) : that.funcGuideEnable != null)
            return false;
        if (funcGuideId != null ? !funcGuideId.equals(that.funcGuideId) : that.funcGuideId != null) return false;
        if (funcGuideUrl != null ? !funcGuideUrl.equals(that.funcGuideUrl) : that.funcGuideUrl != null) return false;
        if (funcIconUrl != null ? !funcIconUrl.equals(that.funcIconUrl) : that.funcIconUrl != null) return false;
        if (funcName != null ? !funcName.equals(that.funcName) : that.funcName != null) return false;
        if (funcParentId != null ? !funcParentId.equals(that.funcParentId) : that.funcParentId != null) return false;
        if (funcPicUrl != null ? !funcPicUrl.equals(that.funcPicUrl) : that.funcPicUrl != null) return false;
        if (funcTitle != null ? !funcTitle.equals(that.funcTitle) : that.funcTitle != null) return false;
        if (funcTopicEnable != null ? !funcTopicEnable.equals(that.funcTopicEnable) : that.funcTopicEnable != null)
            return false;
        if (funcTopicId != null ? !funcTopicId.equals(that.funcTopicId) : that.funcTopicId != null) return false;
        if (funcTopicUrl != null ? !funcTopicUrl.equals(that.funcTopicUrl) : that.funcTopicUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (funcName != null ? funcName.hashCode() : 0);
        result = 31 * result + (funcTitle != null ? funcTitle.hashCode() : 0);
        result = 31 * result + (funcPicUrl != null ? funcPicUrl.hashCode() : 0);
        result = 31 * result + (funcDesc != null ? funcDesc.hashCode() : 0);
        result = 31 * result + (funcGuideEnable != null ? funcGuideEnable.hashCode() : 0);
        result = 31 * result + (funcGuideUrl != null ? funcGuideUrl.hashCode() : 0);
        result = 31 * result + (funcGuideId != null ? funcGuideId.hashCode() : 0);
        result = 31 * result + (funcTopicEnable != null ? funcTopicEnable.hashCode() : 0);
        result = 31 * result + (funcTopicUrl != null ? funcTopicUrl.hashCode() : 0);
        result = 31 * result + (funcTopicId != null ? funcTopicId.hashCode() : 0);
        result = 31 * result + (funcIconUrl != null ? funcIconUrl.hashCode() : 0);
        result = 31 * result + (funcParentId != null ? funcParentId.hashCode() : 0);
        return result;
    }
}
