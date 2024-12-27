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
@TableName("simple_template_result")
@Schema(name="SimpleTemplateResult对象", description="")
public class SimpleTemplateResult implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "核对结果id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(description = "核对结果uuid")
    @TableField("result_uuid")
    private String resultUuid;

    @Schema(description = "核对规则id")
    @TableField("rules_id")
    private Integer rulesId;

    @Schema(description = "核对结果")
    @TableField("result")
    private Integer result;

    @Schema(description = "异常原因")
    @TableField("reason")
    private String reason;

    @Schema(description = "核对时间")
    @TableField("check_time")
    private LocalDateTime checkTime;

    @Schema(description = "删除此条核对记录")
    @TableField("is_deleted")
    private Boolean isDeleted;

    @Schema(description = "是否发送告警")
    @TableField("alert_status")
    private Integer alertStatus;

    @Schema(description = "实例ID")
    @TableField("instance_id")
    private Long instanceId;

    @Schema(description = "执行时间")
    @TableField("running_time")
    private Float runningTime;

    @Schema(description = "错误数据条数")
    @TableField("false_data_length")
    private Integer falseDataLength;


}
