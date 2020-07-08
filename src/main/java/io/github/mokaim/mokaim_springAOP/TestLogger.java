package io.github.mokaim.mokaim_springAOP;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestLogger {
	private Log log = LogFactory.getLog(getClass());
	
	@After("execution(* io.github.mokaim.mokaim_springAOP.UserService.*(..))")
	public void log(JoinPoint point) {
		log.debug(point.getSignature().getName() + "User Method");
	}
	
	@After("execution(* io.github.mokaim.mokaim_springAOP.BoardService.*(..))")
	public void boardLog(JoinPoint point) {
		log.debug(point.getSignature().getName() + "Board Method");
	}
	
}
