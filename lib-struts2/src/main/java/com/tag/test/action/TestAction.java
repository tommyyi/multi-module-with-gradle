package com.tag.test.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tag.qr.bean.Em;

import java.util.ArrayList;

public class TestAction extends ActionSupport
{
    Em em;
    ArrayList ar;

    @Override
    public String execute() throws Exception
    {
        ar = new ArrayList();
        ar.add("呵呵1");
        ar.add("呵呵2");
        ar.add("呵呵3");
        System.out.println(em.getUserName());
        return "success";
    }

    public Em getEm()
    {
        return em;
    }

    public void setEm(Em em)
    {
        this.em = em;
    }

    public ArrayList getAr()
    {
        return ar;
    }

    public void setAr(ArrayList ar)
    {
        this.ar = ar;
    }

}
