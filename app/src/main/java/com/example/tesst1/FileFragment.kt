package com.example.tesst1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.file_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
    }

    private fun init(view1: View) {
        val recycle = view1.findViewById<RecyclerView>(R.id.rcv_item_file)
        val itemFile1 = ItemFile(1, R.drawable.img_doc, "Document", "56kb")
        val itemFile2 = ItemFile(2, R.drawable.img_pdf, "PDF", "1024kb")
        val itemFile3 = ItemFile(3, R.drawable.icon_file, "ZIP", "1024kb")
        val listFile = listOf(itemFile1, itemFile2, itemFile3)
        val adapterFile = AdapterFile(listFile)
        recycle?.adapter = adapterFile
        recycle?.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
    }
}