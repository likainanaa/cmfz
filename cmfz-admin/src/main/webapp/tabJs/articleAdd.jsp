<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/7/8
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文章发布</title>
</head>
<body>
<div id="editor">
    <p>欢迎使用 <b>wangEditor</b> 富文本编辑器</p>
</div>
<button id="btn1">获取html</button>
<!-- 注意， 只需要引用 JS，无需引用任何 CSS ！！！-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/wangEditor.min.js"></script>
<script type="text/javascript">
    var E = window.wangEditor
    var editor = new E('#editor')
    editor.customConfig.uploadImgShowBase64 = true   // 使用 base64 保存图片
     editor.customConfig.uploadImgServer = '/upload'  // 上传图片到服务器

    editor.create();
    <!--读取内容-->
    document.getElementById('btn1').addEventListener('click', function () {
        // 读取 html
        var a=editor.txt.html();
        $.ajax({
            url:"${pageContext.request.contextPath}/article/addArticle",
            data:"introduction="+a,
            type:"POST",
            success:function (n) {
                alert(n);
            }

        })
    }, false)




</script>
</body>
</html>
