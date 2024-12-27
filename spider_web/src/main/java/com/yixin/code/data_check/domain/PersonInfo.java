package com.yixin.code.data_check.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.time.LocalDateTime;
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
@TableName("person_info")
@Schema(name="CronjobRunInstance对象", description="")
public class PersonInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(description = "员工工号")
    @TableField("uniq_employee_id")
    private Integer uniqEmployeeId;

    @Schema(description = "员工姓名")
    @TableField("employee_name")
    private String employeeName;

    @Schema(description = "员工邮箱")
    @TableField("email")
    private String email;

    @Schema(description = "员工邮箱前缀")
    @TableField("email_prefix")
    private String emailPrefix;

    @Schema(description = "是否删除")
    @TableField("is_delete")
    private Boolean isDelete;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "修改时间")
    @TableField("modify_time")
    private LocalDateTime modifyTime;


}
