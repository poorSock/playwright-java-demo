package qm.playwright.pageobject;

import com.microsoft.playwright.Page;

public class PageFactory {

    private final Page page;

    public PageFactory(Page page) {
        this.page = page;
    }

    public <T> T create(Class<T> pageClass) {
        try {
            return pageClass.getConstructor(Page.class).newInstance(page);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create page object for " + pageClass.getSimpleName(), e);
        }
    }
}