package com.kooapps.stackybirdan.gbvd
import org.koin.androidx.viewmodel.ext.android.viewModel
import android.os.Looper
import com.kooapps.stackybirdan.fsps.skdiwjhu.Jowokkwoisjxc
import com.kooapps.stackybirdan.fsps.skdiwjhu.Powisuyxgczas.bkovbkokonkoko
import android.os.Environment
import java.io.IOException
import com.kooapps.stackybirdan.fsps.skdiwjhu.Powisuyxgczas.rpleplpwplwlplpslpd
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.kooapps.stackybirdan.fsps.skdiwjhu.Powisuyxgczas.fpllplppxclvplpxcvkodjif
import android.widget.Toast
import android.net.Uri
import org.koin.core.qualifier.named
import java.io.File
import android.content.Intent
import java.text.SimpleDateFormat
import android.webkit.*
import android.util.Log
import android.provider.MediaStore
import android.os.Bundle
import android.os.Handler

import java.util.*





class Gewisjxchugyzxs : AppCompatActivity() {
    lateinit var dpelpwplplplpqpsl: WebView
    var cioxokcxkovjijisdjif = ""
    private var hxbcbhvhbcxbhxcbhxchbuhdhu = false
    private var eplwpl: ValueCallback<Array<Uri>>? = null
    private  val chxhvjuhvbu = 1
    private var wpqplqlpp: String? = null
    private val ccxyxyvyhuvchub by viewModel<Jowokkwoisjxc>(
        named("BeamModel")
    )







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dpelpwplplplpqpsl = WebView(this)
        setContentView(dpelpwplplplpqpsl)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(dpelpwplplplpqpsl, true)
        ccxyxyvyhuvchub.xzkczxokjivhucgygyxc(dpelpwplplplpqpsl)

        dpelpwplplplpqpsl.webViewClient = Losoixjczijhu()
        dpelpwplplplpqpsl.webChromeClient = Yuwiwiookskodijx()
        dpelpwplplplpqpsl.loadUrl(gofokfdko())
    }

    override fun onActivityResult(hcxuivijdjisfhu: Int, eplwlplpq: Int, odfkokofgko: Intent?) {

        if (hcxuivijdjisfhu != chxhvjuhvbu || eplwpl == null) {
            super.onActivityResult(hcxuivijdjisfhu, eplwlplpq, odfkokofgko)
            return
        }
        var hcxhvijjiifjdhufudhg: Array<Uri>? = null

        if (eplwlplpq == RESULT_OK) {
            if (odfkokofgko == null) {
                if (wpqplqlpp != null) {
                    hcxhvijjiifjdhufudhg = arrayOf(Uri.parse(wpqplqlpp))
                }
            } else {
                val spwowolsdiwji = odfkokofgko.dataString
                if (spwowolsdiwji != null) {
                    hcxhvijjiifjdhufudhg = arrayOf(Uri.parse(spwowolsdiwji))
                }
            }
        }
        eplwpl!!.onReceiveValue(hcxhvijjiifjdhufudhg)
        eplwpl = null
        return
    }


    fun tokrkowkoekooksdoka(gxcvhuxchujidji: String?) {
        if (!gxcvhuxchujidji!!.contains("t.me")) {

            if (cioxokcxkovjijisdjif == "") {
                cioxokcxkovjijisdjif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    gxcvhuxchujidji
                ).toString()

                val trkorokekookdsko = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val kobkovkonivjb = trkorokekookdsko.edit()
                kobkovkonivjb.putString("SAVED_URL", gxcvhuxchujidji)
                kobkovkonivjb.apply()
            }
        }
    }

    inner class Yuwiwiookskodijx : WebChromeClient() {

        override fun onShowFileChooser(
            vjifjidji: WebView?,
            rokekowko: ValueCallback<Array<Uri>>?,
            aplslppllpxclpp: FileChooserParams?
        ): Boolean {
            eplwpl?.onReceiveValue(null)
            eplwpl = rokekowko
            var ucuixjvjiijdji: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (ucuixjvjiijdji!!.resolveActivity(packageManager) != null) {
                var dpsllpepl: File? = null
                try {
                    dpsllpepl = chxvuhxhucuhdjis()
                    ucuixjvjiijdji.putExtra("PhotoPath", wpqplqlpp)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (dpsllpepl != null) {
                    wpqplqlpp = "file:" + dpsllpepl.absolutePath
                    ucuixjvjiijdji.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(dpsllpepl)
                    )
                } else {
                    ucuixjvjiijdji = null
                }
            }
            val cxtvtxcgygysgydhuhusdhusd = Intent(Intent.ACTION_GET_CONTENT)
            cxtvtxcgygysgydhuhusdhusd.addCategory(Intent.CATEGORY_OPENABLE)
            cxtvtxcgygysgydhuhusdhusd.type = "image/*"
            val dplaplslplpplxplclzlpclpz: Array<Intent?> = ucuixjvjiijdji?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val dijjiwe = Intent(Intent.ACTION_CHOOSER)
            dijjiwe.putExtra(Intent.EXTRA_INTENT, cxtvtxcgygysgydhuhusdhusd)
            dijjiwe.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            dijjiwe.putExtra(Intent.EXTRA_INITIAL_INTENTS, dplaplslplpplxplclzlpclpz)
            startActivityForResult(dijjiwe, chxhvjuhvbu)
            return true
        }

        fun chxvuhxhucuhdjis(): File? {
            val spalplpsapllpxlpczpl = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val fudhhucxuhv = "JPEG_" + spalplpsapllpxlpczpl + "_"
            val fkodskokokozxcjizxi = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                fudhhucxuhv,
                ".jpg",
                fkodskokokozxcjizxi
            )
        }
    }


    inner class Losoixjczijhu: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (ccxyxyvyhuvchub.kidoskhucx(url)) {

                    val dfhdfhujidfjioksd = Intent(Intent.ACTION_VIEW)
                    dfhdfhujidfjioksd.data = Uri.parse(url)
                    startActivity(dfhdfhujidfjioksd)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            tokrkowkoekooksdoka(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Gewisjxchugyzxs, description, Toast.LENGTH_SHORT).show()
        }
    }



    override fun onBackPressed() {

        if (dpelpwplplplpqpsl.canGoBack()) {
            if (hxbcbhvhbcxbhxcbhxchbuhdhu) {
                dpelpwplplplpqpsl.stopLoading()
                dpelpwplplplpqpsl.loadUrl(cioxokcxkovjijisdjif)
            }
            this.hxbcbhvhbcxbhxcbhxchbuhdhu = true
            dpelpwplplplpqpsl.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                hxbcbhvhbcxbhxcbhxchbuhdhu = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    private fun gofokfdko(): String {
        val torokkokokosdfjijicvji = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val eplwlpqlp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val yxcygvxchuhuvxhuhusd = torokkokokosdfjijicvji.getString(fpllplppxclvplpxcvkodjif, null)
        val fprlepelwlwelp = torokkokokosdfjijicvji.getString(rpleplpwplwlplpslpd, null)
        val ncvnubhuvijijdf = torokkokokosdfjijicvji.getString(bkovbkokonkoko, null)
        when (torokkokokosdfjijicvji.getString("WebInt", null)) {
            "campaign" -> {
                ccxyxyvyhuvchub.epwpqlpsas(fprlepelwlwelp.toString())
            }
            "deepLink" -> {
                ccxyxyvyhuvchub.epwpqlpsas(fprlepelwlwelp.toString())
            }
            "deepLinkNOApps" -> {
                ccxyxyvyhuvchub.epwpqlpsas(yxcygvxchuhuvxhuhusd.toString())
            }
            "geo" -> {
                ccxyxyvyhuvchub.epwpqlpsas(yxcygvxchuhuvxhuhusd.toString())
            }
        }
        return eplwlpqlp.getString("SAVED_URL", ncvnubhuvijijdf).toString()
    }






}

