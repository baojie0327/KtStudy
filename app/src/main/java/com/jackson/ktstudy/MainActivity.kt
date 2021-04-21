package com.jackson.ktstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jackson.ktstudy.databinding.ActivityMainBinding
import java.util.stream.Stream

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mDataList:ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initView()
        initData()
    }

    /**
     * 初始化view
     */
    private fun initView(){
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
    }

    /**
     * 初始化数据
     */
    private fun initData(){
        mDataList= ArrayList()
        mDataList.add("Java")
        mDataList.add("Kotlin")
        val homeAdapter=MainAdapter(R.layout.item_activity_main,mDataList)
        binding.recyclerView.adapter=homeAdapter

    }
}