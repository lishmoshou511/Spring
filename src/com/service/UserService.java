package com.service;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by InnoXYZ on 14-5-30.
 */
public class UserService {
	@Setter @Getter
	private String name;

	public void sayHello(){
		System.out.print("hello "+name);
	}
}
