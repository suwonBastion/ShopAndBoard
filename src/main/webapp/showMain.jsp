<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>

.container{
  width: 800px; height: 900px;
  background-color: antiquewhite;
}
header{
  width: 100%;
  background-color: aqua;
  height: 100px;
}
nav{
  width: 100%;
  height: 150px;
  background-color:#1b2035;
}
    ul{display:inline-block}
    ul li{float:left;
      padding: 10px;
      width: 200px;
      line-height:5.0;
    font-weight: 600}

  a{text-decoration:none;color:#fff;font-size:15px; } 



#main{
  width: 100%;
  height: 400px;
  background-color: azure;
}
    .img_box{
      width: 230px; height: 250px;
      float: left;
      background-color: blue;
      margin: 55px 25px 20px 10px;
      
    }
#list{
  width: 100%;
  height: 250px;
  background-color: yellow;
}

  </style>
</head>
<body>
  <div class="container">

<header>
헤더
</header>
<nav >
  네비
  <ul>
    <li><a href="#">상품목록</a></li>
    <li><a href="#">장바구니</a></li>
    <li><a href="#">상품등록</a></li>

  </ul>
</nav>
<article id="main">


<div class="img_box"></div>
<div class="img_box"></div>
<div class="img_box"></div>



</article>
<article id="list">

리스트

</article>

  </div>
</body>
</html>
