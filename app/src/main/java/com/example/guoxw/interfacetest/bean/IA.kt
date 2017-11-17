package com.example.guoxw.interfacetest.bean

/**
 * Created by guoxw on 2017/11/17 0017.
 */
interface IA<in T> {

    fun reflash(data: T)

}