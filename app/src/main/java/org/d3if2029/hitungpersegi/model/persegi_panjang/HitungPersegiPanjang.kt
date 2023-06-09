package org.d3if2029.hitungpersegi.model.persegi_panjang


import org.d3if2029.hitungpersegi.db.PersegiPanjangEntity

fun PersegiPanjangEntity.hitungPersegiPanjang(): HasilPersegiPanjang {
    val keliling = (2 * (panjang + lebar))
    val luas = panjang * lebar
    return HasilPersegiPanjang(keliling, luas)
}
