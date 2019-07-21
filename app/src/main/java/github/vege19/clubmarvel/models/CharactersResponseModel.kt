package github.vege19.clubmarvel.models

import java.io.Serializable

data class CharactersResponseModel(val available: Int = 0,
                                   val collectionUri: String = "",
                                   val items: List<CreatorModel> = arrayListOf()): Serializable