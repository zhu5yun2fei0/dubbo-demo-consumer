import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yunfei.server.DemoProviderServer;

public class TestConsumer {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
	        context.start();
	      DemoProviderServer demoConumer =(DemoProviderServer)context.getBean("demoProviderServer");
	     String result= demoConumer.sayHello("你好");
	     System.out.println("远程调用结果"+result);
	     
	     //让服务消费后继续在zookeeper上  方便在dubbo-admin界面查看
	     try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	       context.close();
	}
}
