

$(document).ready(function(){
 $(".resize").vjustify();
 $("div.buttonSubmit").hoverClass("buttonSubmitHover");
 getCurrentDate2();
 setInterval("getCurrentDate2()",1000);   
});

$.fn.vjustify = function() {
    var maxHeight=0;
    $(".resize").css("height","auto");
    this.each(function(){
        if (this.offsetHeight > maxHeight) {
          maxHeight = this.offsetHeight;
        }
    });
    this.each(function(){
        $(this).height(maxHeight);
        if (this.offsetHeight > maxHeight) {
            $(this).height((maxHeight-(this.offsetHeight-maxHeight)));
        }
    });
};

$.fn.hoverClass = function(classname) {
	return this.hover(function() {
		$(this).addClass(classname);
	}, function() {
		$(this).removeClass(classname);
	});
	
};
function getCurrentDate() {
      var   today,timeString;
      today   =   new   Date();  
	  var   week=new   initArray("<font   color=RED>星期日","<font   color=black>星期一","<font   color=black>星期二","<font   color=black>星期三","<font   color=black>星期四","<font   color=black>星期五","<font   color=GREEN>星期六");
	  timeString =today.toLocaleString()+"  "+week[today.getDay()+1];
	  $(".login").html(timeString);
}
	
function getCurrentDate2() { 
	  var   hours,   minutes,   seconds,   xfile;  
      var   intHours,   intMinutes,   intSeconds;  
      var   intYear,intMonth,intDate;  
      var   curYear,curMonth,curDate;  
      var   today;  
      today   =   new   Date();  
      intYear=today.getFullYear();  
      intMonth=today.getMonth();  
      intDate=today.getDate();  
      intHours   =   today.getHours();  
      intMinutes   =   today.getMinutes();  
      intSeconds   =   today.getSeconds();  
 	  curYear=intYear+"年"
      curMonth=intMonth+1+"月";  
      curDate=intDate+"日"; 
      hours = intHours+":";
      if  (intMinutes   <   10)   {  minutes   =   "0"+intMinutes+":";  }  
      else  {  minutes   =   intMinutes+":";  }  
      if (intSeconds   <   10)   {  seconds   =   "0"+intSeconds+"   ";   }  
      else  {  seconds   =   intSeconds+"   ";   }  
	  var   week=new   initArray("<font   color=RED>星期日</font>","<font   color=black>星期一</font>","<font   color=black>星期二</font>","<font   color=black>星期三</font>","<font   color=black>星期四</font>","<font   color=black>星期五</font>","<font color=GREEN>星期六</font>");
	  timeString =curYear+curMonth+curDate+hours+minutes+seconds+"   "+week[today.getDay()+1];
	 $(".login").html(timeString);
}
	function initArray() {
		this.length = initArray.arguments.length;
		for (var i = 0; i < this.length; i++) {
			this[i + 1] = initArray.arguments[i];
		}
	}

