package com.example.listacompra

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class ListaCompraViewModel : ViewModel() {
    private val _productos = getListaCompras().toMutableStateList()
    val productos: List<ListaCompra>
    get() = _productos

    fun remove(item: ListaCompra) {
        _productos.remove(item)
    }
}

private fun getListaCompras() = List(30) { i -> ListaCompra(i, "Producto # $i")}