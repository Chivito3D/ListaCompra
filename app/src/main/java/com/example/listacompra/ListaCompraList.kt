package com.example.listacompra

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun ListaCompraList(
    list: List<ListaCompra>,
    onCloseTask: (ListaCompra) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(items = list, key = { producto -> producto.id}) { producto ->
            ListaCompraProducto(nombreProducto = producto.label, onClose = { onCloseTask(producto)})
        }
    }
}