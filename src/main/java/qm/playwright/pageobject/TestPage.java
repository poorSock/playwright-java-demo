package qm.playwright.pageobject;

import com.microsoft.playwright.Page;

public class TestPage {

    Page page;

    public TestPage(Page page){
        this.page = page;
    }

    public void goTo(){
        page.navigate("https://www.qualityminds.de");
    }
}
