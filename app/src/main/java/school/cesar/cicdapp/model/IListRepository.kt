package school.cesar.cicdapp.model

import androidx.lifecycle.MutableLiveData

interface IListRepository {

    fun getItemList(): MutableLiveData<MutableList<String>>
    fun addItem(newItem: String)

}