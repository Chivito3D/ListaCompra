package com.example.listacompra

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun ShoppingList(   //Antigua ListaCompraList ;(
    list: List<ShoppingData>,
    onCheckedItem: (ShoppingData, Boolean) -> Unit,
    onCloseItem: (ShoppingData) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            //.padding(vertical = 10.dp)
    ) {
        items(
            items = list,
        key = { producto -> producto.id } //debería renombrar producto como item
        ) { producto ->
            ShoppingListItem(
                nombreProducto = producto.label,
                checked = producto.checked,
                onCheckedChange = { checked -> onCheckedItem(producto, checked) },
                onClose = { onCloseItem(producto) }
            )
        }
    }
}