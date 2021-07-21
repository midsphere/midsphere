package io.midsphere.aop;


import io.midsphere.model.LogSubject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 接口入参日志切面
 * @author liqiwen
 * @since 1.0
 */
@Aspect
@Component
public class LoggerAspectSupport extends BaseAspectSupport {


    /**
     * 定义切入点
     */
    @Pointcut("execution(public * io.midsphere.api.*.*(..))")
    public void log() {

    }


    /**
     * 定义环绕通知
     * @param joinPoint jointPoint
     * @return Object
     * @throws Throwable 异常
     */
    @Around("log()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {

        LogSubject logSubject = new LogSubject();


        final Object result = joinPoint.proceed();

        logSubject.setReqResult(result);


        Method method = resolveMethod(joinPoint);

        logSubject.setMethod(method.getName());
        logSubject.setReqParams(getParameters(method, joinPoint.getArgs()));




        return result;
    }

    private Object getParameters(Method method, Object[] args) {
        List<Object> argLists = new ArrayList<>();
        final Parameter[] parameters = method.getParameters();

        Map<String, Object> map = new HashMap<>();

        for(int i = 0; i < parameters.length; i++) {
            final RequestBody requestBody = parameters[i].getAnnotation(RequestBody.class);

            final RequestParam requestParam = parameters[i].getAnnotation(RequestParam.class);


            final String name = parameters[i].getName();
            if(requestBody != null) {
                argLists.add(args[i]);
            } else if(requestParam != null) {
                map.put(name, args[i]);
            } else {
                map.put(name, args[i]);
            }
        }
        if(!map.isEmpty()) {
            argLists.add(map);
        }
        if (argLists.size() == 0) {
            return null;
        } else if (argLists.size() == 1) {
            return argLists.get(0);
        } else {
            return argLists;
        }
    }

}
