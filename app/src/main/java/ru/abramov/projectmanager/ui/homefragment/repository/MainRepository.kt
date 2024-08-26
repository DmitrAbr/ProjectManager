package ru.abramov.projectmanager.ui.homefragment.repository

import ru.abramov.projectmanager.ui.homefragment.domain.OngoingDomain

class MainRepository {
    val items = listOf(
        OngoingDomain("Сканнер QR", "15 августа 2023", 30, "ongoing1"),
        OngoingDomain("Управление проектами", "10 августа 2023", 70, "ongoing2"),
        OngoingDomain("Навигатор СибЦема", "1 июня 2023",60, "ongoing3"),
        OngoingDomain("Axapta", "12 августа 2023", 10, "ongoing4"),
        OngoingDomain("Axapta", "12 августа 2023", 10, "ongoing4"),
        OngoingDomain("Axapta", "12 августа 2023", 10, "ongoing4"),

    )
}