package com.grabred.service;

import com.grabred.pojo.RedPacket;

/**
 * @author chenjie
 * @date 2019/2/28 0028 - 15:19
 */

public interface RedPacketService {

    /****
     * 获取红包
     * @param id 编号
     * @return 红包信息
     */
    RedPacket getRedPacket(Long id);

    /****
     * 扣减红包
     * @param id 编号
     * @return 影响条数
     */
    int decreaseRedPacket(Long id);
}
