package com.JinjH.Huaojbackendjudgeservice.judge.codesandbox;

import com.JinjH.Huaojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.JinjH.Huaojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
