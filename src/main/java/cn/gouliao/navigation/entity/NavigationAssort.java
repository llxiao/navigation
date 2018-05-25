package cn.gouliao.navigation.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 导航分类
 *
 * </p>
 *
 * @author Shawn
 * @since 2018-05-25
 */

@TableName("navigation_assort")
@Data
@EqualsAndHashCode(callSuper = false)
public class NavigationAssort extends Model<NavigationAssort> {


    /**
     * 数据库ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    @SerializedName("id")
    @Expose
    private Integer id;
    /**
     * 导航名称
     */
    @SerializedName("navigationName")
    @Expose
    private String navigationName;
    /**
     * 创建时间 13位时间戳
     */
    @SerializedName("createTime")
    @Expose
    private Long createTime;
    /**
     * 更新时间
     */
    @SerializedName("updateTime")
    @Expose
    private Long updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
