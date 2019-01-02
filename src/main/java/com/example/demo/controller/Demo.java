package com.example.demo.controller;

import com.example.demo.entity.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Lowi on 2018/11/17 0017.
 */
@Api(tags = {"demo接口"})
@RestController
@RequestMapping(value = "/demo")
public class Demo {

	@ApiOperation(value = "待确认雇佣消息")
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Result<Person> test(@ApiIgnore HttpServletRequest request) {
		Person person = new Person();
		person.setAge(18);
		person.setName("张三");
		person.setSex(1);
		Result result = new Result(0, "查询成功", person);
		return result;
	}
}
