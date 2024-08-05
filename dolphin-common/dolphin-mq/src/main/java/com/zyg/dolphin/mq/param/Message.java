package com.zyg.dolphin.mq.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 消息
 *
 * @author zy
 */
@Data
@Accessors(chain = true)
public class Message {
    /**
     * 消息id
     */
    private String msgId;
    /**
     * 消息体
     */
    private String body;
}