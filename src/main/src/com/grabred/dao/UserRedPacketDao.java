package com.grabred.dao;

import com.grabred.pojo.UserRedPacket;
import org.springframework.stereotype.Repository;

/**
 * @author chenjie
 * @date 2019/2/28 0028 - 15:08
 */
@Repository
public interface UserRedPacketDao {

    /****
     * 插入抢红包信息
     * @param userRedPacket 抢红包信息
     * @return 影响记录条数
     */
    int grabRedPacket(UserRedPacket userRedPacket);

}
