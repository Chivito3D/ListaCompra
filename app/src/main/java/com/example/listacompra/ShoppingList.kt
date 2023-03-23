package com.example.listacompra

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun ShoppingList(
    //Antigua ListaCompraList ;(
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
            //key = { it.key }
            key = { item -> item.id } //renombrado producto como item (sin cambiar nombreProducto)
        ) { item ->
            ShoppingListItem(
                nombreProducto = item.label,
                checked = item.checked,
                onCheckedChange = { checked -> onCheckedItem(item, checked) },
                onClose = { onCloseItem(item) }
            )
        }
    }
}