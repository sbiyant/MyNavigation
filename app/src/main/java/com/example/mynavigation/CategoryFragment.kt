package com.example.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_category.*


class CategoryFragment : Fragment() {
    companion object {
        val EXTRA_NAME = "extra_name"
        val EXTRA_STOCK = "extra_stock"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnCategoryLifeStyle.setOnClickListener { view->
            val mBundle = Bundle()
            mBundle.putString(EXTRA_NAME, "Lifestyle")
            mBundle.putLong(EXTRA_STOCK, 7)
            view.findNavController().navigate(R.id.action_categoryFragment_to_detailCategoryFragment, mBundle)
        }
    }


}