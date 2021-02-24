// [START maps_http_timezone_localized]
OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
Request request = new Request.Builder()
  .url("https://maps.googleapis.com/maps/api/timezone/json?location=39.6034810,-119.6822510&timestamp=1331766000&language=es&key=YOUR_API_KEY")
  .method("GET", null)
  .build();
Response response = client.newCall(request).execute();
// [END maps_http_timezone_localized]