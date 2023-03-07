package com.kooapps.stackybirdan.gbvd.uwiwi
import androidx.fragment.app.Fragment
import com.kooapps.stackybirdan.R
import com.kooapps.stackybirdan.fsps.skdiwjhu.Kiwowkosijxchuzgys
import com.kooapps.stackybirdan.fsps.skdiwjhu.Powisuyxgczas.hbhvjijijcv
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import android.view.LayoutInflater
import org.koin.core.qualifier.named
import android.view.ViewGroup
import android.content.SharedPreferences
import android.view.View
import androidx.navigation.fragment.findNavController
import org.koin.android.ext.android.inject
import android.content.Context
import android.os.Bundle




class Miwwiwuysgdxc : Fragment() {

    val fokrokkodok by activityViewModel<Kiwowkosijxchuzgys>(named("MainModel"))
    private lateinit var oxzkokocokjijijciv: Context
    lateinit var rokeokowkkooksojijijicx: String
    val bijijbijjibvjiokcvkokokocvko: SharedPreferences by inject(named("SharedPreferences"))





    override fun onAttach(context: Context) {
        super.onAttach(context)
        oxzkokocokjijijciv = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.usiwwwwsad, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ijzcji = bijijbijjibvjiokcvkokokocvko.getString(hbhvjijijcv, null)
        val spslpslplpslpxkoc = bijijbijjibvjiokcvkokokocvko.getString("appCamp", null)

        if (ijzcji=="1" &&spslpslplpslpxkoc == null) {
            fokrokkodok.okvcokbjijifghusdjifjizxc(oxzkokocokjijijciv)
            fokrokkodok.dpwlplpsapd.observe(viewLifecycleOwner) {
                if (it != null) {
                    rokeokowkkooksojijijicx = it.toString()
                    bijijbijjibvjiokcvkokokocvko.edit().putString("appCamp", rokeokowkkooksojijijicx).apply()
                    findNavController().navigate(R.id.nmcxicxvysdgyfe)
                }
            }
        } else {
            findNavController().navigate(R.id.nmcxicxvysdgyfe)
        }
    }






}