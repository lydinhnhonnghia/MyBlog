/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BlogDAO;
import dao.ShareDAO;
import entity.Blog;
import entity.Share;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kynhanht
 */
public class BlogDetailController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            String sId = request.getParameter("id");
            String pattern = "//d{1,}";
            if (sId == null || sId.matches(pattern)) {
                request.setAttribute("notFound", "Not foud blog");
                RequestDispatcher rd = request.getRequestDispatcher("/ErrorPage.jsp");
                rd.forward(request, response);
            } else {
                int id = Integer.parseInt(sId);
                Blog blog = new BlogDAO().getBlogById(id);
                if (blog == null) {
                    request.setAttribute("notFound", "Not foud blog");
                    RequestDispatcher rd = request.getRequestDispatcher("/ErrorPage.jsp");
                    rd.forward(request, response);
                }
                List<Share> shares = new ShareDAO().getShares();
                request.setAttribute("blog", blog);
                request.setAttribute("shares", shares);
                request.setAttribute("currentPage","0");
                RequestDispatcher rd = request.getRequestDispatcher("/BlogDetail.jsp");
                rd.forward(request, response);

            }
        } catch (Exception e) {
            System.out.println(e);
            request.setAttribute("notFound", "Not foud sushi");
            RequestDispatcher rd = request.getRequestDispatcher("/ErrorPage.jsp");
            rd.forward(request, response);
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
