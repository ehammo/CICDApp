package school.cesar.cicdapp.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import school.cesar.cicdapp.databinding.ListActivityBinding
import school.cesar.cicdapp.viewmodel.ListViewModel

class ListActivity : AppCompatActivity() {

    private val mViewModel by viewModels<ListViewModel>()
    private val list: MutableList<String> = mutableListOf()
    private val adapter: SimpleAdapter = SimpleAdapter(list)

    @SuppressLint("NotifyDataSetChanged")
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