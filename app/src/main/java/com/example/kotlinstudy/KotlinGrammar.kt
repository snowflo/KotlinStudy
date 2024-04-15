package com.example.kotlinstudy

import android.util.Log

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

        /*
        fun setVal(num : Int) : Int {   // val은 Java의 final이기 때문에 값을 바꿀수 없음
            b = num
            return b
        }
         */
    }

    // 형변환 : to변수()를 통해 형변환 ※ Kotlin은 암시적 형변환을 지원하지 않음
    /*
        Java의 경우

        int n1 = 10;
        double n3 = 30.1;

        double t1 = n1;     // 암시적 형변환 ( int형이 자동으로 double형으로 변환 )
        int t2 = (int)n3;   // 명시적 형변환 ( (int)를 통해 int형으로 변환 )
     */
    public class TypeConversion {
        private var a : Int = 123

        /*
        fun returnSuggestive(num : Int) : Double {  // Kotlin은 암시적 형변환 불가
            val b : Double = a
            return b
        }
         */

        fun returnExplicit(num : Int) : Double {
            val b : Double = a.toDouble()
            return b
        }
    }
    
    public class Arrays {
        private val TAG : String = "kotlinTest"

        private val intArr1 : Array<Int> = arrayOf(1, 2, 3, 4)   // int형으로 1 2 3 4 배열 생성
        private val intArr2 = arrayOfNulls<Int>(5)  // type 생략 가능, 초기값 없이 생성
        private val anyArr1 : Array<Any> = arrayOf(1, "awd", 3.2, 4)    // Any는 데이터 타입의 최상위로 어느 데이터든 다 들어갈 수 있음

        fun printArrays() {
            Log.i(TAG, "intArr1 : " + intArr1.contentToString())
            Log.i(TAG, "intArr2 : " + intArr2.contentToString())
            Log.i(TAG, "anyArr1 : " + anyArr1.contentToString())
        }
    }

    public class Functions {
        private val intArray : Array<Int> = arrayOf(1, 2, 3)

        // 함수의 기본형, fun 함수이름(매개변수 : type) : 리턴타입
        fun add() : Int {
            return intArray[0] + intArray[1] + intArray[2]
        }

        // intArray 1, 2, 3을 빼므로 반환형 타입이 int라 추론 가능
        fun minus() : Int = intArray[0] - intArray[1] - intArray[2]
    }
    
    // 조건문, 추후 lateinit vs lazy 공부 필요
    public class Conditional {
        private val TAG : String = "kotlinTest"

        private var a : Int = 0
        private var b : Any = 0
        private var c : Int = 0

        fun setVariables (num : Int, variable : Any) {
            a = num
            b = variable
        }
        
        // if : 다른 언어랑 동일 (주로 사용하는 조건문)
        fun positiveA() {
            if (a > 0) {
                Log.i(TAG, "a is positive")
            } else {
                Log.i(TAG, "a is not positive")
            }
        }

        // is : 데이터 타입 비교
        fun dataTypeB() {
            if (b is Int) {
                Log.i(TAG, "b is integer")
            } else {
                Log.i(TAG, "b is not integer")
            }
        }

        // when : 다른 언어의 switch문이랑 유사
        fun exampleWhen() {
            c = when(a) {
                1 -> a
                2 -> a
                3 -> a
                else -> 4
            }
            Log.i(TAG, "c is " + c)
        }
    }

    // 반복문
    public class Loop {
        private val TAG : String = "kotlinTest"

        private var a : Int = 0

        fun functionWhile() {
            while(a < 3) {
                Log.i(TAG, "a의 값은 " + a)
                a++
            }
        }

        fun functionFor() {
            for(index in 0..3) {
                Log.i(TAG, "index1의 값은 " + index)
            }

            for(index in 3 downTo 0) {
                Log.i(TAG, "index2의 값은 " + index)
            }

            for(index in 0..5 step 2) {
                Log.i(TAG, "index3의 값은 " + index)
            }

            for(index in 'a'..'e') {
                Log.i(TAG, "index4의 값은 " + index)
            }
        }
    }

    public class FlowControl {
        private val TAG : String = "kotlinTest"

        fun functionBreak() {
            for(index in 0..5) {
                Log.i(TAG, "index1 : " + index)
                if (index == 2) {
                    Log.i(TAG, "index1 break : " + index)
                    break
                }
            }
        }

        fun functionContinue() {
            for(index in 0..5) {
                Log.i(TAG, "index2 : " + index)
                if (index == 2) {
                    Log.i(TAG, "index2 continue : " + index)
                    continue
                }
            }
        }
    }
    
    // 클래스 기본형
    public class ClassPerson(var name : String, val birth : Int) {
        private val TAG : String = "kotlinTest"

        // 코틀린 클래스는 자바와 다르게 생성자를 따로 생성하지 않아도 됨!
        fun introduce() {
            Log.i(TAG, "$name $birth")
        }
    }
}