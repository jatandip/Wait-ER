package com.example.emergencytime;

import org.jsoup.Jsoup;
import java.util.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import android.os.AsyncTask;
import android.util.Log;


public class webscrape {

    Map<String, String> waitTimes = new HashMap<String, String>();

    private class GetDocument extends AsyncTask<String,Void,Void> {
        @Override
        protected Void doInBackground(String... city) {
            Document document = null;

            try {
                String url = "http://www12.albertahealthservices.ca/repacPublic/SnapShotController?direct=display" + city[0];
                Log.e("URL:",url);
                document = Jsoup.connect(url).get();
                Log.e("doc:",document.toString());
                Elements table = document.getElementsByClass("publicRepacTable");
                Elements rows = table.select("tr");
                for (Element row : rows) {
                    String name = row.getElementsByClass("publicRepacSiteText").text();
                    if (name.length() == 0) {
                        continue;
                    }

                    String time = "";
                    String[] numbers = {"One", "Two", "Three", "Four"};
                    for (String number : numbers) {
                        String imageName = "publicClockNumber" + number + "Gif";
                        Elements images = row.getElementsByClass(imageName);
                        time = time + images.select("img").attr("alt");
                        if (time.length() == 0) {
                            time += "Not available";
                            break;
                        }
                    }
                    waitTimes.put(name, time);
                }
            }
            catch (Exception ex) {
                Log.e("Error:",ex.toString());
            }
            return null;
        }
    }

    public Map<String, String> get_time(String city)  {
        new GetDocument().execute(city);
        return waitTimes;
    }

}