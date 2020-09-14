package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Certificate Generator</title>\n");
      out.write("<meta charset=\"UTF-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-responsive.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/fullcalendar.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/matrix-style.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/matrix-media.css\" />\n");
      out.write("<link href=\"font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.gritter.css\" />\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!--Header-part-->\n");
      out.write("<div id=\"header\">\n");
      out.write("  <h1><a href=\"dashboard.html\">Certificate Generator</a></h1>\n");
      out.write("</div>\n");
      out.write("<!--close-Header-part--> \n");
      out.write("\n");
      out.write("\n");
      out.write("<!--top-Header-menu-->\n");
      out.write("<div id=\"user-nav\" class=\"navbar navbar-inverse\">\n");
      out.write("  <ul class=\"nav\">\n");
      out.write("    <li  class=\"dropdown\" id=\"profile-messages\" ><a title=\"\" href=\"#\" data-toggle=\"dropdown\" data-target=\"#profile-messages\" class=\"dropdown-toggle\"><i class=\"icon icon-user\"></i>  <span class=\"text\">Welcome User</span><b class=\"caret\"></b></a>\n");
      out.write("      <ul class=\"dropdown-menu\">\n");
      out.write("        <li><a href=\"#\"><i class=\"icon-user\"></i> My Profile</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"#\"><i class=\"icon-check\"></i> My Tasks</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a href=\"login.html\"><i class=\"icon-key\"></i> Log Out</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"dropdown\" id=\"menu-messages\"><a href=\"#\" data-toggle=\"dropdown\" data-target=\"#menu-messages\" class=\"dropdown-toggle\"><i class=\"icon icon-envelope\"></i> <span class=\"text\">Messages</span>  <b class=\"caret\"></b></a>\n");
      out.write("      <ul class=\"dropdown-menu\">\n");
      out.write("        <li><a class=\"sAdd\" title=\"\" href=\"#\"><i class=\"icon-plus\"></i> new message</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a class=\"sInbox\" title=\"\" href=\"#\"><i class=\"icon-envelope\"></i> inbox</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a class=\"sOutbox\" title=\"\" href=\"#\"><i class=\"icon-arrow-up\"></i> outbox</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a class=\"sTrash\" title=\"\" href=\"#\"><i class=\"icon-trash\"></i> trash</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"\"><a title=\"\" href=\"#\"><i class=\"icon icon-cog\"></i> <span class=\"text\">Settings</span></a></li>\n");
      out.write("    <li class=\"\"><a title=\"\" href=\"login.html\"><i class=\"icon icon-share-alt\"></i> <span class=\"text\">Logout</span></a></li>\n");
      out.write("  </ul>\n");
      out.write("</div>\n");
      out.write("<!--close-top-Header-menu-->\n");
      out.write("<!--start-top-serch-->\n");
      out.write("<div id=\"search\">\n");
      out.write("  <input type=\"text\" placeholder=\"Search here...\"/>\n");
      out.write("  <button type=\"submit\" class=\"tip-bottom\" title=\"Search\"><i class=\"icon-search icon-white\"></i></button>\n");
      out.write("</div>\n");
      out.write("<!--close-top-serch-->\n");
      out.write("<!--sidebar-menu-->\n");
      out.write("<div id=\"sidebar\"><a href=\"#\" class=\"visible-phone\"><i class=\"icon icon-home\"></i> Dashboard</a>\n");
      out.write("  <ul>\n");
      out.write("    <li class=\"active\"><a href=\"user.jsp\"><i class=\"icon icon-dashboard\"></i> <span>Dashboard</span></a> </li>\n");
      out.write("    <li > <a href=\"add_employee.jsp\"><i class=\"icon icon-building\"></i> <span>Add Employee</span></a> </li>\n");
      out.write("    <li > <a href=\"employee_report.jsp\"><i class=\"icon icon-building\"></i> <span>List Employee</span></a> </li>\n");
      out.write("    <li > <a href=\"add_student.jsp\"><i class=\"icon icon-building\"></i> <span>Add Student</span></a> </li>\n");
      out.write("    <li > <a href=\"student_report.jsp\"><i class=\"icon icon-building\"></i> <span>List Student</span></a> </li>\n");
      out.write("    <li><a href=\"mark_attendence.jsp\"><i class=\"icon-file-alt\"></i> <span>Mark Attendence</span></a></li>\n");
      out.write("    <li><a href=\"certificate_issue.jsp\"><i class=\"icon-book\"></i> <span>Generate Certificate</span></a></li>\n");
      out.write("    <li><a href=\"subscription.jsp\"><i class=\"icon-suitcase\"></i> <span>Subscription</span></a></li>\n");
      out.write("    \n");
      out.write("  </ul>\n");
      out.write("</div>\n");
      out.write("<!--sidebar-menu-->\n");
      out.write("\n");
      out.write("<!--main-container-part-->\n");
      out.write("<div id=\"content\">\n");
      out.write("<!--breadcrumbs-->\n");
      out.write("  <div id=\"content-header\">\n");
      out.write("    <div id=\"breadcrumb\"> <a href=\"index.jsp\" title=\"Go to Home\" class=\"tip-bottom\"><i class=\"icon-home\"></i> Home</a></div>\n");
      out.write("  </div>\n");
      out.write("<!--End-breadcrumbs-->\n");
      out.write("\n");
      out.write("<!--Action boxes-->\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"quick-actions_homepage\">\n");
      out.write("      <ul class=\"quick-actions\">\n");
      out.write("        <li class=\"bg_lb span4\"> <a href=\"user.jsp\"> <i class=\"icon-dashboard\"></i> My Dashboard </a> </li>\n");
      out.write("        <li class=\"bg_lg span4\"> <a href=\"add_employee.jsp\"> <i class=\"icon-building\"></i>Add Employee</a> </li>\n");
      out.write("        <li class=\"bg_lg span4\"> <a href=\"employee_report.jsp\"> <i class=\"icon-building\"></i>List Employee</a> </li>\n");
      out.write("        <li class=\"bg_lg span4\"> <a href=\"add_student.jsp\"> <i class=\"icon-building\"></i>Add Student</a> </li>\n");
      out.write("        <li class=\"bg_lg span4\"> <a href=\"student_report.jsp\"> <i class=\"icon-building\"></i>List Student</a> </li>\n");
      out.write("        <li class=\"bg_ls span4\"> <a href=\"mark_attendence.jsp\"> <i class=\"icon-file-alt\"></i> Mark Attendence</a> </li>\n");
      out.write("        <li class=\"bg_ls span4\"> <a href=\"certificate_issue.jsp\"> <i class=\"icon-book\"></i> Generate Certificate</a> </li>\n");
      out.write("         <li class=\"bg_ls span4\"> <a href=\"subscription.jsp\"> <i class=\"icon-suitcase\"></i> Subscription</a> </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("<!--End-Action boxes-->    \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("<script src=\"js/excanvas.min.js\"></script> \n");
      out.write("<script src=\"js/jquery.min.js\"></script> \n");
      out.write("<script src=\"js/jquery.ui.custom.js\"></script> \n");
      out.write("<script src=\"js/bootstrap.min.js\"></script> \n");
      out.write("<script src=\"js/jquery.flot.min.js\"></script> \n");
      out.write("<script src=\"js/jquery.flot.resize.min.js\"></script> \n");
      out.write("<script src=\"js/jquery.peity.min.js\"></script> \n");
      out.write("<script src=\"js/fullcalendar.min.js\"></script> \n");
      out.write("<script src=\"js/matrix.js\"></script> \n");
      out.write("<script src=\"js/matrix.dashboard.js\"></script> \n");
      out.write("<script src=\"js/jquery.gritter.min.js\"></script> \n");
      out.write("<script src=\"js/matrix.interface.js\"></script> \n");
      out.write("<script src=\"js/matrix.chat.js\"></script> \n");
      out.write("<script src=\"js/jquery.validate.js\"></script> \n");
      out.write("<script src=\"js/matrix.form_validation.js\"></script> \n");
      out.write("<script src=\"js/jquery.wizard.js\"></script> \n");
      out.write("<script src=\"js/jquery.uniform.js\"></script> \n");
      out.write("<script src=\"js/select2.min.js\"></script> \n");
      out.write("<script src=\"js/matrix.popover.js\"></script> \n");
      out.write("<script src=\"js/jquery.dataTables.min.js\"></script> \n");
      out.write("<script src=\"js/matrix.tables.js\"></script> \n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("  // This function is called from the pop-up menus to transfer to\n");
      out.write("  // a different page. Ignore if the value returned is a null string:\n");
      out.write("  function goPage (newURL) {\n");
      out.write("\n");
      out.write("      // if url is empty, skip the menu dividers and reset the menu selection to default\n");
      out.write("      if (newURL != \"\") {\n");
      out.write("      \n");
      out.write("          // if url is \"-\", it is this page -- reset the menu:\n");
      out.write("          if (newURL == \"-\" ) {\n");
      out.write("              resetMenu();            \n");
      out.write("          } \n");
      out.write("          // else, send page to designated URL            \n");
      out.write("          else {  \n");
      out.write("            document.location.href = newURL;\n");
      out.write("          }\n");
      out.write("      }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("// resets the menu selection upon entry to this page:\n");
      out.write("function resetMenu() {\n");
      out.write("   document.gomenu.selector.selectedIndex = 2;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
