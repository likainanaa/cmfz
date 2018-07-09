package com.likainan.cmfz.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.weaver.MethodDelegateTypeMunger;
import sun.reflect.generics.tree.MethodTypeSignature;

import javax.xml.ws.Service;
import java.util.Date;

/**
 * Created by ASUS on 2018/7/9.
 */
@Aspect
public class LogAspectj {
    /**
     * 声明切入点表达式
     */
    @Pointcut("execution(* com.likainan.cmfz.service.*.*(..))")
    public void pc(){
    }

    @Around("pc()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable{
        System.out.println("环绕前");
        Object obj=pjp.proceed();
        Date date=new Date();
        System.out.println("date:"+date);
    //方法名
        MethodSignature methodSignature= (MethodSignature) pjp.getSignature();
        String typeName="";
        String methName=methodSignature.getName();
        if(methName.contains("Add")){
            typeName="新增";
        }
        else if (methName.contains("Modify")){
             typeName="修改";
        }
        else  if (methName.contains("Delete")){
            typeName="删除";
        }

        System.out.println("typeName:"+typeName);
    //实体类名
        String className=pjp.getTarget().getClass().getName();
        int dex=className.indexOf("ServiceImpl",0);
        String cn=className.split("ServiceImpl")[0];
        String cnn=cn.split("com.likainan.cmfz.service.impl.")[1];
        System.out.println("cn:"+cn);
        System.out.println("cnn:"+cnn);
        System.out.println("className:"+className);

    //参数
        Object[] ob=pjp.getArgs();
        String information="";
        for (int i=0;i<pjp.getArgs().length;i++){
            information+=ob[i];
        }
        System.out.println("information"+information);

        System.out.println("环绕后");
        return obj;
    }
}
