package school.cesar.cicdapp.model

import android.util.Log
import androidx.lifecycle.MutableLiveData

object ListRepository {
    private val list = MutableLiveData<MutableList<String>>(mutableListOf())

    fun getList() = list
    fun addItem(newItem: String) {
        Log.i("duds", "add $newItem")
        val listValue = list.value ?: mutableListOf()
        listValue.add(newItem)
        list.postValue(listValue)
    }
}