package school.cesar.cicdapp.model

import org.junit.Test

class ListRepositoryTest {

    @Test
    fun `When adding a item the list size should increase by one`(){
        val oldSize = ListRepository.getItemList().value?.size ?: 0
        ListRepository.addItem("New Item")
        val newSize = ListRepository.getItemList().value?.size ?: 0
        assert(newSize == (oldSize+1))
    }

    @Test
    fun `When an item is added, it should be inside the list`(){
        val newItem = "New Item"
        ListRepository.addItem(newItem)
        assert(ListRepository.getItemList().value?.contains(newItem)
            ?: false)
    }

}