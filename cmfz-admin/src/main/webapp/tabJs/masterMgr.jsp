<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/7/5
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>


<script type="text/javascript">
    var findMess = function(){
        $("#table2").datagrid('load', {
            "name" : $("#name").val()
        });

    }

    $('#table2').datagrid({
        toolbar: [{
            text:"批量导入",
            iconCls: 'icon-edit',
            handler: function(){
                $("#dialog2").dialog({
                    title: 'Excel文件选择',
                    width: 400,
                    height: 200,
                    closed: false,
                    cache: false,
                    href: '${pageContext.request.contextPath}/tabJs/upMaster.jsp',
                    modal: true,
                    buttons:[{
                        text:'导入',
                        handler:function(){
                            $("#fm2").form("submit",{
                                url:"${pageContext.request.contextPath}/master/addMasters",
                                onSubmit: function(){
                                },
                                success:function(data){
                                    if(data>0){
                                        alert("导入成功！data"+data)
                                        $('#table2').datagrid('reload');
                                    }
                                    else{
                                        alert("导入失败");
                                    }
                                }
                            })
                        }
                    },{
                        text:'关闭',
                        handler:function(){
                            $("#dialug2").dialog({
                                onClose:function () {
                                }
                            })
                        }
                    }]
                })
            }
        },'-',{
            text:"帮助",
            iconCls: 'icon-help',
            handler: function(){alert('帮助按钮')}
        }, '-',{
            text: ' 上师名：<input type="text" id="name"/>'
        }, '-',{
        iconCls: 'icon-search',
            text: '查询',
            handler: function () {
            findMess();
        }
    }],
        title:"上师管理",
        remoteSort:false,
        singleSelect:true,
        nowrap:false,
        fitColumns:true,
        pagination:true,
        pageList:[2,4,6],
        pageSize:2,
        url:"${pageContext.request.contextPath}/master/showMaster",
        columns:[[
            {field:'masterId',title:'编号',width:50},
            {field:'masterName',title:'上师法号',width:50,sortable:true},
            {field:'masterSummary',title:'上师描述',width:50,sortable:true},

        ]],
        view: detailview,
        detailFormatter: function(rowIndex, rowData){
            var a='/carouselImg/'+rowData.masterPic;
            return '<table><tr>' +
                '<td rowspan=2 style="border:0"><img src='+a+' style="height:100px;"></td>' +
                '<td style="border:0">' +
                '<p>法号: ' + rowData.masterName+ '</p>' +
                '<p>简介: ' + rowData.masterSummary + '</p>' +
                '</td>' +
                '</tr></table>';
        }
    });

</script>

<table id="table2"></table>
<div id="dialog2"></div>



