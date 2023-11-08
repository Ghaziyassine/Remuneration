<%-- 
    Document   : home
    Created on : 1 nov. 2023, 21:07:26
    Author     : YASSINE
--%>

<%@page import="services.RemunerationService"%>
<%@page import="entities.Remuneration"%>
<%@page import="entities.Salarie"%>
<%@page import="services.SalarieService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!DOCTYPE html>
    <html>
        <head>
            <title>Ajouter une rémunération</title>
            <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
            <link href="newcss.css" rel="stylesheet" type="text/css"/>
        </head>
        <script>
            afficher(){
                Swal.fire('SweetAlert2 is working!')
            }
        </script>
        <body>

            <div class="content">
                <form method="" action="RemunerationController">
                    <fieldset>
                        <legend class="tiitre">Ajouter une rémunération</legend>
                        <table border="0">
                            <tr>    
                                <td class="tiitre2">Salarié :</td>
                                <td>
                                    <select id="salarieId" name="salarieId">
                                        <%
                                            RemunerationService rs = new RemunerationService();
                                            SalarieService ss = new SalarieService();
                                            for (Salarie s1 : ss.findAll()) {
                                        %>
                                        <option value="<%=s1.getId()%>"><%=s1.toString() %></option>
                                        <%}%>
                                    </select>
                                </td>
                        </tr>

                            <tr>
                                <td class="tiitre2">Montant :</td>
                                <td><input id="montant" type="text" name="montant" value=""  required=""/></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <input name="op" type="submit" value="Envoyer"  />
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </form>
                <form method="" action="RemunerationController">
                   <fieldset>
                    <table>
                        <legend class="tiitre">Recherche des rémunérations par salariés</legend>
                        <tr>
                            <td class="tiitre2">
                                Immatriculation du salarié:
                            </td>
                        </tr>

                        <tr>
                            <td>

                                <input id="salarieId" type="text" name="salarieId" value=""  required=""/> 
                            </td>

                            <td></td>   
                                                        <td>

                                <input name="op" type="submit" value="Chercher"  />
                            </td>
                        </tr>
                    </table>

                   </fieldset>



                    <fieldset>
                        <legend>information sur salarié:</legend>

                        <table border="1" class="tab">
                            <thead>
                                <tr>

                                    <th>Nom <br>
                                    <th>Télé</th>
                                    <th>service</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    try {
                                        int id = -1;
                                        if (request.getParameter("salarieId") != null) {
                                            id = Integer.parseInt(request.getParameter("salarieId"));
                                            Salarie s = ss.findById(id);

                                %>
                                <tr>
                                    <td><%=s.getNom()%></td>
                                    <td><%=s.getTele()%></td>
                                    <td><%=s.getService()%></td>                           
                                </tr>
                                <%}
                                } catch (Exception e) {
                                    System.out.println("yassss=inenedeyyrgfrgfrùufg=rf=grf=rf==:=======");
                                %>
                                <!-- Display an error message or take other actions here -->
                                <tr>
                                    <td colspan="3">Salarie with ID  not found</td>
                                </tr>
                                <%
                                    }
                                %>
                            </tbody>
                        </table>
                    </fieldset>



                    <fieldset>
                        <legend>Rémunerations</legend>

                        <table border="1" class="tab">
                            <thead>
                                <tr>

                                    <th>code rémunération <br>
                                    <th>date de rémunération</th>
                                    <th>montant</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%try {
                                        int id2 = -1;
                                        if (request.getParameter("salarieId") != null) {
                                            id2 = Integer.parseInt(request.getParameter("salarieId"));
                                            for (Remuneration r : rs.findBySalarie(ss.findById(id2).getId())) {
                                %>
                                <tr>
                                    <td><%=r.getId()%></td>
                                    <td><%=r.getDate()%></td>
                                    <td><%=r.getMontant()%></td>                           
                                </tr>
                                <%}
                                    }
                                } catch (Exception e) {
                                    System.out.println("yassss=inenedeyyrgfrgfrùufg=rf=grf=rf==:=======");
                                %>
                                <!-- Display an error message or take other actions here -->
                                <tr>
                                    <td colspan="3">Salarie with ID  not found</td>
                                </tr>
                                <%
                                    }
                                %>
                            </tbody>
                        </table>
                    </fieldset>   

                </form>


    </html>

</html>
