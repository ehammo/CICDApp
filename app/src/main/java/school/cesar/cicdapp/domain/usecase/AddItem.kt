package school.cesar.cicdapp.domain.usecase

import school.cesar.cicdapp.model.ListRepository

object AddItem {

    operator fun invoke(newItem: String) {
        ListRepository.addItem(newItem)
    }
}