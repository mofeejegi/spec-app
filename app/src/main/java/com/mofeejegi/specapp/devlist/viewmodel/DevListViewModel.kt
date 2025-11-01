package com.mofeejegi.specapp.devlist.viewmodel

import androidx.lifecycle.ViewModel
import com.mofeejegi.specapp.devlist.model.Developer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DevListViewModel : ViewModel() {

    private val _developers = MutableStateFlow<List<Developer>>(emptyList())
    val developers: StateFlow<List<Developer>> = _developers

    init {
        _developers.value = listOf(
            Developer("Mofe Jegi", "mofe@example.com", "https://www.gravatar.com/avatar/55b3c3ddb3d6f03a62ea4b071477f15c?d=identicon"),
            Developer("Jane Doe", "jane@example.com", "https://www.gravatar.com/avatar/8ab6e831a238600674ff156f10858175?d=identicon"),
            Developer("John Smith", "john@example.com", "https://www.gravatar.com/avatar/02db38f0b7841804369408e0a39a025f?d=identicon"),
            Developer("Alice Johnson", "alice@example.com", "https://www.gravatar.com/avatar/9a7de8615019d479153347c05b822c15?d=identicon"),
            Developer("Bob Williams", "bob@example.com", "https://www.gravatar.com/avatar/15309caf2a45a33758b73e7255a8220f?d=identicon"),
            Developer("Charlie Brown", "charlie@example.com", "https://www.gravatar.com/avatar/565c5d07094f31c5188448b1116c1417?d=identicon"),
            Developer("Diana Prince", "diana@example.com", "https://www.gravatar.com/avatar/3d62323c2670e976b328d1326442c526?d=identicon"),
            Developer("Ethan Hunt", "ethan@example.com", "https://www.gravatar.com/avatar/b58c95a3f5a77b83d7350d7b732e7a37?d=identicon")
        )
    }
}
