/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ServletsPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import projet.Marque;
import projet.MarqueFacade;
import projet.Produit;

/**
 *
 * @author hp
 */
@WebServlet(name = "ListingMarques", urlPatterns = {"/ListingMarques"})
public class ListingMarques extends HttpServlet {
@EJB
private MarqueFacade m ;

    
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
            out.println("<title>Servlet ListingMarques</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListingMarques at " + request.getContextPath() + "</h1>");
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
try{
    PrintWriter out = response.getWriter();
 out.println("<link rel=\"stylesheet\" href=\"https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css\">");
            out.println("<title>Servlet de listing by marque</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<input type=\"checkbox\" id=\"nav-toggle\">");
            out.println("<div class=\"sideBar\">");
            out.println("<div class=\"sideBar_Brand\">");
            out.println("<h2><span class=\"las la-home\"></span><span> ShopiFayy</span></h2>");
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
            out.println("</div>");
            out.println("</header>");
            out.println("<main>");
            List<Marque> ListMarques = m.findAll();
            out.println("<h2>La liste des produits </h2>");
            out.println("<h2>Les marques déjà existant</h2>");
             
            out.println("<table>"); 
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>");
            out.println("La marque");
            out.println("</th>");
            out.println("<th>");
            out.println("Origine de fabrication");
            out.println("</th>");
            out.println("<th>");
            out.println("Action");   
            out.println("</th>");
            out.println("</tr>");
            out.println("<thead>");
            for (int i = 0; i < ListMarques.size(); i++){
            out.println("<tr>");
            out.println("<td>");
            // tu enleve le commentaire
            //out.println(ListMarques.get(i).getNomMarque());
            out.println("</td>");
            out.println("<td>");
             out.println(ListMarques.get(i).getOrigine());
            out.println("</td>");
            out.println("<td><a href=\"#\">Modifier </a> | <a href=\"#\">Supprimer </a></td>");
            out.println("</tr>");
             }
            out.println("</tbody>");               
            out.println("</table>"); 
            
            
            out.println("</form>");        
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e){
        System.out.println("Probleme dans la servlet creation");}
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
