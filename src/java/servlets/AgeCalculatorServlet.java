/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 845593
 */
public class AgeCalculatorServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.setAttribute("arithpage", "/CPRG352_Lab03/arithmetic");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
         request.setAttribute("arithpage", "/CPRG352_Lab03/arithmetic");

        if (age == null || age.trim().equals("")) {
            request.setAttribute("nextYearAge", "You must give your current age");
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        else {
        try{ int ageN = Integer.parseInt(age);
        int nextYearAgeN = ageN + 1;
        String nextYearAge = "Your age next birthday will be " + nextYearAgeN;
        request.setAttribute("nextYearAge", nextYearAge);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);}
        catch(Exception e){
         request.setAttribute("nextYearAge", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        }
        
    }
}
