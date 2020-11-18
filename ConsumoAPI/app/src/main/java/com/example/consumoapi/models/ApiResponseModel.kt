package com.example.consumoapi.models

data class ApiResponseModel<T>(
    val info: PageInfoModel,
    val results : List<CharacterModel>
)