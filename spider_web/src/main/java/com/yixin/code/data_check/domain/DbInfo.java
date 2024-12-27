package com.yixin.code.data_check.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.time.LocalDateTime;
import java.io.Serializable;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author weilong
 * @since 2024-12-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("db_info")

@Schema(name="DbInfo对象", description="")
public class DbInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "数据库自增id主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(description = "所属空间ID")
    @TableField("space_id")
    private Integer spaceId;

    @Schema(description = "数据库名称")
    @TableField("uniq_dbname")
    private String uniqDbname;

    @Schema(description = "数据库连接串")
    @TableField("mysqlpath")
    private String mysqlpath;

    @Schema(description = "删除数据库记录")
    @TableField("is_deleted")
    private Boolean isDeleted;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;


}
