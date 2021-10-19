package school.cesar.cicdapp.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import school.cesar.cicdapp.databinding.ListActivityBinding
import school.cesar.cicdapp.viewmodel.ListViewModel

class ListActivity : AppCompatActivity() {

    val mViewModel by viewModels<ListViewModel>()
    val list: MutableList<String> = mutableListOf()
    val adapter: SimpleAdapter = SimpleAdapter(list)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ListActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.list.adapter = adapter
        binding.list.layoutManager = LinearLayoutManager(this)

        mViewModel.list.observe(this) {
            Log.i("duds", "changed ${it.size}")
            list.clear()
            list.addAll(it)
            adapter.notifyDataSetChanged()
        }
        binding.button.setOnClickListener {
            mViewModel.addItem(binding.editText.text)
        }
    }
}