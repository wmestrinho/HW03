package com.ironyard.servlets;

import javax.servlet.RequestDispatcher;
import java.io.IOException;

/**
 * Created by WagnerMestrinho on 1/13/17.
 */
@javax.servlet.annotation.WebServlet(name = "Servlet1", urlPatterns = "/invest")
public class Servlet1 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        // Investor information
        String invName = request.getParameter("invName");
        request.setAttribute("invName", invName);

        String invAmount = request.getParameter("invAmount");
        Double toInvest = Double.parseDouble(invAmount);
        request.setAttribute("invAmount", invAmount);

        String invProfit = request.getParameter("invProfit");
        Double profitMargin = Double.parseDouble(invProfit);
        request.setAttribute("invProfit", invProfit);

        Double percent = profitMargin / toInvest * 100;
        int intPercent = percent.intValue();
        request.setAttribute("percent", intPercent);

        String invType;

        if(intPercent <= 5)
        {
            invType = "likely";
        }
        else if
                (percent > 5 && intPercent <= 80)
        {
            invType = "greedy";
        }
        else
        {
            invType = "super duper greedy";
        }
        request.setAttribute("invType", invType);


        //forward to display jsp
        String nextJSP = "/display.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
