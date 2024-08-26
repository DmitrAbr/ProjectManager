package ru.abramov.projectmanager.ui.progilefragment.repository

import ru.abramov.projectmanager.ui.progilefragment.domain.ArchiveDomain
import ru.abramov.projectmanager.ui.progilefragment.domain.TeamDomain

class ProfileRepository {
    val teamItem : MutableList<TeamDomain> = mutableListOf(
        TeamDomain("Мобильные приложения", "В процессе"),
        TeamDomain("Мобильные приложения", "В процессе"),
        TeamDomain("Мобильные приложения", "В процессе"),
        TeamDomain("Мобильные приложения", "В процессе")
    )

    val archiveItems : MutableList<String> = mutableListOf(
        "Мои заметки",
        "Открытые источники",
        "Заебался работать один",
        "Арсен чурка",
    )

}