package com.starlight.dot.framework.presenter

interface BasePresenter<T> {

    /**
     * 列表Item点击事件监听
     * create by Eastevil at 2022/5/10 15:46
     * @author Eastevil
     * @param entity
     *      点击的item对象
     * @return
     *      void
     */
    fun onItemClickListener(entity : T,position : Int);

    /**
     * 列表Item选择事件监听
     * create by Eastevil at 2022/5/10 15:46
     * @author Eastevil
     * @param entity
     *      选择的item对象
     * @return
     *      void
     */
    fun onItemSelectListener(entity : T);

    /**
     * 列表Item菜单按钮点击事件监听
     * create by Eastevil at 2022/5/10 15:46
     * @author Eastevil
     * @param entity
     *      点击的Item对象
     * @return
     *      void
     */
    fun onItemMenuClickListener(entity: T);

    /**
     * 列表Item编辑事件监听
     * create by Eastevil at 2022/5/10 15:46
     * @author Eastevil
     * @param entity
     *      需要编辑的item对象
     * @return
     *      void
     */
    fun onEditListener(entity: T);
}
