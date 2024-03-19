package com.example.kotlinstudy

// kotlin logic test
public class KotlinGrammar {

    // 변수 : var vs val
    public class Variable {
        /*
            var : 변수값 변경 가능
            val : 선언시에만 초기화 가능(변경 불가능) -> Java final
         */
        private var a : Int = 0
        private val b : Int = 1234

        fun setVar(num : Int) : Int {   // 자료형 선언시 -> 변수: type
            a = num
            return a
        }

        fun setVal(num : Int) : Int {
            // b = num // val은 Java의 final이기 때문에 값을 바꿀수 없음
            return b
        }
    }
}