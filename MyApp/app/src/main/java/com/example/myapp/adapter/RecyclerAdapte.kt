//package com.example.myapp.adapter
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.myapp.R
//
//class RecyclerAdapte(
//    var titleList: ArrayList<String>,
//    var descriptionList: ArrayList<String>,
//    var imageList: ArrayList<Int>
//) :RecyclerView.Adapter<RecyclerAdapte.FruitViewHolder>(){
//
//    class FruitViewHolder(view:View):RecyclerView.ViewHolder(view){
//        var image: ImageView=view.findViewById(R.id.imageView4)
//        var title: TextView=view.findViewById(R.id.textView4)
//        var description:TextView=view.findViewById(R.id.textView5)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
//        var view:View=LayoutInflater.from(parent.context).inflate(R.layout.sample_recycler_view_design, false)
//        return FruitViewHolder(view)
//
//    }
//
//    override fun getItemCount(): Int {
//        return titleList.size
//    }
//
//    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
//        holder.image.setImageResource(imageList)
//    }
//}