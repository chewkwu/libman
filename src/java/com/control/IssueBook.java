/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.control;

import com.dao.BooksDAO;
import com.dao.IssueDAO;
import java.util.Date;
import com.pojo.Issue;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Uchenna
 */
public class IssueBook extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet IssueBook</title>");            
            out.println("</head>");
            out.println("<body>");
            Issue iish = new Issue();
            iish.setBookID(Integer.parseInt(request.getParameter("bookID")));
            iish.setBookName(request.getParameter("bookname"));
            iish.setLibPhone(request.getParameter("libPhone"));
            iish.setNoIssued(Integer.parseInt(request.getParameter("nofbooks")));
            Date today = Calendar.getInstance().getTime();
            iish.setDueDate(java.sql.Date.valueOf(today.toString()));
            iish.setDueStatus("issued");
            try {
                IssueDAO ish = new IssueDAO();
                Issue iish2 = ish.issueBooks(iish);
                BooksDAO bk = new BooksDAO();
                bk.updateStock(iish.getNoIssued(), iish.getBookID(), "minus");
                request.setAttribute("Issue", iish2);
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/issue.jsp");
	        rd.forward(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
                out.println("Could record Issue, Please check logs");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
