package Test;

import com.microsoft.playwright.*;

//import com.microsoft.playwright.;
public class ABC {
    public static void main(String[] args) {
        String USERNAME = "standard_user";
        String PASSWORD = "secret_sauce";
        Playwright playwright = Playwright.create();
        BrowserType browserType = playwright.chromium();
        Browser chrome = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext brContext = chrome.newContext();
        Page page = chrome.newPage();
        page.navigate("https://www.saucedemo.com/");
        System.out.println("Hello");
        page.click("text=Login");
        page.fill("#user-name", USERNAME);
        page.fill("#password", PASSWORD);
        page.click("#login-button");
        //brContext.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("applogin.json")));
        page.click("text=Sauce Labs Backpack");
        page.click("text=ADD TO CART");
        page.click(".shopping_cart_link");
        Locator totalPrice = page.locator(".inventory_item_price");
        page.click("text=CHECKOUT");
        page.click("text=CONTINUE");
        page.fill("#first-name", "Isswarya");
        page.fill("#last-name", "Karthikeyan");
        page.fill("#postal-code", "641041");
        page.click("#continue");
        page.click("text=FINISH");
    }
}
