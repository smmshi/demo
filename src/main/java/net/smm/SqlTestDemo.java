package net.smm;

import net.smm.dao.VideoMapper;
import net.smm.domain.Video;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SqlTestDemo {
    public static void main(String[] args) throws IOException {
        String resource = "config/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            VideoMapper mapper = sqlSession.getMapper(VideoMapper.class);
            /**
             * HTML查询
             */
//            Video video = mapper.selectById(30);
//            System.out.println(video.toString());


            /**
             *自定制要查询的字段
             */
//            Video video = mapper.selectByIdNew(30);
//            System.out.println(video.toString());
            /**
             * 查询语句 全量查询
             */
//            List<Video> allvideo = mapper.findAllvideo();
//            for (Video v:allvideo)
//            {
//                System.out.println(v.toString());
//
//            }

            /**
             * 模糊查询
             */

//            List<Video> videos = mapper.selectbynameandpoint("新版", 8.9);
//            for (Video v:videos)
//            {
//                System.out.println(v.toString());
//
//            }

            /**
             * 单条添加
             * `summary`, `cover_img`, `price`, `create_time`, `point`
             */
//             Video video1 = new Video();
//             video1.setCoverImg("http://qqqnjj");
//             video1.setTitle("标题1");
//             video1.setSummary("biaoshucehsi");
//             video1.setPrice(34);
//             video1.setCreateTime(new Date());
//             video1.setPoint(10);
//             video1.setPrice(223);
//             mapper.add(video1);

            /**
             * 多条添加
             */
//            Video video1 = new Video();
//            video1.setCoverImg("http://qqqnjj");
//            video1.setTitle("标题1");
//            video1.setSummary("biaoshucehsi");
//            video1.setPrice(34);
//            video1.setCreateTime(new Date());
//            video1.setPoint(10);
//            video1.setPrice(223);


//            Video video2 = new Video();
//            video2.setCoverImg("https://qqqnjj");
//            video2.setTitle("标题2");
//            video2.setSummary("ceshi");
//            video2.setPrice(34);
//            video2.setCreateTime(new Date());
//            video2.setPoint(10);
//            video2.setPrice(223);

//            List<Video> list = new ArrayList<>();
//            list.add(video1);
//            list.add(video2);
//
//            mapper.addBatch(list);

            /**
             * 更新视频
             */
            Video video2 = new Video();
            video2.setId(50);
            video2.setCoverImg("https://qqqnjj");
            video2.setTitle("标题2new");
            video2.setSummary("ceshi");
            video2.setPrice(34);
            video2.setCreateTime(new Date());
            video2.setPoint(10.0);
            video2.setPrice(223);

            mapper.updateVideo(video2);

        }


    }

}
