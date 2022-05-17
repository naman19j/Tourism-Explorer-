$(".hotel").click(function () {
    let state_selected = $(this).val();
  
    //JSON
  
    myrequest = new XMLHttpRequest();
  
    myrequest.open('GET', 'https://raw.githubusercontent.com/Kshitiz0601/Personal/main/user.json');
  
    myrequest.onload = function () {
  
      data = JSON.parse(myrequest.responseText);
  
      for (i = 0; i < data["state"].length; i++) {
  
        if (data["state"][i]["name"] == state_selected) {
            document.writeln("<html><head><link rel='stylesheet' href='hotel.css'></head>" +
            "<div class='topnav'>" +
            "<a class='active' href='profilepage.html'>Go Back</a>" +
            "<a href='feedback.html' target='_blank'>Feedback</a>" +
            "<a href='login.html' target='_blank'>LogOut</a>" +
            "</div>"+
            "<h1>Hotels</h1>");

            for(j=0;j<data["state"][i]["hotels"].length;j++){
                document.writeln("<div class='card'>"+
                "<img src='"+data["state"][i]["hotels"][j]["image"]+"' alt = '"+ data["state"][i]["products"][j]["name"]+"'style='width:100% ;height:30%'>"+
                "<h2>"+  data["state"][i]["hotels"][j]["name"] +"</h2>"+
                "<h4> "+ data["state"][i]["hotels"][j]["address"]+" </h4>"+
                "<button value = '"+data["state"][i]["hotels"][j]["name"]+"' class = 'room'>Book Now</button>"+
              "</div><br><br><script src='room.js'></script>");
            }
        }
      }
    }; 
  
    myrequest.send();
  
  });