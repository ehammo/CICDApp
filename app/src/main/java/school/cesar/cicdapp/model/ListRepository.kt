package school.cesar.cicdapp.model

import android.util.Log
import androidx.lifecycle.MutableLiveData

object ListRepository: IListRepository {
    private val list = MutableLiveData<MutableList<String>>(mutableListOf())

    override fun getItemList() = list
    override fun addItem(newItem: String) {
        val listValue = list.value ?: mutableListOf()
        listValue.add(newItem)
        list.postValue(listValue)
    }
}