document.write("<script type=\"text/javascript\" src=\"../../resources/js/MyAjax.js\"></script>")
window.onload = function () {
    //获取验证的一行的对象
    var nameElement = document.getElementById("username");
    //鼠标移开后的函数
    nameElement.onblur = function () {
        //获取输入的值
        var name = this.value;
        //获取XMLHTTPRequest对象
        var xhr = getXMLHttpRequest();
        //编写回调函数
        xhr.onreadystatechange = function () {
            //测试连接
            if (xhr.readyState == 4) {
                //服务器是否成功响应
                if (xhr.status == 200) {
                    var msg = document.getElementById("msg");
                    //改变提示行的内容
                    if (xhr.responseText == "false") {
                       msg.innerText="无此用户";
                    } else {
                        msg.innerText="";
                    }
                }
            }
        }
        //get方式发送至服务器
        xhr.open("get","/admin_Check?adminName=" + name);
        xhr.send(null);
    }
}