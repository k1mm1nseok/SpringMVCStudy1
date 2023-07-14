<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%
       String username = req.getParameter("username");
       int age = Integer.parseInt(req.getParameter("age"));

       Member member = new Member(username, age);
       memberRepository.save(member);
%>
<html>
<head>
 <title>Title</title>
</head>
<body>
성공
<ul>
 <li>id=<%=member.getId()%></li>
 <li>username=<%=member.getUsername()%></li>
 <li>age=<%=member.getAge()%></li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>