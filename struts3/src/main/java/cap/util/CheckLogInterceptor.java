package cap.util;

import cap.action.LoginAction;
import cap.bean.Admin;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.sun.deploy.association.Action;

import javax.swing.*;
import java.util.Map;

public class CheckLogInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("开始拦截器拦截");
        Object obj = actionInvocation.getAction();
        if (obj instanceof LoginAction) {
            System.out.println("登录不需要拦截");
            return actionInvocation.invoke();
        }
        Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
        Admin admin = (Admin) session.get("admin");
        if (admin != null) {
            System.out.println("已经登录不需要拦截");
            return actionInvocation.invoke();

        } else {
            System.out.println("你还没有登录，跳转到登录页面");
            return com.opensymphony.xwork2.Action.LOGIN;
        }

    }
}
