function getXMLHttpRequest() {
    var xmlHttp;
    //ie7以上的版本
    if (window.XMLHttpRequest){
        xmlHttp=new XMLHttpRequest;
    }else {
        //ie7以下的版本
        xmlHttp=new ActiveXObject("Microsoft.XMLHTTP")
    }
    return xmlHttp;
}
