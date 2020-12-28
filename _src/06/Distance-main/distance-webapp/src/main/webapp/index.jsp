<html>
<head>
        <script src="http://code.jquery.com/jquery-latest.js">   
        </script>
        <script>
            $(document).ready(function() {                        
                $('#submit').click(function(event) {  
                    var mydistance=$('#mydistance').val();
                    
                    var mydistanceIn=$('[name=distin]:checked').val();
                    var convertTo=$('[name=convertto]:checked').val();
                    if(mydistanceIn==convertTo){
                    	alert("Cannot have same unit");
                    	return false;
                }
                    console.log(mydistance+mydistanceIn+convertTo);
                 $.get('mydistance',{distance:mydistance,distIn:mydistanceIn,convert:convertTo},function(responseText) { 
                        $('#convertvalue').text(responseText);         
                    });
                });
            });
        </script>
</head>
</head>
<body>
<h2>MyDistance Utility</h2>
	<form>
		<table>
			<tr>
				<td><input type="text" id="mydistance" name='distance' placeholder="My Distance In"></td>
				
				<td> <input type="radio" name="distin" id="distin" value="km">KM<br>
				<input type="radio" name="distin" id="distin" value="m">Metre</td>
				
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr> 
				<td> <label for="convert">Convert To</label></td>
				<td> <input type="radio" name="convertto" id="convertto" value="yd">Yard<br>
				<input type="radio" name="convertto" id="convertto" value="mi">Miles</td>
			</tr>
			<tr>
                         <td><input type="button" id="submit" value='Convert'></td>
                        </tr>
            
		</table>
		<div id="convertvalue"> </div>
	</form>
</body>
</html>
