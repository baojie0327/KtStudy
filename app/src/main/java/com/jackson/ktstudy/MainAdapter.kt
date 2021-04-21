package com.jackson.ktstudy

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder


/*
* MainAdapter  2021-04-06
* Copyright (c) 2021 KL Co.Ltd. All right reserved.
*
*/
/*
* class description here
* @author Jackson
* @version 1.0.0
* since 2021 04 06
*/
class MainAdapter(layoutResId:Int,data:ArrayList<String>): BaseQuickAdapter<String, BaseViewHolder>(layoutResId,data) {

    override fun convert(holder: BaseViewHolder, item: String) {
        holder.setText(R.id.tv_show,item)
    }

}