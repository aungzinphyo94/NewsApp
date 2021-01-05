package com.myanmaritc.newsapp.ui.all

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.myanmaritc.newsapp.R

class AllNewsFragment : Fragment() {

    private lateinit var allNewsViewModel: AllNewsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        allNewsViewModel =
                ViewModelProvider(this).get(AllNewsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_all, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        allNewsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}