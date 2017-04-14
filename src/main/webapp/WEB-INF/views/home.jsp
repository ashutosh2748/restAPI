<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>REST API</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"/>
    <script src="https://code.angularjs.org/snapshot/angular.min.js"></script>
    <script src="<c:url value="/resources/js/app.js" />"></script>
    <script src="<c:url value="/resources/js/service.js" />"></script>
</head>
<body>
<div class="container-wrapper" ng-app="restAPI" ng-controller="RestAPIController">
    <div class="container">
        <div class="page-header">
            <h1>Add Company Information</h1>
            <p class="lead">Please fill the following form</p>
        </div>

        <form class="form-horizontal">
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">Name</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="name" placeholder="Name">
                </div>
            </div>

            <div class="form-group">
                <label for="website" class="col-sm-2 control-label">Web Site</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="website" placeholder="Website">
                </div>
            </div>

            <div class="form-group">
                <label for="location" class="col-sm-2 control-label">Location</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="location" placeholder="Location">
                </div>
            </div>

            <div class="form-group">
                <label for="description" class="col-sm-2 control-label">Description</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="description" placeholder="Description">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form>

    </div>
</div>
</body>
</html>
