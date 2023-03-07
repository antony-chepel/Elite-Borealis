package com.kooapps.stackybirdan.fsps.skdiwjhu
import android.webkit.WebSettings
import android.webkit.WebView
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import android.app.Application



class Jowokkwoisjxc(jcxijds: Application): ViewModel() {
    val coxkkoxcokijdhusgyas = jcxijds.packageManager


    fun epwpqlpsas(chxhvij: String) {
        OneSignal.setExternalUserId(
            chxhvij,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(wpllpqoks: JSONObject) {
                    try {
                        if (wpllpqoks.has("push") && wpllpqoks.getJSONObject("push").has("success")) {
                            val vjicijbjifdhudhug = wpllpqoks.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $vjicijbjifdhudhug"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (wpllpqoks.has("email") && wpllpqoks.getJSONObject("email").has("success")) {
                            val rplelppasd =
                                wpllpqoks.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $rplelppasd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (wpllpqoks.has("sms") && wpllpqoks.getJSONObject("sms").has("success")) {
                            val dppqppsxkoczijji = wpllpqoks.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $dppqppsxkoczijji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }





    fun xzkczxokjivhucgygyxc(rplelpwlpplsl: WebView): WebSettings{
        val kcxkmvuhyu = rplelpwlpplsl.settings
        kcxkmvuhyu.setSupportMultipleWindows(false)
        kcxkmvuhyu.useWideViewPort = true
        kcxkmvuhyu.pluginState = WebSettings.PluginState.ON
        kcxkmvuhyu.allowFileAccess = true
        kcxkmvuhyu.cacheMode = WebSettings.LOAD_DEFAULT
        kcxkmvuhyu.allowFileAccess = true
        kcxkmvuhyu.javaScriptEnabled = true
        kcxkmvuhyu.javaScriptCanOpenWindowsAutomatically = true
        kcxkmvuhyu.builtInZoomControls = true
        kcxkmvuhyu.displayZoomControls = false
        kcxkmvuhyu.userAgentString = kcxkmvuhyu.userAgentString.replace("; wv", "")
        kcxkmvuhyu.allowContentAccess = true
        kcxkmvuhyu.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        kcxkmvuhyu.domStorageEnabled = true
        kcxkmvuhyu.allowContentAccess = true
        kcxkmvuhyu.mediaPlaybackRequiresUserGesture = false
        kcxkmvuhyu.loadWithOverviewMode = true
        kcxkmvuhyu.setSupportZoom(true)


        return kcxkmvuhyu
    }

    fun kidoskhucx(dokeowko: String): Boolean {
        try {
            coxkkoxcokijdhusgyas.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }


}