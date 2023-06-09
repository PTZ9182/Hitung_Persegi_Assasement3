package org.d3if2029.hitungpersegi.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.d3if2029.hitungpersegi.model.main.BangunDatar
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL =  "https://bangundatarrr.000webhostapp.com/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()


private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface BangunDatarApiService {
    @GET("apibangundatar.php")
    suspend fun getBangunDatar(): List<BangunDatar>
}
object BangunDatarApi {
    val service: BangunDatarApiService by lazy {
        retrofit.create(BangunDatarApiService::class.java)
    }
    fun getBangunDatarUrl(nama: String): String {
        return "$BASE_URL$nama.PNG"
    }

}
enum class ApiStatus { LOADING, SUCCESS, FAILED }
