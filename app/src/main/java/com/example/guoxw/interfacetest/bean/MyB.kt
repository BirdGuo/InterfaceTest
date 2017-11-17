package com.example.guoxw.interfacetest.bean

/**
 * Created by guoxw on 2017/11/17 0017.
 */
open abstract class MyB<in K,out T : MyC<K, IA<K>>> {

    abstract fun fetchData()

}