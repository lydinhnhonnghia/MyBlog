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
public class OverviewController extends HttpServlet {

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
        try {
            List<Share> shares = new ShareDAO().getShares();
            BlogDAO blogDAO = new BlogDAO();
            int pages = blogDAO.getTotalPages();
            int page;
            //set page
            String sPage = request.getParameter("page");
            String pattern = "\\d{1,}";
            if (sPage == null || !sPage.matches(pattern)) {
                page = 1;
            } else {
                page = Integer.parseInt(sPage);
                if (page > pages) {
                    page = 1;
                }
            }
            List<Blog> Blogs = blogDAO.getBlogByPage(page);
            request.setAttribute("shares", shares);
            request.setAttribute("pages", pages);
            request.setAttribute("page", page);
            request.setAttribute("blogs", Blogs);
            request.setAttribute("currentPage","0");
            RequestDispatcher rd = request.getRequestDispatcher("/Overview.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            System.out.println(e);
            request.setAttribute("error", "Error page!");
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
