package org.d3if2029.hitungpersegi.ui.persegi_panjang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.d3if2029.hitungpersegi.db.PersegiPanjangDao
import org.d3if2029.hitungpersegi.db.PersegiPanjangEntity
import org.d3if2029.hitungpersegi.model.persegi_panjang.HasilPersegiPanjang
import org.d3if2029.hitungpersegi.model.persegi_panjang.hitungPersegiPanjang


class PersegiPanjangViewModel(private val db: PersegiPanjangDao) : ViewModel() {


    private val hasilPersegiPanjang = MutableLiveData<HasilPersegiPanjang?>()


    fun hitung(panjang: Int, lebar: Int) {


        val dataPersegiPanjang = PersegiPanjangEntity(
            panjang = panjang,
            lebar = lebar,
        )
        hasilPersegiPanjang.value = dataPersegiPanjang.hitungPersegiPanjang()
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                db.insert(dataPersegiPanjang)
            }
        }
    }
    fun getHasilHitung(): LiveData<HasilPersegiPanjang?> = hasilPersegiPanjang

}
