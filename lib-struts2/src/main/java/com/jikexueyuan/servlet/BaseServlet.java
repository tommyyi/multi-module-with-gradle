package com.jikexueyuan.servlet;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }

    //当请求发送到action之前，
    //调用 MloginAction类中getModel() 获取要将表单数据封装到哪个实例化的对象中
    //获得到该对象之后，我们可以获得 类类型
    //获得类 类型之后。获得类中的属性
    // request.getParameters获得 表单提交的所有数据名
    // 从而获取值
    // 如果表单提交的 name值 与 实体类中属性名一致
    //那么我们将获得表单中的数据 封装到us对象当中去
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            //在程序运行时 获得当前类的getModel方法对象
            Method method = this.getClass().getDeclaredMethod("getModel", null);
            //通过invoke方法 调用该方法 获得实体类对象
            Object ob = method.invoke(this, null);
            //通过实体类对象获得  类类型
            Class cl = ob.getClass();
            //通过类类型获得 类中的属性对象数组
            Field[] fi = cl.getDeclaredFields();
            //通过request获得所有的 表单中提交的name值
            Enumeration em = request.getParameterNames();
            //循环枚举中的值
            while (em.hasMoreElements())
            {
                //获得枚举中的值  就是表单提交的name值
                String fieldName = em.nextElement().toString();
                System.out.println("从表单中获得的 name值;" + fieldName);
                //循环类中所有的属性对象
                for (int i = 0; i < fi.length; i++)
                {
                    System.out.println("从类中获得的属性：" + fi[i].getName());
                    //判断 如果类中属性的名字 和 表单中提交的名字一致
                    if (fieldName.equals(fi[i].getName()))
                    {
                        fi[i].setAccessible(true);//尤为重要，可以被外部赋值
                        //获取request.getParameter(fieldName) 封装到对象中
                        fi[i].set(ob, request.getParameter(fieldName));
                    }
                }
            }
            //调用默认的方法 执行处理
            Method me1 = this.getClass().getDeclaredMethod("execute", null);
            //获得返回的url字符串
            Object url = me1.invoke(this, null);
            //根据返回的字符串 跳转页面
            request.getRequestDispatcher(String.valueOf(url)).forward(request, response);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
