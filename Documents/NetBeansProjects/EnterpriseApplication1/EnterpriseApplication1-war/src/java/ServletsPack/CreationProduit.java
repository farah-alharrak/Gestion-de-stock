/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ServletsPack;
import projet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
@WebServlet(name = "CreationProduit", urlPatterns = {"/CreationProduit"})
public class CreationProduit extends HttpServlet {

    @EJB
    private MarqueFacadeLocal marqueFacade;

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
            out.println("<title>Servlet CreationProduit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CreationProduit at " + request.getContextPath() + "</h1>");
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

       response.setContentType("text/html;charset=UTF-8");
       try{
            /* TODO output your page here. You may use following sample code. */
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
           
            
            // *******  la balise style  ******* //
            
            out.println("<link rel=\"stylesheet\" href=\"https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css\">");
            out.println("<title>Servlet Creation de Produits</title>");            
            out.println("</head>");
            out.println("<body>");
//            out.println("<input type=\"checkbox\" id=\"nav-toggle\">");
            out.println("<div class=\"sideBar\">");
            out.println("<div class=\"sideBar_Brand\">");
            out.println("<h2><span class=\"las la-home\"></span><span> ShopiFayy </span></h2>");
            out.println("</div>");
            out.println("<div class=\"sideBar_Menu\">");
            out.println("<ul>");
            out.println("<li>");
            out.println("<a href=\"index.html\" ><span class=\"las la-box\"></span>");
            out.println("<span>Les Marques</span></a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a href=\"Produits.html\" class=\"active\"><span class=\"lab la-product-hunt\"></span>");
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

            
            out.println("</header>");
            out.println("<main>");
            out.println("<form  action = \"http://localhost:8080/EntrepriseApplication1-war/CreationProduit\" method = \"POST\"> ");
            out.println("<label for=\"RefProduit\"> Référence du produit:</label> <br>");
            out.println("<input type=\"text\" name=\"RefProduit\" required><br><br>");
            out.println("<label for=\"Marque\"> La marque du produit</label>");
            List<Marque> ListMarque = marqueFacade.findAll();
            out.println("<select name=\"Marque\">");
            for (int i = 0; i < ListMarque.size(); i++){
            out.println("<option value="+ListMarque.get(i).getMarqueReference()+">");
            out.println(ListMarque.get(i).getMarqueReference());
            out.println("</option>");            
            }
            out.println("</select>");
            out.println("<br><br>");
            out.println("<label for=\"Denomination\"> Dénomination </label> <br>");
            out.println("<input type=\"\" name=\"Denomination\" required><br><br>");
            out.println("<label for=\"Prix\"> Prix </label> <br>");
            out.println("<input type=\"text\" name=\"Prix\" required><br><br>");
            out.println("<label for=\"Poids\"> Poids </label> <br>");
            out.println("<input type=\"text\" name=\"Poids\" required><br><br>");
            out.println("<label for=\"Volume\">Volume:</label> <br>");
            out.println("<input type=\"text\" name=\"Volume\" required><br><br>");
            out.println("<input type=\"submit\" value=\"Add\">");
            out.println("</form>");        
            out.println("</body>");
            out.println("</html>");
            }
            catch(Exception e){
            System.out.println("Probleme dans la servlet de creation de produits");}
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
        try{
        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<link rel=\"stylesheet\" href=\"https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css\">");
            out.println("<title>Servlet Creation de produits/title>");            
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
            out.println("<input type=\"search\" placeholder=\"Search here\">");
            out.println("</div>");
            out.println("</header>");
            out.println("<main>");
            
            Boolean ret=produitFacade.CreationProduit(request.getParameter("RefProduit"), request.getParameter("Marque"), request.getParameter("Denomination"), Double.parseDouble(request.getParameter("Prix")), Double.parseDouble(request.getParameter("Poids")), Double.parseDouble(request.getParameter("Volume")));
            if(ret==true)
            {
                out.println("Product added successfully <br/>");
                
            }
            else
            {
                out.println("Le nom du produit existe deja. Impossible de creer le produit <br/>");
            }
            out.println("<form  action = \"http://localhost:8080/EntrepriseApplication1-war/CreationProduit \" method = \"GET\"> ");
            
            out.println("<input type=\"submit\" value =\"Retour\" />");
            out.println("</form>");        
            out.println("</body>");
            out.println("</html>");
       
        }catch(Exception e){ System.out.println("un probleme avec le doPost de la servelet creation produits");}

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
