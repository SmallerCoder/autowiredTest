package com.example.demo.beans.impl;

import org.springframework.stereotype.Service;

import com.example.demo.beans.Student;

/**
 * 
 * The class XiaoMing.
 *
 * Description:小明
 *
 * @author: huangjiawei
 * @since: 2018年7月23日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
@Service("stu2")
public class XiaoMing implements Student {

	@Override
	public void printName() {
		System.err.println("小明");
	}

}
