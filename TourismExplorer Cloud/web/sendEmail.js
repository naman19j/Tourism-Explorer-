/* global Email */

let val = Math.floor(1000 + Math.random() * 9000);
function sendEmail() {
    let a =document.forms["signup"]["email"].value;
      Email.send({
        Host: "smtp.gmail.com",
        Username: "team4lsofficial@gmail.com",
        Password: "Ripper@123",
        To: "jain.naman52@gmail.com",
        From: "team4lsofficial@gmail.com",
        Subject: "Sending OTP for email verification",
        Body: "OTP: "+val+""
      })
        .then(function (message) {
          alert("E-Mail sent successfully");
        });
    }