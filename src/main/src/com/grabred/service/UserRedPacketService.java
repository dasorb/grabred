package com.grabred.service;

import com.grabred.pojo.RedPacket;

/**
 * @author chenjie
 * @date 2019/2/28 0028 - 15:17
 */
public interface UserRedPacketService {

    /****
     * 保存抢红包信息
     * @param redPacketId 红包编号
     * @param userId 抢红包用户编号
     * @return 影响记录条数
     */
    int grapRedPacket(Long redPacketId, Long userId);

    /*****
     * 乐观锁解决超并发问题
     * @param redPacketId
     * @param userId
     * @return
     */
    int grapRedPacketForVersion(Long redPacketId, Long userId);

    /****
     * 通过redis实现抢红包
     * @param redPacketId 红包编号
     * @param userId 用户编号
     * @return
     * 0 - 没有库存失败
     */
    Long grapRedPacketByRedis(Long redPacketId, Long userId);

}
