// Copyright (C) 2020 Meituan
// All rights reserved
package com.starix.nettydemo.netty;

import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

/**
 * Netty WebSokcet工具类
 * @author shiwenjie
 * @created 2020/6/11 6:05 下午
 **/
public class WebSocketUtil {

    /**
     * 发送消息给所有客户端
     * @param msg
     */
    public static void sendMessageToAll(String msg){
        WebSocketHandler.userChannels.writeAndFlush(new TextWebSocketFrame(msg));
    }
}