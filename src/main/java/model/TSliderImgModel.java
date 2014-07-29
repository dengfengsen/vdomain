package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/7/29.
 */
@Entity
@Table(name = "t_slider_img", schema = "", catalog = "vdomain")
public class TSliderImgModel {
    private int id;
    private String sliderFlag;
    private String imgUrl;
    private String imgDesc;
    private String targetUrl;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Basic
    @Column(name = "SLIDER_FLAG", nullable = true, insertable = true, updatable = true, length = 40)
    public String getSliderFlag() {
        return sliderFlag;
    }

    public void setSliderFlag(String sliderFlag) {
        this.sliderFlag = sliderFlag;
    }

    @Basic
    @Column(name = "IMG_URL", nullable = true, insertable = true, updatable = true, length = 1000)
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "IMG_DESC", nullable = true, insertable = true, updatable = true, length = 200)
    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    @Basic
    @Column(name = "TARGET_URL", nullable = true, insertable = true, updatable = true, length = 1000)
    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TSliderImgModel that = (TSliderImgModel) o;

        if (id != that.id) return false;
        if (imgDesc != null ? !imgDesc.equals(that.imgDesc) : that.imgDesc != null) return false;
        if (imgUrl != null ? !imgUrl.equals(that.imgUrl) : that.imgUrl != null) return false;
        if (sliderFlag != null ? !sliderFlag.equals(that.sliderFlag) : that.sliderFlag != null) return false;
        if (targetUrl != null ? !targetUrl.equals(that.targetUrl) : that.targetUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sliderFlag != null ? sliderFlag.hashCode() : 0);
        result = 31 * result + (imgUrl != null ? imgUrl.hashCode() : 0);
        result = 31 * result + (imgDesc != null ? imgDesc.hashCode() : 0);
        result = 31 * result + (targetUrl != null ? targetUrl.hashCode() : 0);
        return result;
    }
}
