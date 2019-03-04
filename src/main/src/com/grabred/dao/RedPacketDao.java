package com.grabred.dao;

import com.grabred.pojo.RedPacket;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author chenjie
 * @date 2019/2/28 0028 - 14:50
 */
@Repository
public interface RedPacketDao {

    /****
     * 获取红包信息
     * @param id 红包id
     * @return 红包具体信息
     */
    public RedPacket getRedPacket(Long id);


    /****
     * 扣减红包数
     * @param id 红包id
     * @return 更新记录条数
     */
    public int decreaseRedPacket(Long id);


    /****
     * 使用for update语句加锁
     * @param id 红包id
     * @return 红包信息
     */
    public RedPacket getRedPacketForUpdate(Long id);

    /****
     * 使用version乐观锁来更新库存
     * @param id
     * @param version
     * @return
     */
    public int decreaseRedPacketForVersion(@Param("id") Long id, @Param("version") Integer version);
}
