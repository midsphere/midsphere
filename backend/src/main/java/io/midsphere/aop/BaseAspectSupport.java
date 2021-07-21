package io.midsphere.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * 通用父类切面
 * @author liqiwen
 * @since 1.0
 */
public class BaseAspectSupport {


    /**
     * 解析 method
     * @param joinPoint joinPoint
     * @return Method
     */
    public Method resolveMethod(ProceedingJoinPoint joinPoint) {
        final MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        final Class<?> targetClass = joinPoint.getTarget().getClass();

        Method method = getDeclaredMethod(targetClass, signature.getName(), signature.getMethod().getParameterTypes());
        if(method == null) {
            throw new IllegalStateException("cannot parser target method: " + signature.getMethod().getName());
        }
        return method;
    }

    /**
     * 获取申明的方法
     * @param clazz clazz
     * @param name name
     * @param parameters parameters
     * @return Method
     */
    private Method getDeclaredMethod(Class<?> clazz, String name, Class<?>... parameters) {
        try {
            return clazz.getDeclaredMethod(name, parameters);
        } catch (NoSuchMethodException e) {
            final Class<?> superClass = clazz.getSuperclass();
            if(superClass != null) {
                return getDeclaredMethod(superClass, name, parameters);
            }
        }
        return null;
    }
}
