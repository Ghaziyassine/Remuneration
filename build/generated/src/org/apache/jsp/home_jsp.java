package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import services.RemunerationService;
import entities.Remuneration;
import entities.Salarie;
import services.SalarieService;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <title>Ajouter une rémunération</title>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("            <link href=\"newcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        </head>\n");
      out.write("        <script>\n");
      out.write("            afficher(){\n");
      out.write("                Swal.fire('SweetAlert2 is working!')\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <form method=\"\" action=\"RemunerationController\">\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend class=\"tiitre\">Ajouter une rémunération</legend>\n");
      out.write("                        <table border=\"0\">\n");
      out.write("                            <tr>    \n");
      out.write("                                <td class=\"tiitre2\">Salarié :</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <select id=\"salarieId\" name=\"salarieId\">\n");
      out.write("                                        ");

                                            RemunerationService rs = new RemunerationService();
                                            SalarieService ss = new SalarieService();
                                            for (Salarie s1 : ss.findAll()) {
                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(s1.getId());
      out.write('"');
      out.write('>');
      out.print(s1.getNom());
      out.write("</option>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </td>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"tiitre2\">Date de rémunération :</td>\n");
      out.write("                                <td><input id=\"date\" type=\"date\" name=\"date\" value=\"\" required=\"\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"tiitre2\">Montant :</td>\n");
      out.write("                                <td><input id=\"montant\" type=\"text\" name=\"montant\" value=\"\"  required=\"\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input name=\"op\" type=\"submit\" value=\"Envoyer\"  />\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </fieldset>\n");
      out.write("                </form>\n");
      out.write("                <form method=\"\" action=\"RemunerationController\">\n");
      out.write("                   <fieldset>\n");
      out.write("                    <table>\n");
      out.write("                        <legend class=\"tiitre\">Recherche des rémunérations par salariés</legend>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"tiitre2\">\n");
      out.write("                                Immatriculation du salarié:\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("\n");
      out.write("                                <input id=\"salarieId\" type=\"text\" name=\"salarieId\" value=\"\"  required=\"\"/> \n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td></td>   \n");
      out.write("                                                        <td>\n");
      out.write("\n");
      out.write("                                <input name=\"op\" type=\"submit\" value=\"Chercher\"  />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                   </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>Rémunerations</legend>\n");
      out.write("\n");
      out.write("                        <table border=\"1\" class=\"tab\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("\n");
      out.write("                                    <th>Nom <br>\n");
      out.write("                                    <th>Télé</th>\n");
      out.write("                                    <th>service</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    try {
                                        int id = -1;
                                        if (request.getParameter("salarieId") != null) {
                                            id = Integer.parseInt(request.getParameter("salarieId"));
                                            Salarie s = ss.findById(id);

                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(s.getNom());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(s.getTele());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(s.getService());
      out.write("</td>                           \n");
      out.write("                                </tr>\n");
      out.write("                                ");
}
                                } catch (Exception e) {
                                    System.out.println("yassss=inenedeyyrgfrgfrùufg=rf=grf=rf==:=======");
                                
      out.write("\n");
      out.write("                                <!-- Display an error message or take other actions here -->\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"3\">Salarie with ID  not found</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>information sur salarié:</legend>\n");
      out.write("\n");
      out.write("                        <table border=\"1\" class=\"tab\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("\n");
      out.write("                                    <th>code rémunération <br>\n");
      out.write("                                    <th>date de rémunération</th>\n");
      out.write("                                    <th>montant</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");
try {
                                        int id2 = -1;
                                        if (request.getParameter("salarieId") != null) {
                                            id2 = Integer.parseInt(request.getParameter("salarieId"));
                                            for (Remuneration r : rs.findBySalarie(ss.findById(id2).getId())) {
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(r.getId());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(r.getDate());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(r.getMontant());
      out.write("</td>                           \n");
      out.write("                                </tr>\n");
      out.write("                                ");
}
                                    }
                                } catch (Exception e) {
                                    System.out.println("yassss=inenedeyyrgfrgfrùufg=rf=grf=rf==:=======");
                                
      out.write("\n");
      out.write("                                <!-- Display an error message or take other actions here -->\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"3\">Salarie with ID  not found</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </fieldset>   \n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </html>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
