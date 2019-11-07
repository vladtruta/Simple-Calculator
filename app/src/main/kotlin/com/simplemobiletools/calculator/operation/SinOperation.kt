package com.simplemobiletools.calculator.operation

import com.simplemobiletools.calculator.operation.base.Operation
import com.simplemobiletools.calculator.operation.base.UnaryOperation

class SinOperation(value: Double) : UnaryOperation(value), Operation {

    override fun getResult() = Math.sin(value)
}
