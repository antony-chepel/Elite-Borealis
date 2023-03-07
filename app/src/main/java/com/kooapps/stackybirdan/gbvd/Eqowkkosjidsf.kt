package com.kooapps.stackybirdan.fsps

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

class Losijshu(private val vcijjijijidf: Uowkskojixcji) {
    suspend fun tijrjiwjier() = vcijjijijidf.vokgkokod()
}
interface Uowkskojixcji {
    @GET("elite_borealis.json")
    suspend fun vokgkokod(): Response<Czokzoxijijcsd>
}
@Keep
data class Czokzoxijijcsd(
    @SerializedName("elite_borealis_gncjcuxy")
    val fifdokokokxcvkoxc: String,
    @SerializedName("elite_borealis_vofdiuhhds")
    val rpellpw: String,
    @SerializedName("elite_borealis_ajxyctxsyauw")
    val apspoxkckoxczjihuuh: String,
)



@Keep
data class Twokwkooksidjijxz(
    @SerializedName("countryCode")
    val njvjickocvkof: String,
)


interface Bxpslplpdokijedhuf {
    @GET("json/?key=LbwKKoO9eF4GLMz")
    suspend fun ucvucxjd(): Response<Twokwkooksidjijxz>
}



class Repwlpslpxc(private val ckmvmkcxijsji: Bxpslplpdokijedhuf) {
    suspend fun eowkkokodjijixc() = ckmvmkcxijsji.ucvucxjd()
}















