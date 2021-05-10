package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BlogDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Blog Detail</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/blogDetail.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"site-wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"content-left\">\n");
      out.write("                        <div class=\"section\">\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <div class=\"content-icon\">\n");
      out.write("                                    <img src=\"images/penIcon.png\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"content-detail\">\n");
      out.write("                                    <div class=\"header\">\n");
      out.write("                                        <div class=\"title\">\n");
      out.write("                                            <a href=\"#\">Essential skills for a happy life!</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"publishedDate\">\n");
      out.write("                                            16-11-2015\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"blog-img\">\n");
      out.write("                                        <img src=\"images/blog.jpg\">\n");
      out.write("                                    </div>\n");
      out.write("                                    Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.\n");
      out.write("\n");
      out.write("                                    At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.\n");
      out.write("\n");
      out.write("                                    Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
