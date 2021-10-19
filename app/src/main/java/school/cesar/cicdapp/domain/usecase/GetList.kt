package school.cesar.cicdapp.domain.usecase

import androidx.lifecycle.MutableLiveData
import school.cesar.cicdapp.model.IListRepository
import school.cesar.cicdapp.model.ListRepository

object GetList {

    operator fun invoke(repository: IListRepository): MutableLiveData<MutableList<String>> {
        return repository.getItemList()
    }

}
