package com.muyu.utils;

import java.util.UUID;

/**
 * @description: 与唯一ID相关
 * @author: yuqiangkun
 * @Date: 2020-11-24
 */
public class IdRelated {


    /**
     * @description 生成32位uuid
     * @return
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
