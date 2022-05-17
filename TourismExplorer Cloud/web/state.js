$(".state").click(function () {
  let state_selected = $(this).val();

  //JSON

  myrequest = new XMLHttpRequest();

  myrequest.open('GET', 'https://raw.githubusercontent.com/Kshitiz0601/Personal/main/user.json');

  myrequest.onload = function () {

    data = JSON.parse(myrequest.responseText);

    for (i = 0; i < data["state"].length; i++) {

      if (data["state"][i]["name"] == state_selected) {
        document.writeln("<html><head><link rel='stylesheet' href='state.css'></head>" +
          "<div class='topnav'>" +
          "<a class='active' href='profilepage.html'>Go Back</a>" +
          "<a href='feedback.html' target='_blank'>Feedback</a>" +
          "<a href='login.html' target='_blank'>LogOut</a>" +
          "</div>" +
          "<h1>" + data["state"][i]["name"] + "</h1>" +
          "<h3>Capital : " + data["state"][i]["capital"] + "</h3>" +
          "<br><br><div class='image'><img src='" + data["state"][i]["img"][1] + "'></div>" +
          "<br><br><div class='container'>" +
          "<div class='panel-about'>" +
          "<p> <b>ABOUT</b> : " + data["state"][i]["about"] + "</p>" +
          "</div>" +
          "</div>" +
          "<br><br><div class='container'>" +
          "<div class='panel-food'>" +
          "<p> <b>FAMOUS CUISINES</b> : " + data["state"][i]["food"] + "</p>" +
          "</div>" +
          "</div>" +
          "<br><br><div class='container'>" +
          "<div class='panel-time'>" +
          "<p> <b>BEST TIME TO VISIT</b> : " + data["state"][i]["time"] + "</p>" +
          "</div>" +
          "</div>" +
          "</html>");
      }

    }
  };

  myrequest.send();

});