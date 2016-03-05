function CutString(targetString, splitChar)
{
	itemList = new Array() ;
	var x = 0 ;
	var stop = 0 ;

	while ( !stop )
	{
		chunkStart = targetString.indexOf(splitChar) ;
		if ( chunkStart != -1 )
		{
			itemList[x] = targetString.slice(0,chunkStart).replace(/(^\s*)/g, "").replace(/(\s*$)/g, "") ; 
			targetString = targetString.slice(chunkStart+1, targetString.length) ;
		}
		else
		{
			stop = 1 ;
		}
		x++ ;
	}
	
	return itemList ;
}

function BuildBreadCrumb()
{
	bits = new Object() ;
	names = new Object() ;
	
	var output = "" ;
	
	var locationHref = new String(location.href) ;
	locationHref = locationHref.slice(8, locationHref.length) ;
	chunkStart = locationHref.indexOf("/") ;
	locationHref = locationHref.slice(chunkStart+1, locationHref.length) ;
	
	var pageTitle = new String(document.title + "-" ) ;
	
	bits = CutString(locationHref, "/") ;
	names = CutString(pageTitle, "-") ;
	for ( var i = 0 ; i < bits.length ; i ++ )
	{
		if ( i == -1 )
		{
			output += "<li class=\"first\">" ;
		}
		else
		{
			output += "<li>" ;
		}
		if ( i == bits.length - 1 && names.length == bits.length ) 
		{
			output += "<a class=\"curr\" href=\"" ;
		}
		else
		{
			output += "<a href=\"" ;
		}
		for ( y = 1 ; y < bits.length+1-i ; y++ )
		{
			output += "../" ;
		}
		if ( i == 0 )
		{
			output += bits[i] + "/\" ><img src='/apca/images/home.gif'></a>" ;
		}
		else
		{
			output += bits[i] + "/\">" + names[i] + "</a>" ;
			
		}
		output += "</li>" ;
	
	}
	if ( names.length > bits.length )
	{
		output += "<li><a href=\"" + new String(location.href) + "\" class=\"curr\">" + names[names.length-1] + "</a></li>" ;
	}

	document.write(output);
}