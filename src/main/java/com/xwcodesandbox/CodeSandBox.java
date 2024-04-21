package com.xwcodesandbox;


import com.xwcodesandbox.model.ExecuteCodeRequest;
import com.xwcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义 
 *
 * @author 西尾coding
 * @createTime 2023/8/30 星期三 10:22
 */
public interface CodeSandBox {

    /**
     * 代码沙箱执行代码接口
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
