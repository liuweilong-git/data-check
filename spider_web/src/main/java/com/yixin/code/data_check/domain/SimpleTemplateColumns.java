package com.yixin.code.data_check.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

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
@TableName("simple_template_columns")
@Schema(name="SimpleTemplateColumns对象", description="")
public class SimpleTemplateColumns implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(description = "核对规则id")
    @TableField("rules_id")
    private Integer rulesId;

    @Schema(description = "字段名")
    @TableField("column_name")
    private String columnName;

    @Schema(description = "预期值比对方法")
    @TableField("method")
    private Integer method;

    @Schema(description = "预期值")
    @TableField("expected_value")
    private String expectedValue;

    @Schema(description = "删除此列")
    @TableField("is_deleted")
    private Boolean isDeleted;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "修改时间")
    @TableField("modify_time")
    private LocalDateTime modifyTime;
}
