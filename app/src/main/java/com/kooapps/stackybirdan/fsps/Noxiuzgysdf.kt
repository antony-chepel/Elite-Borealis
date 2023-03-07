package com.kooapps.stackybirdan.fsps
import android.app.Application
import android.content.Context
import com.kooapps.stackybirdan.fsps.skdiwjhu.Powisuyxgczas.ncnxjnvjnjnxcjijisdji
import com.kooapps.stackybirdan.fsps.skdiwjhu.Powisuyxgczas.aplaslplpx
import com.kooapps.stackybirdan.fsps.skdiwjhu.Powisuyxgczas.fpllplppxclvplpxcvkodjif
import com.kooapps.stackybirdan.fsps.skdiwjhu.Powisuyxgczas.xiziiz
import com.kooapps.stackybirdan.gbvd.vobokkovkoijfd
import com.kooapps.stackybirdan.gbvd.cokkoxkokxijvhud
import org.koin.android.ext.koin.androidContext
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Noxiuzgysdf: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(xiziiz)

        val chuxvjixjijivdjis = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val wpllpqlp = getSharedPreferences("PREFS_NAME", 0)

        val ncxvjndsdfejijidsjif = MyTracker.getTrackerParams()
        val tkokogko = MyTracker.getTrackerConfig()
        val fpllpslplpe = MyTracker.getInstanceId(this)
        tkokogko.isTrackingLaunchEnabled = true
        val xzock = UUID.randomUUID().toString()

        if (wpllpqlp.getBoolean("my_first_time", true)) {
            ncxvjndsdfejijidsjif.setCustomUserId(xzock)
            chuxvjixjijivdjis.edit().putString(fpllplppxclvplpxcvkodjif, xzock).apply()
            chuxvjixjijivdjis.edit().putString(aplaslplpx, fpllpslplpe).apply()
            wpllpqlp.edit().putBoolean("my_first_time", false).apply()
        } else {
            val fkokockoxvkookxcjidsji = chuxvjixjijivdjis.getString(fpllplppxclvplpxcvkodjif, xzock)
            ncxvjndsdfejijidsjif.setCustomUserId(fkokockoxvkookxcjidsji)
        }
        MyTracker.initTracker(ncnxjnvjnjnxcjijisdji, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Noxiuzgysdf)
            modules(
                listOf(
                    vobokkovkoijfd, cokkoxkokxijvhud
                )
            )
        }
    }
}