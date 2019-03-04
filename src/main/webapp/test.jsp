<%--
  Created by IntelliJ IDEA.
  User: cj142
  Date: 2019/2/28 0028
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用javaScript模拟高并发红包测试控制器</title>
    <!--加载JQUERY文件-->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.js"></script>
    <script>
        $(document).ready(function () {
            //模拟3000个异步请求，进行并发
            var max = 2000;
            for(var i = 1; i <= max; i++) {
                $.post({
                    //请求抢id为1的红包
                    url:"./userRedPacket/grabRedPacketByRedis.do?redPacketId=5&userId="+i,
                    //成功回调
                    success : function (result) {
                    }
                });
            }
        });
    </script>
</head>
<body>



</body>
</html>
