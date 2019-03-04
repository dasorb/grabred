package com.grabred.controller;

import com.grabred.service.UserRedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenjie
 * @date 2019/2/28 0028 - 16:14
 */
@Controller
@RequestMapping("/userRedPacket")
public class UserRedPacketController {

    @Autowired
    private UserRedPacketService userRedPacketService = null;

    @RequestMapping(value = "/grabRedPacket")
    @ResponseBody
    public Map<String, Object> grabRedPacket(Long redPacketId, Long userId) {
        //抢红包
        int result  = userRedPacketService.grapRedPacket(redPacketId, userId);
        Map<String, Object> retMap = new HashMap<>();
        boolean flag = result > 0;
        retMap.put("success", flag);
        retMap.put("message", flag?"抢红包成功":"抢红包失败");
        return retMap;
    }

    @RequestMapping(value = "/grabRedPacketForVersion")
    @ResponseBody
    public Map<String, Object> grabRedPacketForVersion(Long redPacketId, Long userId) {
        //抢红包
        int result  = userRedPacketService.grapRedPacketForVersion(redPacketId, userId);
        Map<String, Object> retMap = new HashMap<>();
        boolean flag = result > 0;
        retMap.put("success", flag);
        retMap.put("message", flag?"抢红包成功":"抢红包失败");
        return retMap;
    }

    @RequestMapping(value = "/grabRedPacketByRedis")
    @ResponseBody
    public Map<String, Object> grabRedPacketForByRedis(Long redPacketId, Long userId) {
        Map<String, Object> resultMap = new HashMap<>();
        Long result = userRedPacketService.grapRedPacketByRedis(redPacketId, userId);
        boolean flag = result > 0;
        resultMap.put("success", flag);
        resultMap.put("message", flag?"抢红包成功":"抢红包失败");
        return resultMap;

    }

}
