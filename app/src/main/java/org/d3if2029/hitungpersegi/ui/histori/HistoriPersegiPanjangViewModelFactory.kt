package org.d3if2029.hitungpersegi.ui.histori

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.d3if2029.hitungpersegi.db.PersegiPanjangDao

class HistoriPersegiPanjangViewModelFactory(
    private val db: PersegiPanjangDao
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HistoriPersegiPanjangViewModel::class.java)) {
            return HistoriPersegiPanjangViewModel(db) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
