<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="iuh.se.models.NhanVien" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
  <h1>Quản Lý Nhân Viên</h1>
  <a href="home.jsp">Danh sách nhân viên</a> | <a href="add.jsp">Thêm mới nhân viên</a>

  <h2>Danh sách nhân viên</h2>
  <table border="1">
    <thead>
      <tr>
        <th>Mã NV</th>
        <th>Tên NV</th>
        <th>Ngày sinh</th>
        <th>Giới tính</th>
        <th>Địa chỉ</th>
        <th>Số điện thoại</th>
      </tr>
    </thead>
    <tbody>
      <%
        List<NhanVien> dsNhanVien = (List<NhanVien>) request.getAttribute("dsNhanVien");
        if (dsNhanVien != null) {
          for (NhanVien nv : dsNhanVien) {
      %>
      <tr>
        <td><%= nv.getMaNV()%></td>
        <td><%= nv.getTenNV() %></td>
        <td><%= nv.getEmail()%></td>
        <td><%= nv.getDiaChi() %></td>
         <td><%= nv.getDienThoai() %></td>
        <td><%= nv.getMaPB() %></td>
      </tr>
      <%
          }
        } else {
      %>
      <tr>
        <td colspan="6">Không có dữ liệu</td>
      </tr>
      <%
        }
      %>
    </tbody>
  </table>
</body>
</html>