package com.simplemobiletools.calculator.operation

import com.simplemobiletools.calculator.operation.base.Operation
import com.simplemobiletools.calculator.operation.base.UnaryOperation

class LnOperation(value: Double) : UnaryOperation(value), Operation {

    override fun getResult() = Math.log(value)
}