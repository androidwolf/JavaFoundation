package TestDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK¶¯Ì¬´úÀí
 * @author yxx
 *
 */
public class Application {

	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		InvocationHandler invocationHandler = new MyInvocationHandler(
				userService);
		UserService userServiceProxy = (UserService) Proxy.newProxyInstance(
				userService.getClass().getClassLoader(), userService.getClass()
						.getInterfaces(), invocationHandler);
		System.out.println(userServiceProxy.getName(1));
		System.out.println(userServiceProxy.getAge(1));
	}

}
