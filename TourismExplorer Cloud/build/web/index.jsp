<%-- 
    Document   : index.jsp
    Created on : 16 Jan, 2022, 12:59:46 AM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>Home Page</title>

<head>
    <link rel="stylesheet" href="Homepage.css">
</head>

<body>
    <div class="topnav">
        <a class="active" href="index.jsp">Home</a>
        <a href="login.html">Login</a>
        <a href="signup.html">SignUp</a>
        <a href="aboutus.html" target="_blank">Meet Our Team</a>
        <a href="feedback.html" target="_blank">Feedback</a>
    </div>

    <h4>
        <img style="border-radius:50%;width: 13%; border-style: dotted; border-color: seagreen;"
            src="https://cdn5.vectorstock.com/i/1000x1000/70/64/icons-of-traveling-planning-vacation-tourism-vector-21917064.jpg"
            alt="Travel Logo">
    </h4>

    <h1 style="text-align: center; color:black; font-family: Georgia;">TOURISM EXPLORER</h1>

    <div class="auto" style="max-width:500px;">
        <img class="slideshow" src="https://imgcld.yatra.com/ytimages/image/upload/t_yt_blog_w_800_c_fill_g_auto_q_auto:good_f_jpg/v1543910413/StatueofUnity1_1543908986.jpg" style="width:100%">
        <img class="slideshow" src="https://upload.wikimedia.org/wikipedia/commons/6/6d/Jal_Mahal_in_Man_Sagar_Lake.jpg"style="width:100%">
        <img class="slideshow" src="https://images.news18.com/ibnlive/uploads/2021/09/hawa-mahal-163266422316x9.jpg" style="width:100%">
        <img class="slideshow" src="https://qph.fs.quoracdn.net/main-qimg-add854c2cd376ab188a2dd7c1b2ea0d8" style="width:100%">
        <img class="slideshow" src="https://www.wallpapertip.com/wmimgs/87-877309_indian-historical-places-photo-indian-tourism-photo-chaturbhuj.jpg" style="width:100%">
        <img class="slideshow" src="http://eragenx.com/wp-content/uploads/2016/07/rajasthan.jpg" style="width:100%">
        <img class="slideshow" src="https://wallpapercave.com/wp/wp2301598.jpg" style="width:100%">
    </div>
    <script>
        var myIndex = 0;
        carousel();

        function carousel() {
            var i;
            var x = document.getElementsByClassName("slideshow");
            for (i = 0; i < x.length; i++) {
                x[i].style.display = "none";
            }
            myIndex++;
            if (myIndex > x.length) { myIndex = 1 }
            x[myIndex - 1].style.display = "block";
            setTimeout(carousel, 2000);
        }
    </script>
    <br>

    <BR>
    <h2 style="text-align: center;font-family: Georgia;">WHAT DO YOU WANT TO DO TODAY?</h2>
    <h3 style="font-family: Georgia;">Tourism Explorer offers limitless opportunities for tourism and adventure.
        There is something for everyone - Pilgrimage, &nbsp;&nbsp;Temples, Wildlife tours, Bird Watching, Rafting,
        Mountaineering, Skiing,
        Trekking, Camping, Yoga and Meditation and much &nbsp;&nbsp;more.
        Register yourself to explore the tourism in India.</h3>




    <br><br><br><br><br><br><br>

    <footer>
        <p> &nbsp;Developer: Kshitiz Goyal&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;
            Contact Number: 9772056027&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
            Email: kshitiz.goyal2019@vitstudent.ac.in&emsp;&nbsp;&nbsp;&nbsp;
            Location: Jaipur, Rajasthan, India</p>
        <p> &nbsp;Developer: Naman Jain&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
            Contact Number: 9711554734&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
            Email: naman.jain2019a@vitstudent.ac.in&emsp;&emsp;
            Location: New Delhi, India</p>

    </footer>
</body>

</html>
