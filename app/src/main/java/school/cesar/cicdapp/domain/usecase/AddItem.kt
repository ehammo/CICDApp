package school.cesar.cicdapp.domain.usecase

import school.cesar.cicdapp.model.IListRepository

object AddItem {
    operator fun invoke(repository: IListRepository, newItem: String) {
        repository.addItem(newItem)
    }
}