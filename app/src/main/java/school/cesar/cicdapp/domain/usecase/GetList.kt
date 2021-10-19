package school.cesar.cicdapp.domain.usecase

import androidx.lifecycle.MutableLiveData
import school.cesar.cicdapp.model.ListRepository

object GetList {

    operator fun invoke(): MutableLiveData<MutableList<String>> {
        return ListRepository.getList()
    }

}
