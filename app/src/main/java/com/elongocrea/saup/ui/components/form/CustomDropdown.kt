package com.elongocrea.saup.ui.components.form

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.elongocrea.saup.ui.theme.PrimaryColor

@Composable
fun CustomDropdown(
    modifier: Modifier = Modifier,
    items: List<String>,
    selectedItem: String,
    onItemSelected: (String) -> Unit,
    label: String = "",
    placeholder: String = ""
) {
    var expanded by remember { mutableStateOf(false) }

    Box(modifier = modifier) {
        TextField(
            value = selectedItem,
            onValueChange = {},
            label = { Text(label, fontSize = TextUnit(value = 14F, type = TextUnitType.Sp)) },
            placeholder = { Text(placeholder, fontSize = TextUnit(value = 14F, type = TextUnitType.Sp)) },
            readOnly = true,
            modifier = Modifier
                .fillMaxWidth()
                .border(0.5.dp, Color.Gray.copy(alpha = 0.4f), shape = RoundedCornerShape(8.dp)),
            trailingIcon = {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(
                        imageVector = if (expanded) Icons.Default.ArrowDropUp else Icons.Default.ArrowDropDown,
                        contentDescription = null
                    )
                }
            },
            textStyle = TextStyle(color = Color.Black),
            singleLine = true,
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.colors(
                disabledTextColor = Color.Gray,
                focusedIndicatorColor = Color.Transparent,
                focusedContainerColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color.White,
            )
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = modifier.background(color = Color.White)
        ) {
            items.forEach { item ->
                DropdownMenuItem(
                    modifier = modifier.background(color = Color.White),
                    colors = MenuDefaults.itemColors(),
                    text = { Text(text = item) },
                    onClick = {
                        onItemSelected(item)
                        expanded = false
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomDropdownPreview() {
    var selectedItem by remember { mutableStateOf("") }
    val items = listOf("Male", "Female", "Other")

    CustomDropdown(
        items = items,
        selectedItem = selectedItem,
        onItemSelected = { selectedItem = it },
        label = "Gender",
        placeholder = "Select your gender"
    )
}
