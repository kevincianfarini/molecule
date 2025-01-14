/*
 * Copyright (C) 2021 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example

import app.cash.molecule.RecompositionClock.Immediate
import app.cash.molecule.launchMolecule
import app.cash.turbine.test
import org.junit.Assert.assertEquals

class CountToThreeTest {
  @Test fun counts() {
    launchMolecule(Immediate) {
      CountToThree()
    }.test {
      assertEquals(1, awaitItem())
      assertEquals(2, awaitItem())
      assertEquals(3, awaitItem())
    }
  }
}
