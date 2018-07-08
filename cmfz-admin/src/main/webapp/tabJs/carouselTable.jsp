<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/7/5
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

    <script type="text/javascript">

            $('#table').datagrid({
                toolbar: [{
                    text:"新增轮播图",
                    iconCls: 'icon-edit',
                    handler: function(){
                        $("#dialog").dialog({
                            title: '添加轮播图 ',
                            width: 400,
                            height: 200,
                            closed: false,
                            cache: false,
                            href: '${pageContext.request.contextPath}/tabJs/upCarousel.jsp',
                            modal: true,
                            buttons:[{
                                text:'保存',
                                handler:function(){
                                        $("#fm").form("submit",{
                                            url:"${pageContext.request.contextPath}/carousel/upPic",
                                            onSubmit: function(){
                                            },
                                            success:function(data){
                                                if(data==1){
                                                    alert("添加成功！data"+data)
                                                    $('#table').datagrid('reload');
                                                }
                                                else{
                                                    alert("添加失败");
                                                }


                                            }

                                        })

                                }
                            },{
                                text:'关闭',
                                handler:function(){
                                    $("#dialug").dialog({
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
                }],
                title:"轮播图管理",
                remoteSort:false,
                singleSelect:true,
                nowrap:false,
                fitColumns:true,
                pagination:true,
                pageList:[2,4,6],
                pageSize:2,

                url:"${pageContext.request.contextPath}/carousel/showCarousel",
                columns:[[
                    {field:'picId',title:'编号',width:50},
                    {field:'picDescription',title:'图片描述',width:50,sortable:true},
                    {field:'picDate',title:'上传时间',width:50,sortable:true},
                    {field:'picPath',title:'图片路径',width:50,align:'right',sortable:true},
                    {field:'picStatus',title:'图片状态',width:50,align:'right',sortable:true},
                    {field:"+'编辑'+",title:'操作',width:50,align:'right',sortable:true},
                ]],
                view: detailview,
                detailFormatter: function(rowIndex, rowData){
                    var a='/carouselImg/'+rowData.picPath;
                    return '<table><tr>' +
                        '<td rowspan=2 style="border:0"><img src='+a+' style="height:100px;"></td>' +
                        '<td style="border:0">' +
                        '<p>描述: ' + rowData.picDescription+ '</p>' +
                        '<p>状态: ' + rowData.picStatus + '</p>' +
                        '</td>' +
                        '</tr></table>';
                }
            });

    </script>

        <table id="table"></table>
        <div id="dialog"></div>



