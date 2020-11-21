package com.example.emojimemorygameforandroid.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TableRow
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.emojimemorygameforandroid.R
import android.widget.TextView as TextView


class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val mainLinerLayout = getView().findViewById<TableRow>(R.id.gridTable)
//        val textview = TextView(this)
//        textview.text = "你好！"
//        mainLinerLayout.addView(textview)
        var view = inflater.inflate(R.layout.main_fragment, container, false)
        var mainLinerLayout = view.findViewById<TableRow>(R.id.gridTable)
        var childView1 = TextView(inflater.context)
        childView1.text = "你好！"
        mainLinerLayout?.addView(childView1)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // TODO: Use the ViewModel
    }

}