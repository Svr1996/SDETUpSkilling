package LuanchUsingCookieswithJson;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.util.Date;
import java.util.Set;

public class CookieUtils {

    private static final String COOKIE_FILE = "cookies.json";

    public static void saveCookiesToFile(WebDriver driver) throws IOException {
        Set<Cookie> cookies = driver.manage().getCookies();
        JSONArray jsonCookies = new JSONArray();

        for (Cookie cookie : cookies) {
            JSONObject json = new JSONObject();
            json.put("name", cookie.getName());
            json.put("value", cookie.getValue());
            json.put("domain", cookie.getDomain());
            json.put("path", cookie.getPath());
            json.put("expiry", cookie.getExpiry() != null ? cookie.getExpiry().getTime() : null);
            json.put("isSecure", cookie.isSecure());

            jsonCookies.put(json);
        }

        try (FileWriter file = new FileWriter(COOKIE_FILE)) {
            file.write(jsonCookies.toString());
        }
    }

    public static void loadCookiesFromFile(WebDriver driver) throws IOException {
        File file = new File(COOKIE_FILE);
        if (!file.exists()) return;

        String json = new BufferedReader(new FileReader(file)).lines()
                .reduce("", (acc, line) -> acc + line);

        JSONArray jsonCookies = new JSONArray(json);

        for (int i = 0; i < jsonCookies.length(); i++) {
            JSONObject jsonCookie = jsonCookies.getJSONObject(i);

            Cookie cookie = new Cookie.Builder(jsonCookie.getString("name"), jsonCookie.getString("value"))
                    .domain(jsonCookie.getString("domain"))
                    .path(jsonCookie.getString("path"))
                    .expiresOn(jsonCookie.isNull("expiry") ? null : new Date(jsonCookie.getLong("expiry")))
                    .isSecure(jsonCookie.getBoolean("isSecure"))
                    .build();

            driver.manage().addCookie(cookie);
        }
    }
}
