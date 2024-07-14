package com.elongocrea.saup.ui.components.item

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.elongocrea.saup.ui.components.image.RoundedImage

//@Composable
//fun MovieItem(movie: Movie, onClick: (Movie) -> Unit) {
//    Column(modifier = Modifier
//        .padding(8.dp)
//        .clickable { onClick(movie) }) {
//        movie.posterPath?.let { posterPath ->
//            RoundedImage(
//                image = rememberImagePainter("https://image.tmdb.org/t/p/w500$posterPath"),
//                description = movie.title,
//                modifier = Modifier
//                    .width(180.dp)
//            )
//        }
//        Spacer(modifier = Modifier.height(8.dp))
//        Text(text = movie.title, style = TextStyle(
//            fontSize = TextUnit(value = 14f, type = TextUnitType.Sp),
//            fontWeight = FontWeight.Bold
//        ))
//    }
//}