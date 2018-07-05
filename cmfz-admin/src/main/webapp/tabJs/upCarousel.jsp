<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/7/5
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    $("#fm").form({

        onSubmit: function(){

    },
    success:function(data){
        alert(data)
    }

    })

</script>
<form id="fm">
    <div>
        <label for="name">Name:</label>
        <input class="easyui-validatebox" type="text" name="name" data-options="required:true" />
    </div>
    <div>
        <label for="email">Email:</label>
        <input class="easyui-validatebox" type="text" name="email" data-options="validType:'email'" />
    </div>
</form>
