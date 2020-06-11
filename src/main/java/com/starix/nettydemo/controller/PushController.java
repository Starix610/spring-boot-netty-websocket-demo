// Copyright (C) 2020 Meituan
// All rights reserved
package com.starix.nettydemo.controller;

import com.starix.nettydemo.netty.WebSocketUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shiwenjie
 * @created 2020/6/11 5:47 下午
 **/
@RestController
public class PushController {

    /**
     * 测试服务端主动推送实时消息给所有客户端
     * @param msg
     * @return
     */
    @GetMapping("/push")
    public String pushMsg(String msg){
        WebSocketUtil.sendMessageToAll(msg);
        return "success";
    }

}