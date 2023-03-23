package com.example.listacompra


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*@Composable
fun ShoppingListItem( //Antigua ListaCompraProducto ;D
    nombreProducto: String,
    onClose: () -> Unit,
    modifier: Modifier = Modifier) {
    var checkedState by rememberSaveable { mutableStateOf(false) }

    ShoppingListItem(
        nombreProducto = nombreProducto,
        checked = checkedState,
        onCheckedChange = { newValue -> checkedState = newValue},
        onClose = onClose,
        modifier = modifier,
    )
}*/

@Composable
fun ShoppingListItem(
    nombreProducto: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(10.dp)
            .clickable(onClick = {})
            .height(80.dp),
        shape = RoundedCornerShape(10.dp),
        backgroundColor = MaterialTheme.colors.secondary,
        elevation = 5.dp,

    ) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier
                    .weight(1F)
                    .padding(start = 16.dp),
                text = nombreProducto
            )
            Checkbox(
                checked = checked,
                onCheckedChange = onCheckedChange,
            )
            IconButton(onClick = onClose) {
                Icon(Icons.Filled.Close, contentDescription = "Close")
            }
        }
    }
}