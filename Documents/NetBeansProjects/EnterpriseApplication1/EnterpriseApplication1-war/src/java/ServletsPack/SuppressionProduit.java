/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ServletsPack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import projet.ProduitFacadeLocal;

/**
 *
 * @author hp
 */
@WebServlet(name = "SuppressionProduit", urlPatterns = {"/SuppressionProduit"})
public class SuppressionProduit extends HttpServlet {
    
    @EJB
    private ProduitFacadeLocal produitFacade;
    

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SuppressionProduit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SuppressionProduit at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html");
        try{PrintWriter out = response.getWriter();
         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
             out.println("<link rel=\"stylesheet\" href=\"https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css\">");
            out.println("<title>Servlet CreationMarque</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<input type=\"checkbox\" id=\"nav-toggle\">");
            out.println("<div class=\"sideBar\">");
            out.println("<div class=\"sideBar_Brand\">");
            out.println("<h2><span class=\"las la-home\"></span><span> ShopeFayy</span></h2>");
            out.println("</div>");
            out.println("<div class=\"sideBar_Menu\">");
            out.println("<ul>");
            out.println("<li>");
            out.println("<a href=\"index.html\" ><span class=\"las la-box\"></span>");
            out.println("<span>Les Marques</span></a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a href=\"Produits.html\" class=\"active\" ><span class=\"lab la-product-hunt\"></span>");
            out.println("<span>Les Produits</span></a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a href=\"Store.html\"><span class=\"las la-store-alt\"></span>");
            out.println("<span>Gestion du stock</span></a>");
            out.println("</li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");

            out.println("<div class=\"main_Content\">");
            out.println("<header>");
            out.println("<h2>");
            out.println("<label for=\"nav-toggle\">");
            out.println("<span class=\"las la-bars\"></span>");
            out.println("</label>Les Produits</h2>");

            out.println("<div class=\"search-wrapper\">");
            out.println("<span class=\"las la-search\"></span>");
            out.println("<input type=\"search\" placeholder=\"Search here\">");
            out.println("</div>");
            out.println("</header>");
            out.println("<main>");
            out.println("<form  action = \"http://localhost:8080/GestionStockApplication-war/SuppressionProduit\" method = \"POST\"> ");
            out.println("La référence du produit que vous voulez supprimer: ");
            out.println("<br/>");            
            out.println("<input type=\"text\" name=\"RefProduit\" value =\"\" />");
            out.println("<br/>");            
            out.println("<input type=\"submit\" value =\"Supprimer\" />");
            out.println("</form>");        
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e){
        System.out.println("Probleme dans la servlet de suppression");}
            
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
        response.setContentType("text/html");
        try{
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<link rel=\"stylesheet\" href=\"https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css\">");
            out.println("<title>Servlet CreationMarque</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<input type=\"checkbox\" id=\"nav-toggle\">");
            out.println("<div class=\"sideBar\">");
            out.println("<div class=\"sideBar_Brand\">");
            out.println("<h2><span class=\"las la-home\"></span><span> ShopeFayy</span></h2>");
            out.println("</div>");
            out.println("<div class=\"sideBar_Menu\">");
            out.println("<ul>");
            out.println("<li>");
            out.println("<a href=\"index.html\" ><span class=\"las la-box\"></span>");
            out.println("<span>Les Marques</span></a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a href=\"Produits.html\" class=\"active\" ><span class=\"lab la-product-hunt\"></span>");
            out.println("<span>Les Produits</span></a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a href=\"Store.html\"><span class=\"las la-store-alt\"></span>");
            out.println("<span>Gestion du stock</span></a>");
            out.println("</li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");

            out.println("<div class=\"main_Content\">");
            out.println("<header>");
            out.println("<h2>");
            out.println("<label for=\"nav-toggle\">");
            out.println("<span class=\"las la-bars\"></span>");
            out.println("</label>Les Produits</h2>");

            out.println("<div class=\"search-wrapper\">");
            out.println("<span class=\"las la-search\"></span>");
            out.println("<input type=\"search\" placeholder=\"Search here\">");
            out.println("</div>");
            out.println("</header>");
            out.println("<main>");
            Boolean ret=produitFacade.SuppressionProduit(request.getParameter("RefProduit"));
            if(ret==true)
            {
                out.println("Produit supprime avec succes <br/>");
            }
            else
            {
                out.println("Ce produit n'existe pas. Impossible de supprimer le produit <br/>");
            }
            out.println("<form  action = \"http://localhost:8080/GestionStockApplication-war/SuppressionProduit\" method = \"GET\"> ");
            
            out.println("<input type=\"submit\" value =\"Retour\" />");
            out.println("</form>");        
            out.println("</body>");
            out.println("</html>");
            
        
        }catch(Exception e){System.out.println("Probleme dans la servlet de suppression");}
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
