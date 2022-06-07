function showtext(){
    var fname = document.getElementById('fName').value;
    var lname = document.getElementById('lName').value;
    var email = document.getElementById('email').value;

    var resultText = "Welcome " + fname + " " + lname + "! A confirmation email has been sent to " + email;

    document.getElementById("results").innerHTML = resultText;

}