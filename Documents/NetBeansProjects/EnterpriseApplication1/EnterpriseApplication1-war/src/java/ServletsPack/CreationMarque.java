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
import projet.MarqueFacade;
import projet.MarqueFacadeLocal;

/**
 *
 * @author hp
 */
@WebServlet(name = "CreationMarque", urlPatterns = {"/CreationMarque"})
public class CreationMarque extends HttpServlet {
    @EJB
    private MarqueFacade m;
    

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
            out.println("<title>Servlet CreationMarque</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CreationMarque at " + request.getContextPath() + "</h1>");
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
            out.println("<h2><span class=\"las la-home\"></span><span> ShopiFayy </span></h2>");
            out.println("</div>");
            out.println("<div class=\"sideBar_Menu\">");
            out.println("<ul>");
            out.println("<li>");
            out.println("<a href=\"index.html\" class=\"active\"><span class=\"las la-box\"></span>");
            out.println("<span>Les Marques</span></a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a href=\"Produits.html\" ><span class=\"lab la-product-hunt\"></span>");
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
            out.println("</label>Les Marques</h2>");

            out.println("<div class=\"search-wrapper\">");
            out.println("<span class=\"las la-search\"></span>");
            out.println("</div>");
            out.println("</header>");
            out.println("<main>");
            out.println("<form  action = \"http://localhost:8080/EntrepriseApplication1-war/CreationMarque\" method = \"POST\"> ");
            out.println("Nom de la marque:");
            out.println("<input type=\"text\" name=\"NameM\" value =\"\" />");
            out.println("<br/>");            
            out.println("Pays d’origine:");
            out.println("<input type=\"text\" name=\"OrigineM\" value =\"\" />");
            out.println("<input type=\"submit\" value =\"Creer Marque\" />");
            out.println("</form>");        
            out.println("</body>");
            out.println("</html>");
        
        }catch(Exception e){System.out.println("probleme dans la servlet de creation de marque");}
    
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
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
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
            out.println("<h2><span class=\"las la-home\"></span><span> ShopiFayy </span></h2>");
            out.println("</div>");
            out.println("<div class=\"sideBar_Menu\">");
            out.println("<ul>");
            out.println("<li>");
            out.println("<a href=\"index.html\" class=\"active\"><span class=\"las la-box\"></span>");
            out.println("<span>Les Marques</span></a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a href=\"Produits.html\" ><span class=\"lab la-product-hunt\"></span>");
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
            out.println("</label>Les Marques</h2>");

            out.println("<div class=\"search-wrapper\">");
            out.println("<span class=\"las la-search\"></span>");
            out.println("</div>");
            out.println("</header>");
            out.println("<main>");
            String a = request.getParameter("NameM");
            String b = request.getParameter("OrigineM");
           
            // tu enleves les commentaires
            
//            Boolean ret=m.create( );
//            if(ret==true)
//            {
//                out.println("Marque creee avec succes <br/>");
//            }
//            else
//            {
//                out.println("Le nom de la marque est deja assigne. Impossible de recreer une marque avec le meme nom<br/>");
//            }
            out.println("<form  action = \"http://localhost:8080/EntrepriseApplication1-war/CreationMarque\" method = \"GET\"> ");
            out.println("<input type=\"submit\" value=\"Retour\">");
            out.println("</form>");        
            out.println("</body>");
            out.println("</html>");
        
        }catch(Exception e){System.out.println("probleme dans la sevlet creation marque ");}
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
