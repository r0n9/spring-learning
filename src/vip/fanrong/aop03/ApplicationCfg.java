package vip.fanrong.aop03;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScans({@ComponentScan("vip.fanrong.aop03")})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationCfg {

}
