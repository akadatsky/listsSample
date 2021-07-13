package com.akadatsky.listssample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.akadatsky.listssample.*

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = ListAdapter(sampleItems)
        listView.setOnItemClickListener { parent, view, position, id ->
            toast("Item $position clicked")
        }
    }
}

class ListAdapter(private val items: List<MyItem>) : BaseAdapter() {

    override fun getCount() = items.size

    override fun getItemId(position: Int) = position.toLong()

    override fun getItem(position: Int) = items[position]

    override fun getView(position: Int, convertView: View?, container: ViewGroup): View? {
        val inflater = LayoutInflater.from(container.context)
        val result = convertView ?: inflater
            .inflate(R.layout.list_item, container, false)

        val titleView = result.findViewById<TextView>(R.id.title)
        val subTitleView = result.findViewById<TextView>(R.id.subTitle)
        val icon = result.findViewById<FrameLayout>(R.id.frameLayout)

        getItem(position).apply {
            titleView.text = title
            subTitleView.text = subtitle
            icon.setBackgroundColor(randomColor())
        }

        return result
    }
}