<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/7/5
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    $(function(){
      /*  $('#btn').bind('click', function(){
            $("#fm").form("submit",{
                url:"${pageContext.request.contextPath}/carousel/upPic",
                onSubmit: function(){
                },
                success:function(data){
                    alert(data)
                }

            })
        });*/
    });





</script>
<form id="fm" enctype="multipart/form-data" method="post">
    <div>
        <label>内容描述：</label>
        <input class="easyui-validatebox" type="text" name="description">
    </div>
    <div>
        <label >选择图片:</label>
        <input class="easyui-validatebox" type="file" name="myPic" >
    </div>

</form>
