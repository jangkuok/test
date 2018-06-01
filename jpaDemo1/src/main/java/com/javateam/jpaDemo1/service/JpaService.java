/**
 * 
 */
package com.javateam.jpaDemo1.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.javateam.jpaDemo1.domain.DemoVo;

/**
 * @author javateam
 *
 */
// public interface JpaService extends JpaRepository<DemoVo, Integer> {
public interface JpaService extends CrudRepository<DemoVo, Integer> {

}
