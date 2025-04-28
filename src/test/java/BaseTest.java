

import org.junit.jupiter.api.BeforeEach;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.UsePlaywright;

import qm.playwright.pageobject.PageFactory;

@UsePlaywright
public class BaseTest {
    protected PageFactory pageFactory;

    @BeforeEach
    void setup(Page page) {
        pageFactory = new PageFactory(page);
    }
}
