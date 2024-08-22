
package com.mycompany.artistrycart.servlets;

import com.mycompany.artistrycart.entities.cart;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author adity
 */
public class QuantityIncDecServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String action=request.getParameter("action");            
            int id=Integer.parseInt(request.getParameter("id"));
            
            ArrayList<cart> cart_list=(ArrayList<cart>)request.getSession().getAttribute("cart-list");
            
            
            if(action != null && id>=1)
            {
                if(action.trim().equals("inc"))
                {
                    for(cart c:cart_list)
                    {
                        if(c.getpId()==id)
                        {
                            int quantity=c.getQuantity();
                            quantity++;
                            c.setQuantity(quantity);
                            
                              response.sendRedirect("cartt.jsp");
                           
                        }
                       
                    }
                }
                
                if(action.trim().equals("dec"))
                {
                    for(cart c:cart_list)
                    {
                        if(c.getpId()==id && c.getQuantity() >1)
                        {
                            int quantity=c.getQuantity();
                            quantity--;
                            c.setQuantity(quantity);
                            break;
                             
                           
                        }
                       
                    }
                     response.sendRedirect("cartt.jsp");
                }
            }else{
            
            response.sendRedirect("cartt.jsp");
            }
            
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