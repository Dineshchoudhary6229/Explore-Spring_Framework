<%@ page contentType="text/html;charset=ISO-8859-1" language="java"
 pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Welcome to login Form</title>
  </head>
  <body>
    <h1 class="text-center mt-5 col-md-5">Login Form </h1>


<%--If want to show commonData at this page then uncomment these or we have to provide those here
    <h2 class="text-center">${Header}</h2>
    <p class="text-center">${Desc}</p>
--%>


    <div class="container mt-5">

    <form action="processLogin" method="post">

      <div class="form-group col-md-6">
        <label for="userName">User Name</label>
        <input type="text"
        class="form-control"
        id="userName"
        aria-describedby="userNameHelp"
        placeholder="Enter Name here"
        name="userName">
      </div>

      <div class="form-group col-md-6">
              <label for="exampleInputEmail1">Email address</label>
              <input type="email"
              class="form-control"
              id="exampleInputEmail1"
              aria-describedby="emailHelp"
              placeholder="Enter email here"
              name="email">
            </div>


      <div class="form-group col-md-6">
        <label for="userPassword">User Password</label>
        <input type="password"
        class="form-control"
        id="userPassword"
        placeholder="Enter Password here"
        name= "password">
      </div>


         <div class="container text-center">
      <button type="submit" class="btn btn-success col-md-5 ">Sign up</button>
      </div>
    </form>
