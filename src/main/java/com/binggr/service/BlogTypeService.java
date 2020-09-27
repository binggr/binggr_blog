package com.binggr.service;

import com.binggr.model.BlogType;

import java.util.List;
import java.util.Map;

/**
 * @author: bing
 * @date: 2020/9/15 20:31
 */
public interface BlogTypeService {
    /**
     * 无参查询所有博客类型列表
     * @return
     */
    List<BlogType> countList();

    /**
     * 不固定参数查询博客列表
     * @return
     */
    List<BlogType> list(Map<String,Object> map);

    /**
     * 不固定参数查询博客类型数量
     * @return
     */
    Long getTotal(Map<String,Object> map);

    /**
     * 通过id查询一条博客类型
     * @param id
     * @return
     */
    BlogType selectByPrimaryKey(Integer id);

    /**
     * 添加一条博客类型
     * @param blogType
     * @return
     */
    int add(BlogType blogType);

    /**
     * 更新一条博客类型
     * @param record
     * @return
     */
    int updateByPrimaryKey(BlogType record);

    /**
     *删除一条博客
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);
}
