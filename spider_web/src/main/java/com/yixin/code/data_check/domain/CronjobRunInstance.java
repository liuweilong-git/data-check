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
@TableName("cronjob_run_instance")
@Schema(name="CronjobRunInstance对象", description="")
public class CronjobRunInstance implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "任务id")
    @TableField("rules_id")
    private Long rulesId;

    @Schema(description = "任务执行状态")
    @TableField("run_status")
    private Long runStatus;

    @Schema(description = "失败原因")
    @TableField("reason")
    private String reason;

    @Schema(description = "开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @Schema(description = "结束时间")
    @TableField("finish_time")
    private LocalDateTime finishTime;

    @Schema(description = "执行时间")
    @TableField("next_run_time")
    private LocalDateTime nextRunTime;

    @Schema(description = "实例执行次数")
    @TableField("execute_times")
    private Integer executeTimes;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "修改时间")
    @TableField("modify_time")
    private LocalDateTime modifyTime;

    @Schema(description = "实例类型：1-mysql单库，2-mysql跨库")
    @TableField("type")
    private Integer type;

    @Schema(description = "实例类型：1-定时任务触发，2-手动触发")
    @TableField("trigger_type")
    private Integer triggerType;

    @Schema(description = "是否删除：0-否，1-是")
    @TableField("is_deleted")
    private Integer isDeleted;

}
