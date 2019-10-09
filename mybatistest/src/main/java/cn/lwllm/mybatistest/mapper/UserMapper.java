package cn.lwllm.mybatistest.mapper;

import cn.lwllm.mybatistest.domain.User;


/**
 * @author lwlas
 */
public interface UserMapper {
    /**
     * 根据id获取用户
     *
     * @param id
     * @return
     */
    public User selectById(Integer id);
}
