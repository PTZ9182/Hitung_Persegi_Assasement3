package org.d3if2029.hitungpersegi.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if2029.hitungpersegi.databinding.FragmentRumusPersegipanjangBinding

class RumusPersegiPanjangFragment : Fragment() {
    private lateinit var binding: FragmentRumusPersegipanjangBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRumusPersegipanjangBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }
}
