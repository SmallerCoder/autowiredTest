package com.example.demo.beans.impl;

import org.springframework.stereotype.Service;

import com.example.demo.beans.Student;

/**
 * 
 * The class WangEr.
 *
 * Description:王二
 *
 * @author: huangjiawei
 * @since: 2018年7月23日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
@Service("stu1")
public class WangEr implements Student {

	@Override
	public void printName() {

		System.err.println("王二");
	}

}
