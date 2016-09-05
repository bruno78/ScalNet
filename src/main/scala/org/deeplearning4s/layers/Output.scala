/*
 *
 *  * Copyright 2016 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

package org.deeplearning4s.layers

import org.nd4j.linalg.lossfunctions.LossFunctions.LossFunction

/**
  * Abstract base class for layers in neural net architectures.
  *
  * @author David Kale
  */
trait Output {
  protected var _isOutput = false
  protected var _lossFunction: LossFunction = null

  def isOutput: Boolean = _isOutput
  def makeOutput(lossFunction: LossFunction): Unit = {
    _isOutput = true
    _lossFunction = lossFunction
  }
}