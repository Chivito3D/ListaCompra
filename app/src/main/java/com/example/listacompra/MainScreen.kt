package com.example.listacompra

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun MainScreen(
    //Antigua ListaCompraScreen
    modifier: Modifier = Modifier,
    shoppingListViewModel: ShoppingListViewModel = viewModel(),
) {
    Column(modifier = modifier) {

        ShoppingList(
            list = shoppingListViewModel.list,
            onCheckedItem = { item, checked ->
                shoppingListViewModel.changeItemChecked(item, checked)
            },
            onCloseItem = { item ->
                shoppingListViewModel.remove(item)
            }
        )
    }
}
//val productos = mutableStateListOf<ProductoCompra>()

