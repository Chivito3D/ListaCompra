package com.example.listacompra

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun ListaCompraScreen(
    modifier: Modifier = Modifier,
    listaCompraViewModel: ListaCompraViewModel = viewModel(),
) {
    Column(modifier = modifier) {
        ListaCompraList(list = listaCompraViewModel.productos,
            onCloseTask = { productos -> listaCompraViewModel.remove(productos) })
    }
}