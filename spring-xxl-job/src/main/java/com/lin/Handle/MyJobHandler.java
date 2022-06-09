package com.lin.Handle;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyJobHandler {

    @XxlJob("myJobHandler")
    public ReturnT<String> myJobHandler() throws Exception {
        //从调度中心获取param参数
        String param = XxlJobHelper.getJobParam();
        XxlJobHelper.log("短信内容："+param+"时间："+new Date());
        System.out.println("短信内容："+param+"时间："+new Date());
        return ReturnT.SUCCESS;
    }

}
