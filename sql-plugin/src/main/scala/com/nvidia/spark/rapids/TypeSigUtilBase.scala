/*
 * Copyright (c) 2021-2025, NVIDIA CORPORATION.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nvidia.spark.rapids

import org.apache.spark.sql.types.DataType

trait TypeSigUtilBase {
  def isSupported(check: TypeEnum.ValueSet, dataType: DataType): Boolean
  def getAllSupportedTypes(): TypeEnum.ValueSet
  def reasonNotSupported(
    check: TypeEnum.ValueSet,
    dataType: DataType,
    notSupportedReason: Seq[String]): Seq[String]
  def mapDataTypeToTypeEnum(dataType: DataType): TypeEnum.Value
  def getNumericAndInterval(): TypeSig
  def getAnsiInterval: TypeSig
}
