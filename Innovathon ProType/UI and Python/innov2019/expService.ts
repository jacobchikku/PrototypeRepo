<!DOCTYPE html>
<html lang="en">
<head>
 <meta charset="UTF-8">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
 <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/r/dt/dt-1.10.9/datatables.min.css"/>
 <script type="text/javascript" src="https://cdn.datatables.net/r/dt/dt-1.10.9/datatables.min.js"></script>
 <title> Allianz Recharge Service Details </title>
</head>
<body>
 <div class="container" style="padding:50px 250px;">
   <h1>Allianz Recharge Service Details</h1>
   <div id="header"></div>
   <table id="photos" class="display" cellspacing="0" width="100%">
       <thead>
           <tr>
               <th>User ID</th>
               <th>Title</th>
               <th>Body</th>
           </tr>
       </thead>
       
   </table>
   <div id="footer"></div>
 </div>
</body>
</html>
<script type="text/javascript">
 $(document).ready(function(){
   $('#header').load('../header-ads.html');
   $('#footer').load('../footer-ads.html');
   
   var arrayReturn = [];
           $.ajax({
               url: "https://jsonplaceholder.typicode.com/posts",
               async: false,
               dataType: 'json',
               success: function (data) {
                   for (var i = 0, len = data.length; i < len; i++) {
                       var desc = data[i].body;
                       arrayReturn.push([ data[i].userId, '<a href="http://google.com" target="_blank">'+data[i].title+'</a>',
                        desc.substring(0, 12)]);
                   }
               inittable(arrayReturn);
               }
           });
   function inittable(data) {	
       //console.log(data);
       $('#photos').DataTable( {
           "aaData": data,
           "dataSrc": function ( json ) {
               console.log(json);
             for ( var i=0, ien=json.data.length ; i<ien ; i++ ) {
               json.data[i][0] = '<a href="/message/'+json.data[i][0]+'>View message</a>';
             }
             return json.data;
           }
       } );
   }
 });
</script>