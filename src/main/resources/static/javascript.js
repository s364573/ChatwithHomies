function regInput(){

    const userInput = {
        user : $("#user").val(),
        chat : $("#inputChat").val()
    };

    $.post("/lagre", userInput, function (){
        hentAlle();
    });
    $("#inputChat").val("");
}

    setTimeout(hentAlle(),5000);


function hentAlle(){
    $.get( "/hentAlle",function (chatLog){
        formaterChatLog(chatLog);
    })
}

function formaterChatLog(meldinger){
    let ut = "<table class='table table-striped'><tr><th>Navn</th><th>Melding</th></tr>"

    for(const melding of meldinger){
        ut+="<tr><td>"+melding.user+"</td><td>"+melding.chat+"</td></tr>";
    }
    ut+="<table>";
    $("#chat").html(ut);
}