package com.mofeejegi.specapp.devlist.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.mofeejegi.specapp.devlist.model.Developer
import com.mofeejegi.specapp.devlist.viewmodel.DevListViewModel

@Composable
fun DevListScreen(modifier: Modifier = Modifier, viewModel: DevListViewModel = viewModel()) {
    val developers by viewModel.developers.collectAsState()

    LazyColumn(modifier = modifier) {
        item {
            AsyncImage(
                model = "https://developers.google.com/static/community/images/community-hero-devfest.png",
                contentDescription = "DevFest banner",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(5f / 1f),
                contentScale = ContentScale.Crop
            )
        }
        items(developers) {
            developer ->
            DeveloperListItem(developer = developer)
        }
    }
}

@Composable
fun DeveloperListItem(developer: Developer) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            AsyncImage(
                model = developer.profilePhotoUrl,
                contentDescription = "${developer.name}'s profile photo",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = developer.name, style = MaterialTheme.typography.bodyLarge)
                Text(text = developer.email, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DeveloperListItemPreview() {
    DeveloperListItem(
        developer = Developer("Mofe Jegi", "mofe@example.com", "")
    )
}
