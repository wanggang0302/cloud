/**
 * TcPerCheckinfoMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-06-28 Created
 */
package com.jfsoft.peis.mapper;

import com.jfsoft.peis.entity.TcPerCheckinfo;

public interface TcPerCheckinfoMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_per_checkinfo
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_per_checkinfo
     */
    int insert(TcPerCheckinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_per_checkinfo
     */
    int insertSelective(TcPerCheckinfo record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_per_checkinfo
     */
    TcPerCheckinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_per_checkinfo
     */
    int updateByPrimaryKeySelective(TcPerCheckinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_per_checkinfo
     */
    int updateByPrimaryKey(TcPerCheckinfo record);
}