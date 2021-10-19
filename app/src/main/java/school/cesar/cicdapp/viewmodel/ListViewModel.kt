package school.cesar.cicdapp.viewmodel

import android.text.Editable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import school.cesar.cicdapp.domain.usecase.AddItem
import school.cesar.cicdapp.domain.usecase.GetList
import school.cesar.cicdapp.model.ListRepository

class ListViewModel : ViewModel() {

    fun addItem(text: Editable?) {
        AddItem(ListRepository, text.toString())
    }
    val list: MutableLiveData<MutableList<String>> = GetList(ListRepository)
}