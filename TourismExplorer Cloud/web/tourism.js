$(".tourism").click(function () {
    let state_selected = $(this).val();
  
    //JSON
  
    myrequest = new XMLHttpRequest();
  
    myrequest.open('GET', 'https://raw.githubusercontent.com/Kshitiz0601/Personal/main/user.json');
  
    myrequest.onload = function () {
  
      data = JSON.parse(myrequest.responseText);
  
      for (i = 0; i < data["state"].length; i++) {
  
        if (data["state"][i]["name"] == state_selected) {
            document.writeln("<html><head><link rel='stylesheet' href='tourism.css'></head>" +
            "<div class='topnav'>" +
            "<a class='active' href='profilepage.html'>Go Back</a>" +
            "<a href='feedback.html' target='_blank'>Feedback</a>" +
            "<a href='login.html' target='_blank'>LogOut</a>" +
            "</div>");
            for(j=0;j<data["state"][i]["tourist"].length;j++){
            document.writeln("<h1>"+data["state"][i]["tourist"][j]["name"]+"</h1><br>"+
            "<div class='image'><img src='" + data["state"][i]["tourist"][j]["images"] + "'></div><br><br>"+
            "<div class='container'>" +
            "<div class='panel-food'>" +
            "<p> <b>Information</b> : " + data["state"][i]["tourist"][j]["info"] + "</p>" +
            "</div>" +
            "</div><br><br>"+
            "<div class='locbut'><a href='"+data["state"][i]["tourist"][j]["location"]+"' target='_blank'>LOCATION</a></div><br><br>"+
            "<br><hr>"+
            "</html>");
            }
        }
      }
    };
  
    myrequest.send();
  
  });