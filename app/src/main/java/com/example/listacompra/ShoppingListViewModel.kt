package com.example.listacompra

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

//Antigua ListaCompraViewModel mierda de politica de elección de nombres que tengo
class ShoppingListViewModel : ViewModel() {
    private val _list = getShoppingList().toMutableStateList()
    val list: List<ShoppingData>
    get() = _list

    fun remove(item: ShoppingData) {
        _list.remove(item)
    }
    fun add(item: ShoppingData) {
        _list.add(item)
    }

    fun changeItemChecked(item: ShoppingData, checked: Boolean) =
        list.find { it.id == item.id }?.let { elemento ->
            elemento.checked = checked
        } //productos renombrados a elemento
}

//private fun getShoppingList() = List(30) { i -> ProductoCompra("Producto # $i")} //MierdaNombres

//Esto es la linea cuando a la data class le retiré el id de tipo int
private fun getShoppingList() = List(30) { i -> ShoppingData(i, "Producto # $i")}
