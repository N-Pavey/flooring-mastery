$(document).ready(function () {

  $("#akronInfoDiv").hide();
  $("#minneapolisInfoDiv").hide();
  $("#louisvilleInfoDiv").hide();

  $("#mainButton").on("click", function () {
    $("#akronInfoDiv").hide();
    $("#minneapolisInfoDiv").hide();
    $("#louisvilleInfoDiv").hide();

    $("#mainInfoDiv").show();
  })

  $("#akronButton").on("click", function () {
    $("#mainInfoDiv").hide();
    $("#minneapolisInfoDiv").hide();
    $("#louisvilleInfoDiv").hide();

    $("#akronInfoDiv").show();
    $("#akronWeather").hide();
  })

  $("#minneapolisButton").on("click", function () {
    $("#mainInfoDiv").hide();
    $("#akronInfoDiv").hide();
    $("#louisvilleInfoDiv").hide();

    $("#minneapolisInfoDiv").show();
    $("#minneapolisWeather").hide();
  })

  $("#louisvilleButton").on("click", function () {
    $("#mainInfoDiv").hide();
    $("#minneapolisInfoDiv").hide();
    $("#akronInfoDiv").hide();

    $("#louisvilleInfoDiv").show();
    $("#louisvilleWeather").hide();
  })

  $("#akronWeatherButton").on("click", function () {
    $("#akronWeather").toggle();
  })

  $("#minneapolisWeatherButton").on("click", function () {
    $("#minneapolisWeather").toggle();
  })

  $("#louisvilleWeatherButton").on("click", function () {
    $("#louisvilleWeather").toggle();
  })

  $(".table tr").not(":first-child").hover(
    // in callback
    function () {
        $(this).css("background-color", "WhiteSmoke");
    },
    // out callback
    function () {
        $(this).css("background-color", "");
    }
);

});
