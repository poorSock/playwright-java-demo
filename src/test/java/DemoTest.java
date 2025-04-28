import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.UsePlaywright;

import qm.playwright.part.GoToPart;

@UsePlaywright
public class DemoTest extends BaseTest {
    
    @Test
    public void demotest1(){
        new GoToPart(pageFactory).gotoTest1();
    }

    @Test
    public void demotest2(Page page){
        new GoToPart().gotoTest2(page);
    }
}
