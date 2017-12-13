$(document).ready(function () {

  $("h1").addClass("text-center");
  $("h2").addClass("text-center");

  $(".myBannerHeading").toggleClass("myBannerHeading page-header");

  $("#yellowHeading").text("Yellow Team");

  $("#orangeTeamList").css("background-color", "orange");
  $("#blueTeamList").css("background-color", "blue");
  $("#redTeamList").css("background-color", "red");
  $("#yellowTeamList").css("background-color", "yellow");

  $("#yellowTeamList").append("<li>Joseph Banks</li>");
  $("#yellowTeamList").append("<li>Simon Jones</li>");

  $("#oops h1").hide();

  $("#footerPlaceholder").remove();
  $("#footer").append("p").text("Nathan Pavey | nathanfpavey@gmail.com").css({"font-family": "Courier", "height": "24px"});

});
