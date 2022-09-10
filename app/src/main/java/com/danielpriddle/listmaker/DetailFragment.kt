package com.danielpriddle.listmaker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danielpriddle.listmaker.databinding.FragmentDetailBinding
import com.danielpriddle.listmaker.databinding.FragmentTodoListBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    lateinit var list: TaskList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            list = it.getParcelable(ARG_LIST)!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        private val ARG_LIST = "list"
        fun newInstance(list: TaskList): DetailFragment {
            val bundle = Bundle()
            bundle.putParcelable(ARG_LIST, list)
            val fragment = DetailFragment()
            fragment.arguments = bundle
            return fragment
        }
    }
}