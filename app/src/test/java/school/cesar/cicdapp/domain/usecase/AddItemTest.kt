package school.cesar.cicdapp.domain.usecase

import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import school.cesar.cicdapp.model.IListRepository

class AddItemTest {

    @Test
    fun `When calling AddItem the ListRepository AddItem must be called`(){
        val repo: IListRepository = mock(IListRepository::class.java)
        val itemToAdd = "item"
        AddItem(repo, itemToAdd)
        verify(repo).addItem(itemToAdd)
    }

}