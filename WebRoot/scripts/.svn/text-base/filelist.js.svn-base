$(document).ready(function(){
  //全选
 $("#seldelAll").bind("click",checkAll);
  // 如果有一个没有选中则取消全选
  $("tbody :checkbox").each(function(){
  $(this).bind("click",function(){
   if(!$(this).attr("checked")){$("#seldelAll").attr("checked","");}
  });});
  //
  $("td a").each(function(){
   if($(this).attr("id")!="download"){
      $(this).bind("click",lookInfo);
   }
  });
  
});

/**
* 全选的设置
*/
var checkAll= function (){
 if($("#seldelAll").attr("checked")){
   $("tbody :checkbox").attr("checked","true");
 }
 else{
    $("tbody :checkbox").attr("checked","");
  }
};

/**
*查询文件的信息
*/
var lookInfo =function (){
	 shield();
   var url = $("#view").attr("href");
	$("#shield").after("<div class='file-info'><div>");
	$('.file-info').css("left",8).css("top",28);
	$.ajax({
	 type: "GET",
	 url :url,
	 dataType :"html",
	 success: function(jsonp){
	   	$(".file-info").append(jsonp);
		$(".head-btn .close").bind("click",cancel);
	 },
	 error: function(html){
	   	alert( "Data error: " + html );
	 }
	 });
	 return false;
}

function shield()  
  { 
    var   div   =   document.createElement("div");  
    div.className="shield"; 
    div.id="shield";  
    document.getElementsByTagName("body")[0].appendChild(div);  
  } 
  
  var cancel = function(){ 
    hide();
    }
    
    function hide(){
    $("div").remove(".shield");
    $("div").remove(".file-info");
  };
   
