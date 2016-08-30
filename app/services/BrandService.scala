package services

import javax.inject.Inject

import play.api.cache.CacheApi

/**
 * Created by paulkelly on 30/08/16.
 */
class BrandService @Inject() (cache: CacheApi) {
  def getBrand: String = cache.getOrElse("brand"){
    println("hitting real api for cache entry")
    "adidas"
  }
}
