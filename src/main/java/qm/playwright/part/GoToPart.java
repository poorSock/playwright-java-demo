package qm.playwright.part;

import com.microsoft.playwright.Page;

import qm.playwright.pageobject.PageFactory;
import qm.playwright.pageobject.TestPage;

public class GoToPart {

    TestPage testPage;

    public GoToPart(PageFactory pageFactory){
        this.testPage = pageFactory.create(TestPage.class);
    }

    public GoToPart(){}

    public void gotoTest1(){
        testPage
            .goTo();
    }

    public void gotoTest2(Page page){
        new TestPage(page)
        .goTo();
    }

}
