package school.cesar.cicdapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import school.cesar.cicdapp.R
import school.cesar.cicdapp.databinding.ListItemBinding

class SimpleAdapter(private val list: List<String>) : RecyclerView.Adapter<SimpleAdapter.VH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        val binding = ListItemBinding.bind(view)
        return VH(binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.title.text = list[position]
    }

    class VH(itemView: ListItemBinding): RecyclerView.ViewHolder(itemView.root) {
        val title: TextView = itemView.title
    }
}