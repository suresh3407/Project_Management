<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/header.html" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"></c:set>
    <style>

        #sucessMsg
        {
            animation-name: example;
            animation-duration: 4s;
            opacity: 0;


        }

        @keyframes example {
            0%   {opacity: 0;}
            50%{opacity:1;}

            100% {opacity: 0;}
        }
    </style>

    <div class="col-xs-12 col-sm-8" style="height:200px;width=100%">


    </div>

<%
    String cnf = request.getQueryString();
    if (cnf != null) {
      
%>

<div class="alert alert-success" id="sucessMsg" role="alert">One record with name :${fullName} has been inserted sucessfully</div>
<%
    }
%>


<div class="col-xs-12 col-sm-8" style="border:solid 1px #ccc;padding:10px">
    <form action="${SITE_URL}/register-client" method="POST">

        <div class="form-group">
            <label for="fullName">Full Name:</label>
            <input type="text" class="form-control" name="fullName" id="fullName" placeholder="Your Full Name">
        </div>
        <div class="form-group">
            <label for="email">Email address:</label>
            <input type="email" class="form-control" name="email" id="email" placeholder="Your Email">
        </div>
        <div class="form-group">
            <label for="companyName">Company Name</label>
            <input type="text" class="form-control" name="companyName" id="companyName" placeholder="Your Company Name">
        </div>
        <div class="form-group">
            <label for="desc">Description Text</label>
            <textarea class="form-control"  name="desc" id="desc" placeholder="Description text" rows="3"></textarea>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-success">Add Client</button>
        </div>

    </form>
</div>

<%@include file="../includes/footer.html" %>        
