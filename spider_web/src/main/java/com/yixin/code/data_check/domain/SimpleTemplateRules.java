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
@TableName("simple_template_rules")
@Schema(name="SimpleTemplateRules对象", description="")
public class SimpleTemplateRules implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "核对规则id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(description = "核对规则uuid")
    @TableField("rules_uuid")
    private String rulesUuid;

    @Schema(description = "所属业务线")
    @TableField("business_id")
    private String businessId;

    @Schema(description = "目标数据库ID")
    @TableField("db_id")
    private Integer dbId;

    @Schema(description = "规则名称")
    @TableField("rules_name")
    private String rulesName;

    @Schema(description = "核对规则sql语句")
    @TableField("rules")
    private String rules;

    @Schema(description = "监控类别")
    @TableField("category")
    public Integer category;

    @Schema(description = "结果数据类型")
    @TableField("expected_value_type")
    private Integer expectedValueType;

    @Schema(description = "规则生效")
    @TableField("is_enabled")
    private Boolean isEnabled;

    @Schema(description = "报警发送渠道")
    @TableField("alarm_channel")
    private Integer alarmChannel;

    @Schema(description = "报警工程名")
    @TableField("project_name")
    private String projectName;

    @Schema(description = "企业微信webhook地址")
    @TableField("lark_group_id")
    private String larkGroupId;

    @Schema(description = "告警关联人")
    @TableField("owner")
    private String owner;

    @Schema(description = "规则创建人ID")
    @TableField("creator_id")
    private Integer creatorId;

    @Schema(description = "删除此条规则")
    @TableField("is_deleted")
    private Boolean isDeleted;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "修改时间")
    @TableField("modify_time")
    private LocalDateTime modifyTime;

    @Schema(description = "执行频率:1-小时级别，2-天级别，3-月级别")
    @TableField("run_frequency")
    private Integer runFrequency;

    @Schema(description = "执行时间")
    @TableField("run_time")
    private String runTime;

    @Schema(description = "执行时间_月级别第二个时间")
    @TableField("run_time2")
    private String runTime2;

    @Schema(description = "时区")
    @TableField("timezone")
    private Integer timezone;

    @Schema(description = "时区城市code")
    @TableField("timezone_city")
    private String timezoneCity;

    @Schema(description = "crontab表达式")
    @TableField("crontab_expression")
    private String crontabExpression;

    @Schema(description = "调度类型:1-周期调度，2-手动触发")
    @TableField("scheduling_type")
    private Integer schedulingType;

    @Schema(description = "规则备注")
    @TableField("comments")
    private String comments;

    @Schema(description = "告警级别：2-notice，1-warning，0-critical")
    @TableField("alarm_level")
    private Integer alarmLevel;

    @Schema(description = "是否开启慢sql报警")
    @TableField("slow_sql_alarm")
    private Boolean slowSqlAlarm;
}
