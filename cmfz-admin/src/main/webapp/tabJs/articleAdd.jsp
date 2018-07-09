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
<div>
    <label>文章标题</label>
    <input id="articleName" class="easyui-validatebox">
</div>
<div>
    <label>文章作者</label>
    <input id="guruId" class="easyui-combobox" name="">
</div>
<div>
    <label>文章状态</label>
    <input id="sta" class="easyui-combobox" name="status" style="width: 50px">
</div>
<div id="editor">
    <p>欢迎使用 <b>wangEditor</b> 请开始你的表演</p>
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
        var masterId=$("#guruId").combobox("getValue");
        var status=$("#sta").combobox("getValue");
        var articleName=$("#articleName").val();
        console.log(a+masterId+status+articleName)
        $.ajax({
            url:"${pageContext.request.contextPath}/article/addArticle",
            data:{"introduction":a,"guruId":masterId,"status":status,"articleName":articleName},
            type:"POST",
            success:function (n) {
                alert(n);
            }
        })
    }, false)

    $(function () {
        $("#guruId").combobox({
            queryParams:{page:-1,rows:-1},
            url:"${pageContext.request.contextPath}/master/showMaster",
            valueField:"masterId",
            textField:"masterName"
        })
        $("#sta").combobox({
            valueField:"id",
            textField:"status",
            data:[{
                id:"0",
                status:"下架"
            },{
                id :"1",
                status:"上架"
                }]
        })
    })

</script>
</body>
</html>
