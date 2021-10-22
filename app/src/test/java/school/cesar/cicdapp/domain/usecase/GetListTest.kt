package school.cesar.cicdapp.domain.usecase

import org.junit.Test
import org.mockito.Mockito
import school.cesar.cicdapp.model.IListRepository

class GetListTest {

    @Test
    fun `When calling GetList the ListRepository GetList must be called`(){
        val repo: IListRepository = Mockito.mock(IListRepository::class.java)
        GetList(repo)
        Mockito.verify(repo).getItemList()
    }
}