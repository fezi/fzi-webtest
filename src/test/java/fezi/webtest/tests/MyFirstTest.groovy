package fezi.webtest.tests

import fezi.webtest.pages.MyFirstPage
import fezi.webtest.util.Behavior
import geb.testng.GebReportingTestTrait
import org.testng.annotations.Test

class MyFirstTest implements GebReportingTestTrait {

    @Test
    void visistGebDocumentationAndClickSidebarLink() {
        MyFirstPage page = browser.to MyFirstPage
        println page.headline.text() // "The Book Of Geb"
        assert page.headline.text().contains('Geb')

        page.sidebar.sidemenuAnchors.getAt(2).click()
        Behavior.sleepSoundly(1000)
    }

}
