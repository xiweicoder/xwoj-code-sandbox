package com.xwcodesandbox.model;

import lombok.Data;

/**
 * 判题信息
 * @author 西尾coding
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;

    /**
     * 消耗时间（KB）
     */
    private Long time;
}
