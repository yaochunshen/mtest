package com.test.mtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ValidationTest {
	
	public static void main(String [] agrs){
		
		Demo demo = new Demo();
		
		validation(demo);
	}
	
	public static void validation(Demo demo){
		
		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();// 验证器
		
		Set<ConstraintViolation<Demo>>  vios  = validator.validate(demo); // 验证
		
		for(ConstraintViolation<Demo> vio:vios){
			System.out.println(vio.getMessage());
		}
		
		
	}

}



class Demo{
	
	@Min(value = 10,message = "数据必须>=10")
	private int min=20;
	
	@Max(value = 100,message = "数据必须<=100")
	private int max;
	
	@Size(min = 10,max = 1000,message = "数据范围为10--1000")
	private List size=new ArrayList();
	
	@NotNull(message="不能为空")
	private String notNull;

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public String getNotNull() {
		return notNull;
	}

	public void setNotNull(String notNull) {
		this.notNull = notNull;
	}

	public List getSize() {
		return size;
	}

	public void setSize(List size) {
		this.size = size;
	}
	
	
	
}