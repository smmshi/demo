package net.smm.dao;

import net.smm.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideoMapper {
    /**
     * 根据ID查询视屏列表
     * @param videoId
     * @return
     */
    Video selectById(@Param("video_id") int videoId);

    Video selectByIdNew(@Param("video_id") int videoId);

    //查询语句 适用于简单的sql
    @Select("select * from video")
    List<Video> findAllvideo();

    /**
     * 模糊查询
     * @param title
     * @param point
     * @return
     */
    List<Video> selectbynameandpoint(@Param("title") String title,@Param("point") double point);

    /**
     * 单条插入
     * @param video
     * @return
     */
    int add(Video video);

    /**
     * 批量插入
     * @param video
     * @return
     */
    int addBatch(List<Video> video);

    /**
     * 更新视频
     * @param video
     * @return
     */

    int updateVideo(Video video);


}
