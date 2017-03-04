package TestDynamicProxy2;

import net.sf.cglib.proxy.Enhancer;

/**
 * Cglib实现动态代理
 * 
 * @author yxx
 * 
 */
public class Application {

	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(UserServiceImpl.class);
		enhancer.setCallback(cglibProxy);

		UserService o = (UserService) enhancer.create();
		System.out.println(o.getName(1));
		System.out.println(o.getAge(1));
	}
}
