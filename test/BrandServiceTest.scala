import org.scalatest.{TestData, Matchers, WordSpec}
import org.scalatestplus.play.OneAppPerTest
import play.api.cache.CacheApi
import services.BrandService

/**
 * Created by paulkelly on 30/08/16.
 */
class BrandServiceTest extends WordSpec with Matchers with OneAppPerTest{
//  implicit override def newAppForTest(td: TestData) = new GuiceApplicationBuilder().configure(Map("ehcacheplugin" -> "disabled")).build()

  "getBrand" should {
    "retrieve the brand name" in {
      val cache = app.injector.instanceOf[CacheApi]
      val bs = new BrandService(cache)
      bs.getBrand shouldBe "adidas"
    }
  }
}
