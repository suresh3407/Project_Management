
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/header.html" %>   
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"></c:set>
<form id="projectForm">

    <div class="form-group">
        <label for="clientName">Client Name: </label>
        <input type="text"  name="clientName" class="form-control" id="clientName" placeholder="Client Name">
    </div>
    <div class="form-group">
        <label for="startDate">Start Date: </label>
        <input type="text"  name="startDate" class="form-control" id="startDate" placeholder="startDate">
    </div>
    <div class="form-group">
        <label for="endDate">End Name: </label>
        <input type="text"  name="endDate" class="form-control" id="endDate" placeholder="End Date">
    </div>
    <button class="btn btn-success" type="submit">insert</button>

</form>

<script>
    
    $(document).ready(function(){
        
        $("#startDate").datepicker({
            dateFormat:"yy-mm-dd",
            changeYear: true,
            changeMonth: true,
            minDate:new Date("2012,1,1"),
            maxDate:new Date("2018,1,1")
            
        });
        $("#endDate").datepicker({
            dateFormat:"yy-mm-dd",
            changeYear: true,
            changeMonth: true,
            minDate:new Date("2012,1,1"),
            maxDate:new Date("2018,1,1")
            
        });
        $("form").on("submit",function(form){
            
            form.preventDefault();
            
            $.ajax({
            method:"POST",
            url:"${SITE_URL}/projectRegistration",            
            data:$("#projectForm").serialize(),
        }).done(function(serverData){
            alert(serverData);
        });
            
        });
        
    });
    
 </script>
<%@include file="../includes/footer.html" %>   

