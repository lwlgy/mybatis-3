package cn.lwllm.mybatistest;

import cn.lwllm.mybatistest.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author lwlas
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("begin");

        final InputStream resource = TestMain.class.getResourceAsStream("/mybatis.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resource);
        try (SqlSession sqlSession = sessionFactory.openSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.selectById(2));
        }
        System.out.println("end");
    }
}
