/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Remuneration;
import entities.Salarie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.RemunerationService;
import services.SalarieService;

/**
 *
 * @author YASSINE
 */
@WebServlet(name = "RemunerationController", urlPatterns = {"/RemunerationController"})
public class RemunerationController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   String op=null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       op = request.getParameter("op");
        RemunerationService rs = new RemunerationService();
        SalarieService  ss= new SalarieService();
        if (op.equals("Envoyer")) {
            String montan = request.getParameter("montant"); 
           double montant=Double.parseDouble(montan);
            Date date = new Date();
            Salarie s=ss.findById(Integer.parseInt(request.getParameter("salarieId")));
            rs.create(new Remuneration(date, montant, s) );
            response.sendRedirect("home.jsp");
        }else if(op.equals("Chercher"))
                {String salleId = request.getParameter("salarieId");
    request.setAttribute("salarieId", salleId); 
    request.getRequestDispatcher("home.jsp").forward(request, response);
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
